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
	
	private Thread thread;
	private boolean isRunning;
	private ServerSocket SSocket;
	private Set<Socket> clients = new TreeSet<Socket>();
	private HashMap<Socket, User> users;
	private Server server;
	
	public ConnectionManager(int port) {
		try {
			SSocket = new ServerSocket(port);	
		} catch (IOException e) {
			e.printStackTrace();
		}
		server = new Server();
		start();
	}
	
	private void start() {
		isRunning = true;
		thread = new Thread(this);
		thread.start();
	}
	
	@Override
	public void run() {
		while(isRunning) {
			try {
				Socket client = SSocket.accept();
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
