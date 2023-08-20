package gui;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.border.TitledBorder;
import principal.*;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Interface extends JFrame {
	public static JPanel principalPanel;
	public static JTextField textHorasExtras;
	public static JTextField textTurno;
	public static JTextField textHijos;
	public static JTextField textPrecioHora;
	public static JTextField textHorasComunes;
	public Interface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 529, 457);
		principalPanel = new JPanel();
		principalPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(principalPanel);
		principalPanel.setLayout(null);
		
		JPanel formPanel = new JPanel();
		formPanel.setBounds(0, 0, 519, 238);
		principalPanel.add(formPanel);
		formPanel.setLayout(null);
		
		JLabel lblSueldos = new JLabel("Sueldos");
		lblSueldos.setBounds(231, 0, 57, 15);
		formPanel.add(lblSueldos);
		
		JLabel lblHorasComunes = new JLabel("Horas Comunes:");
		lblHorasComunes.setBounds(12, 22, 121, 15);
		formPanel.add(lblHorasComunes);
		
		JLabel lblPrecioHora = new JLabel("Precio Hora:");
		lblPrecioHora.setBounds(12, 49, 93, 15);
		formPanel.add(lblPrecioHora);
		
		JLabel lblTurno = new JLabel("Turno:");
		lblTurno.setBounds(12, 103, 46, 15);
		formPanel.add(lblTurno);
		
		JLabel lblHijos = new JLabel("Hijos:");
		lblHijos.setBounds(12, 130, 40, 15);
		formPanel.add(lblHijos);
		
		JLabel lblHorasExtras = new JLabel("Horas Extras (+160):");
		lblHorasExtras.setBounds(12, 76, 143, 15);
		formPanel.add(lblHorasExtras);
		
		textHorasComunes = new JTextField();
		textHorasComunes.setColumns(10);
		textHorasComunes.setBounds(156, 20, 114, 19);
		formPanel.add(textHorasComunes);
		
		textPrecioHora = new JTextField();
		textPrecioHora.setColumns(10);
		textPrecioHora.setBounds(156, 47, 114, 19);
		formPanel.add(textPrecioHora);
		
		textHorasExtras = new JTextField();
		textHorasExtras.setColumns(10);
		textHorasExtras.setBounds(156, 74, 114, 19);
		formPanel.add(textHorasExtras);
		
		textTurno = new JTextField();
		textTurno.setColumns(10);
		textTurno.setBounds(156, 101, 114, 19);
		formPanel.add(textTurno);
		
		textHijos = new JTextField();
		textHijos.setColumns(10);
		textHijos.setBounds(156, 128, 114, 19);
		formPanel.add(textHijos);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(199, 201, 117, 25);
		formPanel.add(btnCalcular);
		btnCalcular.addActionListener(e -> Main.procesarDatos());
		
		JPanel panelDatos = new JPanel();
		panelDatos.setBounds(0, 235, 519, 192);
		principalPanel.add(panelDatos);
		panelDatos.setLayout(null);
	}
}
