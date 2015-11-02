package Graphique;

import javax.swing.*;
import java.awt.*;

public class PremiersJButtons
{
        public PremiersJButtons()
        {
                JFrame frame = new JFrame();
                frame.setTitle("My second window !");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().setLayout(new FlowLayout());
                frame.getContentPane().add(new JButton("my First JButton"));
                frame.getContentPane().add(new JButton("my Second JButton"));
                frame.getContentPane().add(new JButton("my Third JButton"));
                frame.getContentPane().add(new JButton("my Fourth JButton"));
                frame.setVisible(true);
                // frame.pack();
                frame.setSize(600, 400);
                frame.setResizable(false);
        }

        public static void main(String[] args)
        {
                new PremiersJButtons();
        }
}