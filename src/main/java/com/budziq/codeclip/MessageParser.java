package com.budziq.codeclip;


public class MessageParser {

    private String mText;
    private String password;
    private String date;
    private String transactonNum;

    private MessageParser(String text) {
        mText = text;
    }

    public static MessageParser parseMessage(String text) throws IllegalArgumentException {

        if(text == null || text.length() == 0)
            throw new IllegalArgumentException("MessageParser expects nonempty string");

        MessageParser self = new MessageParser(text);

        //TODO implement this method stub
        return self;
    }

    public boolean isValid(){
        //TODO implement this method stub
        return  password != null && transactonNum != null && date != null;
    }

    public String getDate(){return date;};
    public String getPassword(){return password;};
    public String gettransactionNum(){return transactonNum;};

}
