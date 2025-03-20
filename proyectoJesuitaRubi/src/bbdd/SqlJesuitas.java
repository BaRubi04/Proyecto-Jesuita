package bbdd;

import java.sql.SQLException;

public class SqlJesuitas {
	ConexionBD objConexion = null;
	
	public SqlJesuitas(ConexionBD objConexion){
		this.objConexion=objConexion;
	}	
	public void insertarFila (String codigo, String nombre, String nombreAlumno, String firma, String firmaIngles){
        try {
           String consulta;
           if(codigo.compareTo("")!=0) {
           consulta = "INSERT INTO JESUITA(codigo,nombre,nombreAlumno,firma,firmaIngles) VALUES ('" 
        		+codigo+ "','"   
				+nombre+ "','" 
				+nombreAlumno+ "','" 
				+firma+ "','" 
				+firmaIngles+"');";
           }else {
        	   consulta = "INSERT INTO JESUITA(codigo,nombre,nombreAlumno,firma,firmaIngles) VALUES ('" 
               		+"NULL,+ '"   
       				+nombre+ "','" 
       				+nombreAlumno+ "','" 
       				+firma+ "','" 
       				+firmaIngles+"');";
           }
           	System.out.println(consulta);
           objConexion.sentencia.executeUpdate(consulta);
          } catch (SQLException ex) {ex.printStackTrace();}
    }
}