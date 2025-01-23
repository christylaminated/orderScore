package com.webhuman.orderscore.view;

import com.webhuman.orderscore.model.OrderScoreUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderToScoreView extends UIView<String,Integer> {
    JPanel mainPanel = new JPanel();
    JButton startGameButton = new JButton("Start Game");
    JLabel scoreLabel = new JLabel("Hello");
    EventHandler eventHandler;
    public OrderToScoreView() {
        mainPanel.add(startGameButton);
        mainPanel.add(scoreLabel);
        initListener();
    }

    @Override
    public void setHandler(EventHandler <Integer> eventHandler) {
        this.eventHandler = eventHandler;
    }

    @Override
    public void initListener() {
        startGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eventHandler.handleEvent(OrderScoreUI.EVENT_START_GAME_BUTTON_CLICK, null);
            }
        });
    }

    @Override
    public void update(String id, String data) {
    }

    @Override
    public JComponent getComponent() {
        return this.mainPanel;
    }
}
