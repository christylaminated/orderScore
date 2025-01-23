package com.webhuman.orderscore.controller;

import com.webhuman.orderscore.view.EventHandler;

import javax.swing.*;

public interface Controller <T> extends EventHandler<T> {
    public JComponent getComponent();
}
