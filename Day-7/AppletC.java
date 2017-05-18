import javax.swing.*;
import java.awt.event.*;
import java.lang.Exception;

public class AppletC extends JApplet implements ActionListener {
	JButton add, sub, mul, div;
	JTextField text1, text2, text3;
	JOptionPane msg;
	
	public void init() {
		add = new JButton("+");
		add.setBounds(5, 80, 45, 30);
		add.addActionListener(this);
		sub = new JButton("-");
		sub.setBounds(50, 80, 40, 30);
		sub.addActionListener(this);
		mul = new JButton("*");
		mul.setBounds(90, 80, 40, 30);
		mul.addActionListener(this);
		div = new JButton("/");
		div.setBounds(130, 80, 40, 30);
		div.addActionListener(this);
		
		text1 = new JTextField();
		text1.setBounds(10, 10, 100, 30);
		text2 = new JTextField();
		text2.setBounds(10, 40, 100, 30);
		text3 = new JTextField();
		text3.setBounds(10, 120, 100, 30);
		text3.setEditable(false);
		
		msg = new JOptionPane();
		
		add(text1);
		add(text2);
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(text3);
	}
	
	public void actionPerformed(ActionEvent e) {
		try {
			if (e.getSource() == add)
				text3.setText(Integer.toString(Integer.parseInt(text1.getText()) + Integer.parseInt(text2.getText())));
			else if (e.getSource() == sub)
				text3.setText(Integer.toString(Integer.parseInt(text1.getText()) - Integer.parseInt(text2.getText())));
			else if (e.getSource() == mul)
				text3.setText(Integer.toString(Integer.parseInt(text1.getText()) * Integer.parseInt(text2.getText())));
			else if (e.getSource() == div)
				text3.setText(Integer.toString(Integer.parseInt(text1.getText()) / Integer.parseInt(text2.getText())));
			else
				System.err.println("Unknown Event Occured!");
		} catch(Exception ex) {
				msg.showMessageDialog(this, "You cannot do that!");
		}
	}
}

/*
	<applet code="AppletC.class" height="300" width="300"></applet>
*/