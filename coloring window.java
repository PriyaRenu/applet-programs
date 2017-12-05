/*displaying a appletviewer with different coloring by click the particular button
--by priya*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class coloring extends Applet implements ActionListener 
{
Color c1,c2,c3,c4;
Button b1,b2,b3;
Label l1;
public void init()
{
b1=new Button("PINK");
b2=new Button("GREEN");
b3=new Button("YELLOW");
l1=new Label("");
add(l1);
add(b1);add(b2);add(b3);
setLayout(null);
l1.setBounds(200,100,100,20);
b1.setBounds(60,250,100,30);
b2.setBounds(200,250,100,30);
b3.setBounds(340,250,100,30);
c1=new Color(245,209,220);
c2=new Color(0,255,0);
c3=new Color(255,255,0);
c4=new Color(255,0,0);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
String str=ae.getActionCommand();
if(str.equals("PINK"))
{
setBackground(c1);
b1.setForeground(c4);
l1.setText("pinky world");
l1.setForeground(c2);
repaint();
}
else if(str.equals("GREEN"))
{
setBackground(c2);
b2.setForeground(c4);
l1.setForeground(c1);
l1.setText("green world");
}
else if(str.equals("YELLOW"))
{
setBackground(c3);
b3.setForeground(c4);
l1.setForeground(c2);
l1.setText("yellow world");
}
}
}
//<applet code=coloring width=500 height=500></applet>
