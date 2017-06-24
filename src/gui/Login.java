package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;

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
		
		//contentPane = new JPanel();
		//contentPane.setBackground(Color.BLACK);
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(contentPane);
		//contentPane.setLayout(null);

		
		try {
			BufferedImage img = ImageIO.read(new File("resources/assets/images/splash-wallpaper.png"));
			setContentPane(new JLabel(new ImageIcon(img)));
		}  catch (IOException exp) {
            exp.printStackTrace();
        }
		
		{
			lblUsuario = new JLabel("Usuario");
			lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblUsuario.setForeground(Color.WHITE);
			lblUsuario.setBounds(39, 87, 76, 20);
			add(lblUsuario);
		}
		{
			lblContrasea = new JLabel("Contrase\u00F1a");
			lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblContrasea.setForeground(Color.WHITE);
			lblContrasea.setBounds(39, 125, 96, 19);
			add(lblContrasea);
		}
		{
			txtUsu = new JTextField();
			txtUsu.setBounds(156, 89, 86, 20);
			txtUsu.setColumns(10);
			add(txtUsu);
		}
		{
			pCon = new JPasswordField();
			pCon.setBounds(156, 126, 86, 20);
			add(pCon);
		}
		{
			btnNewButton = new JButton("ACEPTAR");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(283, 87, 89, 59);
			add(btnNewButton);
		}
		{
			lblLogin = new JLabel("LOGIN");
			lblLogin.setForeground(Color.LIGHT_GRAY);
			lblLogin.setFont(new Font("Arial Black", Font.PLAIN, 19));
			lblLogin.setBounds(164, 29, 112, 32);
			add(lblLogin);
		}
        
        //pack();
        //setLocationRelativeTo(null);
        //setVisible(true);
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
