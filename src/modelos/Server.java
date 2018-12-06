package modelos;

public class Server implements Runnable {

	private boolean isRunning;
	private Thread thread;
	
	public Server() {
		//TODO Terminar la implementación
	}
	
	public void Start() {
		isRunning = true;
		thread = new Thread(this);
		thread.start();
	}
	
	@Override
	public void run() {
		while(isRunning) {
			
		}
		
	}
	
}
