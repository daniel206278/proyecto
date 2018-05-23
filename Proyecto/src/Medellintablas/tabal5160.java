package Medellintablas;
import javax.swing.JTable; 
import javax.swing.JScrollPane; 
import javax.swing.JFrame; 
import java.awt.*; 
import java.awt.event.*;

public class tabal5160 extends JFrame {
public tabal5160() { 
super("Homicidios Medellín ordenados por el intervalo de 51-60 años");

//Array bidimensional de objetos con los datos de la tabla 
Object[][] data = { 
		{"26/06/2017", "HOSPITAL SAN VICENTE DE PAUL", "CONTUNDENTES",51, "femenino"},
		{"18/07/2017", "BARRIO COLON", "ARMA DE FUEGO",51, "masculino"} , 
		{"02/08/2017", "CORAZON DE JESUS", "ARMA BLANCA",51, "masculino"} , 
		{"08/08/2017", "VILLA TINA", "ARMA BLANCA",51, "femenino"} , 
		{"02/11/2017", "SAN GERMAN", "ARMA DE FUEGO",51, "masculino"} , 
		{"09/03/2017", "LOS COLORES", "ARMA DE FUEGO",52, "masculino"} ,
		{"20/04/2017", "TRINIDAD", "ARMA DE FUEGO ",52, "masculino"} ,
		{"14/07/2017", "VDA.LA GABRIELA", "ARMA DE FUEGO",52, "masculino"} , 
		{"10/08/2017", "ALTAVISTA", "ARMA DE FUEGO",52, "masculino"} , 
		{"14/08/2017", "LA MILAGROSA", "ARMA DE FUEGO",52, "masculino"} , 
		{"22/12/2017", "VDA. LA URQUITA", "ARMA BLANCA",52, "masculino"} ,
		{"26/01/2017", "TRINIDAD", "ARMA DE FUEGO",54, "masculino"} ,
		{"07/02/2017", "CASTILLA", "ARMA BLANCA",54, "masculino"},
		{"18/02/2017", "PICACHO", "ARMA DE FUEGO",54, "masculino"} ,
		{"13/04/2017", "ORIENTE", "ARMA BLANCA",54, "masculino"} ,
		{"17/05/2017", "LA CANDELARIA", "ARMA DE FUEGO",54, "masculino"} , 
		{"01/11/2017", "ESTACION VILLA", "ARMA BLANCA",54, "masculino"} ,
		{"10/08/2017", "BRASILIA", "CONTUNDENTES",55, "masculino"} , 
		{"20/08/2017", "BARRIOS DE JESUS", "CONTUNDENTES",55, "masculino"} , 
		{"01/10/2017", "VDA.LA VERDE", "CONTUNDENTES",55, "masculino"} , 
		{"03/02/2017", "SANTA CECILIA", "ARMA DE FUEGO",56, "masculino"} ,
		{"13/02/2017", "BOSTON", "CONTUNDENTES",56, "masculino"} ,
		{"19/02/2017", "LAS INDEPENDENCIAS", "CONTUNDENTES",56, "masculino"} ,
		{"23/02/2017", "CONQUISTADORES", "ARMA BLANCA",56, "masculino"} ,
		{"01/11/2017", "PRADO", "ARMA BLANCA",56, "masculino"} , 
		{"06/04/2017", "LA PALMA", "ARMA DE FUEGO",57, "femenino"} ,
		{"25/09/2017", "LIMONAR", "ARMA DE FUEGO",57, "masculino"} , 
		{"13/10/2017", "URB.ROSALEDA", "ARMA BLANCA",58, "femenino"} , 
		{"16/10/2017", "BETANIA", "ARMA BLANCA",58, "masculino"} , 
		{"30/10/2017", "VDA.SAN JOSÉ DEL MANZANILLO", "ARMA DE FUEGO",58, "masculino"} , 
		{"03/04/2017", "SAN BENITO", "ARMA DE FUEGO",59, "femenino"} ,
		{"24/05/2017", "SAN MIGUEL", "ARMA BLANCA",59, "masculino"} ,
		{"31/12/2017", "LALINDE", "ARMA BLANCA",59, "femenino"} , 
		{"10/04/2017", "EL CORAZON", "CUERDA/SOGA",60, "masculino"} ,
		{"27/06/2017", "LA PALMA", "ARMA DE FUEGO ",60, "femenino"} , 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
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