package app.service;


import app.entity.Message;

import java.util.Random;

/**
 * Created by jiayanguo on 9/24/16.
 */
public class GetMsgService {
    public Message getMsg(String str, String msg){
        Message message = new Message(str, msg);
        message.setLuckNumber(luckNumber());
        return message;
    }

    public long luckNumber(){
        return new Random().nextLong();
    }

}
