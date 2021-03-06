package main;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controladores.CtrPPrincipal;
import vistas.MainPanel;
import vistas.MainView;

	

public class Main {
	
	public static void main(String[] args)  {
	
		MainView vistaPrincipal = new MainPanel();
		ActionListener ctrPPrincipal = new CtrPPrincipal(vistaPrincipal);
		vistaPrincipal.controlador(ctrPPrincipal);

		JFrame ventana = new JFrame("Ventana");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		ventana.setContentPane((JPanel) vistaPrincipal);
		ventana.pack();
		
		
	}

}
