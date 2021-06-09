import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class login extends JFrame
{
JCheckBox c1;
JButton b1;
JTextField t1,t2;
JLabel l1,l2,l3;

login()
{
new JFrame("Login");
Font f = new Font("Verdana", Font.BOLD, 25);
setSize(300,300);
setLocation(200,200);
setVisible(true);
setLayout(null);

l1 = new JLabel("Login");
l1.setFont(f);
l1.setBounds(100,20,200,30);

t1 = new JTextField("Username");
t1.setBounds(20,60,200,30);
t2 = new JTextField("Password");
t2.setBounds(20,100,200,30);

b1 = new JButton("Login");
b1.setBounds(100,150,80,25);

c1 = new JCheckBox("Remember me");
c1.setBounds(20,190,120,25);

l3 = new JLabel("Forgot Password?");
l3.setForeground(Color.blue);
l3.setBounds(150,190,100,25);

add(l1);
add(t1);
add(t2);
add(b1);
add(c1);
add(l3);
}
public static void main(String s[])
{
new login();
}
}