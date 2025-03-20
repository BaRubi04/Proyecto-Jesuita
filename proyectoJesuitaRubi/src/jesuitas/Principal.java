package jesuitas;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class Principal {

	JFrame frame = null;
	JTabbedPane tabpein = null;
	FormularioJesuita cosoJesuitas = null;
	FormularioLugares cosoLugares = null;
	
	public Principal() {
		cosoJesuitas = new FormularioJesuita();
		cosoLugares = new FormularioLugares();
		Lovisual();
		frame.setVisible(true);
	}
	public void Lovisual(){
		frame = new JFrame();
		frame.setTitle("Principal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        
        tabpein = new JTabbedPane();
        tabpein.add("Jesuitas", cosoJesuitas.panel);
        tabpein.add("Lugares", cosoLugares.panel);
        frame.add(tabpein);
	} 
}