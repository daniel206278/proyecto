package cartagenatablas;


import javax.swing.JTable; 
import javax.swing.JScrollPane; 
import javax.swing.JFrame; 
import java.awt.*; 
import java.awt.event.*;

public class tablac6170 extends JFrame {

public tablac6170() { 
super("Homicidios Cartagena ordenados por el intervalom ");

//Array bidimensional de objetos con los datos de la tabla 
Object[][] data = { 
		
		{"07/29/2017", "LA CANDELARIA", "ARMA BLANCA",61, "masculino"},
		{"05/19/2017", "POLICARPA", "ARMA DE FUEGO",65, "masculino"}, 
		{"10/25/2017", "Cto PASACABALLOS", "ARMA DE FUEGO",66, "masculino"}, 
		
		
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
tablac6170 frame1 = new tablac6170(); 
frame1.pack(); 
frame1.setVisible(true); 
} 
}