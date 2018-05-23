package Bogotatablas;


import javax.swing.JTable; 
import javax.swing.JScrollPane; 
import javax.swing.JFrame; 
import java.awt.*; 
import java.awt.event.*;

public class tabla2130B extends JFrame {

public tabla2130B() { 
super("Homicidios Bucaramanga ordenados por el intervalo de 0 a 10 años ");

//Array bidimensional de objetos con los datos de la tabla 
Object[][] data = { 
		{"08/01/2017", "LA PLAYA", "ARMA DE FUEGO",21, "masculino"},
		{"12/01/2017", "PUERTO AL LLANO", "ARMA DE FUEGO",21, "masculino"},
		{"15/01/2017", "VERBENAL", "ARMA BLANCA",21, "masculino"},
		{"22/01/2017", "GRAN BRITALIA", "ARMA DE FUEGO",21, "masculino"},
		{"14/02/2017", "LA MARICHUELA", "ARMA BLANCA",21, "masculino"},
		{"23/02/2017", "LAS COLINAS", "ARMA DE FUEGO",21, "masculino"},
		{"25/02/2017", "BILBAO", "ARMA DE FUEGO",21, "femenino"},
		{"01/03/2017", "LAS FERIAS", "ARMA DE FUEGO",21, "masculino"},
		{"10/03/2017", "URB. LA CORUÑA", "ARMA DE FUEGO",21, "masculino"},
		{"12/03/2017", "VILLA DEL RIO", "ARMA DE FUEGO",21, "masculino"},
		{"19/03/2017", "ARBORIZADORA ALTA", "ARMA DE FUEGO",21, "masculino"},
		{"22/03/2017", "BILBAO", "ARMA DE FUEGO",21, "masculino"},
		{"23/03/2017", "URB. COSTA AZUL I Y II ETAPA", "ARMA DE FUEGO",21, "masculino"},
		{"28/03/2017", "URB. GRANJAS DE SAN PABLO", "ARMA BLANCA",21, "masculino"},
		{"06/04/2017", "LA ESPERANZA", "ARMA DE FUEGO",21, "femenino"},
		{"22/04/2017", "LA PAZ", "ARMA DE FUEGO",21, "masculino"},
		{"30/04/2017", "URB. MANUELA BELTRÁN", "ARMA BLANCA",21, "masculino"},
		{"29/05/2017", "EL PARAÍSO", "ARMA BLANCA",21, "masculino"},
		{"02/06/2017", "LAS COLINAS", "ARMA BLANCA",21, "masculino"},
		{"03/06/2017", "JUAN XXIII", "ARMA DE FUEGO",21, "masculino"},
		{"07/06/2017", "RINCON DE BRITALIA", "ARMA DE FUEGO",21, "femenino"},
		{"18/06/2017", "LUCERO BAJO", "ARMA BLANCA",21, "masculino"},
		{"02/07/2017", "LA ESPERANZA ", "ARMA DE FUEGO",21, "masculino"},
		{"08/07/2017", "VILLA CLEMENCIA SECTOR TIERRA GRATA", "ARMA BLANCA",21, "masculino"},
		{"11/07/2017", "REPUBLICA DE CANADA", "ARMA DE FUEGO",21, "masculino"},
		{"21/07/2017", "ARBOLEDA LA CAMPIÑA", "ARMA DE FUEGO",21, "masculino"},
		{"24/07/2017", "ARBORIZADORA ALTA", "ARMA DE FUEGO",21, "masculino"},
		{"28/07/2017", "EL TUNAL", "ARMA DE FUEGO",21, "masculino"},
		{"30/07/2017", "EL TESORO", "ARMA BLANCA",21, "masculino"},
		{"31/07/2017", "LA COLMENA", "ARMA DE FUEGO",21, "masculino"},
		{"04/08/2017", "LA URBA", "ARMA DE FUEGO",21, "masculino"},
		{"04/08/2017", "EL CORZO", "ARMA DE FUEGO",21, "masculino"},
		{"20/08/2017", "FLORIDA BLANCA", "ARMA DE FUEGO",21, "masculino"},
		{"01/09/2017", "PIAMONTE", "ARMA BLANCA",21, "masculino"},
		{"14/09/2017", "DIANA TURBAY", "ARMA DE FUEGO",21, "masculino"},
		{"15/09/2017", "PRÍNCIPE DE BOCHICA", "ARMA DE FUEGO",21, "masculino"},
		{"17/09/2017", "DIANA TURBAY", "ARMA BLANCA",21, "masculino"},
		{"28/09/2017", "BELLAVISTA", "ARMA DE FUEGO",21, "masculino"},
		{"01/10/2017", "BUENA VISTA", "ARMA DE FUEGO",21, "masculino"},
		{"21/10/2017", "LISBOA", "ARMA DE FUEGO",21, "femenino"},
		{"04/11/2017", "RINCON DE BRITALIA", "ARMA DE FUEGO",21, "masculino"},
		{"05/11/2017", "LAS VEGAS BOSA", "ARMA BLANCA",21, "masculino"},
		{"05/11/2017", "LA AURORA I SECTOR ", "ARMA BLANCA",21, "masculino"},
		{"12/11/2017", "SANTA RITA", "ARMA DE FUEGO",21, "masculino"},
		{"12/11/2017", "SAN VICENTE FERRER", "ARMA DE FUEGO",21, "masculino"},
		{"03/12/2017", "EL AMPARO", "ARMA DE FUEGO",21, "masculino"},
		{"06/12/2017", "BUENA VISTA", "ARMA DE FUEGO",21, "masculino"},
		{"08/12/2017", "ARBORIZADORA ALTA", "ARMA DE FUEGO",21, "masculino"},
		{"08/12/2017", "LAS CRUCES", "ARMA DE FUEGO",21, "masculino"},
		{"10/12/2017", "NUEVA ARGENTINA", "ARMA BLANCA",21, "masculino"},
		{"16/12/2017", "CIUDAD GRANADA", "ARMA BLANCA",21, "femenino"},
		{"25/12/2017", "LA FLORIDA IV SECTOR", "ARMA DE FUEGO",21, "masculino"},
		{"29/12/2017", "URB. COSTA AZUL I Y II ETAPA", "ARMA DE FUEGO",21, "masculino"},
		{"01/01/2017", "ALAMEDA SUR", "ARMA DE FUEGO",22, "masculino"},
		{"14/01/2017", "VILLA DEL RINCON", "ARMA DE FUEGO",22, "masculino"},
		{"15/01/2017", "VOTO NACIONAL", "ARMA BLANCA",22, "masculino"},
		{"19/02/2017", "LOS ALMENDROS", "ARMA DE FUEGO",22, "masculino"},
		{"26/02/2017", "SANTA ROSA DE LIMA", "ARMA DE FUEGO",22, "masculino"},
		{"05/03/2017", "MIRADOR DE LA ESTANCIA ", "ARMA DE FUEGO",22, "masculino"},
		{"18/03/2017", "LA GLORIA ", "ARMA DE FUEGO",22, "masculino"},
		{"18/03/2017", "SAN JOSÉ OBRERO", "ARMA BLANCA",22, "masculino"},
		{"07/04/2017", "MARANDU", "ARMA DE FUEGO",22, "masculino"},
		{"18/04/2017", "SAN PEDRO", "ARMA DE FUEGO",22, "femenino"},
		{"23/04/2017", "LA FLORIDA", "ARMA DE FUEGO",22, "masculino"},
		{"10/05/2017", "EL PORTAL", "ARMA DE FUEGO",22, "masculino"},
		{"13/05/2017", "LA PAZ", "ARMA DE FUEGO",22, "femenino"},
		{"29/05/2017", "EL PARAÍSO", "ARMA DE FUEGO",22, "masculino"},
		{"29/05/2017", "EL PARAÍSO", "ARMA DE FUEGO",22, "masculino"},
		{"03/06/2017", "SAN ISIDRO SUR", "ARMA DE FUEGO",22, "masculino"},
		{"04/06/2017", "PORVENIR LA CONCEPCIÓN", "ARMA BLANCA",22, "masculino"},
		{"08/06/2017", "URB. RIONEGRO", "ARMA BLANCA",22, "masculino"},
		{"26/06/2017", "EL AMPARO ", "ARMA DE FUEGO",22, "masculino"},
		{"30/06/2017", "ALCALÁ", "ARMA DE FUEGO",22, "masculino"},
		{"02/07/2017", "SAN DIEGO BOSA", "ARMA BLANCA",22, "masculino"},
		{"03/07/2017", "ALTOS DE JALISCO", "ARMA DE FUEGO",22, "masculino"},
		{"13/07/2017", "SIMON BOLIVAR", "ARMA DE FUEGO",22, "masculino"},
		{"16/07/2017", "VILLA EMMA", "ARMA DE FUEGO",22, "masculino"},
		{"19/08/2017", "DIANA TURBAY", "ARMA DE FUEGO",22, "masculino"},
		{"03/09/2017", "LAS NIEVES", "ARMA BLANCA",22, "masculino"},
		{"04/09/2017", "SANTA FE", "ARMA DE FUEGO",22, "masculino"},
		{"16/09/2017", "VILLEMAR SUPERPLAST", "ARMA DE FUEGO",22, "masculino"},
		{"08/10/2017", "VILLA DIANA", "ARMA DE FUEGO",22, "masculino"},
		{"16/10/2017", "VILLA CINDY", "ARMA BLANCA",22, "masculino"},
		{"29/10/2017", "CALVO SUR", "ARMA DE FUEGO",22, "femenino"},
		{"29/10/2017", "CEDRITOS SUR", "ARMA DE FUEGO",22, "masculino"},
		{"02/11/2017", "ARABIA", "ARMA BLANCA",22, "masculino"},
		{"10/11/2017", "ACACIAS SUR", "ARMA BLANCA",22, "masculino"},
		{"13/11/2017", "CARACOL", "ARMA DE FUEGO",22, "masculino"},
		{"19/11/2017", "ARBORIZADORA ALTA", "ARMA BLANCA",22, "masculino"},
		{"04/12/2017", "EL PINO ", "ARMA BLANCA",22, "masculino"},
		{"08/12/2017", "NUEVA DELLY", "ARMA BLANCA",22, "masculino"},
		{"17/12/2017", "ALAMOS SUR", "ARMA DE FUEGO",22, "masculino"},
		{"24/12/2017", "EL CARMELO", "ARMA DE FUEGO",22, "masculino"},
		{"26/12/2017", "VISTA HERMOSA", "ARMA DE FUEGO",22, "masculino"},
		{"09/01/2017", "EL TANQUE", "ARMA BLANCA",25, "masculino"},
		{"09/01/2017", "POTOSI", "ARMA DE FUEGO",23, "masculino"},
		{"09/01/2017", "POTOSI", "ARMA DE FUEGO",28, "masculino"},
		{"08/01/2017", "TURINGIA", "ARMA DE FUEGO",24, "masculino"},
		{"07/01/2017", "PATIO BONITO", "ARMA BLANCA",27, "masculino"},
		{"12/01/2017", "EL AMPARO", "ARMA BLANCA",25, "masculino"},
		{"12/01/2017", "CARVAJAL", "ARMA DE FUEGO",25, "masculino"},
		{"14/01/2017", "TOCAIMITA SUR", "ARMA DE FUEGO",26, "masculino"},
		{"19/01/2017", "EL PALMAR", "ARMA DE FUEGO",28, "masculino"},
		{"18/01/2017", "LAS CRUCES", "ARMA BLANCA",26, "masculino"},
		{"18/01/2017", "LA CONCORDIA", "ARMA DE FUEGO",25, "masculino"},
		{"24/01/2017", "TINTALITO", "ARMA DE FUEGO",28, "masculino"},
		{"27/01/2017", "LAS DELICIAS", "ARMA DE FUEGO",23, "masculino"},
		{"28/01/2017", "SABANAS DEL DORADO", "ARMA BLANCA",25, "masculino"},
		{"29/01/2017", "LUCERO MEDIO", "ARMA BLANCA",24, "masculino"},
		{"29/01/2017", "URB.ELTEJAR", "ARMA BLANCA",23, "masculino"},
		{"01/02/2017", "SAN CARLOS TIBUYATES", "ARMA BLANCA",25, "femenino"},
		{"01/02/2017", "PUERTA AL LLANO", "ARMA DE FUEGO",26, "masculino"},
		{"03/02/2017", "LA REGADERA SUR", "ARMA BLANCA",23, "masculino"},
		{"04/02/2017", "EL DORADO", "ARMA DE FUEGO",26, "masculino"},
		{"04/02/2017", "VEINTE DE JULIO", "ARMA BLANCA",27, "masculino"},
		{"05/02/2017", "EL PARAISO", "ARMA DE FUEGO",28, "masculino"},
		{"05/02/2017", "SANTO DOMINGO", "ARMA BLANCA",24, "masculino"},
		{"06/02/2017", "SAN FRANCISCO", "ARMA BLANCA",23, "masculino"},
		{"07/02/2017", "BOYACA REAL", "ARMA BLANCA",26, "masculino"},
		{"08/02/2017", "ALFONSO LOPEZ SECTOR CHARALA", "ARMA DE FUEGO",29, "masculino"},
		{"08/02/2017", "ALFONSO LOPEZ SECTOR CHARALA", "ARMA DE FUEGO",29, "masculino"},
		{"13/02/2017", "CLASS", "ARMA BLANCA",23, "masculino"},
		{"15/02/2017", "SANTA RITA", "ARMA DE FUEGO",27, "masculino"},
		{"15/02/2017", "POLICARPA SALAVARRIETA", "ARMA DE FUEGO",23, "masculino"},
		{"16/02/2017", "PABLO SEXTO", "ARMA BLANCA",28, "femenino"},
		{"17/02/2017", "LA FAVORITA", "ARMA BLANCA",29, "femenino"},
		{"19/02/2017", "LA RIVERA", "ARMA BLANCA",25, "masculino"},
		{"19/02/2017", "ALSACIA", "ARMA BLANCA",24, "masculino"},
		{"19/02/2017", "LA MACARENA", "ARMA DE FUEGO",23, "masculino"},

		{"22/02/2017", "VILLAS EL DIAMANTE", "ARMA DE FUEGO",28, "masculino"},

		{"04/04/2017", "ESTACION VILLA", "ARMA DE FUEGO",23, "masculino"} ,
		{"04/04/2017", "PALO BLANCO", "ARMA BLANCA ",27, "masculino"} ,
		{"04/04/2017", "BUENOS AIRES", "ARMA DE FUEGO",25, "masculino"} ,
		{"06/04/2017", "SAN BERNARDO", "ARMA DE FUEGO",21, "masculino"} ,
		{"21/04/2017", "LIMONAR","ARMA BLANCA",23, "masculino"} ,
		{"21/04/2017", "BELALCAZAR", "CONTUNDENTES",27, "masculino"} ,
		{"22/02/2017", "VILLAS EL DIAMANTE", "ARMA DE FUEGO",28, "masculino"},
		
		
		
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
tabla2130B frame1 = new tabla2130B(); 
frame1.pack(); 
frame1.setVisible(true); 
} 
}