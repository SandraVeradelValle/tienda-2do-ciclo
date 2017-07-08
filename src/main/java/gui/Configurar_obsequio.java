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

public class Configurar_obsequio extends JDialog implements ActionListener {
	private JTextField txtCmma;
	private JTextField txtObse;
	private JButton btnCancelar;
	private JButton btnAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Configurar_obsequio dialog = new Configurar_obsequio();
			dialog.setDefaultCloseOperation(0);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Configurar_obsequio() {
		setTitle("Configurar obsequio");
		setModal(true);
		setBounds(100, 100, 479, 168);
		getContentPane().setLayout(null);
		{
			JLabel lblCantidadMnimaDe = new JLabel("Cantidad m\u00EDnima de maletas adquiridas");
			lblCantidadMnimaDe.setBounds(10, 21, 225, 14);
			getContentPane().add(lblCantidadMnimaDe);
		}
		{
			JLabel lblObsequio = new JLabel("Obsequio");
			lblObsequio.setBounds(10, 46, 60, 14);
			getContentPane().add(lblObsequio);
		}
		{
			txtCmma = new JTextField(""+Tienda.cantidadMinima);
			txtCmma.setBounds(236, 18, 86, 20);
			getContentPane().add(txtCmma);
			txtCmma.setColumns(10);
		}
		{
			txtObse = new JTextField(Tienda.obsequio);
			txtObse.setBounds(236, 47, 86, 20);
			getContentPane().add(txtObse);
			txtObse.setColumns(10);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(364, 17, 89, 23);
			getContentPane().add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(364, 46, 89, 23);
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
	int canmin = Integer.parseInt(txtCmma.getText());
	String obse = txtObse.getText();
	
	Tienda.cantidadMinima = canmin;
	Tienda.obsequio = obse;
	}
}
