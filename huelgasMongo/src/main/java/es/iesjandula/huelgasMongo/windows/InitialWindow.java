package es.iesjandula.huelgasMongo.windows;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class InitialWindow extends JFrame
{
	/**
	 * Create the frame.
	 */
	public InitialWindow()
	{
		super("Menu Huelgas");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JButton botonHuelga = new JButton("Huelga");
		botonHuelga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonHuelga.setBounds(172, 81, 89, 23);
		getContentPane().add(botonHuelga);
		
		JButton botonConsulta = new JButton("Consulta");
		botonConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame consultaHuelga = new ConsultaHuelga();
				consultaHuelga.setVisible(true);
				setVisible(false);
			}
		});
		botonConsulta.setBounds(172, 119, 89, 23);
		getContentPane().add(botonConsulta);
		
		JButton botonCurso = new JButton("Curso_H");
		botonCurso.setBounds(172, 153, 89, 23);
		getContentPane().add(botonCurso);
		
		JButton BotonSalir = new JButton("Salir");
		BotonSalir.setBackground(new Color(255, 0, 0));
		BotonSalir.setForeground(new Color(255, 255, 255));
		BotonSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		BotonSalir.setBounds(172, 187, 89, 23);
		getContentPane().add(BotonSalir);
		
		JLabel labelHuelgas = new JLabel("Huelgas");
		labelHuelgas.setForeground(new Color(0, 0, 0));
		labelHuelgas.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 30));
		labelHuelgas.setBounds(161, 32, 112, 34);
		getContentPane().add(labelHuelgas);
	}
}
