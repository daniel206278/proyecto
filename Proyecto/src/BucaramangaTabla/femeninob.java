package BucaramangaTabla;




import javax.swing.JTable; 
import javax.swing.JScrollPane; 
import javax.swing.JFrame; 
import java.awt.*; 
import java.awt.event.*;

public class femeninob extends JFrame {

public femeninob() { 
super("Homicidios Bucaramanga ordenados por sexo femenino");

//Array bidimensional de objetos con los datos de la tabla 
Object[][] data = { 
		{"22/01/2017", "ALFONSO LOPEZ", "ARMA DE FUEGO",23, "femenino"}, 
		{"28/01/2017", "LA INDEPENDENCIA", "ARMA DE FUEGO",30, "femenino"}, 
		{"04/03/2017", "OLAS II", "ARMA DE FUEGO",78, "femenino"}, 
		{"02/06/2017", "QUINTA ESTRELLA", "VENENO",6, "femenino"}, 
		{"01/07/2017", "CENTRO", "CONTUNDENTES",25, "femenino"}, 
		{"09/07/2017", "KENNEDY", "ARMA DE FUEGO",21, "femenino"}, 
		{"15/09/2017", "CENTRO", "ARMA DE FUEGO",60, "femenino"}, 
		{"27/09/2017", "VILLA ROMERO", "ARMA DE FUEGO",40, "femenino"}, 
		{"26/11/2017", "COLORADOS ", "ARMA BLANCA",28, "femenino"}, 
		
		
		
		
		
		
		
		
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
femeninob frame1 = new femeninob(); 
frame1.pack(); 
frame1.setVisible(true); 
} 
}