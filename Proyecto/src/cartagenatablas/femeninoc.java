package cartagenatablas;


import javax.swing.JTable; 
import javax.swing.JScrollPane; 
import javax.swing.JFrame; 
import java.awt.*; 
import java.awt.event.*;

public class femeninoc extends JFrame {

public femeninoc() { 
super("Homicidios Cartagena ordenados por el intervalom 11-20");

//Array bidimensional de objetos con los datos de la tabla 
Object[][] data = { 
		{"01/18/2017", "LA CONSOLATA", "ARMA BLANCA",19, "femenino"}, 
		{"03/26/2017", "TORICES", "ARMA BLANCA",28, "femenino"}, 
		{"07/13/2017", "NUEVA PARAISO", "ARMA DE FUEGO",33, "femenino"}, 
		{"09/01/2017", "EL POZON", "ARMA BLANCA",44, "femenino"},
		{"12/02/2017", "TERNERA", "ARMA BLANCA",26, "femenino"},
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
femeninoc frame1 = new femeninoc(); 
frame1.pack(); 
frame1.setVisible(true); 
} 
}