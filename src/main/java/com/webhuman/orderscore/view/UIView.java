package com.webhuman.orderscore.view;


import javax.swing.*;

public abstract class UIView <T,K> {
    abstract public JComponent getComponent();
    abstract public void update(String id, T data);
    abstract public void setHandler(EventHandler<K> eventHandler);
    abstract void initListener();
}
