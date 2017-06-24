package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblUsuario;
	private JLabel lblContrasea;
	private JTextField txtUsu;
	private JPasswordField pCon;
	private JButton btnNewButton;
	private JLabel lblLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setBackground(Color.BLACK);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		//contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblUsuario = new JLabel("Usuario");
			lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
			//lblUsuario.setForeground(Color.WHITE);
			lblUsuario.setBounds(39, 87, 76, 20);
			contentPane.add(lblUsuario);
		}
		{
			lblContrasea = new JLabel("Contrase\u00F1a");
			lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 15));
			//lblContrasea.setForeground(Color.WHITE);
			lblContrasea.setBounds(39, 125, 96, 19);
			contentPane.add(lblContrasea);
		}
		{
			txtUsu = new JTextField();
			txtUsu.setBounds(156, 89, 86, 20);
			contentPane.add(txtUsu);
			txtUsu.setColumns(10);
		}
		{
			pCon = new JPasswordField();
			pCon.setBounds(156, 126, 86, 20);
			contentPane.add(pCon);
		}
		{
			btnNewButton = new JButton("ACEPTAR");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(283, 87, 89, 59);
			contentPane.add(btnNewButton);
		}
		{
			lblLogin = new JLabel("LOGIN");
			lblLogin.setForeground(Color.LIGHT_GRAY);
			lblLogin.setFont(new Font("Arial Black", Font.PLAIN, 19));
			lblLogin.setBounds(164, 29, 112, 32);
			contentPane.add(lblLogin);
		}
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(arg0);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent arg0) {
	
	char[] clave = pCon.getPassword();
	String CF = new String(clave);
	
	if(txtUsu.getText().equals("Lenin") && CF.equals("123")){
		dispose();
		JOptionPane.showMessageDialog(null, "Bienvenido al Sistema", "INGRESASTE", JOptionPane.INFORMATION_MESSAGE);
		Tienda t = new Tienda();
		t.setVisible(true);
	}
	else{
		JOptionPane.showMessageDialog(null, "Usuario o contrase�a err�neos", "�ERROR!", JOptionPane.ERROR_MESSAGE);
		txtUsu.setText("");
		pCon.setText("");
		txtUsu.requestFocus();
	}
	
	}
}
