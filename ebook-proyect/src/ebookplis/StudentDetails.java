
package ebookplis;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

import net.proteanit.sql.DbUtils;
import java.sql.*;
import java.awt.event.*;
        

public class StudentDetails extends JFrame implements ActionListener{
    String x[] = {"student_id","Name","father","branch","year","semester"};
     JPanel contentPane;
    private JTable table;
    
    JTable t1;
     JLabel l1,l2,l3,l21;
    JTextField t2;
     String y[][] = new String[20][13];
    int i=0, j=0;
    private JButton b1,b2,b3;

  
    
   

    public StudentDetails() {
        
        
        
        super("detalles de los estudiantes");
        setSize(1366,768);
        setLocation(0,0);
        setLayout(null);
        
        setBackground(new Color(200, 100, 200));	
        
       
        
        l1 = new JLabel("introdusca la id del estudiante : ");
        l1.setBounds(50,360,400,30);
        l1.setFont(new Font("serif",Font.BOLD,20));
        add(l1);
        
        
        t2 = new JTextField();
        
        t2.setBounds(400,360,200,30);
        t2.setBackground(Color.LIGHT_GRAY);
        t2.setForeground(Color.black);
        add(t2);
        
        
        b1 = new JButton("eliminar");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(620, 360, 100 ,30);
        add(b1);
        
        
        b2 = new JButton("volver");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(300, 450, 150 ,30);
        add(b2);
        
            
       
        b1.addActionListener(this);
        b2.addActionListener(this);
        
               
        
	

	


	
        
        
        try{
            conn conn  = new conn();
            String s1 = "select * from student";
            ResultSet rs  = conn.s.executeQuery(s1);
            while(rs.next()){
                y[i][j++]=rs.getString("student_id");
                y[i][j++]=rs.getString("name");
                y[i][j++]=rs.getString("father");
                y[i][j++]=rs.getString("branch");
                y[i][j++]=rs.getString("year");
                y[i][j++]=rs.getString("semester");
                
                i++;
                j=0;
            }
            t1 = new JTable(y,x);
            t1.setForeground(new Color(41,41,41));
            t1.setBackground(Color.LIGHT_GRAY);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        JScrollPane sp = new JScrollPane(t1);
        sp.setBounds(20,20,1200,330); 
        sp.setBackground(Color.LIGHT_GRAY);
         
        add(sp);
       
        
        getContentPane().setBackground(Color.GRAY);
        
        b1.addActionListener(this);
        
        
        
         
    }
    
        
    
    public void actionPerformed(ActionEvent ae){
        
            
            conn con = new conn();
            
            if(ae.getSource() == b1){
                try{
            
                String a = t2.getText();
                String q = "DELETE from student where student_id = '"+a+"'";
                con.s.executeUpdate(q);
              
                this.setVisible(false);
                new StudentDetails().setVisible(true);
            }catch(Exception e){}
            } else if(ae.getSource() == b2){
            new Home().setVisible(true);
            this.setVisible(false);
        }
        }
    
    public static void main(String[] args){
        new StudentDetails().setVisible(true);
    }
}
