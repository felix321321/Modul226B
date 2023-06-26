package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.event.*;

public class DrawView extends JFrame implements ActionListener {

	public String[] polygons = { "Rectangle", "Circle", "Oktagon" };
	public JLabel applicationJLabel = new JLabel("Polygon Zeichner");
	public JComboBox<String> polygonList = new JComboBox<String>(polygons);
	public JPanel input1Panel = new JPanel();
	public JLabel input1Text = new JLabel("Höhe:");
	public JTextField input1 = new JTextField("Hier Höhe eingeben");
	public JPanel input2Panel = new JPanel();
	public JLabel input2Text = new JLabel("Breite:");
	public JTextField input2 = new JTextField("Hier Breite eingeben");
	public JButton drawButton = new JButton("Zeichnen!");

	public DrawView() {
		this.setTitle("Polygon Zeichner");
		this.setLayout(new GridLayout(5, 1));

		input1Panel.setLayout(new GridLayout(1, 2));
		input1Text.setHorizontalAlignment(SwingConstants.CENTER);
		input1Panel.add(input1Text);
		input1.setHorizontalAlignment(SwingConstants.CENTER);
		input1Panel.add(input1);

		input2Panel.setLayout(new GridLayout(1, 2));
		input2Text.setHorizontalAlignment(SwingConstants.CENTER);
		input2Panel.add(input2Text);
		input2.setHorizontalAlignment(SwingConstants.CENTER);
		input2Panel.add(input2);

		applicationJLabel.setHorizontalAlignment(SwingConstants.CENTER);
		applicationJLabel.setBorder(new EmptyBorder(20, 20, 20, 20));
		this.add(applicationJLabel);

		((JLabel) polygonList.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		polygonList.setBorder(new EmptyBorder(20, 20, 20, 20));
		polygonList.addActionListener(this);
		this.add(polygonList);

		input1Panel.setBorder(new EmptyBorder(20, 20, 20, 20));
		this.add(input1Panel);

		input2Panel.setBorder(new EmptyBorder(20, 20, 20, 20));
		this.add(input2Panel);

		drawButton.setHorizontalAlignment(SwingConstants.CENTER);
		drawButton.setBorder(new EmptyBorder(20, 20, 20, 20));
		drawButton.addActionListener(this);
		this.add(drawButton);

		this.setVisible(true);
		this.setSize(600, 600);
		this.repaint();
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
	}

	public void selectPolygon(String s) {
		switch (s) {
		case "Rectangle": {
			this.input1Text.setText("Höhe:");
			this.input1.setText("Hier Höhe eingeben (Zwischen 100-400 empfohlen)");
			this.input2Panel.setVisible(true);
			this.input2Text.setText("Breite:");
			this.input2.setText("Hier Breite eingeben (Zwischen 100-400 empfohlen)");
			this.repaint();
			break;
		}
		case "Circle": {
			this.input1Text.setText("Radius:");
			this.input1.setText("Hier Radius eingeben (Zwischen 100-400 empfohlen)");
			this.input2Panel.setVisible(false);
			break;
		}
		case "Oktagon": {
			this.input1Text.setText("Seitenlänge");
			this.input1.setText("Hier Seitenlänge eingeben (Zwischen 50-100 empfohlen)");
			this.input2Panel.setVisible(false);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + s);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == polygonList) {
			selectPolygon(polygonList.getSelectedItem().toString());
		}
		if (e.getSource() == drawButton) {
			ResultView resultview = new ResultView(polygonList.getSelectedItem().toString(), input1.getText(),
					input2.getText());
			this.dispose();
		}
	}

}
