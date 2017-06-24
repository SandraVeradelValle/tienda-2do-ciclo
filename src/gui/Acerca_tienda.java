package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Acerca_tienda extends JDialog implements ActionListener {
	private JLabel lblAutores;
	private JLabel lblGianmarcoPierreYauri;
	private JLabel lblSandraVera;
	private JLabel lblJoseCabrera;
	private JButton btnCerrar;
	private JLabel lblSebastinLuque;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Acerca_tienda dialog = new Acerca_tienda();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Acerca_tienda() {
		setModal(true);
		setTitle("Acerca de Tienda");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		{
			JLabel lblTienda = new JLabel("Tienda 1.0");
			lblTienda.setFont(new Font("Broadway", Font.PLAIN, 16));
			lblTienda.setBounds(180, 11, 94, 27);
			getContentPane().add(lblTienda);
		}
		{
			lblAutores = new JLabel("Autores");
			lblAutores.setHorizontalAlignment(SwingConstants.CENTER);
			lblAutores.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblAutores.setBounds(184, 79, 74, 14);
			getContentPane().add(lblAutores);
		}
		{
			lblGianmarcoPierreYauri = new JLabel("Gianmarco Pierre Yauri Meza");
			lblGianmarcoPierreYauri.setHorizontalAlignment(SwingConstants.CENTER);
			lblGianmarcoPierreYauri.setBounds(131, 104, 186, 14);
			getContentPane().add(lblGianmarcoPierreYauri);
		}
		{
			lblSandraVera = new JLabel("Sandra Stefany Vera del Valle");
			lblSandraVera.setHorizontalAlignment(SwingConstants.CENTER);
			lblSandraVera.setBounds(141, 129, 172, 14);
			getContentPane().add(lblSandraVera);
		}
		{
			lblJoseCabrera = new JLabel("Jose Manuel Cabrera Vicu\u00F1a ");
			lblJoseCabrera.setHorizontalAlignment(SwingConstants.CENTER);
			lblJoseCabrera.setBounds(151, 154, 150, 14);
			getContentPane().add(lblJoseCabrera);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(185, 216, 89, 23);
			getContentPane().add(btnCerrar);
		}
		{
			lblSebastinLuque = new JLabel("Sebasti\u00E1n Andr\u00E9s Luque Palacios");
			lblSebastinLuque.setHorizontalAlignment(SwingConstants.CENTER);
			lblSebastinLuque.setBounds(131, 179, 196, 14);
			getContentPane().add(lblSebastinLuque);
		}
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCerrar) {
			do_btnCerrar_actionPerformed(arg0);
		}
	}
	protected void do_btnCerrar_actionPerformed(ActionEvent arg0) {
	dispose();
	}
}
