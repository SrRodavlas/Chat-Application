package vistas;

import java.awt.event.ActionListener;

public interface VistaPrincipal {

	String CLIENTE = "C";	//Comando de pasar al menu de cliente
	String SERVIDOR = "S";	//Comando de pasar al menu de servidor
	
	public void controlador(ActionListener ctr);
	
}
