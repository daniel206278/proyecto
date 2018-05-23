package Medellintablas;
import javax.swing.JTable; 
import javax.swing.JScrollPane; 
import javax.swing.JFrame; 
import java.awt.*; 
import java.awt.event.*;

public class tabla010 extends JFrame {

public tabla010() { 
super("Homicidios Medellín ordenados por el intervalo de 0-10 años");

//Array bidimensional de objetos con los datos de la tabla 
Object[][] data = { 
	{"15/09/2017", "CRISTO REY", "CONTUNDENTES",2, "masculino"} ,
	{"01/01/2017", "LA PILARICA", "CONTUNDENTES",4,"masculino"},  
	{"05/02/2017", "LA AURORA", "ARMA BLANCA",10, "masculino"} ,
	{"23/04/2017", "EL PESEBRE", "ARMA DE FUEGO",10, "masculino"} , 
	{"27/07/2017", "BELLO HORIZONTE", "ARMA DE FUEGO",14, "masculino"} , 
	

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
SimpleTable2 frame = new SimpleTable2(); 
frame.pack(); 
frame.setVisible(true); 
} 
}
