package com.webhuman.orderscore.main;

import com.webhuman.orderscore.controller.Controller;
import com.webhuman.orderscore.controller.OrderToScoreController;
import com.webhuman.orderscore.view.OrderToScoreView;

import javax.swing.*;


public class OrderToScore {
    public static void main(String[] args) {
        Controller controller = new OrderToScoreController(new OrderToScoreView(5));
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Order and Score Game");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(controller.getComponent());
            frame.setSize(400, 300);
            frame.setVisible(true);
        });
    }
}
