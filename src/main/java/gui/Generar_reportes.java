package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Generar_reportes extends JDialog implements ActionListener {
	private JLabel lblTipoDeReporte;
	private JComboBox cboReportes;
	private JButton btnCerrar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Generar_reportes dialog = new Generar_reportes();
			dialog.setDefaultCloseOperation(0);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Generar_reportes() {
		setTitle("Generar reportes");
		setBounds(100, 100, 501, 300);
		getContentPane().setLayout(null);
		{
			lblTipoDeReporte = new JLabel("Tipo de reporte");
			lblTipoDeReporte.setBounds(10, 14, 93, 14);
			getContentPane().add(lblTipoDeReporte);
		}
		{
			cboReportes = new JComboBox();
			cboReportes.addActionListener(this);
			cboReportes.setModel(new DefaultComboBoxModel(new String[] {"Ventas por maleta", "Maletas con venta \u00F3ptima", "Maletas con precios mayores al promedio", "Maletas con precios menores al promedio", "Precios menor, mayor y promedio"}));
			cboReportes.setBounds(105, 11, 271, 20);
			getContentPane().add(cboReportes);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(386, 10, 89, 23);
			getContentPane().add(btnCerrar);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 39, 465, 211);
			getContentPane().add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == cboReportes) {
			do_cboReportes_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnCerrar) {
			do_btnCerrar_actionPerformed(arg0);
		}
	}
	protected void do_btnCerrar_actionPerformed(ActionEvent arg0) {
	dispose();
	}
	protected void do_cboReportes_actionPerformed(ActionEvent arg0) {
		
	}
}
