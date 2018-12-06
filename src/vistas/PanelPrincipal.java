package vistas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelPrincipal extends JPanel implements VistaPrincipal {
	
	
	JButton jBCliente;
	JButton jBServidor;
	
	public PanelPrincipal() {
		this.setLayout(new BorderLayout());
		jBCliente = new JButton("Cliente");
		jBServidor = new JButton("Servidor");
	
		jBCliente.setPreferredSize(new Dimension(120,120));
		jBCliente.setPreferredSize(new Dimension(120,120));
		JPanel jPSur = new JPanel();
		jPSur.setLayout(new GridLayout(0,2));
		jPSur.add(jBCliente, BorderLayout.NORTH);
		jPSur.add(jBServidor, BorderLayout.NORTH);	
		add(jPSur, BorderLayout.SOUTH);
		
	}

	@Override
	public void controlador(ActionListener ctr) {
		jBCliente.setActionCommand(VistaPrincipal.CLIENTE);
		jBCliente.addActionListener(ctr);
		jBServidor.setActionCommand(VistaPrincipal.SERVIDOR);
		jBServidor.addActionListener(ctr);
	}

}
