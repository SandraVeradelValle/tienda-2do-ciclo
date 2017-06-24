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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vender_maleta extends JDialog implements ActionListener {
	//Variables globales
	
	//Variables globales
	private JLabel lblCdigo;
	private JLabel lblPrecio;
	private JLabel lblCantidadDeMaletas;
	private JComboBox cboCodigo;
	private JTextField txtPrecio;
	private JTextField txtCan;
	private JButton btnVender;
	private JButton btnCerrar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Vender_maleta dialog = new Vender_maleta();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Vender_maleta() {
		setModal(true);
		setBounds(100, 100, 449, 366);
		getContentPane().setLayout(null);
		{
			lblCdigo = new JLabel("C\u00F3digo");
			lblCdigo.setBounds(10, 11, 46, 14);
			getContentPane().add(lblCdigo);
		}
		{
			lblPrecio = new JLabel("Precio");
			lblPrecio.setBounds(10, 40, 46, 14);
			getContentPane().add(lblPrecio);
		}
		{
			lblCantidadDeMaletas = new JLabel("Cantidad de maletas");
			lblCantidadDeMaletas.setBounds(10, 70, 116, 14);
			getContentPane().add(lblCantidadDeMaletas);
		}
		{
			cboCodigo = new JComboBox();
			cboCodigo.addActionListener(this);
			cboCodigo.setModel(new DefaultComboBoxModel(new String[] {"MT0", "MT1", "MT2", "MT3", "MT4"}));
			cboCodigo.setBounds(129, 8, 116, 20);
			getContentPane().add(cboCodigo);
		}
		{
			txtPrecio = new JTextField(""+Tienda.precio0);
			txtPrecio.setEditable(false);
			txtPrecio.setBounds(129, 37, 116, 20);
			getContentPane().add(txtPrecio);
			txtPrecio.setColumns(10);
		}
		{
			txtCan = new JTextField();
			txtCan.setBounds(129, 67, 116, 20);
			getContentPane().add(txtCan);
			txtCan.setColumns(10);
		}
		{
			btnVender = new JButton("Vender");
			btnVender.addActionListener(this);
			btnVender.setBounds(335, 11, 89, 23);
			getContentPane().add(btnVender);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(335, 47, 89, 23);
			getContentPane().add(btnCerrar);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 108, 414, 208);
			getContentPane().add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
				txtS.setEditable(false);
			}
		}
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == cboCodigo) {
			do_cboCodigo_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnCerrar) {
			do_btnCerrar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnVender) {
			do_btnVender_actionPerformed(arg0);
		}
	}
	protected void do_btnVender_actionPerformed(ActionEvent arg0) {

	String cod = getCodigo();
	int posi = getPosi();
	int can =  getCan();
	double prec = getPrecio();
	String mod = getModelo(posi);
	double ic = getIC(posi, prec, can);
	/*double mts = getMetros(posi, can);
	int conv = getConvertir(mts);*/
	double dscto = getDscto(can);
	double ip = getIP(ic, dscto);
	String obse = getObsequio(can);
	mostrar(cod, mod, prec, can, ic, dscto, ip, obse);
	txtCan.grabFocus();
	}
	
	String getCodigo(){
		return cboCodigo.getSelectedItem().toString();
	}
	int getPosi(){
		return cboCodigo.getSelectedIndex();
	}
	int getCan(){
		return Integer.parseInt(txtCan.getText());
	}
	double getPrecio(){
		return Double.parseDouble(txtPrecio.getText());
	}
	String getModelo(int posicion){
		switch (posicion) {
		case 0: return Tienda.modelo0;
		case 1: return Tienda.modelo1;
		case 2: return Tienda.modelo2;
		case 3: return Tienda.modelo3;
		default:return Tienda.modelo4;
		}
	}
	double getIC(int posi, double prec, int can){
		switch (posi) {
		case 0: return prec*can;
		case 1: return prec*can;
		case 2: return prec*can;
		case 3: return prec*can;
		default:return prec*can;
		}
	}
	/*
	double getMetros(int posicion, int cantidad){
		switch (posicion) {
		case 0: return (Tienda.ancho0*Tienda.alto0*Tienda.fondo0)*cantidad/1000000;
		case 1: return (Tienda.ancho1*Tienda.alto1*Tienda.fondo1)*cantidad/1000000;
		case 2: return (Tienda.ancho2*Tienda.alto2*Tienda.fondo2)*cantidad/1000000;
		case 3: return (Tienda.ancho3*Tienda.alto3*Tienda.fondo3)*cantidad/1000000;
		default:return (Tienda.ancho4*Tienda.alto4*Tienda.fondo4)*cantidad/1000000;
		}
	}
	int getConvertir(double metrosss){
		return (int)metrosss;
	}  Realizamos esto porque pedían cantidad de "METROS", al parecer hubo un error era "MALETAS"*/
	
	double getDscto(int cantidad){
		if(cantidad<=0)return 0;
		if(cantidad>=1 && cantidad<=3)return Tienda.porcentaje1;
		if(cantidad>=4 && cantidad<=5)return Tienda.porcentaje2;
		if(cantidad>=6 && cantidad<=8)return Tienda.porcentaje3;
		else return Tienda.porcentaje4;//mayor a 8 :V
	}
	
	double getIP(double impcomp, double descuento){
		return impcomp - descuento;
	}
	String getObsequio(int cantidad){
		if(cantidad>=Tienda.cantidadMinima)return Tienda.obsequio;
		else return "Para obtenerlo, debe ser mínimo " + Tienda.cantidadMinima + " maletas";
	}
	
	
	void mostrar(String codigo,String modelo, double precio, int cantidad, double impcomp, double impdesc, double imppag, String obsequio){
		txtS.setText("");
		imprimir("  BOLETA\n");
		imprimir("  El código es: " + codigo);
		imprimir("  El modelo es: " + modelo);
		imprimir("  El precio es: " + precio);
		imprimir("  La cantidad es: " + cantidad);
		imprimir("  El importe de compra es: " + impcomp);
		imprimir("  El importe de descuento es: " + impdesc);
		imprimir("  El importe a pagar es: " + imppag);
		imprimir("  Obsequio: " + obsequio);
	}
	void imprimir(String s){
		txtS.append("\n" + s);
	}
	
	
	protected void do_btnCerrar_actionPerformed(ActionEvent arg0) {
	dispose();
	}
	
	protected void do_cboCodigo_actionPerformed(ActionEvent arg0) {
		int posi = cboCodigo.getSelectedIndex();
		switch(posi){
		case 0: txtPrecio.setText(""+Tienda.precio0);
		break;
		case 1: txtPrecio.setText(""+Tienda.precio1);
		break;
		case 2: txtPrecio.setText(""+Tienda.precio2);
		break;
		case 3: txtPrecio.setText(""+Tienda.precio3);
		break;
		default: txtPrecio.setText(""+Tienda.precio4);
		}
	}
}
