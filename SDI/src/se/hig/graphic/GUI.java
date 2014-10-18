package se.hig.graphic;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI extends JFrame {
	private JButton button;
	private Integer numClicks = 0;
	private JLabel numClicksLabel;
	
	public GUI(String title) {
		// TODO Auto-generated constructor stub
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(400, 400);
		setTitle(title);
		setLayout(new FlowLayout());
		
		// create new components
		button = new JButton("Click me!");
		numClicksLabel = new JLabel("0");
		numClicksLabel.setFont(new Font("Serif", Font.PLAIN, 64));
		
		// add components to view/gui
		add(button);
		add(numClicksLabel);
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				/*if (button.getText().equals("Click")) {
					button.setText("Clicked..");
				} else {
					button.setText("Click");
				}*/
				numClicks++;
				numClicksLabel.setText(numClicks.toString());
				//message dialog
				//JOptionPane.showMessageDialog(null, "Button Clicked!!"); 
			}
		});

	}

}
