package Bogotatablas;

import javax.swing.JTable; 
import javax.swing.JScrollPane; 
import javax.swing.JFrame; 
import java.awt.*; 
import java.awt.event.*;

public class femeninoB extends JFrame {

public femeninoB() { 
super("Homicidios Bogotá ordenados por el intervalo de 71 a 80 años  ");

//Array bidimensional de objetos con los datos de la tabla 
Object[][] data = { 
		{"14/01/2017", "LA FLORA ALTA", "ARMA DE FUEGO",15, "femenino"},
		{"15/01/2017", "VENECIA", "ARMA BLANCA",20, "femenino"},
		{"17/01/2017", "LA PRADERA DE SUBA", "ARMA DE FUEGO",41, "femenino"},
		{"22/01/2017", "QUIBA", "ARMA DE FUEGO",20, "femenino"},
		{"22/01/2017", "LUCERO BAJO", "ARMA BLANCA",20, "femenino"},
		{"23/01/2017", "GRAN BRITALIA", "ARMA DE FUEGO",16, "femenino"},
		{"29/01/2017", "RESTREPO", "ARMA DE FUEGO",45, "femenino"},
		{"01/02/2017", "INGLES", "ARMA DE FUEGO",39, "femenino"},
		{"01/02/2017", "SAN CARLOS TIBUYATES", "ARMA BLANCA",25, "femenino"},
		{"01/02/2017", "URB.SAN CARLOS", "ARMA DE FUEGO",37, "femenino"},
		{"07/02/2017", "LUIS CARLOS GALAN", "ARMA BLANCA",16, "femenino"},
		{"07/02/2017", "LUIS CARLOS GALAN", "ARMA BLANCA",16, "femenino"},
		{"14/02/2017", "JERUSALEN", "ARMA DE FUEGO",47, "femenino"},
		{"16/02/2017", "PABLO SEXTO", "ARMA BLANCA",28, "femenino"},
		{"17/02/2017", "LA FAVORITA", "ARMA BLANCA",29, "femenino"},
		{"23/02/2017", "JIMENEZ DE QUESADA", "ARMA DE FUEGO",33, "femenino"},
		{"25/02/2017", "BILBAO", "ARMA DE FUEGO",21, "femenino"},
		{"03/03/2017", "SAN BERNARDO", "ARMA BLANCA",30, "femenino"},
		{"05/03/2017", "NUEVA ARGENTINA", "ARMA BLANCA",63, "femenino"},
		{"05/03/2017", "SAN JOSE ", "ARMA BLANCA",35, "femenino"},
		{"10/03/2017", "JAVA I SECTOR", "ARMA DE FUEGO",27, "femenino"},
		{"19/03/2017", "GALAN", "ARMA BLANCA",33, "femenino"},
		{"23/03/2017", "EL POA", "ARMA BLANCA",11, "femenino"},
		{"25/03/2017", "SAN FRANCISCO", "ARMA DE FUEGO",20, "femenino"},
		{"26/03/2017", "LAS CRUCES ", "ARMA DE FUEGO",33, "femenino"},
		{"01/04/2017", "RUBI ", "ARMA DE FUEGO",20, "femenino"},
		{"03/04/2017", "CENTRO USME", "ARMA DE FUEGO",61, "femenino"},
		{"04/04/2017", "LA RIVERA", "ARMA DE FUEGO",54, "femenino"},
		{"05/04/2017", "EL PORVENIR", "ARMA DE FUEGO",37, "femenino"},
		{"06/04/2017", "LA ESPERANZA", "ARMA DE FUEGO",21, "femenino"},
		{"07/04/2017", "EL ROSARIO", "ARMA DE FUEGO",56, "femenino"},
		{"10/04/2017", "VILLA DEL PRADO", "ARMA DE FUEGO",41, "femenino"},
		{"12/04/2017", "SANTA FE", "ARMA DE FUEGO",34, "femenino"},
		{"12/04/2017", "URB. LA COLINA CAMPESTRE ", "ARMA DE FUEGO",25, "femenino"},
		{"12/04/2017", "LA VICTORIA", "ARMA DE FUEGO",23, "femenino"},
		{"17/04/2017", "VILLA LUZ", "ARMA DE FUEGO",2, "femenino"},
		{"17/04/2017", "VILLA LUZ", "ARMA DE FUEGO",2, "femenino"},
		{"18/04/2017", "SAN PEDRO", "ARMA DE FUEGO",22, "femenino"},
		{"19/04/2017", "EL PORVENIR", "ARMA DE FUEGO",23, "femenino"},
		{"22/04/2017", "LA FAVORITA", "ARMA DE FUEGO",29, "femenino"},
		{"24/04/2017", "URB. CARIMAGUA I SECTOR", "ARMA DE FUEGO",24, "femenino"},
		{"25/04/2017", "URB. LA ALQUERÍA", "ARMA DE FUEGO",70, "femenino"},
		{"02/05/2017", "SAN BERNARDO", "ARMA DE FUEGO",28, "femenino"},
		{"02/05/2017", "CLASS ", "ARMA DE FUEGO",34, "femenino"},
		{"11/05/2017", "VITELMA", "ARMA BLANCA",39, "femenino"},
		{"13/05/2017", "LA PAZ", "ARMA DE FUEGO",22, "femenino"},
		{"21/05/2017", "JOSE ANTONIO GALAN", "ARMA DE FUEGO",25, "femenino"},
		{"23/05/2017", "LAS MARGARITAS", "ARMA BLANCA",35, "femenino"},
		{"28/05/2017", "EL SOCORRO", "ARMA DE FUEGO",28, "femenino"},
		{"01/06/2017", "EL LÍBANO", "ARMA BLANCA",24, "femenino"},
		{"02/06/2017", "LA RESURRECCIÓN II ", "ARMA DE FUEGO",22, "femenino"},
		{"04/06/2017", "LA ESTANZUELA", "ARMA DE FUEGO",24, "femenino"},
		{"07/06/2017", "RINCON DE BRITALIA", "ARMA DE FUEGO",21, "femenino"},
		{"14/06/2017", "SIERRA MORENA", "ARMA DE FUEGO",62, "femenino"},
		{"16/06/2017", "EL EJIDO", "ARMA DE FUEGO",55, "femenino"},
		{"17/06/2017", "CENTRO COMERCIAL ANDINO", "ARMA BLANCA",23, "femenino"},
		{"17/06/2017", "CENTRO COMERCIAL ANDINO", "ARMA BLANCA",31, "femenino"},
		{"17/06/2017", "CENTRO COMERCIAL ANDINO", "ARMA DE FUEGO",41, "femenino"},
		{"18/06/2017", "EL TESORITO", "ARMA BLANCA",33, "femenino"},
		{"21/06/2017", "URB. INDUSTRIAL PENSILVANIA", "ARMA BLANCA",20, "femenino"},
		{"22/06/2017", "LA BELLEZA", "ARMA DE FUEGO",14, "femenino"},
		{"01/07/2017", "MARCO FIDEL SUAREZ", "ARMA DE FUEGO",56, "femenino"},
		{"08/07/2017", "VOTO NACIONAL", "ARMA BLANCA",41, "femenino"},
		{"31/07/2017", "PATIO BONITO ", "ARMA BLANCA",57, "femenino"},
		{"03/08/2017", "SANTA MARTHA", "ARMA BLANCA",78, "femenino"},
		{"07/08/2017", "URB. SAN CARLOS ", "ARMA DE FUEGO",35, "femenino"},
		{"12/08/2017", "VILLA DE LA LOMA", "ARMA DE FUEGO",27, "femenino"},
		{"18/08/2017", "NACIONES UNIDAS", "ARMA BLANCA",42, "femenino"},
		{"19/08/2017", "LA ALAMEDA", "ARMA DE FUEGO",28, "femenino"},
		{"01/09/2017", "URB. INDUSTRIAL PENSILVANIA", "ARMA BLANCA",35, "femenino"},
		{"10/09/2017", "7 DE AGOSTO ", "ARMA BLANCA",32, "femenino"},
		{"13/09/2017", "EL MOCHUELO ORIENTAL", "ARMA DE FUEGO",19, "femenino"},
		{"15/09/2017", "PERDOMO ALTO ", "ARMA DE FUEGO",43, "femenino"},
		{"19/09/2017", "EL PARAISO", "ARMA BLANCA",33, "femenino"},
		{"25/09/2017", "LOS GRUPOS", "ARMA DE FUEGO",31, "femenino"},
		{"27/09/2017", "SAN FERNANDO ", "ARMA DE FUEGO",42, "femenino"},
		{"01/10/2017", "ÁLVARO BERNAL SEGURA", "ARMA BLANCA",54, "femenino"},
		{"02/10/2017", "SAN BERNARDO ", "ARMA DE FUEGO",49, "femenino"},
		{"02/10/2017", "EL LAUREL", "ARMA DE FUEGO",39, "femenino"},
		{"03/10/2017", "MEISSEN", "ARMA DE FUEGO",48, "femenino"},
		{"03/10/2017", "SAN AGUSTÍN SUR", "ARMA DE FUEGO",33, "femenino"},
		{"06/10/2017", "SAN VICTORINO", "ARMA DE FUEGO",40, "femenino"},
		{"08/10/2017", "SAN FRANCISCO", "ARMA BLANCA",30, "femenino"},
		{"08/10/2017", "VERONA", "ARMA BLANCA",32, "femenino"},
		{"11/10/2017", "SANTA FE", "ARMA BLANCA",23, "femenino"},
		{"13/10/2017", "MARIA PAZ ", "ARMA BLANCA",35, "femenino"},
		{"14/10/2017", "LA CATEDRAL", "ARMA BLANCA",74, "femenino"},
		{"21/10/2017", "LISBOA", "ARMA DE FUEGO",21, "femenino"},
		{"29/10/2017", "NUEVA COLOMBIA", "ARMA BLANCA",29, "femenino"},
		{"29/10/2017", "CALVO SUR", "ARMA DE FUEGO",22, "femenino"},
		{"08/11/2017", "LOURDES", "ARMA DE FUEGO",39, "femenino"},
		{"09/11/2017", "7 DE AGOSTO", "ARMA DE FUEGO",17, "femenino"},
		{"17/11/2017", "SANTA MARIA DEL LAGO", "ARMA DE FUEGO",46, "femenino"},
		{"19/11/2017", "PALOQUEMAO", "ARMA DE FUEGO",32, "femenino"},
		{"21/11/2017", "URB. RIVIERA REAL", "ARMA DE FUEGO",30, "femenino"},
		{"21/11/2017", "LAS AMERICAS", "ARMA DE FUEGO",36, "femenino"},
		{"04/12/2017", "URB. LA FRAGUITA", "ARMA DE FUEGO",32, "femenino"},
		{"05/12/2017", "OSPINA PÉREZ", "ARMA BLANCA",78, "femenino"},
		{"12/12/2017", "POTRERITO", "ARMA BLANCA",25, "femenino"},
		{"16/12/2017", "CIUDAD GRANADA", "ARMA BLANCA",21, "femenino"},
		{"23/12/2017", "MOLINOS DEL SUR", "ARMA DE FUEGO",17, "femenino"},
		{"26/12/2017", "ESPINOS I", "ARMA BLANCA",11, "femenino"},
		{"29/12/2017", "URB. INDUSTRIAL PENSILVANIA", "ARMA BLANCA",20, "femenino"},
		{"29/12/2017", "LA BELLEZA", "ARMA DE FUEGO",32, "femenino"},
		{"30/12/2017", "ESPINOS", "ARMA DE FUEGO",32, "femenino"},
		{"22/12/2017", "URB. CATALINA", "ARMA DE FUEGO",36, "femenino"},
		{"17/10/2017", "LOS NARANJOS", "ARMA DE FUEGO",39, "femenino"},
		
		
		
		{"26/05/2017", "SANTA LUCIA", "ARMA DE FUEGO",31, "femenino"},
		
		
		
		
		
		
		
		
		
		
		
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
femeninoB frame1 = new femeninoB(); 
frame1.pack(); 
frame1.setVisible(true); 
} 
}