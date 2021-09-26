package com.yz.spi.service.impl;

import com.yz.spi.service.MessageService;

/**
 * @author hjj
 * @create 2021/09/26/22:08
 */
public class GreetingMessageServiceImpl implements MessageService {

    public void sayMessage() {
        System.out.println("This is greeting type: " + getType());
    }


    public int getType() {
        return GREETING_TYPE;
    }
}
