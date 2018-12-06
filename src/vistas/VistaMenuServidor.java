package vistas;

import java.awt.event.ActionListener;

public interface VistaMenuServidor {

	String CREAR = "C";
	String VOLVER = "V";
	String PORT = "25138";
	
	public void controlador(ActionListener ctr);
	
}
