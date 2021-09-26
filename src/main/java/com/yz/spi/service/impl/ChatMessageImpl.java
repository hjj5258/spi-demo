package com.yz.spi.service.impl;

import com.yz.spi.service.MessageService;

/**
 * @author hjj
 * @create 2021/09/26/22:06
 */
public  abstract class ChatMessageImpl implements MessageService {

    public void sayMessage() {
        System.out.println("This is chat type: " + getType());
    }


    public int getType() {
        return CHAT_TYPE;
    }
}
