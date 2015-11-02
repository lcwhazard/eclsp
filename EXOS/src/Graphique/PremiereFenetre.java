package Graphique;

import javax.swing.*;

public class PremiereFenetre
{
        public static void main(String[] args)
        {
                JFrame f = new JFrame();
                f.setVisible(true);
                f.setTitle("My first window !");
                f.setSize(600, 400);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}