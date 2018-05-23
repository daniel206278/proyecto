package cartagenatablas;


import javax.swing.JTable;

import Medellintablas.tabla4150;

import javax.swing.JScrollPane; 
import javax.swing.JFrame; 
import java.awt.*; 
import java.awt.event.*;

public class tablac4150 extends JFrame {

public tablac4150() { 
super("Homicidios Cartagena ordenados por el intervalom 41-50");

//Array bidimensional de objetos con los datos de la tabla 
Object[][] data = { 
		{"01/23/2017", "AMBERES", "ARMA DE FUEGO",41, "masculino"}, 
		{"08/31/2017", "OLAYA HERRERA", "ARMA DE FUEGO",41, "masculino"}, 
		{"03/06/2017", "EL CAMPESTRE", "ARMA DE FUEGO",42, "masculino"}, 
		{"06/24/2017", "LA CANDELARIA", "ARMA DE FUEGO",42, "masculino"}, 
		{"03/06/2017", "EL CAMPESTRE", "ARMA DE FUEGO",42, "masculino"}, 
		{"06/24/2017", "LA CANDELARIA", "ARMA DE FUEGO",42, "masculino"},
		{"03/06/2017", "EL CAMPESTRE", "ARMA DE FUEGO",44, "masculino"}, 
		{"05/18/2017", "Cto PASACABALLOS", "ARMA DE FUEGO",43, "masculino"}, 
		{"05/27/2017", "EL CAMPESTRE", "ARMA DE FUEGO",44, "masculino"}, 
		{"09/01/2017", "EL POZON", "ARMA BLANCA",44, "femenino"},
		{"10/18/2017", "NELSON MANDELA", "ARMA DE FUEGO",44, "masculino"}, 
		{"05/18/2017", "BARRIO CHINO", "CONTUNDENTES",45, "masculino"}, 
		{"06/19/2017", "EL ESPINAL", "ARMA BLANCA",45, "masculino"}, 
		{"07/23/2017", "BOSTON", "ARMA DE FUEGO",45, "masculino"}, 
		{"02/13/2017", "FREDONIA", "ARMA DE FUEGO",46, "masculino"}, 
		{"03/28/2017", "FREDONIA", "ARMA BLANCA",46, "masculino"}, 
		{"09/27/2017", "EL PRADO", "ARMA DE FUEGO",47, "masculino"}, 
		{"11/04/2017", "SECTOR RICAURTE", "ARMA DE FUEGO",47, "masculino"}, 
		{"11/05/2017", "SECTOR 11 DE NOV", "ARMA DE FUEGO",47, "masculino"}, 
		{"11/05/2017", "EL POZON", "ARMA BLANCA",47, "masculino"}, 
		{"08/30/2017", "BOCAGRANDE", "CONTUNDENTE",48, "masculino"}, 
		{"05/21/2017", "Cto BARU", "ARMA BLANCA",50, "masculino"}, 
		
		
		
		
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
tablac4150 frame1 = new tablac4150(); 
frame1.pack(); 
frame1.setVisible(true); 
} 
}