package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import vistas.PanelMenuServidor;
import vistas.VistaMenuServidor;
import vistas.VistaPrincipal;

public class CtrPPrincipal implements ActionListener {
	
	private VistaPrincipal vistaPrincipal;
	
	public CtrPPrincipal(VistaPrincipal vistaPrincipal) {
		this.vistaPrincipal = vistaPrincipal;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		String command = event.getActionCommand();
		try {
			switch (command) {
			
			case VistaPrincipal.CLIENTE:
				System.out.println("Cliente");
				break;
			case VistaPrincipal.SERVIDOR:
				VistaMenuServidor vistaMenuServidor = new PanelMenuServidor();
				ActionListener ctrPMenuServidor = new CtrPMenuServidor(vistaMenuServidor);
				vistaMenuServidor.controlador(ctrPMenuServidor);

				JFrame ventanaMenuServidor = new JFrame("Ventana servidor");
				ventanaMenuServidor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				ventanaMenuServidor.setVisible(true);
				ventanaMenuServidor.setLocationRelativeTo(null);
				ventanaMenuServidor.setContentPane((JPanel) vistaMenuServidor);
				ventanaMenuServidor.pack();
				break;
			
			}
			
		} catch (RuntimeException e) {
			e.getStackTrace();
		}
	}

}
