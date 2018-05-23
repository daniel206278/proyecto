package Medellintablas;
import javax.swing.JTable; 
import javax.swing.JScrollPane; 
import javax.swing.JFrame; 
import java.awt.*; 
import java.awt.event.*;

public class tabla7180 extends JFrame {
public tabla7180() { 
super("Homicidios Medellín ordenados por el intervalo de 71-80 años");

//Array bidimensional de objetos con los datos de la tabla 
Object[][] data = { 
		{"19/09/2017", "AURES 1", "ARMA BLANCA",76, "masculino"} , 
		{"04/11/2017", "VDA.PAJARITO S.C", "CONTUNDENTES",76, "masculino"} , 
		{"20/04/2017", "LIMONAR", "ARMA BLANCA",77, "masculino"} ,
		
		
			
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