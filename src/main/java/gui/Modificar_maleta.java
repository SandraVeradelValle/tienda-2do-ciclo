package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Modificar_maleta extends JDialog implements ActionListener {
	private JComboBox cboCodigo;
	private JTextField txtModelo;
	private JTextField txtPrecio;
	private JButton btnCerrar;
	private JButton btnGrabar;
	private JLabel lblAnchocm;
	private JTextField txtAncho;
	private JLabel lblAlto;
	private JTextField txtAlto;
	private JLabel lblFondo;
	private JTextField txtFondo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Modificar_maleta dialog = new Modificar_maleta();
			dialog.setDefaultCloseOperation(0);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Modificar_maleta() {
		setModal(true);
		setTitle("Modificar maleta");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		{
			JLabel lblCdigo = new JLabel("C\u00F3digo");
			lblCdigo.setBounds(10, 12, 46, 14);
			getContentPane().add(lblCdigo);
		}
		{
			JLabel lblModelo = new JLabel("Modelo");
			lblModelo.setBounds(10, 49, 46, 14);
			getContentPane().add(lblModelo);
		}
		{
			JLabel lblPrecio = new JLabel("Precio");
			lblPrecio.setBounds(10, 82, 46, 14);
			getContentPane().add(lblPrecio);
		}
		{
			cboCodigo = new JComboBox();
			cboCodigo.addActionListener(this);
			cboCodigo.setModel(new DefaultComboBoxModel(new String[] {"MT0", "MT1", "MT2", "MT3", "MT4"}));
			cboCodigo.setBounds(63, 9, 85, 20);
			getContentPane().add(cboCodigo);
		}
		{
			txtModelo = new JTextField(Tienda.modelo0);
			txtModelo.setBounds(62, 46, 86, 20);
			getContentPane().add(txtModelo);
			txtModelo.setColumns(10);
		}
		{
			txtPrecio = new JTextField(""+Tienda.precio0);
			txtPrecio.setBounds(62, 74, 86, 20);
			getContentPane().add(txtPrecio);
			txtPrecio.setColumns(10);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(232, 8, 89, 23);
			getContentPane().add(btnCerrar);
		}
		{
			btnGrabar = new JButton("Grabar");
			btnGrabar.addActionListener(this);
			btnGrabar.setBounds(232, 45, 89, 23);
			getContentPane().add(btnGrabar);
		}
		{
			lblAnchocm = new JLabel("Ancho");
			lblAnchocm.setBounds(10, 117, 46, 14);
			getContentPane().add(lblAnchocm);
		}
		{
			txtAncho = new JTextField(""+Tienda.ancho0);
			txtAncho.setBounds(63, 114, 86, 20);
			getContentPane().add(txtAncho);
			txtAncho.setColumns(10);
		}
		{
			lblAlto = new JLabel("Alto");
			lblAlto.setBounds(10, 155, 46, 14);
			getContentPane().add(lblAlto);
		}
		{
			txtAlto = new JTextField(""+Tienda.alto0);
			txtAlto.setBounds(62, 152, 86, 20);
			getContentPane().add(txtAlto);
			txtAlto.setColumns(10);
		}
		{
			lblFondo = new JLabel("Fondo");
			lblFondo.setBounds(10, 188, 46, 14);
			getContentPane().add(lblFondo);
		}
		{
			txtFondo = new JTextField(""+Tienda.fondo0);
			txtFondo.setBounds(62, 185, 86, 20);
			getContentPane().add(txtFondo);
			txtFondo.setColumns(10);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnGrabar) {
			do_btnGrabar_actionPerformed(e);
		}
		if (e.getSource() == cboCodigo) {
			do_comboBox_actionPerformed(e);
		}
		if (e.getSource() == btnCerrar) {
			do_btnCerrar_actionPerformed(e);
		}
	}
	protected void do_btnCerrar_actionPerformed(ActionEvent e) {
	dispose();//cerrar solo la ventana emergente
	}
	protected void do_comboBox_actionPerformed(ActionEvent e) {
	int posi = cboCodigo.getSelectedIndex();
	switch(posi){
	case 0:
		txtModelo.setText(Tienda.modelo0);
		txtPrecio.setText(""+ Tienda.precio0);
		txtAncho.setText(""+ Tienda.ancho0);
		txtAlto.setText(""+ Tienda.alto0);
		txtFondo.setText(""+ Tienda.fondo0);
	break;
	
	case 1:
		txtModelo.setText(Tienda.modelo1);
		txtPrecio.setText(""+ Tienda.precio1);
		txtAncho.setText(""+ Tienda.ancho1);
		txtAlto.setText(""+ Tienda.alto1);
		txtFondo.setText(""+ Tienda.fondo1);
	break;
	
	case 2:
		txtModelo.setText(Tienda.modelo2);
		txtPrecio.setText(""+ Tienda.precio2);
		txtAncho.setText(""+ Tienda.ancho2);
		txtAlto.setText(""+ Tienda.alto2);
		txtFondo.setText(""+ Tienda.fondo2);
	break;
	
	case 3:
		txtModelo.setText(Tienda.modelo3);
		txtPrecio.setText(""+ Tienda.precio3);
		txtAncho.setText(""+ Tienda.ancho3);
		txtAlto.setText(""+ Tienda.alto3);
		txtFondo.setText(""+ Tienda.fondo3);
	break;
	
	default:
		txtModelo.setText(Tienda.modelo4);
		txtPrecio.setText(""+ Tienda.precio4);
		txtAncho.setText(""+ Tienda.ancho4);
		txtAlto.setText(""+ Tienda.alto4);
		txtFondo.setText(""+ Tienda.fondo4);
	}
	}
	protected void do_btnGrabar_actionPerformed(ActionEvent e) {
	int posi = cboCodigo.getSelectedIndex();
	String modelo = txtModelo.getText();
	double precio = Double.parseDouble(txtPrecio.getText());
	double ancho= Double.parseDouble(txtAncho.getText());
	double alto = Double.parseDouble(txtAlto.getText());
	double fondo = Double.parseDouble(txtFondo.getText());
	
	switch(posi){
	case 0: 
		Tienda.modelo0 = modelo;
		Tienda.precio0 = precio;
		Tienda.ancho0 = ancho;
		Tienda.alto0 = alto;
		Tienda.fondo0 = fondo;
		break;
	case 1: 
		Tienda.modelo1 = modelo;
		Tienda.precio1 = precio;
		Tienda.ancho1 = ancho;
		Tienda.alto1 = alto;
		Tienda.fondo1 = fondo;
		break;
	case 2: 
		Tienda.modelo2 = modelo;
		Tienda.precio2 = precio;
		Tienda.ancho2 = ancho;
		Tienda.alto2 = alto;
		Tienda.fondo2 = fondo;
		break;
	case 3: 
		Tienda.modelo3 = modelo;
		Tienda.precio3 = precio;
		Tienda.ancho3 = ancho;
		Tienda.alto3 = alto;
		Tienda.fondo3 = fondo;
		break;
	default: 
		Tienda.modelo4 = modelo;
		Tienda.precio4 = precio;
		Tienda.ancho4 = ancho;
		Tienda.alto4 = alto;
		Tienda.fondo4 = fondo;
	}
	}
}
