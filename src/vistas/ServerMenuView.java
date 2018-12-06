package vistas;

import java.awt.event.ActionListener;

public interface ServerMenuView {

	String CREAR = "C";
	String VOLVER = "V";
	String PORT = "25138";
	
	public void controlador(ActionListener ctr);
	
}
