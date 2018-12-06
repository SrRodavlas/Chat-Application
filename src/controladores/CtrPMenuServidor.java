package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vistas.VistaMenuServidor;
import vistas.VistaPrincipal;

public class CtrPMenuServidor implements ActionListener {

	private VistaMenuServidor vistaMenuServidor;
	
	public CtrPMenuServidor(VistaMenuServidor vistaMenuServidor) {
		this.vistaMenuServidor = vistaMenuServidor;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		String command = event.getActionCommand();
		try {
			switch (command) {
			
			case VistaMenuServidor.CREAR:
				System.out.println("Crear");
				break;
			case VistaMenuServidor.VOLVER:
				System.out.println("Volver");
				break;
			
			}
			
		} catch (RuntimeException e) {
			
		}
	}

}
