package Medellintablas;
import javax.swing.JTable; 
import javax.swing.JScrollPane; 
import javax.swing.JFrame; 
import java.awt.*; 
import java.awt.event.*;

public class femenino extends JFrame {

public femenino() { 
super("Homicidios Medellín ordenados por género femenino");

//Array bidimensional de objetos con los datos de la tabla 
Object[][] data = { 
		{"28/01/2017", "ALTAVISTA", "ARMA DE FUEGO",25, "femenino"} ,
		{"31/01/2017", "CONQUISTADORES", "ARMA DE FUEGO",40, "femenino"} ,
		{"02/02/2017", "SAN BENITO", "CINTURON",25, "femenino"} ,
		{"03/02/2017", "FLORENCIA", "ARMA DE FUEGO",18, "femenino"} ,
		{"25/02/2017", "ESTACION VILLA", "ARMA DE FUEGO",30, "femenino"} ,
		{"27/02/2017", "CASTILLA", "ARMA DE FUEGO",28, "femenino"} ,
		{"02/03/2017", "OLAYA HERRERA", " ARMA DE FUEGO",34, "femenino"} ,
		{"09/03/2017", "SAN PEDRO", "CONTUNDENTES",50, "femenino"} ,
		{"18/03/2017", "SAN JAVIER 1", "ARMA DE FUEGO",13, "femenino"} ,
		{"29/03/2017", "ALDEA PABLO VI", "CUERDA/CADENA",17, "femenino"} ,
		{"03/04/2017", "SAN BENITO", "ARMA DE FUEGO",59, "femenino"} ,
		{"06/04/2017", "LA PALMA", "ARMA DE FUEGO",57, "femenino"} ,
		{"09/04/2017", "VDA.MEDIA LUNA PARTE ALTA", "ARMA DE FUEGO",27, "femenino"} ,
		{"10/04/2017", "CRISTO REY", "ARMA BLANCA",34, "femenino"} ,
		{"20/04/2017", "LA CRUZ", "ARMA BLANCA",47, "femenino"} ,    
		{"22/04/2017", "SAN ISIDRO", "ARMA BLANCA",15, "femenino"} ,
		{"23/04/2017", "EL PESEBRE", "ARMA DE FUEGO",33, "femenino"} ,
		{"26/04/2017", "13 DE NOVIEMBRE", "CUERDA/CADENA",34, "femenino"} , 
		{"03/05/2017", "SAN MARTIN DE PORRES", "CONTUNDENTES",93, "femenino"} , 
		{"10/05/2017", "AURES 1", "ARMA DE FUEGO",28, "femenino"} ,
		{"14/05/2017", "LA CANDELARIA", "ARMA BLANCA",20, "femenino"} , 
		{"14/05/2017", "ESTACION VILLA", "ARMA BLANCA",17, "femenino"} , 
		{"18/05/2017", "LA CANDELARIA", "CINTAS/CINTURON",42, "femenino"} ,
		{"25/05/2017", "SAN BENITO", "ARMA DE FUEGO",17, "femenino"} , 
		{"03/06/2017", "LA PIÑUELA", "CINTAS/CINTURON",28, "femenino"} , 
		{"07/06/2017", "VDA. AGUAS FRIAS", "ARMA DE FUEGO",14, "femenino"} , 
		{"11/06/2017", "CORDOBA", "ARMA BLANCA",29, "femenino"} , 
		{"18/06/2017", "VILLA LILLIAN", "ARMA DE FUEGO",15, "femenino"} , 
		{"26/06/2017", "HOSPITAL SAN VICENTE DE PAUL", "CONTUNDENTES",51, "femenino"},
		{"27/06/2017", "LA PALMA", "ARMA DE FUEGO ",60, "femenino"} , 
		{"04/07/2017", "LORENA", "CONTUNDENTES",41, "femenino"} , 
		{"08/07/2017", "ESTACION VILLA", "ARMA DE FUEGO",17, "femenino"} , 
		{"08/08/2017", "VILLA TINA", "ARMA BLANCA",51, "femenino"} , 
		{"09/08/2017", "VILLA GUADALUPE", "ALMOHADA",67, "femenino"} , 
		{"13/08/2017", "MORAVIA", "CUERDA/CADENA",34, "femenino"} , 
		{"19/08/2017", "LAS PALMAS", "ARMA BLANCA",25, "femenino"} , 
		{"20/08/2017", "ALTAVISTA", "ARMA DE FUEGO",33, "femenino"} , 
		{"02/09/2017", "ESTACION VILLA", "ARMA BLANCA",19, "femenino"} , 
		{"11/09/2017", "ESTACION VILLA", "ARMA DE FUEGO",41, "femenino"} , 
		{"12/09/2017", "PABLO VI", "ARMA BLANCA",22, "femenino"} , 
		{"25/09/2017", "SAN BENITO", "ARMA DE FUEGO",24, "femenino"} , 
		{"01/10/2017", "SANTA MARIA DE LOS ANGELES", "ARMA BLANCA",47, "femenino"} , 
		{"07/10/2017", "SAN PABLO", "ARMA BLANCA",64, "femenino"} , 
		{"12/10/2017", "ESTACION VILLA", "CONTUNDENTES",17, "femenino"} , 
		{"13/10/2017", "URB.ROSALEDA", "ARMA BLANCA",58, "femenino"} , 
		{"14/10/2017", "BARICHARA", "CONTUNDENTES",23, "femenino"} , 
		{"18/10/2017", "VSA.SAN JOSE LA LOMA", "ARMA DE FUEGO",42, "femenino"} , 
		{"19/10/2017", "EL VELODROMO", "ARMA BLANCA",65, "femenino"} , 
		{"27/10/2017", "VERSALLES", "ARMA BLANCA",46, "femenino"} , 
		{"29/10/2017", "ESTACION VILLA", "CONTUNDENTES",22, "femenino"} , 
		{"31/12/2017", "LALINDE", "ARMA BLANCA",59, "femenino"} , 
		
		
		
		
		
		

		
		
		
		
		
		
		
		

	
	
	
};

//Array de ‘String’ con los titulos de las columnas 
String[] columnNames = {"Fecha", "Barrio", "Arma empleada", "edad", "sexo"};

//Creacion de la tabla 
final JTable table = new JTable(data, columnNames); 
table.setPreferredScrollableViewportSize(new Dimension(500, 80));

//Creamos un scrollpanel y se lo agregamos a la tabla 
JScrollPane scrollpane = new JScrollPane(table);

//Agregamos el scrollpanel al contenedor 
getContentPane().add(scrollpane, BorderLayout.CENTER);

//manejamos la salida 
addWindowListener(new WindowAdapter() {

public void windowClosing(WindowEvent e) { 
System.exit(0); 
} 
}); 
}

public static void main(String ar[]) { 
SimpleTable2 frame1 = new SimpleTable2(); 
frame1.pack(); 
frame1.setVisible(true); 
} 
}
