package BucaramangaTabla;
import javax.swing.JTable; 
import javax.swing.JScrollPane; 
import javax.swing.JFrame; 
import java.awt.*; 
import java.awt.event.*;

public class tabla5160b extends JFrame {

public tabla5160b() { 
super("Homicidios Bucaramanga ordenados por el intervalo de 51 a 60 años ");

//Array bidimensional de objetos con los datos de la tabla 
Object[][] data = { 
		{"06/02/2017", "VDA.EL NOGAL(COLORADOS)", "ARMA BLANCA",52, "masculino"}, 
		{"11/12/2017", "CIUDAD VENECIA ", "ARMA BLANCA",53, "masculino"}, 
		{"15/09/2017", "CENTRO", "ARMA DE FUEGO",60, "femenino"}, 
		
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
tabla5160b frame1 = new tabla5160b(); 
frame1.pack(); 
frame1.setVisible(true); 
} 
}