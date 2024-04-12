package ebookplis;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Loading extends JFrame implements Runnable {

	private JPanel contentPane;
	private JProgressBar progressBar;
	Connection conn;
	int s;
	Thread th;

	public static void main(String[] args) {
            new Loading().setVisible(true);
	}

	public void setUploading() {
            setVisible(false);
            th.start();
	}

	public void run() {
            try {
                for (int i = 0; i < 200; i++) {
                    s = s + 1;
                    int m = progressBar.getMaximum();
                    int v = progressBar.getValue();
                    if (v < m) {
                        progressBar.setValue(progressBar.getValue() + 1);
                    } else {
                        i = 201;
                        setVisible(false);
                        new Home().setVisible(true);
                    }
                    Thread.sleep(50);
                }
            } catch (Exception e) {
		e.printStackTrace();
            }
	}

	public Loading() {
           
            super("Loading");
            th = new Thread((Runnable) this);

            setBounds(600, 300, 600, 400);
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel lbebookplis = new JLabel("EBOOKPLIS");
            lbebookplis.setForeground(Color.white);
            lbebookplis.setFont(new Font("Comics Sans ms ", Font.BOLD, 40));
            lbebookplis.setBounds(130, 46, 500, 35);
            contentPane.add(lbebookplis);
	
            progressBar = new JProgressBar();
            progressBar.setFont(new Font("Comics Sans ms", Font.BOLD, 12));
            progressBar.setBackground(Color.WHITE);
            progressBar.setStringPainted(true);
            progressBar.setBounds(130, 135, 300, 25);
            contentPane.add(progressBar);

            JLabel lblNewLabel_2 = new JLabel("por favor ");
            lblNewLabel_2.setFont(new Font("Comics Sans ms", Font.BOLD, 20));
            lblNewLabel_2.setForeground(Color.WHITE);
            lblNewLabel_2.setBounds(200, 165, 150, 20);
            contentPane.add(lblNewLabel_2);
            
            JLabel lblNewLabel_21 = new JLabel("espere...");
            lblNewLabel_21.setFont(new Font("Comics Sans ms", Font.BOLD, 20));
            lblNewLabel_21.setForeground(Color.WHITE);
            lblNewLabel_21.setBounds(200, 185, 150, 20);
            contentPane.add(lblNewLabel_21);

            JPanel panel = new JPanel();
            panel.setBackground(Color.gray);
            panel.setBounds(0, 0, 590, 390);
            contentPane.add(panel);
                
            setUploading();
	}
}
