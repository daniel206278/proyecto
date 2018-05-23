package Medellintablas;
import javax.swing.JTable; 
import javax.swing.JScrollPane; 
import javax.swing.JFrame; 
import java.awt.*; 
import java.awt.event.*;

public class tabla6170 extends JFrame {
public tabla6170() { 
super("Homicidios Medellín ordenados por el intervalo de 61-70 años");

//Array bidimensional de objetos con los datos de la tabla 
Object[][] data = { 
		{"06/05/2017", "FERRINI", "ARMA BLANCA",62, "masculino"} , 
		{"22/06/2017", "VILLANUEVA", "ARMA BLANCA",62, "masculino"} , 
		{"10/07/2017", "VDA.AGUAS FRIAS", "ARMA DE FUEGO",62, "masculino"} , 
		{"23/07/2017", "SAN DIEGO", "ARMA BLANCA",62, "masculino"} ,
		{"01/09/2017", "LA ALPUJARRA", "CONTUNDENTES",62, "masculino"} ,
		{"08/10/2017", "SAN PABLO C", "CONTUNDENTES",62, "masculino"} ,
		{"22/10/2017", "VDA. PAJARITO", "ARMA BLANCA",62, "masculino"} , 
		{"04/11/2017", "EVERFIT", "ARMA DE FUEGO",62, "masculino"} , 
		{"14/12/2017", "SANTA RITA", "ARMA DE FUEGO",62, "masculino"} ,
		{"09/08/2017", "LA GLORIA", "CONTUNDENTES",63, "masculino"} , 
		{"22/10/2017", "VILLA NUEVA", "ARMA BLANCA",63, "masculino"} , 
		{"08/05/2017", "VDA.AGUAS FRIAS", "ARMA BLANCA",64, "masculino"} , 
		{"07/10/2017", "SAN PABLO", "ARMA BLANCA",64, "femenino"} , 
		{"28/12/2017", "PALERMO", "ARMA DE FUEGO",64, "masculino"} , 
		{"23/07/2017", "BATALLON GIRARDOT", "CONTUNDENTES",65, "masculino"} , 
		{"19/10/2017", "EL VELODROMO", "ARMA BLANCA",65, "femenino"} , 
		{"27/02/2017", "SANTA CRUZ", "ARMA DE FUEGO",67, "masculino"} ,
		{"19/06/2017", "SAN JAVIER", "ARMA BLANCA",67, "masculino"} , 
		{"22/07/2017", "NARANJAL", "ARMA BLANCA",67, "masculino"} ,
		{"09/08/2017", "VILLA GUADALUPE", "ALMOHADA",67, "femenino"} , 
		{"04/09/2017", "NARANJAL", "ARMA BLANCA",67, "masculino"} , 
		{"04/03/2017", "LA PALMA", "ARMA DE FUEGO",68, "masculino"} ,
		{"19/10/2017", "EL VELODROMO", "ARMA BLANCA",70, "masculino"} , 
		
		
		
		
		
		
		
		
			
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