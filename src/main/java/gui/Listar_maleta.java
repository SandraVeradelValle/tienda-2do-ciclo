package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Listar_maleta extends JDialog implements ActionListener {
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnCerrar;
	private JButton btnListar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Listar_maleta dialog = new Listar_maleta();
			dialog.setDefaultCloseOperation(0);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Listar_maleta() {
		setTitle("Listar maletas");
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(34, 40, 358, 178);
			getContentPane().add(scrollPane);
			{
				txtS = new JTextArea();
				txtS.setEditable(false);
				scrollPane.setViewportView(txtS);
			}
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(34, 229, 89, 23);
			getContentPane().add(btnCerrar);
		}
		{
			btnListar = new JButton("Listar");
			btnListar.addActionListener(this);
			btnListar.setBounds(259, 229, 89, 23);
			getContentPane().add(btnListar);
		}
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCerrar) {
			do_btnCerrar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnListar) {
			do_btnListar_actionPerformed(arg0);
		}
	}
	protected void do_btnListar_actionPerformed(ActionEvent arg0) {
	listarModelos();
	}
	//  Métodos tipo void (sin parámetros)
		void listarModelos() {
			txtS.setText("");
			imprimir("  LISTADO DE MALETAS");
			imprimir("\n  Código\t:  " + Tienda.codigo0);
			imprimir("  Descripción\t:  " + Tienda.modelo0);
			imprimir("  Precio\t:  " + Tienda.precio0);
			imprimir("  Ancho\t:  " + Tienda.ancho0);
			imprimir("  Alto\t:  " + Tienda.alto0);
			imprimir("  Fondo\t:  " + Tienda.fondo0);
			imprimir("\n  Código\t:  " + Tienda.codigo1);
			imprimir("  Descripción\t:  " + Tienda.modelo1);
			imprimir("  Precio\t:  " + Tienda.precio1);
			imprimir("  Ancho\t:  " + Tienda.ancho1);
			imprimir("  Alto\t:  " + Tienda.alto1);
			imprimir("  Fondo\t:  " + Tienda.fondo1);
			imprimir("\n  Código\t:  " + Tienda.codigo2);
			imprimir("  Descripción\t:  " + Tienda.modelo2);
			imprimir("  Precio\t:  " + Tienda.precio2);
			imprimir("  Ancho\t:  " + Tienda.ancho2);
			imprimir("  Alto\t:  " + Tienda.alto2);
			imprimir("  Fondo\t:  " + Tienda.fondo2);
			imprimir("\n  Código\t:  " + Tienda.codigo3);
			imprimir("  Descripción\t:  " + Tienda.modelo3);
			imprimir("  Precio\t:  " + Tienda.precio3);
			imprimir("  Ancho\t:  " + Tienda.ancho3);
			imprimir("  Alto\t:  " + Tienda.alto3);
			imprimir("  Fondo\t:  " + Tienda.fondo3);
			imprimir("\n  Código\t:  " + Tienda.codigo4);
			imprimir("  Descripción\t:  " + Tienda.modelo4);
			imprimir("  Precio\t:  " + Tienda.precio4);
			imprimir("  Ancho\t:  " + Tienda.ancho4);
			imprimir("  Alto\t:  " + Tienda.alto4);
			imprimir("  Fondo\t:  " + Tienda.fondo4);
		}
		//  Métodos tipo void (con parámetros)
		void imprimir(String s) {
			txtS.append(s + "\n");
		}
	
	protected void do_btnCerrar_actionPerformed(ActionEvent arg0) {
	dispose();
	}
}
