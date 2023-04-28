package com.pong;

import javax.swing.*;
import java.awt.*;

public class GameFrames extends JFrame {
    GamePanel panel;

    GameFrames() {
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("GIVE IT BACK ");
        this.setResizable(true);
        this.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
