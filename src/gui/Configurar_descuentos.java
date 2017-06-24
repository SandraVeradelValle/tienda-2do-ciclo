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

public class Configurar_descuentos extends JDialog implements ActionListener {
	private JTextField txt1a3;
	private JTextField txt4a5;
	private JTextField txt6a8;
	private JTextField txtmasde8;
	private JButton btnCancelar;
	private JButton btnAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Configurar_descuentos dialog = new Configurar_descuentos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Configurar_descuentos() {
		setModal(true);
		setTitle("Configurar porcentajes de descuentos");
		setBounds(100, 100, 450, 241);
		getContentPane().setLayout(null);
		{
			JLabel lblA = new JLabel("1 a 3 maletas");
			lblA.setBounds(22, 28, 82, 14);
			getContentPane().add(lblA);
		}
		{
			JLabel lblA_1 = new JLabel("4 a 5 maletas");
			lblA_1.setBounds(22, 57, 82, 14);
			getContentPane().add(lblA_1);
		}
		{
			JLabel lblA_2 = new JLabel("6 a 8 maletas");
			lblA_2.setBounds(22, 85, 82, 14);
			getContentPane().add(lblA_2);
		}
		{
			JLabel lblMsDe = new JLabel("M\u00E1s de 8 maletas");
			lblMsDe.setBounds(22, 112, 97, 14);
			getContentPane().add(lblMsDe);
		}
		{
			txt1a3 = new JTextField(""+Tienda.porcentaje1);
			txt1a3.setBounds(133, 25, 86, 20);
			getContentPane().add(txt1a3);
			txt1a3.setColumns(10);
		}
		{
			txt4a5 = new JTextField(""+Tienda.porcentaje2);
			txt4a5.setBounds(133, 54, 86, 20);
			getContentPane().add(txt4a5);
			txt4a5.setColumns(10);
		}
		{
			txt6a8 = new JTextField(""+Tienda.porcentaje3);
			txt6a8.setBounds(133, 82, 86, 20);
			getContentPane().add(txt6a8);
			txt6a8.setColumns(10);
		}
		{
			txtmasde8 = new JTextField(""+Tienda.porcentaje4);
			txtmasde8.setBounds(133, 109, 86, 20);
			getContentPane().add(txtmasde8);
			txtmasde8.setColumns(10);
		}
		{
			JLabel label = new JLabel("%");
			label.setBounds(226, 28, 46, 14);
			getContentPane().add(label);
		}
		{
			JLabel label = new JLabel("%");
			label.setBounds(226, 57, 46, 14);
			getContentPane().add(label);
		}
		{
			JLabel label = new JLabel("%");
			label.setBounds(226, 85, 46, 14);
			getContentPane().add(label);
		}
		{
			JLabel label = new JLabel("%");
			label.setBounds(226, 112, 46, 14);
			getContentPane().add(label);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(324, 24, 89, 23);
			getContentPane().add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(324, 53, 89, 23);
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
	
	double porcen1 = Double.parseDouble(txt1a3.getText());
	double porcen2 = Double.parseDouble(txt4a5.getText());
	double porcen3 = Double.parseDouble(txt6a8.getText());
	double porcen4 = Double.parseDouble(txtmasde8.getText());
	Tienda.porcentaje1 = porcen1;
	Tienda.porcentaje2 = porcen2;
	Tienda.porcentaje3 = porcen3;
	Tienda.porcentaje4 = porcen4;
	}
}
