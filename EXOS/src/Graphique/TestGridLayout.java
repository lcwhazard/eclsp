package Graphique;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TestGridLayout
{
        JButton[] jButtons;

        
        

        public TestGridLayout()
        {
                JFrame frame = new JFrame();
                jButtons = new JButton[4];
                frame.setTitle("One More Window !");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().setLayout(new GridLayout(2, 2));
                jButtons[0] = new JButton("my First JButton");
                jButtons[1] = new JButton("my Second JButton");
                jButtons[2] = new JButton("my Third JButton");
                jButtons[3] = new JButton("my Fourth JButton");
                for (int i = 0; i < 4; i++)
                {
                        final int bouton =i;
                        frame.getContentPane().add(jButtons[i]);
                        jButtons[i].addActionListener(new ActionListener(){
                        	public void actionPerformed(ActionEvent e)
                        	{
                        		System.out.println("Click on JButton " + (bouton+1));
                        	}
                        });
                }
                frame.setVisible(true);
                frame.pack();
        }

        public static void main(String[] args)
        {
                new TestGridLayout();
        }
}