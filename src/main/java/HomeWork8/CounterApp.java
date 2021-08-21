package HomeWork8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class CounterApp extends JFrame {
    private int value;
    private static final String COUNTER_NORMAL = "Счетчик в норме";
    private static final String COUNTER_IS_TOO_BIG = "Счетчик слишком большой";
    private static final String COUNTER_IS_TOO_LOW = "Счетчик слишком маленький";
    private static final String COUNTER_IS_INCORRECT = "Неверное значение";


    public CounterApp(int initialValue) {
        this.value = initialValue;
        setBounds(500, 500, 300, 150);
        setResizable(false);
        setTitle("Simple counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Font font = new Font("Times new roman", Font.BOLD, 40);
        Font font1 = new Font("Calibri", Font.ITALIC, 20);

        JLabel counterValue = new JLabel(String.valueOf(this.value));
        counterValue.setFont(font);

        counterValue.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValue, BorderLayout.CENTER);

        JLabel infoPane = new JLabel(COUNTER_NORMAL);
        infoPane.setHorizontalAlignment(SwingConstants.CENTER);
        infoPane.setFont(font1);
        add(infoPane, BorderLayout.NORTH);

        JButton decrement = new JButton("<");
        decrement.setFont(font);
        add(decrement, BorderLayout.WEST);

        JButton increment = new JButton(">>");
        increment.setFont(font);
        add(increment, BorderLayout.EAST);

        decrement.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value--;
                counterValue.setText(String.valueOf(value));
                if (value <= -10 && value > -20) {
                    infoPane.setForeground(Color.BLACK);
                    counterValue.setForeground(Color.GRAY);
                    infoPane.setText(COUNTER_IS_TOO_LOW);

                } else if (value <= - 20) {
                    infoPane.setForeground(Color.RED);
                    counterValue.setForeground(Color.RED);
                    infoPane.setText(COUNTER_IS_INCORRECT);
                }
                else {
                    infoPane.setForeground(Color.BLACK);
                    counterValue.setForeground(Color.BLACK);
                    infoPane.setText(COUNTER_NORMAL);
                }
            }
        });

        increment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value +=2;
                counterValue.setText(String.valueOf(value));
                if (value >= 10 && value < 20) {
                    infoPane.setForeground(Color.BLACK);
                    counterValue.setForeground(Color.GRAY);
                    infoPane.setText(COUNTER_IS_TOO_BIG);
                } else if (value >= 20) {
                    infoPane.setForeground(Color.RED);
                    counterValue.setForeground(Color.RED);
                    infoPane.setText(COUNTER_IS_INCORRECT);
                }
                else {
                    infoPane.setForeground(Color.BLACK);
                    counterValue.setForeground(Color.BLACK);
                    infoPane.setText(COUNTER_NORMAL);
                }
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window is closing with value = " + counterValue.getText());
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new CounterApp(0);
    }

}
