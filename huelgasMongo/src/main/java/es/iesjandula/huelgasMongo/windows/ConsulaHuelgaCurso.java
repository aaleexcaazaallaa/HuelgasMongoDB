package es.iesjandula.huelgasMongo.windows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class ConsulaHuelgaCurso extends JFrame
{

	private JPanel contentPane;


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
		
		JLabel lblNewLabel = new JLabel("Curso :");
		lblNewLabel.setBounds(147, 75, 147, 44);
		contentPane.add(lblNewLabel);
	}
}
