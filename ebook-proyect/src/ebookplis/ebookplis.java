package ebookplis;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ebookplis extends JFrame implements ActionListener{

        JLabel l1;
        JButton b1;
        
        public ebookplis() {
		
                setSize(1366,768);
                setLayout(null);
                setLocation(0,0);

		l1 = new JLabel("");
                b1 = new JButton("Next");
                
                b1.setBackground(Color.WHITE);
                b1.setForeground(Color.BLACK);
				
                
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("ebookplis/icons/ebookplis1.png"));
                Image i3 = i1.getImage().getScaledInstance(1366,768,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                l1 = new JLabel(i2);
                
                b1.setBounds(1050,250,200,60);
		l1.setBounds(0, 0, 1366,768);
                
                l1.add(b1);
		add(l1);
                
                b1.addActionListener(this);
	}
        
        public void actionPerformed(ActionEvent ae){
                new Login_user().setVisible(true);
                this.setVisible(false);
                
        }
        
        public static void main(String[] args) {
                ebookplis window = new ebookplis();
                window.setVisible(true);			
	}
}
