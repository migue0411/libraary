package ebookplis;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;

public class IssueBook extends JFrame implements ActionListener{

    private JPanel contentPane;
    
    private JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15;
    private JButton b1,b2,b3,b4;

    public static void main(String[] args) {
	new IssueBook().setVisible(true);
			
    }

    public IssueBook() {
	setBounds(370, 200, 800, 500);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
        contentPane.setBackground(Color.gray);
	contentPane.setLayout(null);

	JLabel l1 = new JLabel("LIBRO_id");
	l1.setFont(new Font("Tahoma", Font.BOLD, 14));
	l1.setForeground(new Color(41, 41, 41));
	l1.setBounds(47, 63, 100, 23);
	contentPane.add(l1);

	JLabel l2 = new JLabel("NOMBRE");
	l2.setForeground(new Color(41, 41, 41));
	l2.setFont(new Font("Tahoma", Font.BOLD, 14));
	l2.setBounds(47, 97, 100, 23);
	contentPane.add(l2);

	JLabel l3 = new JLabel("ISBN");
	l3.setForeground(new Color(41, 41, 41));
	l3.setFont(new Font("Tahoma", Font.BOLD, 14));
	l3.setBounds(47, 131, 100, 23);
	contentPane.add(l3);

	JLabel l4 = new JLabel("EDITOR");
	l4.setForeground(new Color(41, 41, 41));
	l4.setFont(new Font("Tahoma", Font.BOLD, 14));
	l4.setBounds(47, 165, 100, 23);
	contentPane.add(l4);

	JLabel l5 = new JLabel("Edicion");
	l5.setForeground(new Color(41, 41, 41));
	l5.setFont(new Font("Tahoma", Font.BOLD, 14));
	l5.setBounds(47, 199, 100, 23);
	contentPane.add(l5);

	JLabel l6 = new JLabel("Precio");
	l6.setForeground(new Color(41, 41, 41));
	l6.setFont(new Font("Tahoma", Font.BOLD, 14));
	l6.setBounds(47, 233, 100, 23);
	contentPane.add(l6);

	

	t1 = new JTextField();
	t1.setForeground(new Color(47, 79, 79));
	t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t1.setBounds(126, 66, 86, 20);
	contentPane.add(t1);
	
	b1 = new JButton("buscar");
	b1.addActionListener(this);
	b1.setBorder(new LineBorder(new Color(41, 41, 41), 1, true));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
	b1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b1.setBounds(234, 59, 100, 30);
        
	contentPane.add(b1);

	t2 = new JTextField();
	t2.setEditable(false);
	t2.setForeground(new Color(41, 41, 41));
	t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t2.setBounds(126, 100, 208, 20);
	contentPane.add(t2);
	t2.setColumns(10);

	t3 = new JTextField();
	t3.setEditable(false);
	t3.setForeground(new Color(41, 41, 41));
	t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t3.setColumns(10);
	t3.setBounds(126, 131, 208, 20);
	contentPane.add(t3);

	t4 = new JTextField();
	t4.setEditable(false);
	t4.setForeground(new Color(41, 41, 41));
	t4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t4.setColumns(10);
	t4.setBounds(126, 168, 208, 20);
	contentPane.add(t4);

	t5 = new JTextField();
	t5.setEditable(false);
	t5.setForeground(new Color(41, 41, 41));
	t5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t5.setColumns(10);
	t5.setBounds(126, 202, 208, 20);
	contentPane.add(t5);

	t6 = new JTextField();
	t6.setEditable(false);
	t6.setForeground(new Color(41, 41, 41));
	t6.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t6.setColumns(10);
	t6.setBounds(126, 236, 208, 20);
	contentPane.add(t6);

	
	JPanel panel = new JPanel();
	panel.setBorder(new TitledBorder(new LineBorder(new Color(41, 41, 41), 2, true), "Issue-Book",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(41, 41, 41)));
	panel.setFont(new Font("Tahoma", Font.BOLD, 14));
	panel.setBounds(10, 38, 345, 288);
        panel.setBackground(Color.WHITE);
	contentPane.add(panel);

	JLabel l8 = new JLabel("estudiante_id");
	l8.setForeground(new Color(41, 41, 41));
	l8.setFont(new Font("Tahoma", Font.BOLD, 14));
	l8.setBounds(384, 63, 100, 23);
	contentPane.add(l8);

	JLabel l9 = new JLabel("nombre");
	l9.setForeground(new Color(41, 41, 41));
	l9.setFont(new Font("Tahoma", Font.BOLD, 14));
	l9.setBounds(384, 103, 100, 23);
	contentPane.add(l9);

	JLabel l10 = new JLabel("nombre del ");
	l10.setForeground(new Color(41, 41, 41));
	l10.setFont(new Font("Tahoma", Font.BOLD, 14));
	l10.setBounds(384, 147, 100, 23);
	contentPane.add(l10);
        
        JLabel l101 = new JLabel(" padre");
	l101.setForeground(new Color(41, 41, 41));
	l101.setFont(new Font("Tahoma", Font.BOLD, 14));
	l101.setBounds(384, 160, 100, 23);
	contentPane.add(l101);

	
	JLabel l12 = new JLabel("programa");
	l12.setForeground(new Color(41, 41, 41));
	l12.setFont(new Font("Tahoma", Font.BOLD, 14));
	l12.setBounds(384, 187, 100, 23);
	contentPane.add(l12);

	JLabel l13 = new JLabel("año");
	l13.setForeground(new Color(41, 41, 41));
	l13.setFont(new Font("Tahoma", Font.BOLD, 14));
	l13.setBounds(384, 233, 100, 23);
	contentPane.add(l13);

	JLabel l14 = new JLabel("semestre");
	l14.setForeground(new Color(41, 41, 41));
	l14.setFont(new Font("Tahoma", Font.BOLD, 14));
	l14.setBounds(384, 284, 100, 23);
	contentPane.add(l14);

	t8 = new JTextField();
	t8.setForeground(new Color(41, 41, 41));
	t8.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t8.setColumns(10);
	t8.setBounds(508, 66, 86, 20);
	contentPane.add(t8);

	b2 = new JButton("buscar");
	b2.addActionListener(this);
	b2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b2.setBorder(new LineBorder(new Color(41, 41, 41), 1, true));
	b2.setBounds(604, 59, 100, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
	contentPane.add(b2);

	t9 = new JTextField();
	t9.setForeground(new Color(41, 41, 41));
	t9.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t9.setEditable(false);
	t9.setColumns(10);
	t9.setBounds(508, 106, 208, 20);
	contentPane.add(t9);

	t10 = new JTextField();
	t10.setForeground(new Color(41, 41, 41));
	t10.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t10.setEditable(false);
	t10.setColumns(10);
	t10.setBounds(508, 150, 208, 20);
	contentPane.add(t10);

	

	t12 = new JTextField();
	t12.setForeground(new Color(41, 41, 41));
	t12.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t12.setEditable(false);
	t12.setColumns(10);
	t12.setBounds(508, 190, 208, 20);
	contentPane.add(t12);

	t13 = new JTextField();
	t13.setForeground(new Color(41, 41, 41));
	t13.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t13.setEditable(false);
	t13.setColumns(10);
	t13.setBounds(508, 236, 208, 20);
	contentPane.add(t13);

	t14 = new JTextField();
	t14.setForeground(new Color(41, 41, 41));
	t14.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t14.setEditable(false);
	t14.setColumns(10);
	t14.setBounds(508, 286, 208, 20);
	contentPane.add(t14);

	JPanel panel_1 = new JPanel();
	panel_1.setBorder(new TitledBorder(new LineBorder(new Color(41, 41, 41), 2, true), "Student-Deatails",
			TitledBorder.LEADING, TitledBorder.TOP, null, new Color(41, 41, 41)));
	panel_1.setForeground(new Color(0, 100, 0));
	panel_1.setBounds(360, 38, 378, 372);
        panel_1.setBackground(Color.WHITE);
	contentPane.add(panel_1);
        
	JLabel l15 = new JLabel("fecha(a-m-d):");
	l15.setForeground(new Color(41, 41, 41));
	l15.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	l15.setBounds(20, 340, 118, 26);
	contentPane.add(l15);

	t15 = new JTextField();
	t15.setBorder(new LineBorder(new Color(41, 41, 41), 1, true));
	t15.setForeground(new Color(41, 41, 41));
	t15.setBounds(137, 337, 200, 29);
	contentPane.add(t15);

	b3 = new JButton("edicion");
	b3.addActionListener(this);
	b3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b3.setBorder(new LineBorder(new Color(41, 41, 41), 1, true));
	b3.setBounds(47, 377, 118, 33);
	b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        contentPane.add(b3);

	b4 = new JButton("volver");
	b4.addActionListener(this);
	b4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b4.setBorder(new LineBorder(new Color(41, 41, 41), 1, true));
	b4.setBounds(199, 377, 100, 33);
	b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        contentPane.add(b4);
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            conn con = new conn();
            if(ae.getSource() == b1){
                String sql = "select * from book where book_id = ?";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, t1.getText());
		ResultSet rs = st.executeQuery();
		
                while (rs.next()) {
                    t2.setText(rs.getString("name"));
                    t3.setText(rs.getString("isbn"));
                    t4.setText(rs.getString("publisher"));
                    t5.setText(rs.getString("edition"));
                    t6.setText(rs.getString("price"));
                    t7.setText(rs.getString("pages"));
		}
		st.close();
		rs.close();
		
            }
            if(ae.getSource() == b2){
                String sql = "select * from student where student_id = ?";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, t8.getText());
		ResultSet rs = st.executeQuery();
		
                while (rs.next()) {
                    t9.setText(rs.getString("name"));
                    t10.setText(rs.getString("father"));
                    t12.setText(rs.getString("branch"));
                    t13.setText(rs.getString("year"));
                    t14.setText(rs.getString("semester"));
		}
		st.close();
		rs.close();
		
            }
            if(ae.getSource() == b3){
                    try{
                String sql = "insert into issueBook(book_id, student_id, bname, sname, branch, dateOfIssue) values( ?, ?, ?, ?, ?, ?)";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, t1.getText());
		st.setString(2, t8.getText());
		st.setString(3, t2.getText());
		st.setString(4, t9.getText());
		st.setString(5, t12.getText());
		st.setString(6, t15.getText());
		int i = st.executeUpdate();
		if (i > 0)
                    JOptionPane.showMessageDialog(null, "añadido..!");
		else
                    JOptionPane.showMessageDialog(null, "error");
                    }catch(Exception e){
                        e.printStackTrace();
                                }
            }
            if(ae.getSource() == b4){
                this.setVisible(false);
		new Home().setVisible(true);
			
            }
            
            con.c.close();
        }catch(Exception e){
            
        }
    }
}
