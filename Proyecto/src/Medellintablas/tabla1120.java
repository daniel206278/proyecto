package Medellintablas;
import javax.swing.JTable; 
import javax.swing.JScrollPane; 
import javax.swing.JFrame; 
import java.awt.*; 
import java.awt.event.*;

public class tabla1120 extends JFrame {

public tabla1120() { 
super("Homicidios Medellín ordenados por el intervalo de 11-20 años");

//Array bidimensional de objetos con los datos de la tabla 
Object[][] data = { 
	{"18/03/2017", "SAN JAVIER 1", "ARMA DE FUEGO",13, "femenino"} ,
	{"23/04/2017", "EL PESEBRE", "ARMA DE FUEGO",13, "masculino"} ,
	{"05/08/2017", "PAJARITO", "ARMA DE FUEGO",13, "masculino"} , 
	{"31/12/2017", "AURES 2", "ARMA DE FUEGO",13, "masculino"} , 
	{"07/06/2017", "VDA. AGUAS FRIAS", "ARMA DE FUEGO",14, "femenino"} , 
	{"08/12/2017", "AURES 2", "ARMA DE FUEGO",14, "masculino"} ,
	{"27/07/2017", "BELLO HORIZONTE", "ARMA DE FUEGO",14, "masculino"} , 
	{"12/03/2017", "ORIENTE", "ARMA DE FUEGO",15, " masculino "} ,
	{"22/04/2017", "SAN ISIDRO", "ARMA BLANCA",15, "femenino"} ,
	{"23/05/2017", "LA CAPILLA", "ARMA DE FUEGO",15, "masculino"} , 
	{"18/06/2017", "VILLA LILLIAN", "ARMA DE FUEGO",15, "femenino"} , 
	{"03/07/2017", "VDA.PAJARITO", "ARMA DE FUEGO",15, "masculino"} , 
	{"10/10/2017", "BETANIA", "ARMA DE FUEGO",15, "masculino"} , 
	{"29/11/2017", "ESTACION VILLA", "ARMA DE FUEGO",15, "masculino"} , 
	{"29/11/2017", "VDA. BELLAVISTA S.C", "ARMA DE FUEGO",15, "masculino"} ,
	{"05/02/2017", "LA AURORA", "ARMA BLANCA",16, "masculino"} ,
	{"05/03/2017", "VDA.LA GABRIELA", "ARMA DE FUEGO",16, "masculino"} ,
	{"24/05/2017", "AURES 1", "ARMA DE FUEGO",16, "masculino"} , 
	{"24/06/2017", "PRADO", "ARMA DE FUEGO",16, "masculino"} , 
	{"05/08/2017", "TOSCANA", "ARMA DE FUEGO",16, "masculino"} , 
	{"25/05/2017", "SAN BENITO", "ARMA DE FUEGO",17, "femenino"} , 
	{"05/06/2017", "ALTAVISTA", "ARMA DE FUEGO",17, "masculino"} , 
	{"08/07/2017", "ESTACION VILLA", "ARMA DE FUEGO",17, "femenino"} , 
	{"16/07/2017", "MORAVIA", "ARMA BLANCA",17, "masculino"} , 
	{"26/08/2017", "VDA.SAN PEDRO LA LOMA", "ARMA DE FUEGO",17, "masculino"} ,
	{"26/09/2017", "GIRARDOT", "ARMA DE FUEGO",17, "masculino"} ,
	{"06/10/2017", "ALTAVISTA", "ARMA DE FUEGO",17, "masculino"} , 
	{"12/10/2017", "ESTACION VILLA", "CONTUNDENTES",17, "femenino"} , 
	{"14/10/2017", "LAS PALMAS", "ARMA BLANCA",17, "masculino"} , 
	{"04/11/2017", "EL CUCARACHO", "ARMA DE FUEGO",17, "masculino"} , 
	{"08/11/2017", "LAS INDEPENDENCIAS", "ARMA DE FUEGO",17, "masculino"} ,
	{"09/12/2017", "CALLE NUEVA", "ARMA BLANCA",17, "masculino"} , 
	{"14/12/2017", "VDA. LA GABRIELA", "ARMA DE FUEGO",17, "masculino"} , 
	{"09/02/2017", "EL DIAMANTE", "ARMA DE FUEGO",17, "masculino"} ,
	{"24/02/2017", "CERRO EL VOLADOR", "ARMA DE FUEGO",17, "masculino"} ,
	{"28/02/2017", "SAN JAVIER", "ARMA DE FUEGO",17, "masculino"} ,
	{"13/03/2017", "MONTECLARO", "ARMA DE FUEGO",17, "masculino"} ,
	{"28/03/2017", "VDA EL PICACHO", "ARMA DE FUEGO",17, "masculino"} ,
	{"29/03/2017", "ALDEA PABLO VI", "CUERDA/CADENA",17, "femenino"} ,
	{"14/05/2017", "ESTACION VILLA", "ARMA BLANCA",17, "femenino"} , 
	{"07/06/2017", "VDA.AGUAS FRIAS", "ARMA DE FUEGO",18, "masculino"} , 
	{"10/06/2017", "POPULAR", "ARMA BLANCA",18, "masculino"} , 
	{"18/07/2017", "AURES", "ARMA DE FUEGO",18, "masculino"} , 
	{"19/07/2017", "EL DIAMANTE", "ARMA DE FUEGO",18, "masculino"} , 
	{"05/08/2017", "EL CHAGUALO", "ARMA BLANCA",18, "masculino"} , 
	{"17/09/2017", "ENCISO", "ARMA BLANCA",18, "masculino"} , 
	{"23/09/2017", "ESCOBAR S.A.P", "ARMA DE FUEGO",18, "masculino"} , 
	{"21/10/2017", "VILLA NUEVA", "ARMA BLANCA",18, "masculino"} , 
	{"09/11/2017", "FLORENCIA", "ARMA DE FUEGO",18, "masculino"} , 
	{"27/01/2017", "VDA.LA ILUSION", "ARMA DE FUEGO",18, "masculino"} ,
	{"03/02/2017", "FLORENCIA", "ARMA DE FUEGO",18, "femenino"} ,
	{"20/02/2017", "VIA AL MAR", "ARMA DE FUEGO",18, "masculino"} ,
	{"29/04/2017", "AURES", "ARMA DE FUEGO ",18, "masculino"} ,
	{"30/04/2017", "BLANQUIZAL", "ARMA BLANCA",18, "masculino"} ,
	{"04/01/2017", "ALTAVISTA", "ARMA DE FUEGO",19, "masculino"} ,
	{"20/01/2017", "VDA.SAN JOSE DE LA LOMA", "ARMA DE FUEGO",19, "masculino"} ,
	{"20/01/2017", "LA HONDONADA", "ARMA DE FUEGO",19, "masculino"} ,
	{"23/01/2017", "LA MOTA", "ARMA BLANCA",19, "masculino"}, 
	{"03/04/2017", "NUEVOS CONQUISTADORES", "ARMA DE FUEGO",19, "masculino"} ,
	{"10/05/2017", "AURES 1", "ARMA DE FUEGO",19, "masculino"} ,  
	{"26/05/2017", "SAN JAVIER", "ARMA DE FUEGO",19, "masculino"} , 
	{"23/06/2017", "SAN JAVIER", "ARMA DE FUEGO",19, "masculino"} , 
	{"29/06/2017", "CAMPO ALEGRE", "ARMA DE FUEGO ",19, "masculino"} ,
	{"08/08/2017", "ESTACION VILLA", "ARMA DE FUEGO",19, "masculino"} , 
	{"02/09/2017", "ESTACION VILLA", "ARMA BLANCA",19, "femenino"} , 
	{"18/09/2017", "ALTAVISTA", "ARMA DE FUEGO",19, "masculino"} , 
	{"19/09/2017", "ALTAVISTA", "ARMA DE FUEGO",19, "masculino"} , 
	{"28/09/2017", "EL CUCARACHO", "CUERDA/CADENA",19, "masculino"} , 
	{"21/10/2017", "LA COLINA", "ARMA DE FUEGO",19, "masculino"} , 
	{"18/11/2017", "NUEVA VILLA DE ABURRA", "ARMA DE FUEGO",19, "masculino"} ,
	{"19/11/2017", "EL SALADO", "ARMA BLANCA",19, "masculino"} , 
	{"04/12/2017", "VDA.SAN JOSE LA LOMA", "ARMA BLANCA",19, "masculino"} ,
	{"15/12/2017", "ARANJUEZ", "ARMA DE FUEGO",19, "masculino"} , 
	{"27/12/2017", "VILLA NUEVA", "ARMA DE FUEGO",19, "masculino"} ,
	{"27/12/2017", "VILLA NUEVA", "ARMA DE FUEGO",19, "masculino"} ,
	{"08/02/2017", "LOS CERROS EL VERGEL ", "ARMA BLANCA",20, "masculino"} ,
	{"23/02/2017", "BARICHARA", "ARMA DE FUEGO",20, "masculino"} ,
	{"27/03/2017", "SANTA CRUZ", "ARMA DE FUEGO",20, "masculino"} ,
	{"08/04/2017", "SANTA FE", "ARMA DE FUEGO",20, "masculino"} ,
	{"19/04/2017", "LA CANDELARIA", "ARMA BLANCA",20, "masculino"} ,
	{"02/05/2017", "BOSTON", "ARMA BLANCA",20, "masculino"} ,
	{"06/05/2017", "MIRAVALLE", "ARMA DE FUEGO",20, "masculino"} , 
	{"09/05/2017", "SAN ANTONIO", "ARMA DE FUEGO",20, "masculino"} , 
	{"14/05/2017", "LA CANDELARIA", "ARMA BLANCA",20, "femenino"} , 
	{"21/05/2017", "BLANQUIZAL", "ARMA DE FUEGO",20, "masculino"} , 
	{"02/06/2017", "EL SALADO", "ARMA DE FUEGO",20, "masculino"} , 
	{"06/06/2017", "GUAYABAL", "ARMA DE FUEGO",20, "masculino"} ,
	{"13/06/2017", "CERRO EL VOLADOR", "ARMA DE FUEGO",20, "masculino"} , 
	{"15/06/2017", "PREDEGAL", "ARMA DE FUEGO",20, "masculino"} , 
	{"15/06/2017", "CENTRO", "ARMA DE FUEGO",20, "masculino"} ,
	{"19/06/2017", "ALTAVISTA", "ARMA DE FUEGO",20, "masculino"} , 
	{"19/06/2017", "TRINIDAD", "ARMA DE FUEGO",20, "masculino"} , 
	{"02/07/2017", "EL RINCON", "ARMA DE FUEGO",20, "masculino"} , 
	{"19/07/2017", "AURES 1", "ARMA DE FUEGO",20, "masculino"} , 
	{"12/08/2017", "LAS INDEPENDENCIAS", "ARMA DE FUEGO",20, "masculino"} , 
	{"30/08/2017", "EL VELODROMO", "ARMA DE FUEGO",20, "masculino"} , 
	{"03/09/2017", "LAS INDEPENDENCIAS", "ARMA DE FUEGO",20, "masculino"} , 
	{"06/10/2017", "VDA.PAJARITO", "ARMA DE FUEGO",20, "masculino"} , 
	{"09/10/2017", "LAS MERCEDES", "ARMA DE FUEGO",20, "masculino"} , 
	{"10/10/2017", "EL CUCARACHO", "ARMA DE FUEGO",20, "masculino"} , 
	{"19/10/2017", "VILLA DEL SOCORRO", "ARMA DE FUEGO",20, "masculino"} ,
	{"03/11/2017", "VDA. EL CORAZÓN-EL MORRO", "ARMA DE FUEGO",20, "masculino"} , 
	{"29/11/2017", "ESTACION VILLA", "ARMA DE FUEGO",20, "masculino"} , 
	{"08/12/2017", "VDA.EL PICACHO", "CONTUNDENTES",20, "masculino"} ,
	{"16/12/2017", "VILLANUEVA", "ARMA BLANCA",20, "masculino"} , 
	{"16/12/2017", "LORENA", "CONTUNDENTES",20, "masculino"} , 
	{"19/12/2017", "ANDALUCIA", "BOLSA PLASTICA",20, "masculino"} , 
	
	
	
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
SimpleTable2 frame = new SimpleTable2(); 
frame.pack(); 
frame.setVisible(true); 
} 
}

