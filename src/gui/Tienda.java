package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tienda extends JFrame implements ActionListener {
	// Datos mínimos del primer modelo
	public static String codigo0 = "MT0";
	public static String modelo0 = "Aviator";
	public static double precio0 = 124.9;
	public static double ancho0 = 63.5;
	public static double alto0 = 30.9;
	public static double fondo0 = 29.2;
	// Datos mínimos del segundo modelo
	public static String codigo1 = "MT1";
	public static String modelo1 = "Century";
	public static double precio1 = 174.9;
	public static double ancho1 = 75.0;
	public static double alto1 = 28.5;
	public static double fondo1 = 30.0;
	// Datos mínimos del tercer modelo
	public static String codigo2 = "MT2";
	public static String modelo2 = "Benneton";
	public static double precio2 = 159.9;
	public static double ancho2 = 65.2;
	public static double alto2 = 31.2;
	public static double fondo2 = 29.4;
	// Datos mínimos del cuarto modelo
	public static String codigo3 = "MT3";
	public static String modelo3 = "Lucas";
	public static double precio3 = 99.9;
	public static double ancho3 = 45.0;
	public static double alto3 = 70.0;
	public static double fondo3 = 25.0;
	// Datos mínimos del quinto modelo
	public static String codigo4 = "MT4";
	public static String modelo4 = "Samsonite";
	public static double precio4 = 84.9;
	public static double ancho4 = 50.2;
	public static double alto4 = 60.4;
	public static double fondo4 = 25.0;
	// Porcentajes de descuento
	public static double porcentaje1 = 4.0;
	public static double porcentaje2 = 5.5;
	public static double porcentaje3 = 7.0;
	public static double porcentaje4 = 8.5;
	// Cantidad óptima de maletas vendidas
	public static int cantidadOptima = 50;
	// Cantidad mínima de maletas adquiridas para obtener el obsequio
	public static int cantidadMinima = 20;
	// Obsequio
	public static String obsequio = "USB";
	// Número de cliente que recibe el premio sorpresa
	public static int numeroClientePremiado = 5;
	// Premio sorpresa
	public static String premioSorpresa = "Una agenda";
	
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArchivos;
	private JMenu mnMantenimiento;
	private JMenu mnVentas;
	private JMenuItem mntmConsultarMaleta;
	private JMenuItem mntmModificarMaleta;
	private JMenuItem mntmSalir;
	private JMenuItem mntmListarMaletas;
	private JMenu mnConfiguracin;
	private JMenu mnAyuda;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerarReportes;
	private JMenuItem mntmConfigurarDescuentos;
	private JMenuItem mntmConfigurarObsequio;
	private JMenuItem mntmConfigurarCantidadptima;
	private JMenuItem mntmConfigurarPremioSorpresa;
	private JMenuItem mntmAcercaDeTienda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda frame = new Tienda();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tienda() {
		setTitle("Tienda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		{
			menuBar = new JMenuBar();
			setJMenuBar(menuBar);
			{
				mnArchivos = new JMenu("Archivos");
				menuBar.add(mnArchivos);
				{
					mntmSalir = new JMenuItem("Salir");
					mntmSalir.addActionListener(this);
					mnArchivos.add(mntmSalir);
				}
			}
			{
				mnMantenimiento = new JMenu("Mantenimiento");
				menuBar.add(mnMantenimiento);
				{
					mntmConsultarMaleta = new JMenuItem("Consultar maleta");
					mntmConsultarMaleta.addActionListener(this);
					mnMantenimiento.add(mntmConsultarMaleta);
				}
				{
					mntmModificarMaleta = new JMenuItem("Modificar maleta");
					mntmModificarMaleta.addActionListener(this);
					mnMantenimiento.add(mntmModificarMaleta);
				}
				{
					mntmListarMaletas = new JMenuItem("Listar maletas");
					mntmListarMaletas.addActionListener(this);
					mnMantenimiento.add(mntmListarMaletas);
				}
			}
			{
				mnVentas = new JMenu("Ventas");
				menuBar.add(mnVentas);
				{
					mntmVender = new JMenuItem("Vender");
					mntmVender.addActionListener(this);
					mnVentas.add(mntmVender);
				}
				{
					mntmGenerarReportes = new JMenuItem("Generar reportes");
					mntmGenerarReportes.addActionListener(this);
					mnVentas.add(mntmGenerarReportes);
				}
			}
			{
				mnConfiguracin = new JMenu("Configuraci\u00F3n");
				menuBar.add(mnConfiguracin);
				{
					mntmConfigurarDescuentos = new JMenuItem("Configurar descuentos");
					mntmConfigurarDescuentos.addActionListener(this);
					mnConfiguracin.add(mntmConfigurarDescuentos);
				}
				{
					mntmConfigurarObsequio = new JMenuItem("Configurar obsequio");
					mntmConfigurarObsequio.addActionListener(this);
					mnConfiguracin.add(mntmConfigurarObsequio);
				}
				{
					mntmConfigurarCantidadptima = new JMenuItem("Configurar cantidad \u00F3ptima de maletas vendidas");
					mntmConfigurarCantidadptima.addActionListener(this);
					mnConfiguracin.add(mntmConfigurarCantidadptima);
				}
				{
					mntmConfigurarPremioSorpresa = new JMenuItem("Configurar premio sorpresa");
					mntmConfigurarPremioSorpresa.addActionListener(this);
					mnConfiguracin.add(mntmConfigurarPremioSorpresa);
				}
			}
			{
				mnAyuda = new JMenu("Ayuda");
				menuBar.add(mnAyuda);
				{
					mntmAcercaDeTienda = new JMenuItem("Acerca de Tienda");
					mntmAcercaDeTienda.addActionListener(this);
					mnAyuda.add(mntmAcercaDeTienda);
				}
			}
		}
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == mntmAcercaDeTienda) {
			do_mntmAcercaDeTienda_actionPerformed(arg0);
		}
		if (arg0.getSource() == mntmConfigurarPremioSorpresa) {
			do_mntmConfigurarPremioSorpresa_actionPerformed(arg0);
		}
		if (arg0.getSource() == mntmConfigurarCantidadptima) {
			do_mntmConfigurarCantidadptima_actionPerformed(arg0);
		}
		if (arg0.getSource() == mntmConfigurarObsequio) {
			do_mntmConfigurarObsequio_actionPerformed(arg0);
		}
		if (arg0.getSource() == mntmConfigurarDescuentos) {
			do_mntmConfigurarDescuentos_actionPerformed(arg0);
		}
		if (arg0.getSource() == mntmGenerarReportes) {
			do_mntmGenerarReportes_actionPerformed(arg0);
		}
		if (arg0.getSource() == mntmVender) {
			do_mntmVender_actionPerformed(arg0);
		}
		if (arg0.getSource() == mntmListarMaletas) {
			do_mntmListarMaletas_actionPerformed(arg0);
		}
		if (arg0.getSource() == mntmModificarMaleta) {
			do_mntmModificarMaleta_actionPerformed(arg0);
		}
		if (arg0.getSource() == mntmConsultarMaleta) {
			do_mntmConsultarMaleta_actionPerformed(arg0);
		}
		if (arg0.getSource() == mntmSalir) {
			do_mntmSalir_actionPerformed(arg0);
		}
	}
	protected void do_mntmSalir_actionPerformed(ActionEvent arg0) {
	System.exit(0);//cerrar software
	}
	protected void do_mntmConsultarMaleta_actionPerformed(ActionEvent arg0) {
	Consultar_maleta c = new Consultar_maleta();
	c.setVisible(true);
	}
	protected void do_mntmModificarMaleta_actionPerformed(ActionEvent arg0) {
	Modificar_maleta m = new Modificar_maleta();
	m.setVisible(true);
	}
	protected void do_mntmListarMaletas_actionPerformed(ActionEvent arg0) {
	Listar_maleta l = new Listar_maleta();
	l.setVisible(true);
	}
	protected void do_mntmVender_actionPerformed(ActionEvent arg0) {
	Vender_maleta v = new Vender_maleta();
	v.setVisible(true);
	}
	protected void do_mntmGenerarReportes_actionPerformed(ActionEvent arg0) {
	Generar_reportes gr = new Generar_reportes();
	gr.setVisible(true);
	}
	protected void do_mntmConfigurarDescuentos_actionPerformed(ActionEvent arg0) {
	Configurar_descuentos cd = new Configurar_descuentos();
	cd.setVisible(true);
	}
	protected void do_mntmConfigurarObsequio_actionPerformed(ActionEvent arg0) {
	Configurar_obsequio co = new Configurar_obsequio();
	co.setVisible(true);
	}
	protected void do_mntmConfigurarCantidadptima_actionPerformed(ActionEvent arg0) {
	Configurar_cantidad_optima cco = new Configurar_cantidad_optima();
	cco.setVisible(true);
	}
	protected void do_mntmConfigurarPremioSorpresa_actionPerformed(ActionEvent arg0) {
	Configurar_premio_sorpresa cps = new Configurar_premio_sorpresa();
	cps.setVisible(true);
	}
	protected void do_mntmAcercaDeTienda_actionPerformed(ActionEvent arg0) {
	Acerca_tienda at = new Acerca_tienda();
	at.setVisible(true);
	}
}
