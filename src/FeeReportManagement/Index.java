package FeeReportManagement;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class Index extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5;
    JButton bt1,bt2;
    JPanel p1,p2,p3,p4;
    Font f,f1;
    
    Index()
    {
        super("Home Page");
        setLocation(100,100);
        setSize(500,250);
        
        l1=new JLabel("Fee Report");
        l2=new JLabel("Admin Login");
        l3=new JLabel("Accountant Login");
        l5=new JLabel("Developed by - Jessica Chouhan");
        
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setForeground(Color.blue); 
        
        l5.setForeground(Color.blue);
        
        bt1=new JButton("Login");
        bt2=new JButton("Login");
        
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        
        f=new Font("Arial", Font.BOLD,20);
        f1=new Font("Arial",Font.BOLD,15);
        
        l1.setFont(f);
        l2.setFont(f1);
        l3.setFont(f1);
        bt1.setFont(f1);
        bt2.setFont(f1);
        l5.setFont(f1);
        
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("FeeReportManagement/icons/img1.png"));
        Image img =i.getImage().getScaledInstance(130,100,Image.SCALE_DEFAULT);
        ImageIcon ii=new ImageIcon(img);
        l4=new JLabel(ii);
        
        p1=new JPanel();
        p1.setLayout(new GridLayout(1,1,10,10));
        p1.add(l1);
        
        p2=new JPanel();
        p2.setLayout(new GridLayout(2,1,10,10));
        p2.add(l2);
        p2.add(bt1);
        p2.add(l3);
        p2.add(bt2);
        
        p3=new JPanel();
        p3.setLayout(new GridLayout(1,1,10,10));
        p3.add(l4);
        
        p4=new JPanel();
        p4.setLayout(new GridLayout(1,1,10,10));
        p4.add(l5);
        
        setLayout(new BorderLayout(0,0));
        
        add(p1,"North");
        add(p2,"Center");
        add(p3,"West");
        add(p4,"South");
        
        
        
        
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==bt1){
            new Admin().setVisible(true);
            this.setVisible(false);
        }
        if(e.getSource()==bt2){
            new Accountant().setVisible(true);
            this.setVisible(false);
        }
    }
    public static void main(String[] args) {
        {
            new Index().setVisible(true);
        }
    }
}
