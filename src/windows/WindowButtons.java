package windows;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

import controller.WindowController;

public class WindowButtons extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JButton btnShowAlumnos;
	private JButton btnShowAsignaturas;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;

	public WindowButtons(WindowController w) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 419, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnShowAlumnos = new JButton("Mostrar alumnos");
		btnShowAlumnos.setBounds(20, 11, 169, 57);
		contentPane.add(btnShowAlumnos);
		
		btnShowAsignaturas = new JButton("Mostrar asignaturas");
		btnShowAsignaturas.setBounds(215, 11, 164, 57);
		contentPane.add(btnShowAsignaturas);
		
		btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(118, 79, 156, 57);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(20, 147, 169, 57);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(215, 147, 164, 57);
		contentPane.add(btnNewButton_4);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
