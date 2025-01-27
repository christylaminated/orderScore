package com.webhuman.orderscore.view;

import com.webhuman.orderscore.model.OrderScoreUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderToScoreView extends UIView<String,Integer> {
    private static final int NUMBER_BOX_SIZE = 50;
    JPanel mainPanel = new JPanel();
    JPanel numberPanel = new JPanel();
    JLabel [] numberLabels;
    JPanel orderPanel = new JPanel();
    JLabel [] orderLabels;
    JPanel controlPanel = new JPanel();
    JButton startGameButton = new JButton("Start Game");
    JLabel scoreLabel = new JLabel("Score : 0");
    EventHandler eventHandler;

    public OrderToScoreView(int numberOfNumber) {
        numberLabels = new JLabel[numberOfNumber];
        orderLabels = new JLabel[numberOfNumber];
        for (int i = 0; i < numberOfNumber; i++) {
            numberLabels[i] = new JLabel(Integer.toString(i+1));
            numberLabels[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            numberLabels[i].setPreferredSize(new Dimension(NUMBER_BOX_SIZE,NUMBER_BOX_SIZE));
            numberLabels[i].setHorizontalAlignment(SwingConstants.CENTER); // Horizontally center
            numberLabels[i].setVerticalAlignment(SwingConstants.CENTER);
            numberLabels[i].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            numberPanel.add(numberLabels[i]);

            orderLabels[i] = new JLabel();
            orderPanel.add(orderLabels[i]);
        }
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        FlowLayout numberPanelLayout = new FlowLayout();
        numberPanel.setLayout(numberPanelLayout);

        FlowLayout orderPanelLayout = new FlowLayout();
        orderPanel.setLayout(orderPanelLayout);

        FlowLayout controlPanelLayout = new FlowLayout();
        controlPanel.setLayout(controlPanelLayout);
        controlPanel.add(startGameButton);
        controlPanel.add(scoreLabel);

        mainPanel.add(numberPanel);
        mainPanel.add(orderPanel);
        mainPanel.add(controlPanel);
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
