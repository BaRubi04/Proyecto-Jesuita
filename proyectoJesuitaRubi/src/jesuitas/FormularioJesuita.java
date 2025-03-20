package jesuitas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import bbdd.ConexionBD;
import bbdd.SqlJesuitas;

public class FormularioJesuita implements ActionListener {

	JFrame frame=null;
	JPanel panel=null;	
	
	JLabel etiqueta_titulo=null;
	JLabel etiqueta_nombreJesuita=null;
	JLabel etiqueta_nombreAlumno=null;
	JLabel etiqueta_firmaEspañol=null;
	JLabel etiqueta_firmaIngles=null;
	JLabel etiqueta_codigo=null;
	JLabel etiqueta_lugar=null;
	
	JTextField campo_nombreJesuita=null;
	JTextField campo_nombreAlumno=null;
	JTextField campo_codigo=null;
	
	JTextArea area_firmaEspañol=null;
	JTextArea area_firmaIngles=null;
	
	JComboBox<String> combo_lugar=null;
	
	ConexionBD obj;
	public SqlJesuitas objJesuita;
	
	JButton boton_enviar=null;
	
	JTabbedPane pestañas;
	
	public FormularioJesuita() {
		Lovisual();
		obj = new ConexionBD();
		objJesuita = new SqlJesuitas(obj);
	}
	public void Lovisual() {
        
        	//panel
        	panel = new JPanel();
        	panel.setSize(500, 500);
        	panel.setBackground(new Color(255,128,128));
        	panel.setLayout(null);
        	
				//etiqueta_titulo
        		etiqueta_titulo=new JLabel("Proyecto Jesuita");
        		etiqueta_titulo.setBounds(170, 0, 250, 50);
        		etiqueta_titulo.setFont(new Font("Arial", Font.BOLD, 19));
        		panel.add(etiqueta_titulo);
        		
        		//etiqueta_nombreJesuita
        		etiqueta_nombreJesuita=new JLabel("Nombre del jesuita: ");
        		etiqueta_nombreJesuita.setBounds(50, 70, 150, 25);
        		panel.add(etiqueta_nombreJesuita);
        		
        		//campo_nombreJesuita
        		campo_nombreJesuita=new JTextField();
        		campo_nombreJesuita.setBounds(300, 70, 150, 25);
        		panel.add(campo_nombreJesuita);
        		
        		//etiqueta_nombreAlumno        		
        		etiqueta_nombreJesuita=new JLabel("Nombre del alumno: ");
        		etiqueta_nombreJesuita.setBounds(50, 120, 150, 25);
        		panel.add(etiqueta_nombreJesuita);
        		
        		//campo_nombreAlumno
        		campo_nombreAlumno=new JTextField();
        		campo_nombreAlumno.setBounds(300, 120, 150, 25);
        		panel.add(campo_nombreAlumno);
        		
        		//etiqueta_codigo
        		etiqueta_nombreJesuita=new JLabel("codigo: ");
        		etiqueta_nombreJesuita.setBounds(50, 170, 150, 25);
        		panel.add(etiqueta_nombreJesuita);
        		
        		//campo_codigo
        		campo_codigo=new JTextField();
        		campo_codigo.setBounds(300, 170, 150, 25);
        		panel.add(campo_codigo);
        		
        		//etiqueta_firmaEspañol
        		etiqueta_firmaEspañol=new JLabel("firma en español: ");
        		etiqueta_firmaEspañol.setBounds(50, 200, 150, 25);
        		panel.add(etiqueta_firmaEspañol);
        		
        		//area_firmaEspañol
        		area_firmaEspañol=new JTextArea();
        		area_firmaEspañol.setBounds(50, 225, 150, 80);
        		area_firmaEspañol.setLineWrap(true);
        		area_firmaEspañol.setWrapStyleWord(true);
        		panel.add(area_firmaEspañol);
        		
        		//etiqueta_firmaIngles
        		etiqueta_nombreJesuita=new JLabel("firma en inglés: ");
        		etiqueta_nombreJesuita.setBounds(300, 200, 150, 25);
        		panel.add(etiqueta_nombreJesuita);
        		
        		//area_firmaIngles
        		area_firmaIngles=new JTextArea();
        		area_firmaIngles.setBounds(300, 225, 150, 80);
        		area_firmaIngles.setLineWrap(true);
        		area_firmaIngles.setWrapStyleWord(true);
        		panel.add(area_firmaIngles);
        		
        		//etiqueta_lugar
        		etiqueta_nombreJesuita=new JLabel("Seleccione el lugar al que quiere viajar: ");
        		etiqueta_nombreJesuita.setBounds(50, 320, 250, 25);
        		panel.add(etiqueta_nombreJesuita);
        		
        		//combo_lugar
        		combo_lugar=new JComboBox<String>();
        		combo_lugar.setBounds(300, 320, 150, 25);
        		panel.add(combo_lugar);
        		
        		//boton_enviar
        		boton_enviar=new JButton("enviar");
        		boton_enviar.setBounds(200, 370, 100, 30);
        		boton_enviar.addActionListener(this);
        		panel.add(boton_enviar);        		
	}
	public static void main(String[] args) {
		new FormularioJesuita();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==boton_enviar) enviar();
	}
	public void enviar() {		
		objJesuita.insertarFila(campo_codigo.getText(), campo_nombreJesuita.getText(), campo_nombreAlumno.getText(), area_firmaEspañol.getText(), area_firmaIngles.getText());
		campo_codigo.setText("");
		campo_nombreJesuita.setText("");
		campo_nombreAlumno.setText("");
		area_firmaEspañol.setText("");
		area_firmaIngles.setText("");
	}
}