package com.budziq.codeclip;

import com.budziq.codeclip.MessageParser;

import org.junit.Test;

import java.lang.IllegalArgumentException;
import java.lang.String;

import static com.budziq.codeclip.MessageParser.*;
import static org.fest.assertions.api.Assertions.assertThat;

public class MessageParserTest {

    @Test
    public void testBasicInput() {
        final String TEST_STR = "Operacja nr 1 z dn. 13-08-2012 Definicja odbiorcy z rach: ...00232300 na rach: 2420...454332 haslo: 53673306 mBank. ";
        MessageParser pars = parseMessage(TEST_STR);
        assertThat(pars.getPassword()).isEqualTo("53673306");
        assertThat(pars.getDate()).isEqualTo("13-08-2012");
        assertThat(pars.gettransactionNum()).isEqualTo("1");
        assertThat(pars.isValid()).isTrue();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullImput() {
        MessageParser pars = parseMessage(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyInput() {
        MessageParser pars = parseMessage(new String());
    }
}

