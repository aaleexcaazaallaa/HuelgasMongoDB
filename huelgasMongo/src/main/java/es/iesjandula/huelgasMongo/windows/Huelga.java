package es.iesjandula.huelgasMongo.windows;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Huelga extends JFrame
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public Huelga()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox cursoComboBox = new JComboBox();
		cursoComboBox.setBounds(175, 43, 224, 35);
		contentPane.add(cursoComboBox);
		
		JLabel cursoLabel = new JLabel("CURSO");
		cursoLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		cursoLabel.setBounds(53, 43, 112, 42);
		contentPane.add(cursoLabel);
		
		JLabel huelgaLabel = new JLabel("HUELGA");
		huelgaLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		huelgaLabel.setBounds(53, 96, 112, 42);
		contentPane.add(huelgaLabel);
		
		JComboBox huelgaCombobox = new JComboBox();
		huelgaCombobox.setBounds(175, 103, 224, 35);
		contentPane.add(huelgaCombobox);
		
		JButton botonAceptar = new JButton("ACEPTAR");
		botonAceptar.setForeground(new Color(255, 255, 255));
		botonAceptar.setBackground(new Color(0, 255, 0));
		botonAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonAceptar.setBounds(67, 487, 112, 52);
		contentPane.add(botonAceptar);
		
		JButton botonSalir = new JButton("SALIR");
		botonSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InitialWindow initialWindow = new InitialWindow();
				initialWindow.setVisible(true);
				setVisible(false);
			}
		});
		botonSalir.setBackground(new Color(255, 0, 0));
		botonSalir.setForeground(new Color(255, 255, 255));
		botonSalir.setBounds(613, 487, 112, 52);
		contentPane.add(botonSalir);
		
		JCheckBoxMenuItem alumnosCheckBox = new JCheckBoxMenuItem("New check item");
		alumnosCheckBox.setBounds(67, 169, 658, 294);
		contentPane.add(alumnosCheckBox);
	}
}

