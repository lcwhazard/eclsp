package Graphique;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Formatage
{
 
        public Formatage()
        {
                JFrame frame = new JFrame();
                frame.setTitle("Gestionnaire de disque dur");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().setLayout(new FlowLayout());
                JButton format = new JButton("Formater le disque dur");
                JButton stop = new JButton("Interrompre le formatage");
                frame.getContentPane().add(format);
                frame.getContentPane().add(stop);
                stop.addActionListener(new ActionListener()
                {
						public void actionPerformed(ActionEvent e) {
							System.out.println("Formatage interrompu");
						}
                });
                
                format.addActionListener(new ActionListener()
                {
						public void actionPerformed(ActionEvent e) {
							System.out.println("Formatage en cours");
						}
                });
                frame.setVisible(true);
                frame.pack();
                frame.setResizable(true);
        }

        public static void main(String[] args)
        {
                new Formatage();
        }

}
