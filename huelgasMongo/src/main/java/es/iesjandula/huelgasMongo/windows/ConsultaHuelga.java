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
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.border.LineBorder;

import es.iesjandula.huelgasMongo.connections.MongoClientConnection;

import javax.swing.JCheckBoxMenuItem;

public class ConsultaHuelga extends JFrame
{

	private JPanel contentPane;
	private JTextField textFieldFecha;

	/**
	 * Create the frame.
	 */
	public ConsultaHuelga(MongoClientConnection mongo)
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
				consulta(mongo);
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
				JFrame initialWindow = new InitialWindow(mongo);
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
		
		JLabel lblCursoConMasAlumnos = new JLabel("CURSO CON MÁS ALUMNOS:");
		lblCursoConMasAlumnos.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCursoConMasAlumnos.setBounds(160, 224, 285, 44);
		contentPane.add(lblCursoConMasAlumnos);
		
		JLabel lblCursoConMenosAlumnos = new JLabel("CURSO CON MENOS ALUMNOS:");
		lblCursoConMenosAlumnos.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCursoConMenosAlumnos.setBounds(160, 293, 313, 44);
		contentPane.add(lblCursoConMenosAlumnos);
		
		JLabel lblCursosQueNoVan = new JLabel("CURSOS QUE NO VAN:");
		lblCursosQueNoVan.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCursosQueNoVan.setBounds(160, 368, 233, 44);
		contentPane.add(lblCursosQueNoVan);
		
		JLabel lblConsultasHuelgas = new JLabel("CONSULTAS DE HUELGAS");
		lblConsultasHuelgas.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblConsultasHuelgas.setBounds(260, 21, 264, 44);
		contentPane.add(lblConsultasHuelgas);
		
		JComboBox comboBoxCursosQueNoVan = new JComboBox();
		comboBoxCursosQueNoVan.setBounds(403, 368, 222, 44);
		contentPane.add(comboBoxCursosQueNoVan);
		
		JLabel lblNumAlumnosEnHuelga_Result = new JLabel("");
		lblNumAlumnosEnHuelga_Result.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNumAlumnosEnHuelga_Result.setBounds(469, 152, 156, 44);
		contentPane.add(lblNumAlumnosEnHuelga_Result);
		
		JLabel lblCursoConMasAlumnos_Result = new JLabel("");
		lblCursoConMasAlumnos_Result.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCursoConMasAlumnos_Result.setBounds(469, 224, 156, 44);
		contentPane.add(lblCursoConMasAlumnos_Result);
		
		JLabel lblCursoConMenosAlumnos_Result = new JLabel("");
		lblCursoConMenosAlumnos_Result.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCursoConMenosAlumnos_Result.setBounds(483, 293, 142, 44);
		contentPane.add(lblCursoConMenosAlumnos_Result);
	}
	
	
	public void consulta(MongoClientConnection mongo) {
		
		
	}
}
