package modelos;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
//TODO Crear una llamada a la clase Server
public class ConnectionManager implements Runnable {
	
	private Thread hilo;
	private boolean isRunning;
	private ServerSocket entrada;
	private Set<Socket> clients = new TreeSet<Socket>();
	private HashMap<Socket, User> users;
	
	public ConnectionManager(int port) {
		try {
			entrada = new ServerSocket(port);
			start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void start() {
		isRunning = true;
		hilo = new Thread(this);
		hilo.start();
	}
	
	@Override
	public void run() {
		while(isRunning) {
			try {
				Socket client = entrada.accept();
				Scanner scan = new Scanner(client.getInputStream());
				User user = new User(scan.nextLine());
				clients.add(client);
				users.put(client, user);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
