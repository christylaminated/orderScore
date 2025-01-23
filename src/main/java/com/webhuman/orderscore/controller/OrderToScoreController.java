package com.webhuman.orderscore.controller;

import com.webhuman.orderscore.model.OrderScoreUI;
import com.webhuman.orderscore.view.UIView;

import javax.swing.*;


public class OrderToScoreController implements Controller<Integer> {
    UIView <String,Integer> view;
    public OrderToScoreController(UIView <String, Integer> view) {
        this.view = view;
        this.view.setHandler(this);
    }

    @Override
    public JComponent getComponent() {
        return this.view.getComponent();
    }

    @Override
    public void handleEvent(String id, Integer data) {
        if(id.equals(OrderScoreUI.EVENT_START_GAME_BUTTON_CLICK)){
            view.update(OrderScoreUI.SHOW_ALL_NUMBER, null);
        }
    }
}
