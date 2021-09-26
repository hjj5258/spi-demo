package com.yz.spi;

import com.yz.spi.service.MessageService;

import java.util.ServiceLoader;

/**
 * @author hjj
 * @create 2021/09/26/22:14
 */
public class Main {
    public static void main(String[] args) {
        ServiceLoader<MessageService> serviceLoader = ServiceLoader.load(MessageService.class);
        for (MessageService messageService : serviceLoader) {
            messageService.sayMessage();
        }
    }
}
