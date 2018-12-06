package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelos.ConnectionManager;
import vistas.PanelMenuServidor;
import vistas.VistaMenuServidor;

public class CtrPMenuServidor implements ActionListener {

	private VistaMenuServidor vistaMenuServidor;
	private ConnectionManager manager;
	
	public CtrPMenuServidor(VistaMenuServidor vistaMenuServidor) {
		this.vistaMenuServidor = vistaMenuServidor;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		String command = event.getActionCommand();
		try {
			switch (command) {
			
			case VistaMenuServidor.CREAR:
				int port = Integer.parseInt(((PanelMenuServidor)vistaMenuServidor).getPort());
				manager = new ConnectionManager(port);
				//TODO Implementar la llamada del cliente configurado
				break;
			case VistaMenuServidor.VOLVER:
				System.out.println("Volver");
				break;
			
			}
			
		} catch (RuntimeException e) {
			
		}
	}

}
