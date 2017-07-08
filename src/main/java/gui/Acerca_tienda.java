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
import javax.swing.JSeparator;
import java.awt.SystemColor;

public class Acerca_tienda extends JDialog implements ActionListener {
	private JLabel lblAutores;
	private JLabel lblGianmarcoPierreYauri;
	private JLabel lblSandraVera;
	private JLabel lblJoseCabrera;
	private JButton btnCerrar;
	private JLabel lblSebastinLuque;
	private JLabel lblLeopoldoAlcidesDvalos;
	private JSeparator separator;
	private JLabel lblI;
	private JLabel lblIcibertecedupe;
	private JLabel lblIcibertecedupe_1;
	private JLabel lblIcibertecedupe_2;
	private JLabel lblIcibertecedupe_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Acerca_tienda dialog = new Acerca_tienda();
			dialog.setDefaultCloseOperation(0);
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
		setBounds(100, 100, 462, 450);
		getContentPane().setLayout(null);
		{
			JLabel lblTienda = new JLabel("Tienda 1.0");
			lblTienda.setHorizontalAlignment(SwingConstants.CENTER);
			lblTienda.setFont(new Font("Monotype Corsiva", Font.BOLD, 31));
			lblTienda.setBounds(0, 11, 446, 27);
			getContentPane().add(lblTienda);
		}
		{
			lblAutores = new JLabel("Autores");
			lblAutores.setHorizontalAlignment(SwingConstants.CENTER);
			lblAutores.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 18));
			lblAutores.setBounds(0, 65, 446, 23);
			getContentPane().add(lblAutores);
		}
		{
			lblGianmarcoPierreYauri = new JLabel("Gianmarco Pierre Yauri Meza");
			lblGianmarcoPierreYauri.setFont(new Font("Verdana", Font.ITALIC, 18));
			lblGianmarcoPierreYauri.setHorizontalAlignment(SwingConstants.CENTER);
			lblGianmarcoPierreYauri.setBounds(0, 93, 446, 27);
			getContentPane().add(lblGianmarcoPierreYauri);
		}
		{
			lblSandraVera = new JLabel("Sandra Stefany Vera del Valle");
			lblSandraVera.setFont(new Font("Verdana", Font.ITALIC, 18));
			lblSandraVera.setHorizontalAlignment(SwingConstants.CENTER);
			lblSandraVera.setBounds(0, 147, 446, 23);
			getContentPane().add(lblSandraVera);
		}
		{
			lblJoseCabrera = new JLabel("Jose Manuel Cabrera Vicu\u00F1a ");
			lblJoseCabrera.setFont(new Font("Verdana", Font.ITALIC, 18));
			lblJoseCabrera.setHorizontalAlignment(SwingConstants.CENTER);
			lblJoseCabrera.setBounds(0, 242, 446, 27);
			getContentPane().add(lblJoseCabrera);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(180, 365, 89, 23);
			getContentPane().add(btnCerrar);
		}
		{
			lblSebastinLuque = new JLabel("Sebasti\u00E1n Andr\u00E9 Luque Palacios");
			lblSebastinLuque.setFont(new Font("Verdana", Font.ITALIC, 18));
			lblSebastinLuque.setHorizontalAlignment(SwingConstants.CENTER);
			lblSebastinLuque.setBounds(0, 194, 446, 27);
			getContentPane().add(lblSebastinLuque);
		}
		{
			lblLeopoldoAlcidesDvalos = new JLabel("Leopoldo Alcides D\u00E1valos Casas");
			lblLeopoldoAlcidesDvalos.setFont(new Font("Verdana", Font.ITALIC, 18));
			lblLeopoldoAlcidesDvalos.setHorizontalAlignment(SwingConstants.CENTER);
			lblLeopoldoAlcidesDvalos.setBounds(0, 290, 446, 27);
			getContentPane().add(lblLeopoldoAlcidesDvalos);
		}
		{
			separator = new JSeparator();
			separator.setBounds(10, 49, 426, 2);
			getContentPane().add(separator);
		}
		{
			lblI = new JLabel("");
			lblI.setForeground(SystemColor.textHighlight);
			lblI.setHorizontalAlignment(SwingConstants.CENTER);
			lblI.setFont(new Font("Verdana", Font.ITALIC, 13));
			lblI.setBounds(0, 120, 446, 17);
			getContentPane().add(lblI);
		}
		{
			lblIcibertecedupe = new JLabel("");
			lblIcibertecedupe.setHorizontalAlignment(SwingConstants.CENTER);
			lblIcibertecedupe.setForeground(SystemColor.textHighlight);
			lblIcibertecedupe.setFont(new Font("Verdana", Font.ITALIC, 13));
			lblIcibertecedupe.setBounds(0, 170, 446, 17);
			getContentPane().add(lblIcibertecedupe);
		}
		{
			lblIcibertecedupe_1 = new JLabel("");
			lblIcibertecedupe_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblIcibertecedupe_1.setForeground(SystemColor.textHighlight);
			lblIcibertecedupe_1.setFont(new Font("Verdana", Font.ITALIC, 13));
			lblIcibertecedupe_1.setBounds(0, 220, 446, 17);
			getContentPane().add(lblIcibertecedupe_1);
		}
		{
			lblIcibertecedupe_2 = new JLabel("");
			lblIcibertecedupe_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblIcibertecedupe_2.setForeground(SystemColor.textHighlight);
			lblIcibertecedupe_2.setFont(new Font("Verdana", Font.ITALIC, 13));
			lblIcibertecedupe_2.setBounds(0, 268, 446, 17);
			getContentPane().add(lblIcibertecedupe_2);
		}
		{
			lblIcibertecedupe_3 = new JLabel("");
			lblIcibertecedupe_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblIcibertecedupe_3.setForeground(SystemColor.textHighlight);
			lblIcibertecedupe_3.setFont(new Font("Verdana", Font.ITALIC, 13));
			lblIcibertecedupe_3.setBounds(0, 317, 446, 17);
			getContentPane().add(lblIcibertecedupe_3);
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
