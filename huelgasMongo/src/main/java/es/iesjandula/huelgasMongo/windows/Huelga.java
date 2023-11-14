package es.iesjandula.huelgasMongo.windows;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import es.iesjandula.huelgasMongo.connections.MongoClientConnection;
import es.iesjandula.huelgasMongo.utils.Alumno;
import es.iesjandula.huelgasMongo.utils.CheckboxListCellRenderer;
import es.iesjandula.huelgasMongo.utils.Curso;
import es.iesjandula.huelgasMongo.utils.ParseAlumnos;

public class Huelga extends JFrame
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	
	/**
	 * Create the frame.
	 */
	public Huelga(MongoClientConnection mongo)
	{
		
		ParseAlumnos parseAlumnos = new ParseAlumnos(".\\src\\main\\resources\\ALUMNADO.csv");
		
		Map<String, Curso> cursos = parseAlumnos.parse();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		
		DefaultListModel<JCheckBox> alumnolistModel = new DefaultListModel<JCheckBox>();
		
		
		JList<JCheckBox> listAlumnos = new JList<>(alumnolistModel);
		listAlumnos.setLocation(479, 148);
        listAlumnos.setCellRenderer(new CheckboxListCellRenderer());
        listAlumnos.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting() ) {
                    ListSelectionModel selectionModel = ((JList) e.getSource()).getSelectionModel();
                    if (!selectionModel.get) {
                        selectionModel.setLeadAnchorNotificationEnabled(true);
                    }
                }
            }
        });
		JScrollPane scrollPane = new JScrollPane(listAlumnos);
		scrollPane.setBounds(53, 164, 346, 290);
		contentPane.add(scrollPane);
		
		
		JLabel cursoLabel = new JLabel("CURSO");
		cursoLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		cursoLabel.setBounds(53, 43, 112, 42);
		contentPane.add(cursoLabel);
		
		JComboBox<Curso> cursoComboBox = new JComboBox<Curso>();
		cursoComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateList(alumnolistModel, (Curso)cursoComboBox.getSelectedItem());
			}
		});
		cursoComboBox.setBounds(175, 43, 224, 35);
		contentPane.add(cursoComboBox);
		
		for (Entry<String, Curso> curso : cursos.entrySet())
		{
			cursoComboBox.addItem(curso.getValue());
		}
		
		
		
		JLabel huelgaLabel = new JLabel("HUELGA");
		huelgaLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		huelgaLabel.setBounds(53, 96, 112, 42);
		contentPane.add(huelgaLabel);
		
		textField = new JTextField();
		textField.setBounds(175, 106, 224, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton botonAceptar = new JButton("ACEPTAR");
		botonAceptar.setForeground(new Color(255, 255, 255));
		botonAceptar.setBackground(new Color(0, 255, 0));
		botonAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
			}
		});
		botonAceptar.setBounds(53, 485, 112, 52);
		contentPane.add(botonAceptar);
		
		JButton botonSalir = new JButton("SALIR");
		botonSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InitialWindow initialWindow = new InitialWindow(mongo);
				initialWindow.setVisible(true);
				setVisible(false);
			}
		});
		botonSalir.setBackground(new Color(255, 0, 0));
		botonSalir.setForeground(new Color(255, 255, 255));
		botonSalir.setBounds(287, 485, 112, 52);
		contentPane.add(botonSalir);
	}
	
	public void updateList(DefaultListModel<JCheckBox> list, Curso curso)
	{

		list.removeAllElements();
		for (Entry<String, Alumno> entry : curso.getAlumnos().entrySet())
		{
			
			JCheckBox chckbxNewCheckBox = new JCheckBox(entry.getValue().toString());
			list.addElement(chckbxNewCheckBox);
		}

	}
}

