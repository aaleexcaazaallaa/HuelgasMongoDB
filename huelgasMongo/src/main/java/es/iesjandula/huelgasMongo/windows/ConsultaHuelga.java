package es.iesjandula.huelgasMongo.windows;

import java.awt.Color;
import java.awt.Font;
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
import javax.swing.JCheckBox;

public class ConsultaHuelga extends JFrame
{

	private JPanel contentPane;
	private JTextField textFieldFecha;
	private JTextField textFieldNumAlumnosEnHuelga;
	private JTextField textFieldCursoConMasAlumnos;
	private JTextField textFieldCursoConMenosAlumnos;

	/**
	 * Create the frame.
	 */
	public ConsultaHuelga()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAceptar = new JButton("ACEPTAR");
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAceptar.setBackground(Color.GREEN);
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAceptar.setBounds(160, 444, 177, 59);
		contentPane.add(btnAceptar);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSalir.setBackground(Color.RED);
		btnSalir.setForeground(Color.WHITE);
		btnSalir.setBounds(448, 444, 177, 59);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame initialWindow = new InitialWindow();
				initialWindow.setVisible(true);
				setVisible(false);
			}
		});
		contentPane.add(btnSalir);
		
		JLabel lblFecha = new JLabel("FECHA:");
		lblFecha.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFecha.setBounds(160, 80, 79, 44);
		contentPane.add(lblFecha);
		
		textFieldFecha = new JTextField();
		textFieldFecha.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldFecha.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldFecha.setBounds(272, 81, 353, 44);
		contentPane.add(textFieldFecha);
		textFieldFecha.setColumns(10);
		
		JLabel lblNumAlumnosEnHuelga = new JLabel("Nº DE ALUMNOS EN HUELGA:");
		lblNumAlumnosEnHuelga.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNumAlumnosEnHuelga.setBounds(160, 152, 299, 44);
		contentPane.add(lblNumAlumnosEnHuelga);
		
		textFieldNumAlumnosEnHuelga = new JTextField();
		textFieldNumAlumnosEnHuelga.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldNumAlumnosEnHuelga.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldNumAlumnosEnHuelga.setColumns(10);
		textFieldNumAlumnosEnHuelga.setBounds(479, 153, 146, 44);
		contentPane.add(textFieldNumAlumnosEnHuelga);
		
		JLabel lblCursoConMasAlumnos = new JLabel("CURSO CON MÁS ALUMNOS:");
		lblCursoConMasAlumnos.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCursoConMasAlumnos.setBounds(160, 224, 285, 44);
		contentPane.add(lblCursoConMasAlumnos);
		
		textFieldCursoConMasAlumnos = new JTextField();
		textFieldCursoConMasAlumnos.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCursoConMasAlumnos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldCursoConMasAlumnos.setColumns(10);
		textFieldCursoConMasAlumnos.setBounds(479, 225, 146, 44);
		contentPane.add(textFieldCursoConMasAlumnos);
		
		JLabel lblCursoConMenosAlumnos = new JLabel("CURSO CON MENOS ALUMNOS:");
		lblCursoConMenosAlumnos.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCursoConMenosAlumnos.setBounds(160, 293, 313, 44);
		contentPane.add(lblCursoConMenosAlumnos);
		
		textFieldCursoConMenosAlumnos = new JTextField();
		textFieldCursoConMenosAlumnos.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCursoConMenosAlumnos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldCursoConMenosAlumnos.setColumns(10);
		textFieldCursoConMenosAlumnos.setBounds(479, 294, 146, 44);
		contentPane.add(textFieldCursoConMenosAlumnos);
		
		JLabel lblCursosQueNoVan = new JLabel("CURSOS QUE NO VAN:");
		lblCursosQueNoVan.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCursosQueNoVan.setBounds(160, 368, 233, 44);
		contentPane.add(lblCursosQueNoVan);
		
		JLabel lblConsultasHuelgas = new JLabel("CONSULTAS DE HUELGAS");
		lblConsultasHuelgas.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblConsultasHuelgas.setBounds(260, 21, 264, 44);
		contentPane.add(lblConsultasHuelgas);
		
		JCheckBox chckbxCursosQueNoVAn = new JCheckBox("New check box");
		chckbxCursosQueNoVAn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxCursosQueNoVAn.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxCursosQueNoVAn.setBounds(399, 368, 226, 44);
		contentPane.add(chckbxCursosQueNoVAn);
	}
}
