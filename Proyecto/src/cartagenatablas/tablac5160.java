package cartagenatablas;


import javax.swing.JTable; 
import javax.swing.JScrollPane; 
import javax.swing.JFrame; 
import java.awt.*; 
import java.awt.event.*;

public class tablac5160 extends JFrame {

public tablac5160() { 
super("Homicidios Cartagena ordenados por el intervalom 51-60");

//Array bidimensional de objetos con los datos de la tabla 
Object[][] data = { 
		{"06/14/2017", "ZARAGOCILLA", "ARMA DE FUEGO",52, "masculino"}, 
		{"09/14/2017", "POLICARPA", "ARMA DE FUEGO",52, "masculino"}, 
		{"12/07/2017", "BLAS DE LEZO", "ARMA DE FUEGO",52, "masculino"}, 
		{"03/17/2017", "EL RECREO", "ARMA DE FUEGO",55, "masculino"}, 
		{"12/03/2017", "MEMBRILLAL", "ARMA DE FUEGO",56, "masculino"}, 
		{"07/04/2017", "SAN FERNANDO", "ARMA BLANCA",57, "masculino"}, 
		{"02/06/2017", "FREDONIA", "ARMA DE FUEGO",59, "masculino"}, 
		{"03/08/2017", "BAZURTO", "ARMA DE FUEGO",59, "masculino"},
		{"01/26/2017", "AMBERES", "ARMA DE FUEGO",60, "masculino"}, 
		
		
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
tablac5160 frame1 = new tablac5160(); 
frame1.pack(); 
frame1.setVisible(true); 
} 
}