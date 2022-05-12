package com.company.lesson8.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter extends JFrame {
    private int counter = 0;

    public Counter() {
        setTitle("CounterApp window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 500, 250, 250);
        setLayout(null);

        Font font = new Font("Arial", Font.BOLD, 30);

        JLabel counterView = new JLabel(String.valueOf(counter));
        counterView.setHorizontalAlignment(SwingConstants.CENTER);
        counterView.setFont(font);
        setLayout(null);
        counterView.setBounds(100,100, 45, 30);
        add(counterView);

        JButton incrementButton = new JButton(">");
        incrementButton.setBounds(180,85,45,50);
        add(incrementButton);
        JButton decrementButton = new JButton("<");
        decrementButton.setBounds(10,85,45,50);
        add(decrementButton);
        JButton zeroingButton = new JButton("Обнулить счетчик");
        zeroingButton.setBounds(45,5,150,50);
        add(zeroingButton);
        JButton incrementTenButton = new JButton("+10");
        incrementTenButton.setBounds(155,150, 70, 50);
        add(incrementTenButton);
        JButton decrementTenButton = new JButton("-10");
        decrementTenButton.setBounds(10, 150, 70,50);
        add(decrementTenButton);
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == incrementButton) {
                    counter++;
                } else if (e.getSource() == decrementButton) {
                    counter--;
                } else if (e.getSource() == zeroingButton) {
                    counter = 0;
                } else if (e.getSource() == incrementTenButton) {
                    counter += 10;
                } else if (e.getSource() == decrementTenButton) {
                    counter -= 10;
                }
                refreshCounterView(counterView);
            }
        };

        decrementButton.addActionListener(actionListener);
        incrementButton.addActionListener(actionListener);
        zeroingButton.addActionListener(actionListener);
        incrementTenButton.addActionListener(actionListener);
        decrementTenButton.addActionListener(actionListener);
        setVisible(true);
    }

    private void refreshCounterView(JLabel counterView) {
        counterView.setText(String.valueOf(counter));
    }

    public static void main(String[] args) {
        new Counter();
    }
}
