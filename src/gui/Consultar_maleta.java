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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Consultar_maleta extends JDialog implements ActionListener {
	private JLabel lblCdigo;
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JComboBox cboCodigo;
	private JTextField txtModelo;
	private JTextField txtPrecio;
	private JButton btnCerrar;
	private JLabel lblAncho;
	private JTextField txtAncho;
	private JLabel lblFondo;
	private JTextField txtFondo;
	private JLabel lblAlto;
	private JTextField txtAlto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Consultar_maleta dialog = new Consultar_maleta();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Consultar_maleta() {
		setModal(true);
		setTitle("Consultar maleta");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		{
			lblCdigo = new JLabel("C\u00F3digo");
			lblCdigo.setBounds(10, 11, 46, 14);
			getContentPane().add(lblCdigo);
		}
		{
			lblModelo = new JLabel("Modelo");
			lblModelo.setBounds(10, 46, 46, 14);
			getContentPane().add(lblModelo);
		}
		{
			lblPrecio = new JLabel("Precio");
			lblPrecio.setBounds(10, 81, 46, 14);
			getContentPane().add(lblPrecio);
		}
		{
			cboCodigo = new JComboBox();
			cboCodigo.addActionListener(this);
			cboCodigo.setModel(new DefaultComboBoxModel(new String[] {"MT0", "MT1", "MT2", "MT3", "MT4"}));
			cboCodigo.setBounds(81, 11, 86, 20);
			getContentPane().add(cboCodigo);
		}
		{
			txtModelo = new JTextField(Tienda.modelo0);
			txtModelo.setEditable(false);
			txtModelo.setBounds(81, 43, 86, 20);
			getContentPane().add(txtModelo);
			txtModelo.setColumns(10);
		}
		{
			txtPrecio = new JTextField(""+Tienda.precio0);
			txtPrecio.setEditable(false);
			txtPrecio.setBounds(81, 78, 86, 20);
			getContentPane().add(txtPrecio);
			txtPrecio.setColumns(10);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(286, 7, 89, 23);
			getContentPane().add(btnCerrar);
		}
		{
			lblAncho = new JLabel("Ancho");
			lblAncho.setBounds(10, 112, 46, 14);
			getContentPane().add(lblAncho);
		}
		{
			txtAncho = new JTextField(""+Tienda.ancho0);
			txtAncho.setEditable(false);
			txtAncho.setBounds(81, 109, 86, 20);
			getContentPane().add(txtAncho);
			txtAncho.setColumns(10);
		}
		{
			lblFondo = new JLabel("Fondo");
			lblFondo.setBounds(10, 177, 46, 14);
			getContentPane().add(lblFondo);
		}
		{
			txtFondo = new JTextField(""+Tienda.fondo0);
			txtFondo.setEditable(false);
			txtFondo.setBounds(81, 174, 86, 20);
			getContentPane().add(txtFondo);
			txtFondo.setColumns(10);
		}
		{
			lblAlto = new JLabel("Alto");
			lblAlto.setBounds(10, 143, 46, 14);
			getContentPane().add(lblAlto);
		}
		{
			txtAlto = new JTextField(""+Tienda.alto0);
			txtAlto.setEditable(false);
			txtAlto.setBounds(81, 140, 86, 20);
			getContentPane().add(txtAlto);
			txtAlto.setColumns(10);
		}
	}
	public void actionPerformed(ActionEvent e) {
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
		txtAncho.setText(""+Tienda.ancho0);
		txtAlto.setText(""+Tienda.alto0);
		txtFondo.setText(""+Tienda.fondo0);
	break;
	
	case 1:
		txtModelo.setText(Tienda.modelo1);
		txtPrecio.setText(""+ Tienda.precio1);
		txtAncho.setText(""+Tienda.ancho1);
		txtAlto.setText(""+Tienda.alto1);
		txtFondo.setText(""+Tienda.fondo1);
	break;
	
	case 2:
		txtModelo.setText(Tienda.modelo2);
		txtPrecio.setText(""+ Tienda.precio2);
		txtAncho.setText(""+Tienda.ancho2);
		txtAlto.setText(""+Tienda.alto2);
		txtFondo.setText(""+Tienda.fondo2);
	break;
	
	case 3:
		txtModelo.setText(Tienda.modelo3);
		txtPrecio.setText(""+ Tienda.precio3);
		txtAncho.setText(""+Tienda.ancho3);
		txtAlto.setText(""+Tienda.alto3);
		txtFondo.setText(""+Tienda.fondo3);
	break;
	
	default:
		txtModelo.setText(Tienda.modelo4);
		txtPrecio.setText(""+ Tienda.precio4);
		txtAncho.setText(""+Tienda.ancho4);
		txtAlto.setText(""+Tienda.alto4);
		txtFondo.setText(""+Tienda.fondo4);
	}
	}
}
