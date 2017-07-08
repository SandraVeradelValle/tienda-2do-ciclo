package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Configurar_premio_sorpresa extends JDialog implements ActionListener {
	private JTextField txtNumcli;
	private JTextField txtPresmor;
	private JButton btnCancelar;
	private JButton btnAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Configurar_premio_sorpresa dialog = new Configurar_premio_sorpresa();
			dialog.setDefaultCloseOperation(0);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Configurar_premio_sorpresa() {
		setTitle("Configurar premio sorpresa");
		setModal(true);
		setBounds(100, 100, 450, 171);
		getContentPane().setLayout(null);
		{
			JLabel lblNmeroDeCliente = new JLabel("N\u00FAmero de cliente");
			lblNmeroDeCliente.setBounds(22, 21, 105, 14);
			getContentPane().add(lblNmeroDeCliente);
		}
		{
			JLabel lblPremioSorpresa = new JLabel("Premio sorpresa");
			lblPremioSorpresa.setBounds(22, 52, 105, 14);
			getContentPane().add(lblPremioSorpresa);
		}
		{
			txtNumcli = new JTextField(""+Tienda.numeroClientePremiado);
			txtNumcli.setBounds(137, 18, 86, 20);
			getContentPane().add(txtNumcli);
			txtNumcli.setColumns(10);
		}
		{
			txtPresmor = new JTextField(Tienda.premioSorpresa);
			txtPresmor.setBounds(137, 49, 86, 20);
			getContentPane().add(txtPresmor);
			txtPresmor.setColumns(10);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(335, 17, 89, 23);
			getContentPane().add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(335, 48, 89, 23);
			getContentPane().add(btnCancelar);
		}
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnAceptar) {
			do_btnAceptar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnCancelar) {
			do_btnCancelar_actionPerformed(arg0);
		}
	}
	protected void do_btnCancelar_actionPerformed(ActionEvent arg0) {
	dispose();
	}
	protected void do_btnAceptar_actionPerformed(ActionEvent arg0) {
	int numcliente = Integer.parseInt(txtNumcli.getText());
	String premio = txtPresmor.getText();
	
	Tienda.numeroClientePremiado = numcliente;
	Tienda.premioSorpresa = premio;
	}
}
