/*displaying a appletviewer to perform a login program with password
--by priya*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class login_form extends Applet implements  
ActionListener
{
Color c=new Color(255,0,255);
Label l1,l2;
TextField t1,t2,t3;
Button b1,b2;
public void init()
{
l1=new Label("USER_NAME");
l2=new Label("PASSWORD");
t1=new TextField(20);
t2=new TextField(8);
t3=new TextField(100);
b1=new Button("LOGIN");
b2=new Button("CLEAR");
add(l1); add(t1);
t2.setEchoChar('*');
add(l2); add(t2);
add(b1); add(b2);
setLayout(new BorderLayout());
add(t3,BorderLayout.SOUTH);
l1.setBounds(100,100,100,20);t1.setBounds(220,100,100,20);
l2.setBounds(100,140,100,20);t2.setBounds(220,140,100,20);
b1.setBounds(150,220,50,20);b2.setBounds(300,220,50,20);
b1.addActionListener(this);
b2.addActionListener(this);
t3.setBounds(0,500,500,20);
}
public void actionPerformed(ActionEvent ae)
{
setBackground(c);
String str1=t1.getText();
String str2=t2.getText();
if(ae.getSource()==b1)
{
if(str1.equals("laksh")&&str2.equals("simran"))
t3.setText("login successfull");
else
t3.setText("login failure try again");
}
if(ae.getSource()==b2)
{
t1.setText("");
t2.setText("");
t3.setText("");
t1.requestFocus();
}}
}//<applet code=login_form  width=5 height=500></applet> 