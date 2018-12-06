package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelos.ConnectionManager;
import vistas.ServerMenuPanel;
import vistas.ServerMenuView;

public class CtrPMenuServidor implements ActionListener {

	private ServerMenuView vistaMenuServidor;
	private ConnectionManager manager;
	
	public CtrPMenuServidor(ServerMenuView vistaMenuServidor) {
		this.vistaMenuServidor = vistaMenuServidor;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		String command = event.getActionCommand();
		try {
			switch (command) {
			
			case ServerMenuView.CREAR:
				int port = Integer.parseInt(((ServerMenuPanel)vistaMenuServidor).getPort());
				manager = new ConnectionManager(port);
				//TODO Implementar la llamada del cliente configurado
				break;
			case ServerMenuView.VOLVER:
				System.out.println("Volver");
				break;
			
			}
			
		} catch (RuntimeException e) {
			
		}
	}

}
