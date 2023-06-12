package view;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ResultView extends JPanel {

	public JFrame frame = new JFrame();
	public JPanel valuesJPanel = new JPanel();
	public JLabel scope = new JLabel("Umfang: ");
	public JLabel surfaceArea = new JLabel("Flächeninhalt: ");
	public String shape = "";
	public int value1 = 0;
	public int value2 = 0;

	public ResultView(String s, String value1, String value2) {

		frame.setTitle("Your Polygon!");
		frame.setLayout(new BorderLayout());

		frame.add(this, BorderLayout.CENTER);

		valuesJPanel.setLayout(new GridLayout(2, 1));

		scope.setHorizontalAlignment(SwingConstants.CENTER);
		scope.setBorder(new EmptyBorder(20, 20, 20, 20));
		valuesJPanel.add(scope, BorderLayout.PAGE_END);

		surfaceArea.setHorizontalAlignment(SwingConstants.CENTER);
		surfaceArea.setBorder(new EmptyBorder(20, 20, 20, 20));
		valuesJPanel.add(surfaceArea, BorderLayout.WEST);

		frame.add(valuesJPanel, BorderLayout.PAGE_END);

		frame.setVisible(true);
		frame.setSize(600, 600);
		frame.repaint();
		frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);

		shape = s;
		this.value1 = Integer.parseInt(value1);
		if (value2.equals("")) {

		} else {
			this.value2 = Integer.parseInt(value2);
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		switch (shape) {
		case "Rectangle": {
			g.drawRect(5, 5, value2, value1);
			break;
		}
		case "Circle": {
			g.drawOval(5, 5, value1, value1);
			break;
		}
		case "Oktagon": {
			g.drawPolygon(
					new int[] { value1 * 3, value1 * 4, value1 * 4, value1 * 3, value1 * 2, value1, value1,
							value1 * 2 },
					new int[] { value1 * 4, value1 * 3, value1 * 2, value1, value1, value1 * 2, value1 * 3,
							value1 * 4 },
					8);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + shape);
		}
	}

}
