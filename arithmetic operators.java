/*displaying a appletviewer to perform a basic arithmetic operators
--by priya*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class arithmatic extends Applet implements  
ActionListener
{
Color c=new Color(130,140,200);
Label l1,l2,l3;
TextField t1,t2,t3,t4;
Button b1,b2,b3,b4,b5;
public void init()
{
l1=new Label("Number1");
l2=new Label("Number2");
l3=new Label("Results");
t1=new TextField(20);
t2=new TextField(20);
t3=new TextField(20);
t4=new TextField(100);
b1=new Button("ADD");
b2=new Button("SUB");
b3=new Button("MUL");
b4=new Button("DIV");
b5=new Button("CLEAR");
add(l1);add(t1);
add(l2);add(t2);
add(l3);add(t3);
add(b1);add(b2);add(b3);add(b4);add(b5);
setLayout(new BorderLayout());
add(t4,BorderLayout.SOUTH);
l1.setBounds(100,100,100,20);t1.setBounds(220,100,100,20);
l2.setBounds(100,140,100,20);t2.setBounds(220,140,100,20);
l3.setBounds(100,180,100,20);t3.setBounds(220,180,100,20);
b1.setBounds(70,220,50,20);b2.setBounds(160,220,50,20);b3.setBounds(250,220,50,20);b4.setBounds(340,220,50,20);b5.setBounds(420,220,50,20);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
t4.setBounds(0,500,500,20);
}
public void actionPerformed(ActionEvent ae)
{
setBackground(c);
double a,b,c;
if(ae.getSource()==b1)
{
a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());
c=a+b;
t3.setText(String.valueOf(c));
t4.setText("addition is performed");
}
if(ae.getSource()==b2)
{
a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());
c=a-b;
t3.setText(String.valueOf(c));
t4.setText("subtraction is performed");
}
if(ae.getSource()==b3)
{
a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());
c=a*b;
t3.setText(String.valueOf(c));
t4.setText("multiplication is performed");
}
if(ae.getSource()==b4)
{
a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());
c=a/b;
t3.setText(String.valueOf(c));
t4.setText("division is performed");
}
if(ae.getSource()==b5) {
 t1.setText("");
 t2.setText("");
 t3.setText("");
 t1.requestFocus();
 t4.setText("all the data’s have been cleared");
 }
}   
}
//<applet code=arithmatic width=500   height=500></applet>  
