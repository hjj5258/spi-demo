package com.yz.spi.service;

/**
 * @author hjj
 * @create 2021/09/26/22:03
 */
public interface MessageService {
    int CHAT_TYPE = 2;
    int GREETING_TYPE = 1;

    void sayMessage();

    int getType();
}
