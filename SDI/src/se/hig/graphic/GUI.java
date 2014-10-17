package se.hig.graphic;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI extends JFrame {
	private JButton button;

	public GUI(String title) {
		// TODO Auto-generated constructor stub
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(400, 400);
		setTitle(title);
		setLayout(new FlowLayout());

		button = new JButton("Click");
		add(button);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (button.getText().equals("Click")) {
					button.setText("Clicked..");
				} else {
					button.setText("Click");
				}

			}
		});

	}

}
