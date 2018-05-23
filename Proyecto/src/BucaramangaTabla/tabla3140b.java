package BucaramangaTabla;
import javax.swing.JTable; 
import javax.swing.JScrollPane; 
import javax.swing.JFrame; 
import java.awt.*; 
import java.awt.event.*;

public class tabla3140b extends JFrame {

public tabla3140b() { 
super("Homicidios Bucaramanga ordenados por el intervalo de 31 a 40 años ");

//Array bidimensional de objetos con los datos de la tabla 
Object[][] data = { 
		{"06/03/2017", "GARCIA ROVIRA", "ARMA BLANCA",31, "masculino"}, 
		
		{"21/05/2017", "SAN ALONSO", "ARMA BLANCA",31, "masculino"}, 
		{"28/07/2017", "ALARCON", "ARMA DE FUEGO",31, "masculino"}, 
		{"25/01/2017", "VILLAS DE SAN IGNACIO", "ARMA DE FUEGO",33, "masculino"}, 
		{"05/06/2017", "MIRAFLORES", "ARMA DE FUEGO",33, "masculino"}, 
		{"10/07/2017", "COMUNEROS", "ARMA DE FUEGO",33, "masculino"}, 
		{"04/08/2017", "SAN RAFAEL", "ARMA DE FUEGO",33, "masculino"}, 
		{"08/10/2017", "COLORADOS", "ARMA DE FUEGO",33, "masculino"}, 
		{"21/10/2017", "ALARCON ", "ARMA BLANCA",33, "masculino"}, 
		{"12/03/2017", "CHAPINERO", "ARMA BLANCA",34, "masculino"}, 
		{"29/04/2017", "CAFÉ MADRID", "ARMA DE FUEGO",34, "masculino"}, 
		{"25/06/2017", "LA JOYA", "ARMA DE FUEGO",34, "masculino"}, 
		{"18/05/2017", "CENTRO", "ARMA BLANCA",35, "masculino"},
		{"03/10/2017", "LAS HAMACAS", "ARMA DE FUEGO",35, "masculino"}, 
		{"05/11/2017", "GAITAN ", "ARMA BLANCA",35, "masculino"}, 
		{"31/10/2017", "CLAVERIANO  ", "ARMA DE FUEGO",36, "masculino"}, 
		{"09/04/2017", "ESPERANZA III", "ARMA DE FUEGO",37, "masculino"}, 
		{"07/05/2017", "CHAPINERO", "CONTUNDENTES",37, "masculino"}, 
		{"25/09/2017", "ALFONSO LOPEZ", "ARMA DE FUEGO",37, "masculino"}, 
		{"02/02/2017", "OLAS II", "ARMA DE FUEGO",39, "masculino"}, 
		{"14/04/2017", "TRANSICION IV", "ARMA DE FUEGO",39, "masculino"}, 
		{"26/02/2017", "GIRARDOT", "ARMA DE FUEGO",40, "masculino"}, 
		{"27/09/2017", "VILLA ROMERO", "ARMA DE FUEGO",40, "femenino"}, 
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
tabla3140b frame1 = new tabla3140b(); 
frame1.pack(); 
frame1.setVisible(true); 
} 
}