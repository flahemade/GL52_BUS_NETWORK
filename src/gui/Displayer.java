package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Displayer extends JPanel {
	static final long serialVersionUID = 1;

	 public Displayer() {
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(800, 600));
	 } 
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
}
