package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import vistas.ServerMenuPanel;
import vistas.ServerMenuView;
import vistas.MainView;

public class CtrPPrincipal implements ActionListener {
	
	private MainView vistaPrincipal;
	
	public CtrPPrincipal(MainView vistaPrincipal) {
		this.vistaPrincipal = vistaPrincipal;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		String command = event.getActionCommand();
		try {
			switch (command) {
			
			case MainView.CLIENTE:
				System.out.println("Cliente");
				break;
			case MainView.SERVIDOR:
				ServerMenuView vistaMenuServidor = new ServerMenuPanel();
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
