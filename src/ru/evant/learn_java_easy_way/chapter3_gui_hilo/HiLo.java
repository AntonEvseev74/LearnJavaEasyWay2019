package ru.evant.learn_java_easy_way.chapter3_gui_hilo;

// стр. 75
// нужно угадать загаданное программой число от 1 до 100
// приложение с графическим интерфейсом

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class HiLo extends JFrame implements KeyListener {

    private static JLabel label1;
    private static JLabel label2;
    private static JTextField txtGuess;
    private static JButton button;
    private static JLabel label3;
    private static JTextArea outText;
    private static JButton buttonNewGame;

    private static int theNumber = (int) (Math.random() * 100 + 1);
    private static int guess;
    private static int attempt = 1; // попытка

    public static void main(String[] args) {

        JFrame frame = new JFrame("1-100");
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label1 = new JLabel("УГАДАЙ ЧИСЛО");
        label1.setBounds(100, 20, 300, 20);
        frame.add(label1);

        label2 = new JLabel("Введите число от 1 до 100:");
        label2.setBounds(40, 60, 200, 20);
        frame.add(label2);

        txtGuess = new JTextField();
        txtGuess.setBounds(205, 60, 40, 20);
        txtGuess.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    game();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        frame.add(txtGuess);

        button = new JButton("Угадать");
        button.setBounds(100, 110, 100, 20);
        frame.add(button);

        label3 = new JLabel("Введите номер выше и нажмите \"Угадать\"");
        label3.setBounds(15, 150, 250, 20);
        label3.setVisible(true);
        frame.add(label3);

        outText = new JTextArea("");
        outText.setBounds(15, 150, 250, 50);
        outText.setVisible(false);
        frame.add(outText);

        buttonNewGame = new JButton("Новая игра");
        buttonNewGame.setBounds(100, 110, 100, 20);
        buttonNewGame.setVisible(false);
        frame.add(buttonNewGame);

        button.addActionListener(e -> game());
        buttonNewGame.addActionListener(e -> newGame());
    }

    public static void newGame() {
        theNumber = (int) (Math.random() * 100 + 1);
        attempt = 1;
        buttonNewGame.setVisible(false);
        button.setVisible(true);
        txtGuess.setText("");
        label2.setVisible(true);
        label1.setVisible(true);
        txtGuess.setVisible(true);
        txtGuess.requestFocusInWindow();
    }

    public static void game() {
        label3.setVisible(false);
        outText.setVisible(true);

        try {
            guess = Integer.parseInt(txtGuess.getText());
        } catch (Exception error) {
            System.out.println("Вы ввели не число");
        }

        if (guess < theNumber) {
            outText.setText("Попытка № " + attempt + "\n" + guess + " меньше загаданного числа.\nПопробуйте еще раз.");
            attempt++;
            txtGuess.setText("");
            txtGuess.requestFocusInWindow();
        } else if (guess > theNumber) {
            outText.setText("Попытка № " + attempt + "\n" + guess + " больше загаданного числа.\nПопробуйте еще раз.");
            attempt++;
            txtGuess.setText("");
            txtGuess.requestFocusInWindow();
        } else {
            outText.setText("Вы угадали с " + attempt + " попытки\n" + guess + " правильно! ПОБЕДА!");
            label2.setVisible(false);
            label1.setVisible(false);
            txtGuess.setVisible(false);
            buttonNewGame.setVisible(true);
            button.setVisible(false);
        }
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
