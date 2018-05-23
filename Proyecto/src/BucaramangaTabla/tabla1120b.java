package BucaramangaTabla;
import javax.swing.JTable; 
import javax.swing.JScrollPane; 
import javax.swing.JFrame; 
import java.awt.*; 
import java.awt.event.*;

public class tabla1120b extends JFrame {

public tabla1120b() { 
super("Homicidios Bucaramanga ordenados por el intervalo de 11 a 20 años  ");

//Array bidimensional de objetos con los datos de la tabla 
Object[][] data = { 
		
		{"26/12/2017", "DIAMANTE I ", "ARMA BLANCA",16, "masculino"}, 
		{"06/06/2017", "ALVAREZ", "ARMA BLANCA",17, "masculino"}, 
		{"03/12/2017", "GRANADA ", "ARMA BLANCA",17, "masculino"}, 
		{"10/02/2017", "LA JUVENTUD", "ARMA DE FUEGO",18, "masculino"}, 
		{"14/07/2017", "VILLA HELENA I", "ARMA DE FUEGO",18, "masculino"}, 
		{"30/10/2017", "JOSE ANTONIO GALAN ", "ARMA DE FUEGO",18, "masculino"}, 
		{"02/09/2017", "ZARABANDA", "ARMA DE FUEGO",19, "masculino"}, 
		{"09/09/2017", "SAN FRANCISCO", "ARMA DE FUEGO",19, "masculino"}, 
		{"05/11/2017", "ALARCON ", "ARMA DE FUEGO",19, "masculino"}, 
		{"18/02/2017", "URB.MARSELLA REAL", "ARMA DE FUEGO",20, "masculino"}, 
		{"05/07/2017", "ESPERANZA II", "ARMA DE FUEGO",20, "masculino"}, 
		{"22/08/2017", "LA INDEPENDENCIA", "ARMA DE FUEGO",20, "masculino"}, 
		{"19/09/2017", "CLAVERIANO", "ARMA DE FUEGO",20, "masculino"}, 
		{"07/10/2017", "FONTANA", "ARMA DE FUEGO",20, "masculino"}, 
		{"21/10/2017", "JOSE MARIA CORDOBA ", "ARMA BLANCA",20, "masculino"}, 
		
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
tabla1120b frame1 = new tabla1120b(); 
frame1.pack(); 
frame1.setVisible(true); 
} 
}