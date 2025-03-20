package jesuitas;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormularioLugares {
	
	JFrame frame=null;
	JPanel panel=null;	
	
	JLabel etiqueta_Titulo=null;
	JLabel etiqueta_NombreJesuita=null;
	JLabel etiqueta_LugarVisitado=null;
	JLabel etiqueta_FechaHoraVisita=null;
	JTextField campo_NombreJesuita=null;
	JTextField campo_LugarVisitado=null;
	JTextField campo_FechaHoraVisita=null;
	
	JButton boton=null;
	
	public FormularioLugares() {
		 //panel
		 panel = new JPanel();
		 panel.setSize(500, 500);
		 panel.setBackground(new Color(255,128,128));
	     panel.setLayout(null);
	     
	     	//etiqueta_Titulo
		    etiqueta_Titulo = new JLabel("Lugares");
		    etiqueta_Titulo.setBounds(200, 0, 250, 50);
		    etiqueta_Titulo.setFont(new Font("Arial", Font.BOLD, 19));
	     	panel.add(etiqueta_Titulo);
	     
	     	//etiqueta_NombreJesuita
	     	etiqueta_NombreJesuita = new JLabel("Nombre del jesuita: ");
	     	etiqueta_NombreJesuita.setBounds(50, 100, 150, 25);
	     	panel.add(etiqueta_NombreJesuita);
	     	
	     	//campo_NombreJesuita
	     	campo_NombreJesuita = new JTextField();
	     	campo_NombreJesuita.setBounds(250, 100, 150, 25);
	     	panel.add(campo_NombreJesuita);
	     	
	     	//etiqueta_LugarVisitado
	     	etiqueta_LugarVisitado = new JLabel("Lugar que ha visitado: ");
	     	etiqueta_LugarVisitado.setBounds(50, 150, 150, 25);
	     	panel.add(etiqueta_LugarVisitado);
	     	
	     	//campo_LugarVisitado
	     	campo_LugarVisitado = new JTextField();
	     	campo_LugarVisitado.setBounds(250, 150, 150, 25);
	     	panel.add(campo_LugarVisitado);
	     	
	     	//etiqueta_FechaHoraVisita
	     	etiqueta_FechaHoraVisita = new JLabel("Fecha y hora de la visita: ");
	     	etiqueta_FechaHoraVisita.setBounds(50, 200, 150, 25);
	     	panel.add(etiqueta_FechaHoraVisita);
	     	
	     	//campo_FechaHoraVisita
	     	campo_FechaHoraVisita = new JTextField();
	     	campo_FechaHoraVisita.setBounds(250, 200, 150, 25);
	     	panel.add(campo_FechaHoraVisita);
	     	
	     	//boton
	     	boton = new JButton("Enviar");
	     	boton.setBounds(200, 250, 80, 30);
	     	panel.add(boton);
	}
}