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

public class DrawView extends JFrame implements ActionListener {

	public String[] polygons = { "Circle", "Rectangle", "Oktagon" };
	public JLabel applicationJLabel = new JLabel("Polygon Zeichner");
	public JComboBox<String> polygonList = new JComboBox<String>(polygons);
	public JPanel input1Panel = new JPanel();
	public JLabel input1Text = new JLabel("");
	public JTextField input1 = new JTextField("");
	public JPanel input2Panel = new JPanel();
	public JLabel input2Text = new JLabel("");
	public JTextField input2 = new JTextField("");
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
		this.add(polygonList);
		input1Panel.setBorder(new EmptyBorder(20, 20, 20, 20));
		this.add(input1Panel);
		input2Panel.setBorder(new EmptyBorder(20, 20, 20, 20));
		this.add(input2Panel);
		drawButton.setHorizontalAlignment(SwingConstants.CENTER);
		drawButton.setBorder(new EmptyBorder(20, 20, 20, 20));
		this.add(drawButton);

		this.setVisible(true);
		this.setSize(600, 600);
		this.repaint();
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
