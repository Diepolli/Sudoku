
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class Layout {
	private JPanel Feld;
	//private JTextField Feld1;
	JTextField[][] Reihen = new JTextField[9][9];
	
	public Layout()
	{
	JFrame window= new JFrame();
	window.setTitle("Sudoku");
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setSize(800,800);
	window.setBackground(Color.lightGray);
	
	JPanel Feld=new JPanel();
	
	
	window.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		
		Layout Sudoku = new Layout();
	}
}
