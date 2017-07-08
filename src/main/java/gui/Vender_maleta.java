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
	int nven0,nven1,nven2,nven3,nven4;
	double aven0,aven1,aven2,aven3,aven4;
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
			dialog.setDefaultCloseOperation(0);
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
	double ic = getIC(prec, can);
	double dscto = getDscto(can);
	double ip = getIP(ic, dscto);
	String obse = getObsequio(can);
	efectuarIncrementos(posi, ip);
	String premisor = getPremioSorpresa();
	mostrar(cod, mod, prec, can, ic, dscto, ip, obse, premisor);
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
	
	double getIC(double precio, int cantidad){
		return precio*cantidad;
	}
	
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
	
	void efectuarIncrementos(int posicion, double ImpPag){
		switch(posicion){
		case 0: nven0++; aven0+=ImpPag;break;
		case 1: nven1++; aven1+=ImpPag;break;
		case 2: nven2++; aven2+=ImpPag;break;
		case 3: nven3++; aven3+=ImpPag;break;
		default: nven4++; aven4+=ImpPag;
		}
	}
	
	String getPremioSorpresa(){
			if(nven0==Tienda.numeroClientePremiado & nven1==0 & nven2==0 & nven3==0 & nven4==0) return Tienda.premioSorpresa;
			else if(nven1==Tienda.numeroClientePremiado & nven0==0 & nven2==0 & nven3==0 & nven4==0) return Tienda.premioSorpresa;
			else if(nven2==Tienda.numeroClientePremiado & nven0==0 & nven1==0 & nven3==0 & nven4==0) return Tienda.premioSorpresa;
			else if(nven3==Tienda.numeroClientePremiado & nven0==0 & nven1==0 & nven2==0 & nven4==0) return Tienda.premioSorpresa;
			else if(nven4==Tienda.numeroClientePremiado & nven0==0 & nven1==0 & nven2==0 & nven3==0) return Tienda.premioSorpresa;
			else if((nven0 + nven1 + nven2 + nven3 + nven4)==Tienda.numeroClientePremiado) return Tienda.premioSorpresa;
			else return "Solo válido para el cliente Nro " + Tienda.numeroClientePremiado;
	}
	
	void mostrar(String codigo,String modelo, double precio, int cantidad, double impcomp, double impdesc, double imppag, String obsequio, String premiosorpresa){
		txtS.setText("");
		Imprimir("  BOLETA\n");
		Imprimir("  El código es: " + codigo);
		Imprimir("  El modelo es: " + modelo);
		Imprimir("  El precio es: " + precio);
		Imprimir("  La cantidad es: " + cantidad);
		Imprimir("  El importe de compra es: " + Math.rint(impcomp)*100/100);
		Imprimir("  El importe de descuento es: " + impdesc);
		Imprimir("  El importe a pagar es: " + Math.rint(imppag)*100/100);
		Imprimir("  Obsequio: " + obsequio);
		Imprimir("  Premio Sorpresa: " + premiosorpresa);
	}
	void Imprimir(String s){
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
