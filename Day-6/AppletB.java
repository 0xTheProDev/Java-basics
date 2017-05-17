import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.lang.Exception;

public class AppletB extends Applet implements ActionListener {
	TextField text1, text2, text3;	
	Button btn1, btn2, btn3, btn4;
		
	public void init() {
		text1 = new TextField();
		text2 = new TextField();
		
		btn1 = new Button("Add");
		btn1.addActionListener(this);
		btn2 = new Button("Sub");
		btn2.addActionListener(this);
		btn3 = new Button("Mul");
		btn3.addActionListener(this);
		btn4 = new Button("Div");
		btn4.addActionListener(this);
		
		text3 = new TextField();
		text3.setEditable(false);
		
		add(text1);
		add(text2);
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(text3);
	}
	
	public void actionPerformed(ActionEvent e) {
		try {
			if (e.getSource() == btn1)
				text3.setText(Integer.toString(Integer.parseInt(text1.getText()) + Integer.parseInt(text2.getText())));
			else if (e.getSource() == btn2)
				text3.setText(Integer.toString(Integer.parseInt(text1.getText()) - Integer.parseInt(text2.getText())));
			else if (e.getSource() == btn3)
				text3.setText(Integer.toString(Integer.parseInt(text1.getText()) * Integer.parseInt(text2.getText())));
			else if (e.getSource() == btn4)
				text3.setText(Integer.toString(Integer.parseInt(text1.getText()) / Integer.parseInt(text2.getText())));
			else
				System.err.println("Unknown Event Occured!");
		} catch(Exception ex) {
				System.err.println("You cannot do that!");
		}
	}
}

/*
	<applet code="AppletB.class" height="300" width="300"></applet>
*/