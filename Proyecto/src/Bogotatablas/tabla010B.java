package Bogotatablas;


import javax.swing.JTable; 
import javax.swing.JScrollPane; 
import javax.swing.JFrame; 
import java.awt.*; 
import java.awt.event.*;

public class tabla010B extends JFrame {

public tabla010B() { 
super("Homicidios Bucaramanga ordenados por el intervalo de 0 a 10 años ");

//Array bidimensional de objetos con los datos de la tabla 
Object[][] data = { 
		{"04/11/2017", "SAN PABLO", "ARMA BLANCA",1, "masculino"},
		{"17/04/2017", "VILLA LUZ", "ARMA DE FUEGO",2, "femenino"},
		{"13/07/2017", "MARIA PAZ", "ARMA DE FUEGO",4, "masculino"},
		{"14/01/2017", "SAN ISIDRO", "ARMA DE FUEGO",6, "masculino"},
		{"10/03/2017", "JAVA I SECTOR", "ARMA DE FUEGO",6, "masculino"},
		{"15/12/2017", "BOITA ", "ARMA DE FUEGO",7, "masculino"},
		{"26/05/2017", "RINCÓN DE BOYACÁ", "ARMA DE FUEGO",8, "masculino"},
		{"24/10/2017", "EL JARDÍN", "ARMA BLANCA",8, "masculino"},
		
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
tabla010B frame1 = new tabla010B(); 
frame1.pack(); 
frame1.setVisible(true); 
} 
}