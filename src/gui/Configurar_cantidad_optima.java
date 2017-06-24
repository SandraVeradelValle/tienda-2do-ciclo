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

public class Configurar_cantidad_optima extends JDialog implements ActionListener {
	private JLabel lblCantidadptimaDe;
	private JTextField txtComv;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Configurar_cantidad_optima dialog = new Configurar_cantidad_optima();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Configurar_cantidad_optima() {
		setTitle("Configurar cantidad \u00F3ptima de maletas vendidas");
		setModal(true);
		setBounds(100, 100, 450, 168);
		getContentPane().setLayout(null);
		{
			lblCantidadptimaDe = new JLabel("Cantidad \u00F3ptima de maletas vendidas");
			lblCantidadptimaDe.setBounds(10, 22, 215, 14);
			getContentPane().add(lblCantidadptimaDe);
		}
		{
			txtComv = new JTextField(""+Tienda.cantidadOptima);
			txtComv.setBounds(222, 19, 86, 20);
			getContentPane().add(txtComv);
			txtComv.setColumns(10);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(335, 18, 89, 23);
			getContentPane().add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(335, 52, 89, 23);
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
	int canomv = Integer.parseInt(txtComv.getText());
	
	Tienda.cantidadOptima = canomv;
	}
}
