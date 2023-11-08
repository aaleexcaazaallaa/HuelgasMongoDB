package es.iesjandula.huelgasMongo.windows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;

public class ConsulaHuelgaCurso extends JFrame
{

	private JPanel contentPane;
	private JTextField textField;


	/**
	 * Create the frame.
	 */
	public ConsulaHuelgaCurso()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelCurso = new JLabel("Curso :");
		labelCurso.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelCurso.setBounds(219, 40, 73, 44);
		contentPane.add(labelCurso);
		
		JLabel labelFecha = new JLabel("Fecha :");
		labelFecha.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelFecha.setBounds(219, 95, 73, 44);
		contentPane.add(labelFecha);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(326, 48, 239, 37);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(326, 99, 239, 44);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JList listAlumnos = new JList();
		listAlumnos.setBounds(219, 150, 346, 310);
		contentPane.add(listAlumnos);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAceptar.setBounds(99, 497, 129, 37);
		contentPane.add(btnAceptar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSalir.setBounds(327, 497, 129, 37);
		contentPane.add(btnSalir);
		
		JButton btnMagia = new JButton("Magia?");
		btnMagia.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMagia.setBounds(555, 497, 129, 37);
		contentPane.add(btnMagia);
	}
}
