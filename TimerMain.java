package com.horstmann.corejava.TimerTen;

import java.awt.event.*;
import javax.swing.*;

public class TimerMain {
    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();

        // Сконструировать таймер, вызывающий обработчик событий
        // через каждые 10 секунд
        javax.swing.Timer t = new javax.swing.Timer(10000, listener);
        t.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }

}
