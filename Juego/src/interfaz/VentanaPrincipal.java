package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;

import java.util.HashMap;
import java.util.Map;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.LineBorder;

import controlador.controladorWordle;
import modelo.EstadoLetra;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class VentanaPrincipal {

	private JFrame frame;
	private JLabel[] casilleros = new JLabel[30];
	private Map<String, JButton> letrasTeclado;
	private controladorWordle controlador = new controladorWordle(this);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal window = new VentanaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 663, 675);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		frame.setFocusable(true);
		frame.requestFocusInWindow();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		this.letrasTeclado = new HashMap<>();
		
		JPanel grillaJuego = new JPanel();
		grillaJuego.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(grillaJuego, BorderLayout.NORTH);
		grillaJuego.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel casillerosPanel = new JPanel();
		casillerosPanel.setBackground(new Color(255, 255, 255));
		grillaJuego.add(casillerosPanel);
		casillerosPanel.setLayout(new GridLayout(0, 5, 5, 5));
		

		for (int i = 0; i < 30; i++) {
		    casilleros[i] = new JLabel("");
		    casilleros[i].setPreferredSize(new Dimension(60, 60));
		    casilleros[i].setHorizontalAlignment(SwingConstants.CENTER);
		    casilleros[i].setFont(new Font("Yu Gothic", Font.BOLD, 28));
		    casilleros[i].setBorder(new LineBorder(new Color(150, 150, 150), 2, true));
		    casilleros[i].setOpaque(true);
		    casilleros[i].setBackground(new Color(245, 245, 245));
		    casillerosPanel.add(casilleros[i]); 
		}
		
		JPanel tecladoGeneral = new JPanel();
		tecladoGeneral.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(tecladoGeneral, BorderLayout.SOUTH);
		tecladoGeneral.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 2));
		
		JPanel panelTeclado = new JPanel();
		panelTeclado.setBackground(new Color(255, 255, 255));
		tecladoGeneral.add(panelTeclado);
		panelTeclado.setLayout(new GridLayout(2, 1, 10, 5));
		
		JPanel teclado1 = new JPanel();
		teclado1.setBackground(new Color(255, 255, 255));
		panelTeclado.add(teclado1);
		teclado1.setLayout(new GridLayout(2, 10, 5, 5));
		
		
		JButton q = new JButton("Q");
		q.setFocusable(false);
		q.setBackground(new Color(245, 245, 245));
		q.setPreferredSize(new Dimension(50, 50));
		teclado1.add(q);
		
		JButton w = new JButton("W");
		w.setFocusable(false);
		w.setBackground(new Color(245, 245, 245));
		w.setPreferredSize(new Dimension(50, 50));
		teclado1.add(w);
		
		JButton e = new JButton("E");
		e.setFocusable(false);
		e.setBackground(new Color(245, 245, 245));
		e.setPreferredSize(new Dimension(50, 50));
		teclado1.add(e);
		
		JButton r = new JButton("R");
		r.setFocusable(false);
		r.setBackground(new Color(245, 245, 245));
		r.setPreferredSize(new Dimension(50, 50));
		teclado1.add(r);
		
		JButton t = new JButton("T");
		t.setFocusable(false);
		t.setBackground(new Color(245, 245, 245));
		t.setPreferredSize(new Dimension(50, 50));
		teclado1.add(t);
		
		JButton y = new JButton("Y");
		y.setFocusable(false);
		y.setBackground(new Color(245, 245, 245));
		y.setPreferredSize(new Dimension(50, 50));
		teclado1.add(y);
		
		JButton u = new JButton("U");
		u.setFocusable(false);
		u.setBackground(new Color(245, 245, 245));
		u.setPreferredSize(new Dimension(50, 50));
		teclado1.add(u);
		
		JButton i = new JButton("I");
		i.setFocusable(false);
		i.setBackground(new Color(245, 245, 245));
		i.setPreferredSize(new Dimension(50, 50));
		teclado1.add(i);
		
		JButton o = new JButton("O");
		o.setFocusable(false);
		o.setBackground(new Color(245, 245, 245));
		o.setPreferredSize(new Dimension(50, 50));
		teclado1.add(o);
		
		JButton p = new JButton("P");
		p.setFocusable(false);
		p.setBackground(new Color(245, 245, 245));
		p.setPreferredSize(new Dimension(50, 50));
		teclado1.add(p);
		
		JButton a = new JButton("A");
		a.setFocusable(false);
		a.setBackground(new Color(245, 245, 245));
		a.setPreferredSize(new Dimension(50, 50));
		teclado1.add(a);
		
		JButton s = new JButton("S");
		s.setFocusable(false);
		s.setBackground(new Color(245, 245, 245));
		s.setPreferredSize(new Dimension(50, 50));
		teclado1.add(s);
		
		JButton d = new JButton("D");
		d.setFocusable(false);
		d.setBackground(new Color(245, 245, 245));
		d.setPreferredSize(new Dimension(50, 50));
		teclado1.add(d);
		
		JButton f = new JButton("F");
		f.setFocusable(false);
		f.setBackground(new Color(245, 245, 245));
		f.setPreferredSize(new Dimension(50, 50));
		teclado1.add(f);
		
		JButton g = new JButton("G");
		g.setFocusable(false);
		g.setBackground(new Color(245, 245, 245));
		g.setPreferredSize(new Dimension(50, 50));
		teclado1.add(g);
		
		JButton h = new JButton("H");
		h.setFocusable(false);
		h.setBackground(new Color(245, 245, 245));
		h.setPreferredSize(new Dimension(50, 50));
		teclado1.add(h);
		
		JButton j = new JButton("J");
		j.setFocusable(false);
		j.setBackground(new Color(245, 245, 245));
		j.setPreferredSize(new Dimension(50, 50));
		teclado1.add(j);
		
		JButton k = new JButton("K");
		k.setFocusable(false);
		k.setBackground(new Color(245, 245, 245));
		k.setPreferredSize(new Dimension(50, 50));
		teclado1.add(k);
		
		JButton l = new JButton("L");
		l.setFocusable(false);
		l.setBackground(new Color(245, 245, 245));
		l.setPreferredSize(new Dimension(50, 50));
		teclado1.add(l);
		
		JButton ñ = new JButton("Ñ");
		ñ.setFocusable(false);
		ñ.setBackground(new Color(245, 245, 245));
		ñ.setPreferredSize(new Dimension(50, 50));
		teclado1.add(ñ);
		
		JPanel teclado2 = new JPanel();
		teclado2.setBackground(new Color(255, 255, 255));
		panelTeclado.add(teclado2);
		teclado2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton enviar = new JButton("Enviar");
		enviar.setFocusable(false);
		enviar.setBackground(new Color(245, 245, 245));
		enviar.setPreferredSize(new Dimension(100, 50));
		teclado2.add(enviar);
		
		enviar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controlador.procesarPalabra();
			}
		});
		
		JButton z = new JButton("Z");
		z.setFocusable(false);
		z.setBackground(new Color(245, 245, 245));
		z.setPreferredSize(new Dimension(50, 50));
		teclado2.add(z);
		
		JButton x = new JButton("X");
		x.setFocusable(false);
		x.setBackground(new Color(245, 245, 245));
		x.setPreferredSize(new Dimension(50, 50));
		teclado2.add(x);
		
		JButton c = new JButton("C");
		c.setFocusable(false);
		c.setBackground(new Color(245, 245, 245));
		c.setPreferredSize(new Dimension(50, 50));
		teclado2.add(c);
		
		JButton v = new JButton("V");
		v.setFocusable(false);
		v.setBackground(new Color(245, 245, 245));
		v.setPreferredSize(new Dimension(50, 50));
		teclado2.add(v);
		
		JButton b = new JButton("B");
		b.setFocusable(false);
		b.setBackground(new Color(245, 245, 245));
		b.setPreferredSize(new Dimension(50, 50));
		teclado2.add(b);
		
		JButton n = new JButton("N");
		n.setFocusable(false);
		n.setBackground(new Color(245, 245, 245));
		n.setPreferredSize(new Dimension(50, 50));
		teclado2.add(n);
		
		JButton m = new JButton("M");
		m.setFocusable(false);
		m.setBackground(new Color(245, 245, 245));
		m.setPreferredSize(new Dimension(50, 50));
		teclado2.add(m);
		
		JButton borrar = new JButton("Borrar");
		borrar.setFocusable(false);
		borrar.setBackground(new Color(245, 245, 245));
		borrar.setPreferredSize(new Dimension(100, 50));
		teclado2.add(borrar);
		
		borrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controlador.borrarLetra();
			}
		});
		
		letrasTeclado.put("Q", q);
		letrasTeclado.put("W", w);
		letrasTeclado.put("E", e);
		letrasTeclado.put("R", r);
		letrasTeclado.put("T", t);
		letrasTeclado.put("Y", y);
		letrasTeclado.put("U", u);
		letrasTeclado.put("I", i);
		letrasTeclado.put("O", o);
		letrasTeclado.put("P", p);
		letrasTeclado.put("A", a);
		letrasTeclado.put("S", s);
		letrasTeclado.put("D", d);
		letrasTeclado.put("F", f);
		letrasTeclado.put("G", g);
		letrasTeclado.put("H", h);
		letrasTeclado.put("J", j);
		letrasTeclado.put("K", k);
		letrasTeclado.put("L", l);
		letrasTeclado.put("Ñ", ñ);
		letrasTeclado.put("Z", z);
		letrasTeclado.put("X", x);
		letrasTeclado.put("C", c);
		letrasTeclado.put("V", v);
		letrasTeclado.put("B", b);
		letrasTeclado.put("N", n);
		letrasTeclado.put("M", m);
		
		for(String letra : this.letrasTeclado.keySet()) {
			JButton boton = this.letrasTeclado.get(letra);
			
			
			boton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					controlador.recibirLetra(letra);	
				}
			});
		}
		
		frame.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				int codigo = e.getKeyCode();
				
				if (codigo >= KeyEvent.VK_A && codigo <= KeyEvent.VK_Z) {
		            String letra = String.valueOf(e.getKeyChar()).toUpperCase();
		            controlador.recibirLetra(letra);
		        }
		        
		        if (codigo == KeyEvent.VK_ENTER) {
		            controlador.procesarPalabra();
		        }

		        if (codigo == KeyEvent.VK_BACK_SPACE) {
		            controlador.borrarLetra();
		        }
				
			}
		});
		
	}
	
	private Color obtenerColor(EstadoLetra estado) {
		switch (estado) {
		case CORRECTA:
			return Color.GREEN;
		case PRESENTE:
			return Color.YELLOW;
		case AUSENTE:
			return Color.gray;
		default:
			return Color.WHITE;
		}
	}
	

	public void dibujarLetra(int casilleroActual, String letra) {
		JLabel casillero = this.casilleros[casilleroActual];
		
		casillero.setText(letra);
		
	}

	public void pintarCasillero(int indice, EstadoLetra estado) {
	    Color color = obtenerColor(estado);
	    casilleros[indice].setBackground(color);
	}
	
	public void pintarTeclado(String letra, EstadoLetra estado) {
	    JButton boton = letrasTeclado.get(letra);
	    
	    if (boton != null) {
	    	Color colorActual = boton.getBackground();
	        Color colorNuevo = obtenerColor(estado);
	        
	        
	        if (colorActual.equals(Color.WHITE)) { 
	            boton.setBackground(colorNuevo);
	        } else if (colorActual.equals(Color.YELLOW) && colorNuevo.equals(Color.GREEN)) {
	        	boton.setBackground(colorNuevo);
	        }
	    }
	}
	
	
	
	

}
