package vistas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ServerMenuPanel extends JPanel implements ServerMenuView {
	
	private JButton jBCrear;
	private JButton jBVolver;
	private JTextField jTFIp;
	private JTextField jTFPort;
	
	public ServerMenuPanel() {
		this.setLayout(new BorderLayout());
		jBCrear = new JButton("Crear");
		jBVolver = new JButton("Volver");
		jTFPort = new JTextField();
		
		jTFPort.setText(ServerMenuView.PORT);
	
		jBCrear.setPreferredSize(new Dimension(200,120));
		jBVolver.setPreferredSize(new Dimension(200,120));
		jTFPort.setPreferredSize(new Dimension(200,40));
		jTFPort.setBorder(BorderFactory.createTitledBorder("Puerto:"));
		
		JPanel jPSur = new JPanel();
		jPSur.setLayout(new GridLayout(0,1));
		jPSur.add(jBCrear);
		jPSur.add(jBVolver);
		JPanel jPNorte = new JPanel();
		jPNorte.setLayout(new GridLayout(2,0));
		jPNorte.add(jTFPort);
		add(jPSur, BorderLayout.SOUTH);
		add(jPNorte, BorderLayout.NORTH);
		
	}
	
	public String getPort() {
		return jTFPort.getText();
	}

	@Override
	public void controlador(ActionListener ctr) {
		jBCrear.setActionCommand(ServerMenuView.CREAR);
		jBCrear.addActionListener(ctr);
		jBVolver.setActionCommand(ServerMenuView.VOLVER);
		jBVolver.addActionListener(ctr);
	}
	
	

}
