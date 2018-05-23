package Medellintablas;
import javax.swing.JTable; 
import javax.swing.JScrollPane; 
import javax.swing.JFrame; 
import java.awt.*; 
import java.awt.event.*;

public class tabla4150 extends JFrame {
public tabla4150() { 
super("Homicidios Medellín ordenados por el intervalo de 41-50 años");

//Array bidimensional de objetos con los datos de la tabla 
Object[][] data = { 
		{"18/01/2017", "EL PINAL", "ARMA DE FUEGO",41, "masculino"} ,
		{"22/06/2017", "SANTA FE", "ARMA DE FUEGO",41, "masculino"},
		{"29/06/2017", "KENNEDY", "BOLSA PLASICA",41, "masculino"},
		{"04/07/2017", "LORENA", "CONTUNDENTES",41, "femenino"} , 
		{"15/07/2017", "ESTACION VILLA", "ARMA DE FUEGO",41, "masculino"} , 
		{"21/07/2017", "EL RINCON", "CONTUNDENTES",41, "masculino"} , 
		{"24/07/2017", "BELALCAZAR", "ARMA DE FUEGO",41, "masculino"} , 
		{"11/09/2017", "ESTACION VILLA", "ARMA DE FUEGO",41, "femenino"} , 
		{"25/09/2017", "VILLA TINA", "CONTUNDENTES",41, "masculino"} , 
		{"04/02/2017", "CORDOBA", "ARMA DE FUEGO",42, "masculino"} ,
		{"15/02/2017", "PRADITO", "ARMA DE FUEGO",42, "masculino"} ,
		{"18/05/2017", "LA CANDELARIA", "CINTAS/CINTURON",42, "femenino"} , 
		{"16/06/2017", "LA PRADERA S.A.P", "ARMA DE FUEGO",42, "masculino"},
		{"26/07/2017", "LA ESPERANZA", "ARMA BLANCA",42, "masculino"} , 
		{"09/10/2017", "AURES 1", "ARMA DE FUEGO",42, "masculino"} , 
		{"18/10/2017", "VSA.SAN JOSE LA LOMA", "ARMA DE FUEGO",42, "femenino"} , 
		{"01/11/2017", "LA LIBERTAD", "CONTUNDENTES",42, "masculino"} , 
		{"16/11/2017", "GUAYABAL", "ARMA DE FUEGO",42, "masculino"} ,
		{"30/11/2017", "MIRANDA", "ARMA DE FUEGO",42, "masculino"} , 
		{"07/01/2017", "ESTACION VILLA", "ARMA BLANCA",43, "masculino"} ,  
		{"09/01/2017", "KENNEDY", "ARMA BLANCA",43, "masculino"} ,
		{"01/07/2017", "LA AMERICA", "ARMA BLANCA",43, "masculino"} ,
		{"16/02/2017", "OCHO DE MARZO", "ARMA BLANCA",44, "masculino"} ,
		{"13/07/2017", "CAMPO AMOR", "ARMA DE FUEGO",44, "masculino"} , 
		{"05/08/2017", "JUAN XXIII", "ARMA DE FUEGO",44, "masculino"} ,
		{"05/11/2017", "LA COLINA", "ARMA DE FUEGO",44, "masculino"} ,
		{"18/11/2017", "VDA.SAN JOSÉ DEL MANZANILLO", "ARMA DE FUEGO",44, "masculino"} , 
		{"02/12/2017", "ESTACION VILLA", "ARMA DE FUEGO",44, "masculino"} , 
		{"17/12/2017", "NUEVA VILLA DE LA IGUANA", "BOLSA PLASTICA",44, "masculino"} , 
		{"31/01/2017", "LA FLORESTA", "ARMA DE FUEGO",45, "masculino"} ,
		{"31/01/2017", "SAN BERNARDO", "ARMA BLANCA",45, "masculino"} ,
		{"12/02/2017", "LAS BRISAS", "ARMA BLANCA",45, "masculino"} ,
		{"19/06/2017", "LA CANDELARIA", "ARMA BLANCA",45, "masculino"} , 
		{"29/06/2017", "BELENCITO", "ARMA BLANCA",45, "masculino"} , 
		{"14/07/2017", "CALLE NUEVA", "ARMA DE FUEGO",45, "masculino"} , 
		{"04/08/2017", "SANTO DOMINGO", "ARMA BLANCA",45, "masculino"} , 
		{"04/08/2017", "BUENOS AIRES", "ARMA DE FUEGO",45, "masculino"} , 
		{"12/12/2017", "SAN JOSE DE LA CIMA", "ARMA DE FUEGO",45, "masculino"} , 
		{"18/12/2017", "CERRO NUTIBARA", "ARMA BLANCA",45, "masculino"} , 
		{"22/12/2017", "GRANADA", "ARMA BLANCA",45, "masculino"} , 
		{"20/07/2017", "POPULAR 1", "CONTUNDENTES",46, "masculino"} , 
		{"14/10/2017", "JESUS NAZARENO", "ARMA DE FUEGO",46, "masculino"} , 
		{"27/10/2017", "VERSALLES", "ARMA BLANCA",46, "femenino"} , 
		{"28/12/2017", "PICAHO", "ARMA DE FUEGO",46, "masculino"} , 
		{"20/04/2017", "LA CRUZ", "ARMA BLANCA",47, "femenino"} , 
		{"23/04/2017", "LA CANDELARIA", "ARMA BLANCA",47, "masculino"} ,
		{"26/04/2017", "CARIBE", "ARMA DE FUEGO ",47, "masculino"} , 
		{"01/10/2017", "SANTA MARIA DE LOS ANGELES", "ARMA BLANCA",47, "femenino"} ,
		{"26/10/2017", "EL PESEBRE", "CONTUNDENTES",47, "masculino"} , 
		{"15/01/2017", "KENNEDY", "ARMA BLANCA",48, "masculino"}, 
		{"14/07/2017", "SAN JOAQUIN", "ARMA DE FUEGO",48, "masculino"} , 
		{"27/07/2017", "MIRANDA", "ARMA DE FUEGO",48, "masculino"} ,
		{"06/10/2017", "CERRO EL VOLADOR", "ARMA DE FUEGO",48, "masculino"} , 
		{"25/03/2017", "VDA.PAJARITO", "ARMA DE FUEGO",49, "masculino"} ,
		{"07/04/2017", "VDA.PAJARITO S.C", "ARMA DE FUEGO",49, "masculino"} ,
		{"01/10/2017", "AURES 1", "ARMA DE FUEGO",49, "masculino"} ,
		{"20/10/2017", "MANRIQUE", "ARMA BLANCA",49, "masculino"} , 
		{"03/11/2017", "ESTACION VILLA", "ARMA BLANCA",49, "masculino"} , 
		{"16/02/2017", "LA FLORESTA", "ARMA BLANCA",50, "masculino"} ,
		{"09/03/2017", "SAN PEDRO", "CONTUNDENTES",50, "femenino"} ,
		{"30/05/2017", "EL VELODROMO", "ARMA DE FUEGO",50, "masculino"} ,
		{"06/06/2017", "TRINIDAD", "CONTUNDENTES",50, "masculino"} , 
		{"17/07/2017", "GUAYABAL", "BOLSA PLASTICA",50, "masculino"} , 
		{"16/11/2017", "EL CHAGUALO", "ARMA BLANCA",50, "masculino"} , 
		{"27/12/2017", "VDA.SAN JOSE DEL MANZANILLO", "ARMA DE FUEGO",50, "masculino"} , 
		
		

		
		
		
		
			
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