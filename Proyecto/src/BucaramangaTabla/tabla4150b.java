package BucaramangaTabla;
import javax.swing.JTable; 
import javax.swing.JScrollPane; 
import javax.swing.JFrame; 
import java.awt.*; 
import java.awt.event.*;

public class tabla4150b extends JFrame {

public tabla4150b() { 
super("Homicidios Bucaramanga ordenados por el intervalo de 41 a 50 años ");

//Array bidimensional de objetos con los datos de la tabla 
Object[][] data = { 
		
		{"20/01/2017", "ALARCON", "ARMA BLANCA",41, "masculino"}, 
		{"22/02/2017", "SANTANDER", "ARMA DE FUEGO",42, "masculino"}, 
		{"03/06/2017", "TRANSICON IV", "ARMA DE FUEGO",43, "masculino"}, 
		{"09/10/2017", "CHORRERAS DE DON JUAN", "ARMA DE FUEGO",43, "masculino"}, 
		{"25/12/2017", "QUEBRADA LA IGLESIA ", "ARMA BLANCA",43, "masculino"}, 
		{"15/01/2017", "NUEVA COLOMBIA", "ARMA DE FUEGO",46, "masculino"}, 
		{"16/02/2017", "LA JUVENTUD", "ARMA DE FUEGO",46, "masculino"}, 
		{"05/03/2017", "QUINTADANIA", "ARMA DE FUEGO",46, "masculino"},
		{"08/09/2017", "ALARCON", "ARMA DE FUEGO",46, "masculino"}, 
		{"14/10/2017", "LA INDEPENDENCIA ", "ARMA DE FUEGO",47, "masculino"},
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
tabla4150b frame1 = new tabla4150b(); 
frame1.pack(); 
frame1.setVisible(true); 
} 
}