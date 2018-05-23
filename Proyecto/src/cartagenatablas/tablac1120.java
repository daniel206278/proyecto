package cartagenatablas;


import javax.swing.JTable; 
import javax.swing.JScrollPane; 
import javax.swing.JFrame; 
import java.awt.*; 
import java.awt.event.*;

public class tablac1120 extends JFrame {

public tablac1120() { 
super("Homicidios Cartagena ordenados por el intervalom 11-20");

//Array bidimensional de objetos con los datos de la tabla 
Object[][] data = { 
		{"09/09/2017", "EL CAMINO DEL MEDIO", "CONTUNDENTE",14, "masculino"},   
		{"11/07/2017", "EL POZON", "ARMA DE FUEGO",14, "masculino"},
		{"02/23/2017", "CAMILO TORRES", "ARMA DE FUEGO",15, "masculino"}, 
		{"09/07/2017", "OLAYA HERRERA", "ARMA DE FUEGO",15, "masculino"}, 
		{"12/11/2017", "VILLA ROSITA", "ARMA DE FUEGO",15, "masculino"}, 
		{"03/08/2017", "LA CANDELARIA", "ARMA BLANCA",16, "masculino"}, 
		{"04/01/2017", "EL POZON", "ARMA DE FUEGO",16, "masculino"}, 
		{"05/29/2017", "OLAYA HERRERA", "ARMA BLANCA",16, "masculino"}, 
		{"11/13/2017", "LA ESPERANZA", "ARMA DE FUEGO",16, "masculino"}, 
		{"12/17/2017", "ARROZ BARATO", "ARMA DE FUEGO",16, "masculino"}, 
		{"05/17/2017", "Cto PASACABALLOS", "ARMA BLANCA",17, "masculino"}, 
		{"09/03/2017", "PETARE", "ARMA DE FUEGO",17, "masculino"}, 
		{"10/02/2017", "TORICES", "ARMA BLANCA",17, "masculino"}, 
		{"11/10/2017", "FREDONIA", "ARMA DE FUEGO",17, "masculino"},
		{"03/01/2017", "NELSON MANDELA", "ARMA BLANCA",18, "masculino"}, 
		{"04/02/2017", "LA QUINTA", "ARMA DE FUEGO",18, "masculino"}, 
		{"04/02/2017", "FLOR DEL CAMPO E-10", "ARMA BLANCA",18, "masculino"}, 
		{"04/10/2017", "JUNIN", "ARMA BLANCA",18, "masculino"},
		{"06/24/2017", "BOSTON", "ARMA DE FUEGO",18, "masculino"}, 
		{"08/13/2017", "PALESTINA", "ARMA DE FUEGO",18, "masculino"}, 
		{"11/21/2017", "SAN JOSE OBRERO", "ARMA DE FUEGO",18, "masculino"}, 
		{"01/18/2017", "LA CONSOLATA", "ARMA BLANCA",19, "femenino"}, 
		{"03/05/2017", "NELSON MANDELA", "ARMA BLANCA",19, "masculino"}, 
		{"07/02/2017", "ZAPATERO", "ARMA DE FUEGO",19, "masculino"}, 
		{"07/16/2017", "LA CANDELARIA", "ARMA BLANCA",19, "masculino"}, 
		{"09/24/2017", "PARAGUAY", "ARMA DE FUEGO",19, "masculino"}, 
		{"12/07/2017", "NUEVO BOSQUE", "ARMA BLANCA",19, "masculino"}, 
		{"05/01/2017", "CARTAGENITA", "ARMA DE FUEGO",20, "masculino"}, 
		{"11/16/2017", "HENEQUEN", "ARMA DE FUEGO",20, "masculino"}, 
		{"12/17/2017", "FREDONIA", "ARMA DE FUEGO",20, "masculino"}, 
		{"12/31/2017", "OLAYA HERRERA", "ARMA DE FUEGO",20, "femenino"}, 
		

		
		
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
tablac1120 frame1 = new tablac1120(); 
frame1.pack(); 
frame1.setVisible(true); 
} 
}