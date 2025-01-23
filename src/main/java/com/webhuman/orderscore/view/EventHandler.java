package com.webhuman.orderscore.view;

public interface EventHandler <T>{
    void handleEvent(String id, T data);
}
