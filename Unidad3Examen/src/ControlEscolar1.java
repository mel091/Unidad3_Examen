import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;

public class ControlEscolar1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ControlEscolar1 frame = new ControlEscolar1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ControlEscolar1() 
	{
		this.entry(this);
		//this.login(this);
		//this.eliminarDocente(this);
		//this.inicio(this);
		//addKeyListener(this);
	}
	
	public void entry(JFrame frame)
	{
		this.setTitle("NeoByte");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(180, 20, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#F0E4F3"));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel logo = new JLabel();
		logo.setIcon(new ImageIcon(getClass().getResource("logo1.png")));
		logo.setBounds(320, 5, 350, 200);
		panel.add(logo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.decode("#725B75"));
		panel_1.setBounds(100, 200, 770, 400);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Selecciona tu rol");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 19));
		lblNewLabel_2.setForeground(Color.white);
		lblNewLabel_2.setBounds(325, 40, 180, 25);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.decode("#F8F1FA"));
		panel_2.setBounds(120, 110, 200, 200);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel estudiante = new JLabel();
		estudiante.setIcon(new ImageIcon(getClass().getResource("estudiante1.png")));
		estudiante.setBounds(0, 0, 200, 200);
		panel_2.add(estudiante);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.decode("#F8F1FA"));
		panel_2_1.setBounds(454, 110, 200, 200);
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel docente = new JLabel();
		docente.setIcon(new ImageIcon(getClass().getResource("maestro.png")));
		docente.setBounds(0, 0, 200, 200);
		panel_2_1.add(docente);
		
		JButton alumno = new JButton("Alumno");
		alumno.addActionListener(new ActionListener() 
		{	
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.remove(panel);
				
				login(frame);
				
				frame.repaint();
				frame.revalidate();
				
			}
		});
		alumno.setBounds(159, 321, 120, 25);
		alumno.setForeground(new Color(255, 255, 255));
		alumno.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		alumno.setBackground(Color.decode("#725B75"));
		alumno.setBorderPainted(true); 
		alumno.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		panel_1.add(alumno);
		
		JButton docente1 = new JButton("Docente");
		docente1.addActionListener(new ActionListener() 
		{	
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Opción no disponible");
			}
		});
		docente1.setBounds(496, 321, 120, 25);
		docente1.setForeground(new Color(255, 255, 255));
		docente1.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		docente1.setBackground(Color.decode("#725B75"));
		docente1.setBorderPainted(true); 
		docente1.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		panel_1.add(docente1);
	}
	
	public void login(JFrame frame)
	{
		this.setTitle("Neobyte - Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(180, 20, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Bienvenido");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 33));
		lblNewLabel_3.setBounds(250, 150, 200, 30);
		contentPane.add(lblNewLabel_3);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#BAA1C2"));
		panel.setBounds(230, 190, 550, 300);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(70, 70, 400, 40);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Acceder");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				frame.remove(panel);
				
				inicio(frame);
				
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		btnNewButton.setBounds(210, 230, 140, 40);
		panel.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(70, 147, 400, 40);
		panel.add(passwordField);
		
		JLabel lblNewLabel_5 = new JLabel("Correo electrónico educativo");
		lblNewLabel_5.setBounds(70, 55, 200, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Contraseña");
		lblNewLabel_5_1.setBounds(70, 132, 150, 14);
		panel.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_4 = new JLabel("Olvidé mi contraseña");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(445, 501, 140, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel fondo = new JLabel();
		fondo.setIcon(new ImageIcon(getClass().getResource("fondo.png")));
		fondo.setBounds(0, 0, 1000, 700);
		contentPane.add(fondo);
	
	}
	
	public void inicio(JFrame frame)
	{
		this.setTitle("NeoByte - Página de inicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(180, 20, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.decode("#6A4E90"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 11, 960, 60);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel fondo = new JLabel();
		fondo.setIcon(new ImageIcon(getClass().getResource("logoControl.png")));
		fondo.setBounds(0, 5, 150, 60);
		panel.add(fondo);
		
		JLabel lblNewLabel_7 = new JLabel("Grupos");
		lblNewLabel_7.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblNewLabel_7.setBounds(200, 25, 50, 14);
		panel.add(lblNewLabel_7);
		
		JLabel f = new JLabel();
		f.setIcon(new ImageIcon(getClass().getResource("f.png")));
		f.setBounds(250, 22, 15, 20);
		panel.add(f);
		
		JLabel lblNewLabel_6 = new JLabel("Materias");
		lblNewLabel_6.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblNewLabel_6.setBounds(320, 25, 50, 15);
		panel.add(lblNewLabel_6);
		
		JLabel f1 = new JLabel();
		f1.setIcon(new ImageIcon(getClass().getResource("f.png")));
		f1.setBounds(380, 22, 15, 20);
		panel.add(f1);
		
		JLabel lblNewLabel_8 = new JLabel("Calificaciones");
		lblNewLabel_8.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblNewLabel_8.setBounds(450, 25, 90, 14);
		panel.add(lblNewLabel_8);
		
		JLabel f2 = new JLabel();
		f2.setIcon(new ImageIcon(getClass().getResource("f.png")));
		f2.setBounds(540, 22, 15, 20);
		panel.add(f2);
		
		JLabel lblNewLabel_9 = new JLabel("Horarios");
		lblNewLabel_9.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblNewLabel_9.setBounds(610, 25, 60, 14);
		panel.add(lblNewLabel_9);
		
		JLabel f3 = new JLabel();
		f3.setIcon(new ImageIcon(getClass().getResource("f.png")));
		f3.setBounds(670, 22, 15, 20);
		panel.add(f3);
		
		JLabel lblNewLabel_10 = new JLabel("Usuarios");
		lblNewLabel_10.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblNewLabel_10.setBounds(730, 25, 70, 14);
		panel.add(lblNewLabel_10);
		
		JLabel f4 = new JLabel();
		f4.setIcon(new ImageIcon(getClass().getResource("f.png")));
		f4.setBounds(790, 22, 15, 20);
		panel.add(f4);
		
		JButton close = new JButton("Cerrar sesión");
		close.addActionListener(new ActionListener() 
		{	
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.remove(panel);
				
				entry(frame);
				
				frame.repaint();
				frame.revalidate();
				
			}
		});
		close.setBounds(850, 22, 90, 20);
		close.setForeground(new Color(0, 0, 0));
		close.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		close.setBackground(Color.white);
		close.setBorderPainted(true); 
		close.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
		panel.add(close);
		
		JLabel f_1 = new JLabel();
		f_1.setBounds(374, 25, 15, 20);
		panel.add(f_1);
		
		JLabel lblNewLabel_11 = new JLabel("Inicio");
		lblNewLabel_11.setForeground(new Color(255, 255, 255));
		lblNewLabel_11.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 29));
		lblNewLabel_11.setBounds(450, 108, 100, 25);
		contentPane.add(lblNewLabel_11);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 128, 255));
		panel_1.setBounds(78, 165, 830, 430);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(2, 5, 0, 0));
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(0, 0, 128));
		panel_1.add(panel_12);
		panel_12.setLayout(null);
		
		JLabel school = new JLabel();
		school.setBounds(0, 0, 165, 215);
		school.setIcon(new ImageIcon(getClass().getResource("Escuela.png")));
		panel_12.add(school);
	
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(255, 0, 255));
		panel_1.add(panel_11);
		panel_11.setLayout(null);
		
		JLabel tuto = new JLabel();
		tuto.setBounds(0, 0, 165, 215);
		tuto.setIcon(new ImageIcon(getClass().getResource("tuto1.png")));
		panel_11.add(tuto);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(192, 192, 192));
		panel_1.add(panel_10);
		panel_10.setLayout(null);
		
		JLabel cal = new JLabel();
		cal.setBounds(0, 0, 165, 215);
		cal.setIcon(new ImageIcon(getClass().getResource("cal.png")));
		panel_10.add(cal);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(128, 0, 128));
		panel_1.add(panel_9);
		panel_9.setLayout(null);
		
		JLabel admi = new JLabel();
		admi.setBounds(0, 0, 165, 215);
		admi.setIcon(new ImageIcon(getClass().getResource("admin.png")));
		panel_9.add(admi);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(64, 0, 0));
		panel_1.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel act = new JLabel();
		act.setBounds(0, 0, 165, 215);
		act.setIcon(new ImageIcon(getClass().getResource("act.png")));
		panel_8.add(act);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(0, 128, 0));
		panel_1.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel padres = new JLabel();
		padres.setBounds(0, 0, 165, 215);
		padres.setIcon(new ImageIcon(getClass().getResource("padres.png")));
		panel_7.add(padres);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(128, 64, 64));
		panel_1.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel aviso = new JLabel();
		aviso.setBounds(0, 0, 165, 215);
		aviso.setIcon(new ImageIcon(getClass().getResource("avisos.png")));
		panel_6.add(aviso);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(0, 255, 255));
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel servicio = new JLabel();
		servicio.setBounds(0, 0, 165, 215);
		servicio.setIcon(new ImageIcon(getClass().getResource("servicio.png")));
		panel_5.add(servicio);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 128, 128));
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel materias = new JLabel();
		materias.setBounds(0, 0, 165, 215);
		materias.setIcon(new ImageIcon(getClass().getResource("materias.png")));
		panel_4.add(materias);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 64, 0));
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel egreso = new JLabel();
		egreso.setBounds(0, 0, 165, 215);
		egreso.setIcon(new ImageIcon(getClass().getResource("egreso.png")));
		panel_3.add(egreso);
		
		JMenuBar barra = new JMenuBar(); //se puede colocar mas menús, constructor vacío
		JMenu menuFile = new JMenu("Alumnos");
		JMenu menuFile1 = new JMenu("Docentes");
		JMenu menuFile2 = new JMenu("Más");
		
		JMenuItem download = new JMenuItem("Descargar información");
		download.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				descargarAlumno(frame);
				frame.repaint();
				frame.revalidate();	
			}
			
		});
		JMenuItem consultar = new JMenuItem("Consultar");
		consultar.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				consultarAlumno(frame);
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		JMenuItem crear = new JMenuItem("Añadir");
		crear.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				crearAlumno(frame);
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		JMenuItem edit = new JMenuItem("Editar");
		edit.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				editarAlumno(frame);
				frame.repaint();
				frame.revalidate();
			}
		});
		JMenuItem delete = new JMenuItem("Eliminar");
		delete.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				eliminarAlumno(frame);
				frame.repaint();
				frame.revalidate();
			}
		});
		
		
		menuFile.add(download);
		menuFile.add(consultar);
		menuFile.add(crear);
		menuFile.add(edit);
		menuFile.add(delete);
		
		JMenuItem download1 = new JMenuItem("Descargar información");
		download1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				descargarDocente(frame);
				frame.repaint();
				frame.revalidate();		
			}
			
		});
		JMenuItem consultar1 = new JMenuItem("Consultar");
		consultar1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				consultarDocente(frame);
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		JMenuItem crear1 = new JMenuItem("Añadir");
		crear1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				crearDocente(frame);
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		JMenuItem edit1 = new JMenuItem("Editar");
		edit1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				editarDocente(frame);
				frame.repaint();
				frame.revalidate();	
			}
			
		});
		JMenuItem delete1 = new JMenuItem("Eliminar");
		delete1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				eliminarDocente(frame);
				frame.repaint();
				frame.revalidate();	
			}
			
		});
		
		menuFile1.add(download1);
		menuFile1.add(consultar1);
		menuFile1.add(crear1);
		menuFile1.add(edit1);
		menuFile1.add(delete1);
		
		JMenuItem exit = new JMenuItem("Información");
		JMenuItem help = new JMenuItem("Ayuda");
		
		menuFile2.add(exit);
		menuFile2.add(help);
		
		barra.add(menuFile);
		barra.add(menuFile1);
		barra.add(menuFile2);
		
		this.setJMenuBar(barra);
		
		
	}
	
	public void descargarAlumno(JFrame frame)
	{
		this.setTitle("NeoByte - Descargar información del alumno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(180, 20, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.decode("#725b75"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel fondo = new JLabel();
		fondo.setIcon(new ImageIcon(getClass().getResource("logoControl.png")));
		fondo.setBounds(15, 25, 150, 60);
		contentPane.add(fondo);
		
		JLabel lblNewLabel_16 = new JLabel("Información del alumno");
		lblNewLabel_16.setForeground(new Color(255, 255, 255));
		lblNewLabel_16.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 24));
		lblNewLabel_16.setBounds(370, 45, 500, 25);
		contentPane.add(lblNewLabel_16);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#E3DEE9"));
		panel.setBounds(65, 97, 850, 500);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 128, 128));
		panel_1.setBounds(635, 45, 170, 220);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel alumnoID = new JLabel();
		alumnoID.setBounds(0, 0, 170, 220);
		alumnoID.setIcon(new ImageIcon(getClass().getResource("alumnoID.png")));
		panel_1.add(alumnoID);
		
		JLabel lblNewLabel_17 = new JLabel("Nombre completo:");
		lblNewLabel_17.setBounds(46, 58, 120, 14);
		panel.add(lblNewLabel_17);
		
		JLabel lblNewLabel_17_1 = new JLabel("Fecha de nacimiento:");
		lblNewLabel_17_1.setBounds(46, 96, 150, 14);
		panel.add(lblNewLabel_17_1);
		
		JLabel lblNewLabel_17_2 = new JLabel("CURP:");
		lblNewLabel_17_2.setBounds(46, 133, 100, 14);
		panel.add(lblNewLabel_17_2);
		
		JLabel lblNewLabel_17_3 = new JLabel("Dirección:");
		lblNewLabel_17_3.setBounds(46, 168, 100, 14);
		panel.add(lblNewLabel_17_3);
		
		JLabel lblNewLabel_17_4 = new JLabel("Número de teléfono:");
		lblNewLabel_17_4.setBounds(46, 206, 150, 14);
		panel.add(lblNewLabel_17_4);
		
		JLabel lblNewLabel_17_5 = new JLabel("Correo electrónico:");
		lblNewLabel_17_5.setBounds(46, 243, 150, 14);
		panel.add(lblNewLabel_17_5);
		
		JLabel lblNewLabel_17_6 = new JLabel("Carrera:");
		lblNewLabel_17_6.setBounds(46, 282, 100, 14);
		panel.add(lblNewLabel_17_6);
		
		JLabel lblNewLabel_17_7 = new JLabel("Semestre:");
		lblNewLabel_17_7.setBounds(46, 322, 100, 14);
		panel.add(lblNewLabel_17_7);
		
		JLabel lblNewLabel_17_8 = new JLabel("Información de contacto de emergencia");
		lblNewLabel_17_8.setBounds(46, 370, 250, 14);
		panel.add(lblNewLabel_17_8);
		
		JLabel lblNewLabel_17_9 = new JLabel("Nombre del tutor:      Laura Ochoa");
		lblNewLabel_17_9.setBounds(46, 410, 300, 14);
		panel.add(lblNewLabel_17_9);
		
		JLabel lblNewLabel_17_10 = new JLabel("Teléfono:      (555) 987-6543");
		lblNewLabel_17_10.setBounds(367, 410, 200, 14);
		panel.add(lblNewLabel_17_10);
		
		JButton btnNewButton_6 = new JButton("Descargar información");
		btnNewButton_6.addActionListener(new ActionListener() 
		{	
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showMessageDialog(null, "Descarga exitosa");	
			}
		});
		btnNewButton_6.setBackground(Color.white);
		btnNewButton_6.setBounds(635, 466, 200, 23);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_5_1 = new JButton("Volver");
		btnNewButton_5_1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				inicio(frame);
				frame.repaint();
				frame.revalidate();
				
			}	
		});
		btnNewButton_5_1.setBackground(Color.white);
		btnNewButton_5_1.setBounds(500, 465, 100, 23);
		panel.add(btnNewButton_5_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(20, 359, 800, 85);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_17_10_1 = new JLabel("Relación:      Madre");
		lblNewLabel_17_10_1.setBounds(600, 50, 200, 14);
		panel_2.add(lblNewLabel_17_10_1);
		
		JLabel lblNewLabel_17_11 = new JLabel("Alejandro Cázares Ochoa");
		lblNewLabel_17_11.setBounds(206, 58, 150, 14);
		panel.add(lblNewLabel_17_11);
		
		JLabel lblNewLabel_17_11_1 = new JLabel("20 de abril 2002\r\n");
		lblNewLabel_17_11_1.setBounds(206, 96, 120, 14);
		panel.add(lblNewLabel_17_11_1);
		
		JLabel lblNewLabel_17_11_1_1 = new JLabel("CAOA800101HDFZLRLA2");
		lblNewLabel_17_11_1_1.setBounds(206, 133, 150, 14);
		panel.add(lblNewLabel_17_11_1_1);
		
		JLabel lblNewLabel_17_11_1_1_1 = new JLabel("Calle Robes #453, Colonia El Sol CDMX");
		lblNewLabel_17_11_1_1_1.setBounds(206, 168, 250, 14);
		panel.add(lblNewLabel_17_11_1_1_1);
		
		JLabel lblNewLabel_17_11_1_1_2 = new JLabel("(555) 123-4567");
		lblNewLabel_17_11_1_1_2.setBounds(206, 206, 150, 14);
		panel.add(lblNewLabel_17_11_1_1_2);
		
		JLabel lblNewLabel_17_11_1_1_2_1 = new JLabel("alejandroCerv20@gmail.com");
		lblNewLabel_17_11_1_1_2_1.setBounds(206, 243, 170, 14);
		panel.add(lblNewLabel_17_11_1_1_2_1);
		
		JLabel lblNewLabel_17_11_1_1_2_2 = new JLabel("Ingeniería en Desarrollo de Software");
		lblNewLabel_17_11_1_1_2_2.setBounds(206, 282, 210, 14);
		panel.add(lblNewLabel_17_11_1_1_2_2);
		
		JLabel lblNewLabel_17_11_1_1_2_3 = new JLabel("7mo");
		lblNewLabel_17_11_1_1_2_3.setBounds(206, 322, 150, 14);
		panel.add(lblNewLabel_17_11_1_1_2_3);
		
		JLabel lblNewLabel_17_11_1_1_2_3_1 = new JLabel("ID: 987654321");
		lblNewLabel_17_11_1_1_2_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_17_11_1_1_2_3_1.setBounds(645, 275, 150, 14);
		panel.add(lblNewLabel_17_11_1_1_2_3_1);
	}
	
	public void descargarDocente(JFrame frame)
	{
		this.setTitle("NeoByte - Descargar información del docente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(180, 20, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.decode("#322030"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel fondo = new JLabel();
		fondo.setIcon(new ImageIcon(getClass().getResource("logoControl.png")));
		fondo.setBounds(20, 30, 150, 60);
		contentPane.add(fondo);
		
		JLabel lblNewLabel_16 = new JLabel("Información del docente");
		lblNewLabel_16.setForeground(new Color(255, 255, 255));
		lblNewLabel_16.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 24));
		lblNewLabel_16.setBounds(370, 45, 500, 25);
		contentPane.add(lblNewLabel_16);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(65, 97, 850, 500);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 128, 128));
		panel_1.setBounds(635, 45, 170, 220);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel maestroID = new JLabel();
		maestroID.setBounds(0, 0, 170, 220);
		maestroID.setIcon(new ImageIcon(getClass().getResource("maestro1.png")));
		panel_1.add(maestroID);
		
		JLabel lblNewLabel_17 = new JLabel("Nombre completo:                          Simón Gómez Talamante");
		lblNewLabel_17.setBounds(46, 58, 350, 14);
		panel.add(lblNewLabel_17);
		
		JLabel lblNewLabel_17_1 = new JLabel("Fecha de nacimiento:                     7 de octubre 1986");
		lblNewLabel_17_1.setBounds(46, 96, 350, 14);
		panel.add(lblNewLabel_17_1);
		
		JLabel lblNewLabel_17_2 = new JLabel("CURP:                                                 GOTS900315HDFMZMSA8");
		lblNewLabel_17_2.setBounds(46, 133, 350, 14);
		panel.add(lblNewLabel_17_2);
		
		JLabel lblNewLabel_17_3 = new JLabel("Dirección:                                          Calle del Bosque #612, Colonia La Ilusión 73791");
		lblNewLabel_17_3.setBounds(46, 168, 530, 14);
		panel.add(lblNewLabel_17_3);
		
		JLabel lblNewLabel_17_4 = new JLabel("Número de teléfono:");
		lblNewLabel_17_4.setBounds(46, 206, 120, 14);
		panel.add(lblNewLabel_17_4);
		
		JLabel lblNewLabel_17_5 = new JLabel("Correo electrónico:");
		lblNewLabel_17_5.setBounds(46, 243, 150, 14);
		panel.add(lblNewLabel_17_5);
		
		JLabel lblNewLabel_17_6 = new JLabel("Ocupación:");
		lblNewLabel_17_6.setBounds(46, 282, 100, 14);
		panel.add(lblNewLabel_17_6);
		
		JLabel lblNewLabel_17_7 = new JLabel("Materias impartidas:");
		lblNewLabel_17_7.setBounds(46, 322, 150, 14);
		panel.add(lblNewLabel_17_7);
		
		JLabel lblNewLabel_17_8 = new JLabel("Información académica");
		lblNewLabel_17_8.setBounds(46, 370, 250, 14);
		panel.add(lblNewLabel_17_8);
		
		JLabel lblNewLabel_17_9 = new JLabel("Estudios:       Instituto Tecnológico del Norte");
		lblNewLabel_17_9.setBounds(46, 410, 260, 14);
		panel.add(lblNewLabel_17_9);
		
		JLabel lblNewLabel_17_10 = new JLabel("Carrera cursada:        Ingeniería en Sistemas");
		lblNewLabel_17_10.setBounds(367, 410, 260, 14);
		panel.add(lblNewLabel_17_10);
		
		JButton btnNewButton_6 = new JButton("Descargar información");
		btnNewButton_6.addActionListener(new ActionListener() 
		{	
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showMessageDialog(null, "Descarga exitosa");
				
			}
		});
		btnNewButton_6.setBackground(Color.white);
		btnNewButton_6.setBounds(635, 466, 200, 23);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_5_1 = new JButton("Volver");
		btnNewButton_5_1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				inicio(frame);
				frame.repaint();
				frame.revalidate();
				
			}	
		});
		btnNewButton_5_1.setBackground(Color.white);
		btnNewButton_5_1.setBounds(500, 465, 100, 23);
		panel.add(btnNewButton_5_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(20, 359, 800, 85);
		panel.add(panel_2);	
		
		JLabel lblNewLabel_17_4_1 = new JLabel("(555) 555-5555");
		lblNewLabel_17_4_1.setBounds(227, 206, 100, 14);
		panel.add(lblNewLabel_17_4_1);
		
		JLabel lblNewLabel_17_5_1 = new JLabel("smnGomez@gmail.com");
		lblNewLabel_17_5_1.setBounds(227, 243, 200, 14);
		panel.add(lblNewLabel_17_5_1);
		
		JLabel lblNewLabel_17_5_1_1 = new JLabel("Profesor");
		lblNewLabel_17_5_1_1.setBounds(227, 282, 200, 14);
		panel.add(lblNewLabel_17_5_1_1);
		
		JLabel lblNewLabel_17_5_1_2 = new JLabel("Diseño web, Redes II");
		lblNewLabel_17_5_1_2.setBounds(227, 322, 200, 14);
		panel.add(lblNewLabel_17_5_1_2);
		
		JLabel lblNewLabel_17_5_1_2_1 = new JLabel("Experiencia docente:  7 años");
		lblNewLabel_17_5_1_2_1.setBounds(637, 276, 200, 14);
		panel.add(lblNewLabel_17_5_1_2_1);
	}
	
	public void crearAlumno(JFrame frame)
	{
		this.setTitle("School Smart Zone");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(180, 20, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.white);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel fondo = new JLabel();
		fondo.setIcon(new ImageIcon(getClass().getResource("logoControl.png")));
		fondo.setBounds(15, 15, 150, 60);
		contentPane.add(fondo);
		
		JLabel lblNewLabel_18_1 = new JLabel("Añadir a un nuevo alumno");
		lblNewLabel_18_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 27));
		lblNewLabel_18_1.setBounds(360, 40, 400, 25);
		contentPane.add(lblNewLabel_18_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#A894C2"));
		panel.setBounds(57, 90, 870, 530);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_19 = new JLabel("Para añadir a un nuevo estudiante, rellene los siguientes datos con la información que corresponde:");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_19.setBounds(35, 30, 700, 20);
		panel.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Nombre completo:           (Apellido paterno, apellido materno y nombre(s))");
		lblNewLabel_20.setBounds(35, 75, 450, 14);
		panel.add(lblNewLabel_20);
		
		textField_10 = new JTextField();
		textField_10.addKeyListener(new KeyAdapter()
		{
			public void keyTyped(KeyEvent e) //validar q solo ingrese letras
			{
				char character = e.getKeyChar();
				if(!Character.isLetter(character))
				{
					e.consume();
				}
			}
		});
		textField_10.setBounds(35, 93, 550, 20);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_20_1 = new JLabel("Fecha de nacimiento:\r\n");
		lblNewLabel_20_1.setBounds(35, 124, 400, 14);
		panel.add(lblNewLabel_20_1);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(35, 140, 550, 20);
		panel.add(textField_11);
		
		JLabel lblNewLabel_20_1_1 = new JLabel("CURP:");
		lblNewLabel_20_1_1.setBounds(35, 173, 400, 14);
		panel.add(lblNewLabel_20_1_1);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(35, 189, 550, 20);
		panel.add(textField_12);
		
		JLabel lblNewLabel_20_1_1_1 = new JLabel("Correo electrónico:");
		lblNewLabel_20_1_1_1.setBounds(35, 220, 400, 14);
		panel.add(lblNewLabel_20_1_1_1);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(35, 235, 550, 20);
		panel.add(textField_13);
		
		JLabel lblNewLabel_20_1_1_1_1 = new JLabel("Número de teléfono (personal):");
		lblNewLabel_20_1_1_1_1.setBounds(35, 266, 400, 14);
		panel.add(lblNewLabel_20_1_1_1_1);
		
		textField_14 = new JTextField();
		textField_14.addKeyListener(new KeyAdapter()
		{
			public void keyTyped(KeyEvent e) //validar q solo ingrese numeros
			{
				char character = e.getKeyChar();
				if(!Character.isDigit(character))
				{
					e.consume();
				}
			}
		});
		textField_14.setColumns(10);
		textField_14.setBounds(35, 283, 550, 20);
		panel.add(textField_14);
		
		JLabel lblNewLabel_20_1_1_1_1_1 = new JLabel("Nacionalidad");
		lblNewLabel_20_1_1_1_1_1.setBounds(35, 314, 100, 14);
		panel.add(lblNewLabel_20_1_1_1_1_1);
		
		String nacionalidad[] = {"Mexicano", "Estadounidense", "Coreano", "Japonés", "Chino", "Español"};
		JComboBox nacionalidadBox = new JComboBox(nacionalidad);
		nacionalidadBox.setBounds(36, 330, 100, 20);
		nacionalidadBox.setFont(new Font("Consolas", Font.BOLD, 12));
		panel.add(nacionalidadBox);	
		
		JLabel lblNewLabel_20_1_1_1_1_1_1 = new JLabel("Tipo de sangre");
		lblNewLabel_20_1_1_1_1_1_1.setBounds(185, 314, 100, 14);
		panel.add(lblNewLabel_20_1_1_1_1_1_1);
		
		String sangre[] = {"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"};
		JComboBox sangreBox = new JComboBox(sangre);
		sangreBox.setBounds(180, 330, 100, 20);
		sangreBox.setFont(new Font("Consolas", Font.BOLD, 12));
		panel.add(sangreBox);	
		
		JLabel lblNewLabel_20_1_1_1_1_1_1_1 = new JLabel("Estado civil");
		lblNewLabel_20_1_1_1_1_1_1_1.setBounds(335, 314, 100, 14);
		panel.add(lblNewLabel_20_1_1_1_1_1_1_1);
		
		String civil[] = {"Soltero", "Casado", "Divorciado", "Viudo"};
		JComboBox civilBox = new JComboBox(civil);
		civilBox.setBounds(330, 330, 100, 20);
		civilBox.setFont(new Font("Consolas", Font.BOLD, 12));
		panel.add(civilBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(630, 75, 200, 250);
		panel.add(panel_1);
		
		JLabel lblNewLabel_21 = new JLabel("Inserta tu foto");
		panel_1.add(lblNewLabel_21);
		
		JLabel lblNewLabel_20_1_1_1_1_1_1_1_1 = new JLabel("Género");
		lblNewLabel_20_1_1_1_1_1_1_1_1.setBounds(480, 314, 100, 14);
		panel.add(lblNewLabel_20_1_1_1_1_1_1_1_1);
		
		String genero[] = {"Femenino", "Masculino", "Prefiero no responder"};
		JComboBox generoBox = new JComboBox(genero);
		generoBox.setBounds(475, 330, 100, 20);
		generoBox.setFont(new Font("Consolas", Font.BOLD, 12));
		panel.add(generoBox);
		
		JLabel lblNewLabel_20_1_1_1_1_1_2 = new JLabel("Idiomas:");
		lblNewLabel_20_1_1_1_1_1_2.setBounds(35, 370, 100, 14);
		panel.add(lblNewLabel_20_1_1_1_1_1_2);
		
		JCheckBox itemBox1 = new JCheckBox("Inglés");
		itemBox1.setBounds(36, 385, 80, 30);
		itemBox1.setOpaque(false); 
		panel.add(itemBox1);
		
		JCheckBox itemBox2 = new JCheckBox("Francés");
		itemBox2.setBounds(120, 385, 80, 30);
		itemBox2.setOpaque(false); 
		panel.add(itemBox2);
		
		JCheckBox itemBox3 = new JCheckBox("Portugués");
		itemBox3.setBounds(220, 385, 120, 30);
		itemBox3.setOpaque(false); 
		panel.add(itemBox3);
		
		JCheckBox itemBox4 = new JCheckBox("Otro");
		itemBox4.setForeground(new Color(255, 255, 255));
		itemBox4.setBounds(320, 385, 120, 30);
		itemBox4.setOpaque(false); 
		panel.add(itemBox4);
		
		JLabel lblNewLabel_20_1_1_1_1_1_2_1 = new JLabel("Alergias o padecimientos de salud:");
		lblNewLabel_20_1_1_1_1_1_2_1.setBounds(35, 426, 300, 14);
		panel.add(lblNewLabel_20_1_1_1_1_1_2_1);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(35, 443, 550, 20);
		panel.add(textField_15);
		
		JButton btnNewButton_7 = new JButton("Siguiente");
		btnNewButton_7.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				crearAlumno2(frame);
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		btnNewButton_7.setBackground(Color.white);
		btnNewButton_7.setBounds(756, 496, 89, 23);
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_7_1 = new JButton("Volver");
		btnNewButton_7_1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				inicio(frame);
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		btnNewButton_7_1.setBackground(Color.white);
		btnNewButton_7_1.setBounds(646, 496, 89, 23);
		panel.add(btnNewButton_7_1);
	}

	public void crearAlumno2(JFrame frame)
	{
		this.setTitle("NeoByte - Añadir nuevo alumno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(180, 20, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.white);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel fondo = new JLabel();
		fondo.setIcon(new ImageIcon(getClass().getResource("logoControl.png")));
		fondo.setBounds(15, 15, 150, 60);
		contentPane.add(fondo);
		
		JLabel lblNewLabel_18_1 = new JLabel("Añadir a un nuevo alumno");
		lblNewLabel_18_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 27));
		lblNewLabel_18_1.setBounds(360, 40, 400, 25);
		contentPane.add(lblNewLabel_18_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#A894C2"));
		panel.setBounds(57, 90, 870, 530);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_19 = new JLabel("Para añadir a un nuevo estudiante, rellene los siguientes datos con la información que corresponde:");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_19.setBounds(35, 30, 700, 20);
		panel.add(lblNewLabel_19);
		
		JLabel lblNewLabel_22 = new JLabel("Información del tutor:");
		lblNewLabel_22.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_22.setBounds(35, 71, 200, 14);
		panel.add(lblNewLabel_22);
		
		JLabel lblNewLabel_22_1 = new JLabel("Nombre completo:");
		lblNewLabel_22_1.setBounds(35, 100, 200, 14);
		panel.add(lblNewLabel_22_1);
		
		JLabel lblNewLabel_22_2 = new JLabel("Número de teléfono:");
		lblNewLabel_22_2.setBounds(35, 135, 200, 14);
		panel.add(lblNewLabel_22_2);
		
		JLabel lblNewLabel_22_3 = new JLabel("Dirección:");
		lblNewLabel_22_3.setBounds(35, 170, 200, 14);
		panel.add(lblNewLabel_22_3);
		
		JLabel lblNewLabel_22_4 = new JLabel("Relación:");
		lblNewLabel_22_4.setBounds(35, 210, 200, 14);
		panel.add(lblNewLabel_22_4);
		
		JRadioButton mom = new JRadioButton("Madre");
		mom.setBounds(160, 210, 80, 30);
		mom.setFont(new Font("Consolas", Font.BOLD, 12));
		mom.setOpaque(false); 
		panel.add(mom);
		
		JRadioButton dad = new JRadioButton("Padre");
		dad.setBounds(260, 210, 80, 30);
		dad.setFont(new Font("Consolas", Font.BOLD, 12));
		dad.setOpaque(false); 
		panel.add(dad);
		
		JRadioButton otro = new JRadioButton("Otro");
		otro.setBounds(360, 210, 80, 30);
		otro.setFont(new Font("Consolas", Font.BOLD, 12));
		otro.setOpaque(false); 
		panel.add(otro);
		
		ButtonGroup terms = new ButtonGroup();
		terms.add(mom);
		terms.add(dad);
		terms.add(otro);
		
		textField_16 = new JTextField();
		textField_16.addKeyListener(new KeyAdapter()
		{
			public void keyTyped(KeyEvent e) //validar q solo ingrese letras
			{
				char character = e.getKeyChar();
				if(!Character.isLetter(character))
				{
					e.consume();
				}
			}
		});
		textField_16.setBounds(160, 96, 300, 20);
		panel.add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.addKeyListener(new KeyAdapter()
		{
			public void keyTyped(KeyEvent e) //validar q solo ingrese numeros
			{
				char character = e.getKeyChar();
				if(!Character.isDigit(character))
				{
					e.consume();
				}
			}
		});
		textField_17.setColumns(10);
		textField_17.setBounds(160, 132, 300, 20);
		panel.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(160, 167, 300, 20);
		panel.add(textField_18);
		
		JLabel lblNewLabel_22_4_1 = new JLabel("Características:");
		lblNewLabel_22_4_1.setBounds(35, 259, 200, 14);
		panel.add(lblNewLabel_22_4_1);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(35, 280, 430, 90);
		panel.add(textField_19);
		
		JButton btnNewButton_8 = new JButton("Finalizar");
		btnNewButton_8.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Alumno añadido con éxito.");
				
			}
		});
		btnNewButton_8.setBackground(Color.white);
		btnNewButton_8.setBounds(748, 496, 89, 23);
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_8_1 = new JButton("Volver");
		btnNewButton_8_1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				crearAlumno(frame);
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		btnNewButton_8_1.setBackground(Color.white);
		btnNewButton_8_1.setBounds(629, 496, 89, 23);
		panel.add(btnNewButton_8_1);
	}
	
	public void crearDocente(JFrame frame)
	{
		this.setTitle("NeoByte - Añadir nuevo Docente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(180, 20, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel fondo = new JLabel();
		fondo.setIcon(new ImageIcon(getClass().getResource("logoControl.png")));
		fondo.setBounds(15, 15, 150, 60);
		contentPane.add(fondo);
		
		JLabel lblNewLabel_18_1 = new JLabel("Añadir a un nuevo docente");
		lblNewLabel_18_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 27));
		lblNewLabel_18_1.setBounds(360, 40, 400, 25);
		contentPane.add(lblNewLabel_18_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#322030"));
		panel.setBounds(57, 90, 870, 530);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_19 = new JLabel("Para añadir a un nuevo docente, rellene los siguientes datos con la información que corresponde:");
		lblNewLabel_19.setForeground(new Color(255, 255, 255));
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_19.setBounds(35, 30, 700, 20);
		panel.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Nombre completo:           (Apellido paterno, apellido materno y nombre(s))");
		lblNewLabel_20.setForeground(new Color(255, 255, 255));
		lblNewLabel_20.setBounds(35, 75, 450, 14);
		panel.add(lblNewLabel_20);
		
		textField_10 = new JTextField();
		textField_10.addKeyListener(new KeyAdapter()
		{
			public void keyTyped(KeyEvent e) //validar q solo ingrese numeros
			{
				char character = e.getKeyChar();
				if(!Character.isLetter(character))
				{
					e.consume();
				}
			}
		});
		textField_10.setBounds(35, 93, 550, 20);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_20_1 = new JLabel("Fecha de nacimiento:\r\n");
		lblNewLabel_20_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_20_1.setBounds(35, 124, 400, 14);
		panel.add(lblNewLabel_20_1);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(35, 140, 550, 20);
		panel.add(textField_11);
		
		JLabel lblNewLabel_20_1_1 = new JLabel("CURP:");
		lblNewLabel_20_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_20_1_1.setBounds(35, 173, 400, 14);
		panel.add(lblNewLabel_20_1_1);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(35, 189, 550, 20);
		panel.add(textField_12);
		
		JLabel lblNewLabel_20_1_1_1 = new JLabel("Correo electrónico:");
		lblNewLabel_20_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_20_1_1_1.setBounds(35, 220, 400, 14);
		panel.add(lblNewLabel_20_1_1_1);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(35, 235, 550, 20);
		panel.add(textField_13);
		
		JLabel lblNewLabel_20_1_1_1_1 = new JLabel("Número de teléfono (personal):");
		lblNewLabel_20_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_20_1_1_1_1.setBounds(35, 266, 400, 14);
		panel.add(lblNewLabel_20_1_1_1_1);
		
		textField_14 = new JTextField();
		textField_14.addKeyListener(new KeyAdapter()
		{
			public void keyTyped(KeyEvent e) //validar q solo ingrese numeros
			{
				char character = e.getKeyChar();
				if(!Character.isDigit(character))
				{
					e.consume();
				}
			}
		});
		textField_14.setColumns(10);
		textField_14.setBounds(35, 283, 550, 20);
		panel.add(textField_14);
		
		JLabel lblNewLabel_20_1_1_1_1_1 = new JLabel("Nacionalidad");
		lblNewLabel_20_1_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_20_1_1_1_1_1.setBounds(35, 314, 100, 14);
		panel.add(lblNewLabel_20_1_1_1_1_1);
		
		String nacionalidad[] = {"Mexicano", "Estadounidense", "Coreano", "Japonés", "Chino", "Español"};
		JComboBox nacionalidadBox = new JComboBox(nacionalidad);
		nacionalidadBox.setBounds(36, 330, 100, 20);
		nacionalidadBox.setFont(new Font("Consolas", Font.BOLD, 12));
		panel.add(nacionalidadBox);	
		
		JLabel lblNewLabel_20_1_1_1_1_1_1 = new JLabel("Tipo de sangre");
		lblNewLabel_20_1_1_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_20_1_1_1_1_1_1.setBounds(185, 314, 100, 14);
		panel.add(lblNewLabel_20_1_1_1_1_1_1);
		
		String sangre[] = {"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"};
		JComboBox sangreBox = new JComboBox(sangre);
		sangreBox.setBounds(180, 330, 100, 20);
		sangreBox.setFont(new Font("Consolas", Font.BOLD, 12));
		panel.add(sangreBox);	
		
		JLabel lblNewLabel_20_1_1_1_1_1_1_1 = new JLabel("Estado civil");
		lblNewLabel_20_1_1_1_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_20_1_1_1_1_1_1_1.setBounds(335, 314, 100, 14);
		panel.add(lblNewLabel_20_1_1_1_1_1_1_1);
		
		String civil[] = {"Soltero", "Casado", "Divorciado", "Viudo"};
		JComboBox civilBox = new JComboBox(civil);
		civilBox.setBounds(330, 330, 100, 20);
		civilBox.setFont(new Font("Consolas", Font.BOLD, 12));
		panel.add(civilBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(630, 75, 200, 250);
		panel.add(panel_1);
		
		JLabel lblNewLabel_21 = new JLabel("Inserta tu foto");
		panel_1.add(lblNewLabel_21);
		
		JLabel lblNewLabel_20_1_1_1_1_1_1_1_1 = new JLabel("Género");
		lblNewLabel_20_1_1_1_1_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_20_1_1_1_1_1_1_1_1.setBounds(480, 314, 100, 14);
		panel.add(lblNewLabel_20_1_1_1_1_1_1_1_1);
		
		String genero[] = {"Femenino", "Masculino", "Prefiero no responder"};
		JComboBox generoBox = new JComboBox(genero);
		generoBox.setBounds(475, 330, 100, 20);
		generoBox.setFont(new Font("Consolas", Font.BOLD, 12));
		panel.add(generoBox);
		
		JLabel lblNewLabel_20_1_1_1_1_1_2 = new JLabel("Idiomas:");
		lblNewLabel_20_1_1_1_1_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_20_1_1_1_1_1_2.setBounds(35, 370, 100, 14);
		panel.add(lblNewLabel_20_1_1_1_1_1_2);
		
		JCheckBox itemBox1 = new JCheckBox("Inglés");
		itemBox1.setForeground(new Color(255, 255, 255));
		itemBox1.setBounds(36, 385, 80, 30);
		itemBox1.setOpaque(false); 
		panel.add(itemBox1);
		
		JCheckBox itemBox2 = new JCheckBox("Francés");
		itemBox2.setForeground(new Color(255, 255, 255));
		itemBox2.setBounds(120, 385, 80, 30);
		itemBox2.setOpaque(false); 
		panel.add(itemBox2);
		
		JCheckBox itemBox3 = new JCheckBox("Portugués");
		itemBox3.setForeground(new Color(255, 255, 255));
		itemBox3.setBounds(220, 385, 120, 30);
		itemBox3.setOpaque(false); 
		panel.add(itemBox3);
		
		JCheckBox itemBox4 = new JCheckBox("Otro");
		itemBox4.setForeground(new Color(255, 255, 255));
		itemBox4.setBounds(320, 385, 120, 30);
		itemBox4.setOpaque(false); 
		panel.add(itemBox4);
		
		JLabel lblNewLabel_20_1_1_1_1_1_2_1 = new JLabel("Comentarios adicionales:");
		lblNewLabel_20_1_1_1_1_1_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_20_1_1_1_1_1_2_1.setBounds(35, 426, 300, 14);
		panel.add(lblNewLabel_20_1_1_1_1_1_2_1);
		
		JTextArea bioText = new JTextArea();
		bioText.setBounds(36, 445, 550, 40);
		bioText.setFont(new Font("Consolas", Font.BOLD, 16));
		panel.add(bioText);
		
		JButton btnNewButton_7 = new JButton("Finalizar");
		btnNewButton_7.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Docente añadido con éxito.");
				
			}
		});
		btnNewButton_7.setBackground(Color.white);
		btnNewButton_7.setBounds(756, 496, 89, 23);
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_7_1 = new JButton("Volver");
		btnNewButton_7_1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				inicio(frame);
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		btnNewButton_7_1.setBackground(Color.white);
		btnNewButton_7_1.setBounds(646, 496, 89, 23);
		panel.add(btnNewButton_7_1);
	}
	
	
	public void consultarAlumno(JFrame frame)
	{
		this.setTitle("School Smart Zone");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(180, 20, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("General");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(30, 250, 150, 23);
		btnNewButton_1.setBackground(Color.white);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Información familiar");
		btnNewButton_2.setBackground(Color.white);
		btnNewButton_2.setBounds(30, 290, 150, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Información académica");
		btnNewButton_3.setBackground(Color.white);
		btnNewButton_3.setBounds(20, 330, 170, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Otros...");
		btnNewButton_4.setBackground(Color.white);
		btnNewButton_4.setBounds(30, 370, 150, 23);
		contentPane.add(btnNewButton_4);
		
		JLabel fondo = new JLabel();
		fondo.setIcon(new ImageIcon(getClass().getResource("logoControl.png")));
		fondo.setBounds(20, 30, 150, 60);
		contentPane.add(fondo);
		
		JLabel lblNewLabel_16 = new JLabel("Consulta de alumnos");
		lblNewLabel_16.setForeground(new Color(0, 0, 0));
		lblNewLabel_16.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 24));
		lblNewLabel_16.setBounds(480, 45, 350, 25);
		contentPane.add(lblNewLabel_16);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#E3DEE9"));
		panel.setBounds(220, 100, 720, 500);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_15 = new JLabel("Nombre del alumno que desea consultar:");
		lblNewLabel_15.setBounds(37, 38, 250, 14);
		panel.add(lblNewLabel_15);
		
		JLabel lblNewLabel_15_1 = new JLabel("Apellido paterno:");
		lblNewLabel_15_1.setBounds(290, 85, 160, 14);
		panel.add(lblNewLabel_15_1);
		
		JLabel lblNewLabel_15_1_1 = new JLabel("Apellido materno:");
		lblNewLabel_15_1_1.setBounds(290, 135, 160, 14);
		panel.add(lblNewLabel_15_1_1);
		
		JLabel lblNewLabel_15_1_2 = new JLabel("Nombre(s):");
		lblNewLabel_15_1_2.setBounds(290, 180, 160, 14);
		panel.add(lblNewLabel_15_1_2);
		
		JLabel lblNewLabel_15_1_3 = new JLabel("Fecha de nacimiento:");
		lblNewLabel_15_1_3.setBounds(90, 315, 160, 14);
		panel.add(lblNewLabel_15_1_3);
		
		JLabel lblNewLabel_15_1_3_1 = new JLabel("Género:");
		lblNewLabel_15_1_3_1.setBounds(60, 365, 160, 14);
		panel.add(lblNewLabel_15_1_3_1);
		
		JLabel lblNewLabel_15_1_3_2 = new JLabel("");
		lblNewLabel_15_1_3_2.setBounds(290, 225, 160, 14);
		panel.add(lblNewLabel_15_1_3_2);
		
		JLabel lblNewLabel_15_1_3_3 = new JLabel("Número de teléfono:");
		lblNewLabel_15_1_3_3.setBounds(290, 270, 160, 14);
		panel.add(lblNewLabel_15_1_3_3);
		
		JLabel lblNewLabel_15_1_3_4 = new JLabel("Correo electrónico:");
		lblNewLabel_15_1_3_4.setBounds(290, 315, 160, 14);
		panel.add(lblNewLabel_15_1_3_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(60, 80, 170, 200);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel alumnoID = new JLabel();
		alumnoID.setBounds(0, 0, 170, 220);
		alumnoID.setIcon(new ImageIcon(getClass().getResource("alumna.png")));
		panel_1.add(alumnoID);
		
		String colonias[] = {"Centro", "Camino Real", "Pedregal", "Conchalito", "La ocho"};
		
		JButton btnNewButton_5_1 = new JButton("Volver");
		btnNewButton_5_1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				inicio(frame);
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		btnNewButton_5_1.setBackground(Color.white);
		btnNewButton_5_1.setBounds(50, 460, 100, 23);
		panel.add(btnNewButton_5_1);
		
		JLabel lblNewLabel_15_1_3_4_1 = new JLabel("Status:");
		lblNewLabel_15_1_3_4_1.setBounds(290, 360, 160, 14);
		panel.add(lblNewLabel_15_1_3_4_1);
		
		JLabel lblNewLabel_15_1_3_4_1_1 = new JLabel("Estado civil:");
		lblNewLabel_15_1_3_4_1_1.setBounds(290, 398, 160, 14);
		panel.add(lblNewLabel_15_1_3_4_1_1);
		
		String opciones[] = {"Soltero", "Casado", "Divorciado"};
		
		textField_28 = new JTextField();
		textField_28.setText("Emma Díaz Herrera");
		textField_28.setBounds(285, 35, 400, 20);
		panel.add(textField_28);
		textField_28.setColumns(10);
		
		JLabel lblNewLabel_15_1_4 = new JLabel("Díaz");
		lblNewLabel_15_1_4.setBounds(435, 85, 160, 14);
		panel.add(lblNewLabel_15_1_4);
		
		JLabel lblNewLabel_15_1_4_1 = new JLabel("Herrera");
		lblNewLabel_15_1_4_1.setBounds(435, 135, 160, 14);
		panel.add(lblNewLabel_15_1_4_1);
		
		JLabel lblNewLabel_15_1_4_2 = new JLabel("Emma");
		lblNewLabel_15_1_4_2.setBounds(435, 180, 160, 14);
		panel.add(lblNewLabel_15_1_4_2);
		
		JLabel lblNewLabel_15_1_2_1 = new JLabel("Dirección:");
		lblNewLabel_15_1_2_1.setBounds(290, 225, 160, 14);
		panel.add(lblNewLabel_15_1_2_1);
		
		JLabel lblNewLabel_15_1_4_2_1 = new JLabel("Calle de los Susurros, Colonia Estrella 23482");
		lblNewLabel_15_1_4_2_1.setBounds(435, 225, 300, 14);
		panel.add(lblNewLabel_15_1_4_2_1);
		
		JLabel lblNewLabel_15_1_3_2_1 = new JLabel("(555) 876-5432");
		lblNewLabel_15_1_3_2_1.setBounds(435, 270, 160, 14);
		panel.add(lblNewLabel_15_1_3_2_1);
		
		JLabel lblNewLabel_15_1_3_2_1_1 = new JLabel("emmaHerreraD@gmail.com");
		lblNewLabel_15_1_3_2_1_1.setBounds(435, 315, 160, 14);
		panel.add(lblNewLabel_15_1_3_2_1_1);
		
		JLabel lblNewLabel_15_1_3_2_1_1_1 = new JLabel("Activa");
		lblNewLabel_15_1_3_2_1_1_1.setBounds(435, 360, 160, 14);
		panel.add(lblNewLabel_15_1_3_2_1_1_1);
		
		JLabel lblNewLabel_15_1_3_2_1_1_1_1 = new JLabel("Soltera");
		lblNewLabel_15_1_3_2_1_1_1_1.setBounds(435, 398, 160, 14);
		panel.add(lblNewLabel_15_1_3_2_1_1_1_1);
		
		JLabel lblNewLabel_15_1_3_2_1_1_1_1_1 = new JLabel("13 octubre 2002");
		lblNewLabel_15_1_3_2_1_1_1_1_1.setBounds(100, 335, 160, 14);
		panel.add(lblNewLabel_15_1_3_2_1_1_1_1_1);
		
		JLabel lblNewLabel_15_1_3_2_1_1_1_1_1_1 = new JLabel("Femenino");
		lblNewLabel_15_1_3_2_1_1_1_1_1_1.setBounds(169, 365, 160, 14);
		panel.add(lblNewLabel_15_1_3_2_1_1_1_1_1_1);
		
		JLabel lblNewLabel_15_1_3_5 = new JLabel("ID: 987123456");
		lblNewLabel_15_1_3_5.setBounds(110, 291, 160, 14);
		panel.add(lblNewLabel_15_1_3_5);
		
	}

	public void consultarDocente(JFrame frame)
	{
		this.setTitle("NeoByte - Consultar información de docente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(180, 20, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("General");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(30, 290, 150, 23);
		btnNewButton_1.setBackground(Color.white);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Información académica");
		btnNewButton_3.setBackground(Color.white);
		btnNewButton_3.setBounds(20, 330, 170, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Otros...");
		btnNewButton_4.setBackground(Color.white);
		btnNewButton_4.setBounds(30, 370, 150, 23);
		contentPane.add(btnNewButton_4);
		
		JLabel fondo = new JLabel();
		fondo.setIcon(new ImageIcon(getClass().getResource("logoControl.png")));
		fondo.setBounds(20, 30, 150, 60);
		contentPane.add(fondo);
		
		JLabel lblNewLabel_16 = new JLabel("Consulta de docentes");
		lblNewLabel_16.setForeground(new Color(0, 0, 0));
		lblNewLabel_16.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 24));
		lblNewLabel_16.setBounds(480, 45, 350, 25);
		contentPane.add(lblNewLabel_16);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#725b75"));
		panel.setBounds(220, 100, 720, 500);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_15 = new JLabel("Nombre del docente que desea consultar:");
		lblNewLabel_15.setForeground(new Color(255, 255, 255));
		lblNewLabel_15.setBounds(37, 38, 250, 14);
		panel.add(lblNewLabel_15);
		
		JLabel lblNewLabel_15_1 = new JLabel("Apellido paterno:");
		lblNewLabel_15_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_15_1.setBounds(290, 85, 160, 14);
		panel.add(lblNewLabel_15_1);
		
		JLabel lblNewLabel_15_1_1 = new JLabel("Apellido materno:");
		lblNewLabel_15_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_15_1_1.setBounds(290, 135, 160, 14);
		panel.add(lblNewLabel_15_1_1);
		
		JLabel lblNewLabel_15_1_2 = new JLabel("Nombre(s):");
		lblNewLabel_15_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_15_1_2.setBounds(290, 180, 160, 14);
		panel.add(lblNewLabel_15_1_2);
		
		JLabel lblNewLabel_15_1_3 = new JLabel("Fecha de nacimiento:");
		lblNewLabel_15_1_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_15_1_3.setBounds(85, 295, 160, 14);
		panel.add(lblNewLabel_15_1_3);
		
		JLabel lblNewLabel_15_1_3_1 = new JLabel("Género:");
		lblNewLabel_15_1_3_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_15_1_3_1.setBounds(60, 350, 160, 14);
		panel.add(lblNewLabel_15_1_3_1);

		JLabel lblNewLabel_15_1_3_3 = new JLabel("Número de teléfono:");
		lblNewLabel_15_1_3_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_15_1_3_3.setBounds(290, 270, 160, 14);
		panel.add(lblNewLabel_15_1_3_3);
		
		JLabel lblNewLabel_15_1_3_4 = new JLabel("Correo electrónico:");
		lblNewLabel_15_1_3_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_15_1_3_4.setBounds(290, 315, 160, 14);
		panel.add(lblNewLabel_15_1_3_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(60, 80, 170, 200);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel profeID = new JLabel();
		profeID.setBounds(0, 0, 170, 220);
		profeID.setIcon(new ImageIcon(getClass().getResource("newMaestro.png")));
		panel_1.add(profeID);
		
		JButton btnNewButton_5_1 = new JButton("Volver");
		btnNewButton_5_1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				inicio(frame);
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		btnNewButton_5_1.setBackground(Color.white);
		btnNewButton_5_1.setBounds(50, 460, 100, 23);
		panel.add(btnNewButton_5_1);
		
		JLabel lblNewLabel_15_1_3_4_1 = new JLabel("Status:");
		lblNewLabel_15_1_3_4_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_15_1_3_4_1.setBounds(290, 360, 160, 14);
		panel.add(lblNewLabel_15_1_3_4_1);
		
		JLabel lblNewLabel_15_1_3_4_1_1 = new JLabel("Estado civil:");
		lblNewLabel_15_1_3_4_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_15_1_3_4_1_1.setBounds(290, 398, 160, 14);
		panel.add(lblNewLabel_15_1_3_4_1_1);
		
		String opciones[] = {"Soltero", "Casado", "Divorciado"};
		
		textField_28 = new JTextField();
		textField_28.setText("Javier García Morales");
		textField_28.setBounds(285, 35, 400, 20);
		panel.add(textField_28);
		textField_28.setColumns(10);
		
		JLabel lblNewLabel_15_1_4 = new JLabel("García");
		lblNewLabel_15_1_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_15_1_4.setBounds(435, 85, 160, 14);
		panel.add(lblNewLabel_15_1_4);
		
		JLabel lblNewLabel_15_1_4_1 = new JLabel("Morales");
		lblNewLabel_15_1_4_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_15_1_4_1.setBounds(435, 135, 160, 14);
		panel.add(lblNewLabel_15_1_4_1);
		
		JLabel lblNewLabel_15_1_4_2 = new JLabel("Javier");
		lblNewLabel_15_1_4_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_15_1_4_2.setBounds(435, 180, 160, 14);
		panel.add(lblNewLabel_15_1_4_2);
		
		JLabel lblNewLabel_15_1_2_1 = new JLabel("Dirección:");
		lblNewLabel_15_1_2_1.setForeground(Color.white);
		lblNewLabel_15_1_2_1.setBounds(290, 225, 160, 14);
		panel.add(lblNewLabel_15_1_2_1);
		
		JLabel lblNewLabel_15_1_4_2_1 = new JLabel("Calle playa, Colonia Jamaica 23482");
		lblNewLabel_15_1_4_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_15_1_4_2_1.setBounds(435, 225, 300, 14);
		panel.add(lblNewLabel_15_1_4_2_1);
		
		JLabel lblNewLabel_15_1_3_2_1 = new JLabel("(555) 672-0032");
		lblNewLabel_15_1_3_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_15_1_3_2_1.setBounds(435, 270, 160, 14);
		panel.add(lblNewLabel_15_1_3_2_1);
		
		JLabel lblNewLabel_15_1_3_2_1_1 = new JLabel("JMGarcia@gmail.com");
		lblNewLabel_15_1_3_2_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_15_1_3_2_1_1.setBounds(435, 315, 160, 14);
		panel.add(lblNewLabel_15_1_3_2_1_1);
		
		JLabel lblNewLabel_15_1_3_2_1_1_1 = new JLabel("Activo");
		lblNewLabel_15_1_3_2_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_15_1_3_2_1_1_1.setBounds(435, 360, 160, 14);
		panel.add(lblNewLabel_15_1_3_2_1_1_1);
		
		JLabel lblNewLabel_15_1_3_2_1_1_1_1 = new JLabel("Soltero");
		lblNewLabel_15_1_3_2_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_15_1_3_2_1_1_1_1.setBounds(435, 398, 160, 14);
		panel.add(lblNewLabel_15_1_3_2_1_1_1_1);
		
		JLabel lblNewLabel_15_1_3_2_1_1_1_1_1 = new JLabel("21 septiembre 1973");
		lblNewLabel_15_1_3_2_1_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_15_1_3_2_1_1_1_1_1.setBounds(90, 320, 160, 14);
		panel.add(lblNewLabel_15_1_3_2_1_1_1_1_1);
		
		JLabel lblNewLabel_15_1_3_2_1_1_1_1_1_1 = new JLabel("Masculino");
		lblNewLabel_15_1_3_2_1_1_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_15_1_3_2_1_1_1_1_1_1.setBounds(169, 350, 160, 14);
		panel.add(lblNewLabel_15_1_3_2_1_1_1_1_1_1);
		
		JLabel lblNewLabel_15_1_3_4_1_1_1 = new JLabel("Grado de estudios:");
		lblNewLabel_15_1_3_4_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_15_1_3_4_1_1_1.setBounds(290, 436, 160, 14);
		panel.add(lblNewLabel_15_1_3_4_1_1_1);
		
		JLabel lblNewLabel_15_1_3_2_1_1_1_1_2 = new JLabel("Universidad");
		lblNewLabel_15_1_3_2_1_1_1_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_15_1_3_2_1_1_1_1_2.setBounds(435, 436, 160, 14);
		panel.add(lblNewLabel_15_1_3_2_1_1_1_1_2);
	}

	public void editarAlumno(JFrame frame)
	{
		this.setTitle("NeoByte - Editar alumno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(180, 20, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel fondo = new JLabel();
		fondo.setIcon(new ImageIcon(getClass().getResource("logoControl.png")));
		fondo.setBounds(10, 10, 150, 60);
		contentPane.add(fondo);
		
		JLabel lblNewLabel_24 = new JLabel("Editar información del alumno");
		lblNewLabel_24.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 27));
		lblNewLabel_24.setBounds(350, 30, 400, 30);
		contentPane.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("Algunos de los datos guardados no pueden cambiarse desde aquí, para poder hacerlo acuda de manera presencial a la escuela.");
		lblNewLabel_25.setBounds(35, 80, 780, 14);
		contentPane.add(lblNewLabel_25);
		
		JPanel panel = new JPanel();
		panel.setBounds(30, 104, 910, 40);
		panel.setBackground(Color.decode("#E3DEE9"));		
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_26 = new JLabel("Nombre del alumno alumno:            Alejandro Cervantes Ochoa");
		lblNewLabel_26.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		panel.add(lblNewLabel_26, BorderLayout.CENTER);
		
		JLabel lblNewLabel_27 = new JLabel("Identidad de género");
		lblNewLabel_27.setBounds(100, 170, 150, 14);
		contentPane.add(lblNewLabel_27);
		
		String genero[] = {"Hombre", "Mujer", "No binarie", "No deseo contestar"};
		JComboBox locations = new JComboBox(genero);
		locations.setBounds(380, 165, 250, 20);
		locations.setFont(new Font("Consolas", Font.BOLD, 12));
		contentPane.add(locations);	
		
		JLabel lblNewLabel_27_1 = new JLabel("Orientación sexual");
		lblNewLabel_27_1.setBounds(100, 215, 150, 14);
		contentPane.add(lblNewLabel_27_1);
		
		String orientacion[] = {"Heterosexual", "Homosexual", "Bisexual", "Pansexual", "Asexual"};
		JComboBox orientacionBox = new JComboBox(orientacion);
		orientacionBox.setBounds(380, 210, 250, 20);
		orientacionBox.setFont(new Font("Consolas", Font.BOLD, 12));
		contentPane.add(orientacionBox);	
		
		JLabel lblNewLabel_27_1_1 = new JLabel("Domicilio");
		lblNewLabel_27_1_1.setBounds(100, 265, 150, 14);
		contentPane.add(lblNewLabel_27_1_1);
		
		textField_20 = new JTextField();
		textField_20.setText("Calle Robes #453, Colonia El Sol CDMX");
		textField_20.setBounds(380, 260, 250, 20);
		contentPane.add(textField_20);
		textField_20.setColumns(10);
		
		JLabel lblNewLabel_27_1_1_1 = new JLabel("Teléfono celular");
		lblNewLabel_27_1_1_1.setBounds(100, 310, 150, 14);
		contentPane.add(lblNewLabel_27_1_1_1);
		
		textField_21 = new JTextField();
		textField_21.setText("(555) 123-4567");
		textField_21.setColumns(10);
		textField_21.setBounds(380, 305, 250, 20);
		contentPane.add(textField_21);
		
		JLabel lblNewLabel_27_1_1_1_1 = new JLabel("Estado civil");
		lblNewLabel_27_1_1_1_1.setBounds(100, 360, 100, 14);
		contentPane.add(lblNewLabel_27_1_1_1_1);
		
		String opciones[] = {"Soltero", "Casado", "Divorciado"};
		JComboBox estadoCivil = new JComboBox(opciones);
		estadoCivil.setFont(new Font("Consolas", Font.BOLD, 12));
		estadoCivil.setBounds(380, 355, 250, 20);
		contentPane.add(estadoCivil);
		
		JLabel lblNewLabel_27_1_1_1_1_1 = new JLabel("Información adicional");
		lblNewLabel_27_1_1_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblNewLabel_27_1_1_1_1_1.setBounds(100, 430, 200, 14);
		contentPane.add(lblNewLabel_27_1_1_1_1_1);
		
		JLabel lblNewLabel_28 = new JLabel("Contacto en caso de emergencia");
		lblNewLabel_28.setBounds(100, 455, 200, 14);
		contentPane.add(lblNewLabel_28);
		
		JLabel lblNewLabel_29 = new JLabel("Nombre completo de la persona responsable");
		lblNewLabel_29.setBounds(130, 485, 260, 14);
		contentPane.add(lblNewLabel_29);
		
		JLabel lblNewLabel_30 = new JLabel("Relación");
		lblNewLabel_30.setBounds(130, 525, 100, 14);
		contentPane.add(lblNewLabel_30);
		
		
		JLabel lblNewLabel_31 = new JLabel("Dirección");
		lblNewLabel_31.setBounds(130, 565, 100, 14);
		contentPane.add(lblNewLabel_31);
		
		JLabel lblNewLabel_32 = new JLabel("Número de teléfono");
		lblNewLabel_32.setBounds(130, 600, 150, 14);
		contentPane.add(lblNewLabel_32);
		
		textField_22 = new JTextField();
		textField_22.setText("Laura Ochoa");
		textField_22.setColumns(10);
		textField_22.setBounds(400, 485, 250, 20);
		contentPane.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setText("Calle Robes #453, Colonia El Sol CDMX");
		textField_23.setColumns(10);
		textField_23.setBounds(400, 565, 250, 20);
		contentPane.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setText("(555) 987-6543");
		textField_24.setColumns(10);
		textField_24.setBounds(400, 600, 250, 20);
		contentPane.add(textField_24);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.decode("#E3DEE9"));
		panel_1.setBounds(720, 197, 200, 250);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel alumnoID = new JLabel();
		alumnoID.setBounds(0, 0, 200, 250);
		alumnoID.setIcon(new ImageIcon(getClass().getResource("alumno1.png")));
		panel_1.add(alumnoID);
		
		JButton btnNewButton_9 = new JButton("Guardar cambios");
		btnNewButton_9.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, "Cambios guardados con éxito");
			}
		});
		btnNewButton_9.setBounds(735, 495, 170, 23);
		btnNewButton_9.setBackground(Color.white);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_9_1 = new JButton("Volver");
		btnNewButton_9_1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				frame.getContentPane().removeAll();
				inicio(frame);
				frame.repaint();
				frame.revalidate();	
			}
		});
		btnNewButton_9_1.setBounds(770, 530, 100, 23);
		btnNewButton_9_1.setBackground(Color.white);
		contentPane.add(btnNewButton_9_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.decode("#E3DEE9"));
		panel_2.setBounds(69, 154, 590, 240);
		contentPane.add(panel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.decode("#E3DEE9"));
		panel_2_1.setBounds(69, 415, 590, 215);
		contentPane.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JRadioButton mom = new JRadioButton("Madre");
		mom.setSelected(true);
		mom.setBounds(330, 110, 61, 23);
		mom.setFont(new Font("Consolas", Font.BOLD, 12));
		mom.setOpaque(false); 
		panel_2_1.add(mom);
		
		JRadioButton dad = new JRadioButton("Padre");
		dad.setBounds(420, 110, 61, 23);
		dad.setFont(new Font("Consolas", Font.BOLD, 12));
		dad.setOpaque(false); 
		panel_2_1.add(dad);
		
		JRadioButton otro = new JRadioButton("Otro");
		otro.setBounds(510, 110, 53, 23);
		otro.setFont(new Font("Consolas", Font.BOLD, 12));
		otro.setOpaque(false); 
		panel_2_1.add(otro);
		
		ButtonGroup terms = new ButtonGroup();
		terms.add(mom);
		terms.add(dad);
		terms.add(otro);
		
		JLabel lblNewLabel = new JLabel("ID: 987654321");
		lblNewLabel.setBounds(745, 455, 150, 14);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
	}
	
	public void editarDocente(JFrame frame)
	{
		this.setTitle("NeoByte - Editar docente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(180, 20, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel fondo = new JLabel();
		fondo.setIcon(new ImageIcon(getClass().getResource("logoControl.png")));
		fondo.setBounds(10, 10, 150, 60);
		contentPane.add(fondo);
		
		JLabel lblNewLabel_24 = new JLabel("Editar información del docente");
		lblNewLabel_24.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 27));
		lblNewLabel_24.setBounds(350, 30, 450, 30);
		contentPane.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("Algunos de los datos guardados no pueden cambiarse desde aquí, para poder hacerlo acuda de manera presencial a la escuela.");
		lblNewLabel_25.setBounds(35, 80, 780, 14);
		contentPane.add(lblNewLabel_25);
		
		JPanel panel = new JPanel();
		panel.setBounds(30, 104, 910, 40);
		panel.setBackground(Color.decode("#322030"));		
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_26 = new JLabel("Nombre del docente:            Simón Gómez Talamante");
		lblNewLabel_26.setForeground(new Color(255, 255, 255));
		lblNewLabel_26.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		panel.add(lblNewLabel_26, BorderLayout.CENTER);
		
		JLabel lblNewLabel_27 = new JLabel("Identidad de género");
		lblNewLabel_27.setForeground(new Color(255, 255, 255));
		lblNewLabel_27.setBounds(100, 170, 150, 14);
		contentPane.add(lblNewLabel_27);
		
		String genero[] = {"Hombre", "Mujer", "No binarie", "No deseo contestar"};
		JComboBox locations = new JComboBox(genero);
		locations.setBounds(380, 165, 250, 20);
		locations.setFont(new Font("Consolas", Font.BOLD, 12));
		contentPane.add(locations);	
		
		JLabel lblNewLabel_27_1 = new JLabel("Correo electrónico");
		lblNewLabel_27_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_27_1.setBounds(100, 215, 150, 14);
		contentPane.add(lblNewLabel_27_1);
		
		JTextField correo = new JTextField();
		correo.setText("smnGomez@gmail.com");
		correo.setBounds(380, 210, 250, 20);
		contentPane.add(correo);
		correo.setColumns(10);
		
		JLabel lblNewLabel_27_1_1 = new JLabel("Domicilio:");
		lblNewLabel_27_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_27_1_1.setBounds(100, 265, 150, 14);
		contentPane.add(lblNewLabel_27_1_1);
		
		textField_20 = new JTextField();
		textField_20.setText("Calle del Bosque #612, Colonia La Ilusión 73791");
		textField_20.setBounds(380, 260, 250, 20);
		contentPane.add(textField_20);
		textField_20.setColumns(10);
		
		JLabel lblNewLabel_27_1_1_1 = new JLabel("Teléfono celular");
		lblNewLabel_27_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_27_1_1_1.setBounds(100, 310, 150, 14);
		contentPane.add(lblNewLabel_27_1_1_1);
		
		textField_21 = new JTextField();
		textField_21.setText("(555) 555-5555");
		textField_21.setColumns(10);
		textField_21.setBounds(380, 305, 250, 20);
		contentPane.add(textField_21);
		
		JLabel lblNewLabel_27_1_1_1_1 = new JLabel("Estado civil");
		lblNewLabel_27_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_27_1_1_1_1.setBounds(100, 360, 100, 14);
		contentPane.add(lblNewLabel_27_1_1_1_1);
		
		String opciones[] = {"Soltero", "Casado", "Divorciado"};
		JComboBox estadoCivil = new JComboBox(opciones);
		estadoCivil.setFont(new Font("Consolas", Font.BOLD, 12));
		estadoCivil.setBounds(380, 355, 250, 20);
		contentPane.add(estadoCivil);
		
		JLabel lblNewLabel_27_1_1_1_1_1 = new JLabel("Información académica");
		lblNewLabel_27_1_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_27_1_1_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblNewLabel_27_1_1_1_1_1.setBounds(100, 430, 200, 14);
		contentPane.add(lblNewLabel_27_1_1_1_1_1);
		
		JLabel lblNewLabel_29 = new JLabel("Estudios concluidos");
		lblNewLabel_29.setForeground(new Color(255, 255, 255));
		lblNewLabel_29.setBounds(130, 465, 260, 14);
		contentPane.add(lblNewLabel_29);
		
		JLabel lblNewLabel_30 = new JLabel("Carrera cursada");
		lblNewLabel_30.setForeground(new Color(255, 255, 255));
		lblNewLabel_30.setBounds(130, 510, 100, 14);
		contentPane.add(lblNewLabel_30);
		
		
		JLabel lblNewLabel_31 = new JLabel("Materias impartidas");
		lblNewLabel_31.setForeground(new Color(255, 255, 255));
		lblNewLabel_31.setBounds(130, 555, 190, 14);
		contentPane.add(lblNewLabel_31);
		
		JLabel lblNewLabel_32 = new JLabel("Número de teléfono");
		lblNewLabel_32.setForeground(new Color(255, 255, 255));
		lblNewLabel_32.setBounds(130, 595, 150, 14);
		contentPane.add(lblNewLabel_32);
		
		textField_22 = new JTextField();
		textField_22.setText("Instituto Tecnológico del Norte");
		textField_22.setColumns(10);
		textField_22.setBounds(400, 465, 250, 20);
		contentPane.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setText("Diseño web, Redes II");
		textField_23.setColumns(10);
		textField_23.setBounds(400, 555, 250, 20);
		contentPane.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setText("(555) 555-5555");
		textField_24.setColumns(10);
		textField_24.setBounds(400, 595, 250, 20);
		contentPane.add(textField_24);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.decode("#E3DEE9"));
		panel_1.setBounds(720, 197, 200, 250);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel maestro2 = new JLabel();
		maestro2.setBounds(0, 0, 200, 250);
		maestro2.setIcon(new ImageIcon(getClass().getResource("maestro2.png")));
		panel_1.add(maestro2);
		
		JButton btnNewButton_9 = new JButton("Guardar cambios");
		btnNewButton_9.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, "Cambios guardados con éxito");
			}
		});
		btnNewButton_9.setBounds(735, 495, 170, 23);
		btnNewButton_9.setBackground(Color.white);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_9_1 = new JButton("Volver");
		btnNewButton_9_1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				frame.getContentPane().removeAll();
				inicio(frame);
				frame.repaint();
				frame.revalidate();	
			}
		});
		btnNewButton_9_1.setBounds(770, 530, 100, 23);
		btnNewButton_9_1.setBackground(Color.white);
		contentPane.add(btnNewButton_9_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.decode("#322030"));
		panel_2.setBounds(69, 154, 590, 240);
		contentPane.add(panel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.decode("#322030"));
		panel_2_1.setBounds(69, 415, 590, 215);
		contentPane.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		textField_9 = new JTextField();
		textField_9.setText("Ingeniería en Sistemas");
		textField_9.setColumns(10);
		textField_9.setBounds(330, 95, 250, 20);
		panel_2_1.add(textField_9);
		
		ButtonGroup terms = new ButtonGroup();
		
		JLabel lblNewLabel = new JLabel("Experiencia docente:  7 años");
		lblNewLabel.setBounds(700, 455, 230, 14);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
	}
	
	public void eliminarDocente(JFrame frame)
	{
		this.setTitle("NeoByte - Eliminar docente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(180, 20, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel fondo = new JLabel();
		fondo.setIcon(new ImageIcon(getClass().getResource("logoControl.png")));
		fondo.setBounds(15, 25, 150, 60);
		contentPane.add(fondo);
		
		JLabel lblNewLabel_24 = new JLabel("Eliminación de un docente");
		lblNewLabel_24.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 27));
		lblNewLabel_24.setBounds(350, 40, 400, 30);
		contentPane.add(lblNewLabel_24);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#DB2F1D"));
		panel.setBounds(50, 120, 880, 40);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_36 = new JLabel("  Esta acción es permanente y el docente será eliminado de la base de datos.");
		lblNewLabel_36.setForeground(new Color(255, 255, 255));
		panel.add(lblNewLabel_36, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.decode("#D94F41"));
		panel_1.setBounds(180, 189, 600, 30);
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_37 = new JLabel("  Ingresa la siguiente información");
		lblNewLabel_37.setForeground(new Color(255, 255, 255));
		panel_1.add(lblNewLabel_37, BorderLayout.CENTER);
		
		JLabel lblNewLabel_38 = new JLabel("Nombre completo:");
		lblNewLabel_38.setBounds(300, 250, 150, 14);
		contentPane.add(lblNewLabel_38);
		
		JLabel lblNewLabel_38_1 = new JLabel("Contraseña:");
		lblNewLabel_38_1.setBounds(300, 294, 100, 14);
		contentPane.add(lblNewLabel_38_1);
		
		textField_26 = new JTextField();
		textField_26.setBounds(441, 247, 250, 20);
		contentPane.add(textField_26);
		textField_26.setColumns(10);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(441, 291, 250, 20);
		contentPane.add(textField_27);
		
		JButton btnNewButton_10 = new JButton("Volver");
		btnNewButton_10.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				frame.getContentPane().removeAll();
				inicio(frame);
				frame.repaint();
				frame.revalidate();	
			}
		});
		btnNewButton_10.setBackground(Color.white);
		btnNewButton_10.setBounds(372, 357, 89, 23);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_10_1 = new JButton("Eliminar");
		btnNewButton_10_1.addActionListener(new ActionListener() 
		{	
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showConfirmDialog(null, "¿Está seguro de querer realizar esta acción?");
			}
		});
		btnNewButton_10_1.setBackground(Color.decode("#D94F41"));
		btnNewButton_10_1.setForeground(Color.white);
		btnNewButton_10_1.setBounds(540, 357, 89, 23);
		contentPane.add(btnNewButton_10_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.decode("#e3cebd"));
		panel_2.setBounds(26, 109, 930, 300);
		contentPane.add(panel_2);
	}
	
	public void eliminarAlumno(JFrame frame)
	{
		this.setTitle("NeoByte - Eliminar alumno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(180, 20, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel fondo = new JLabel();
		fondo.setIcon(new ImageIcon(getClass().getResource("logoControl.png")));
		fondo.setBounds(15, 25, 150, 60);
		contentPane.add(fondo);
		
		JLabel lblNewLabel_24 = new JLabel("Eliminación de un alumno");
		lblNewLabel_24.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 27));
		lblNewLabel_24.setBounds(350, 40, 400, 30);
		contentPane.add(lblNewLabel_24);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#DB2F1D"));
		panel.setBounds(50, 120, 880, 40);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_36 = new JLabel("  Esta acción es permanente y el alumno será eliminado de la base de datos.");
		lblNewLabel_36.setForeground(new Color(255, 255, 255));
		panel.add(lblNewLabel_36, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.decode("#D94F41"));
		panel_1.setBounds(180, 189, 600, 30);
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_37 = new JLabel("  Ingresa la siguiente información");
		lblNewLabel_37.setForeground(new Color(255, 255, 255));
		panel_1.add(lblNewLabel_37, BorderLayout.CENTER);
		
		JLabel lblNewLabel_38 = new JLabel("Nombre completo:");
		lblNewLabel_38.setBounds(300, 250, 150, 14);
		contentPane.add(lblNewLabel_38);
		
		JLabel lblNewLabel_38_1 = new JLabel("ID:");
		lblNewLabel_38_1.setBounds(300, 294, 100, 14);
		contentPane.add(lblNewLabel_38_1);
		
		textField_26 = new JTextField();
		textField_26.setBounds(441, 247, 250, 20);
		contentPane.add(textField_26);
		textField_26.setColumns(10);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(441, 291, 250, 20);
		contentPane.add(textField_27);
		
		JButton btnNewButton_10 = new JButton("Volver");
		btnNewButton_10.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				frame.getContentPane().removeAll();
				inicio(frame);
				frame.repaint();
				frame.revalidate();	
			}
		});
		btnNewButton_10.setBackground(Color.white);
		btnNewButton_10.setBounds(372, 357, 89, 23);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_10_1 = new JButton("Eliminar");
		btnNewButton_10_1.addActionListener(new ActionListener() 
		{	
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showConfirmDialog(null, "¿Está seguro de querer realizar esta acción?");
			}
		});
		btnNewButton_10_1.setBackground(Color.decode("#D94F41"));
		btnNewButton_10_1.setForeground(Color.white);
		btnNewButton_10_1.setBounds(540, 357, 89, 23);
		contentPane.add(btnNewButton_10_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.decode("#e3cebd"));
		panel_2.setBounds(26, 109, 930, 300);
		contentPane.add(panel_2);
	}
	
	
}
