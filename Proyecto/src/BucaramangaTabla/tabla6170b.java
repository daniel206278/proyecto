package BucaramangaTabla;
import javax.swing.JTable; 
import javax.swing.JScrollPane; 
import javax.swing.JFrame; 
import java.awt.*; 
import java.awt.event.*;

public class tabla6170b extends JFrame {

public tabla6170b() { 
super("Homicidios Bucaramanga ordenados por el intervalo de 61 a 70 años ");

//Array bidimensional de objetos con los datos de la tabla 
Object[][] data = { 
		{"22/01/2017", "TRANSICION II", "ARMA BLANCA",61, "masculino"}, 
		{"02/07/2017", "BOLIVAR", "ARMA BLANCA",67, "masculino"},
		
		
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
tabla6170b frame1 = new tabla6170b(); 
frame1.pack(); 
frame1.setVisible(true); 
} 
}