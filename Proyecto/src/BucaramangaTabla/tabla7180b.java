package BucaramangaTabla;
import javax.swing.JTable; 
import javax.swing.JScrollPane; 
import javax.swing.JFrame; 
import java.awt.*; 
import java.awt.event.*;

public class tabla7180b extends JFrame {

public tabla7180b() { 
super("Homicidios Bucaramanga ordenados por el intervalo de 71 a 80 años  ");

//Array bidimensional de objetos con los datos de la tabla 
Object[][] data = { 
		{"20/12/2017", "ALFONSO LOPEZ ", "CONTUNDENTES",72, "masculino"}, 
		
		
		
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
tabla7180b frame1 = new tabla7180b(); 
frame1.pack(); 
frame1.setVisible(true); 
} 
}