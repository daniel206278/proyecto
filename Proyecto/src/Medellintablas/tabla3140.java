package Medellintablas;
import javax.swing.JTable; 
import javax.swing.JScrollPane; 
import javax.swing.JFrame; 
import java.awt.*; 
import java.awt.event.*;

public class tabla3140 extends JFrame {
public tabla3140() { 
super("Homicidios Medellín ordenados por el intervalo de 31-40 años");

//Array bidimensional de objetos con los datos de la tabla 
Object[][] data = { 
		{"15/02/2017", "PALERMO", "ARMA DE FUEGO",31, "masculino"} ,
		{"18/02/2017", "MORAVIA", "CUERDA O CADENA",31, "masculino"} ,
		{"14/03/2017", "ALCONES S.A.P", "ARMA DE FUEGO",31, "masculino"} ,
		{"07/05/2017", "ROBLEDO", "ARMA BLANCA",31, "masculino"} , 
		{"22/05/2017", "VILLA DEL SOCORRO", "ARMA DE FUEGO",31, "masculino"} , 
		{"24/05/2017", "LA CANDELARIA", "ARMA BLANCA",31, "masculino"} , 
		{"24/06/2017", "ENCISO", "ARMA DE FUEGO",31, "masculino"} , 
		{"28/06/2017", "GIRARDOT", "ARMA DE FUEGO ",31, "masculino"} ,
		{"13/07/2017", "PREDEGAL", "ARMA DE FUEGO",31, "masculino"} , 
		{"21/07/2017", "CORDOBA", "ARMA DE FUEGO",31, "masculino"} , 
		{"25/07/2017", "SANTA MONICA", "ARMA DE FUEGO",31, "masculino"} ,   
		{"05/08/2017", "ALTAVISTA", "ARMA DE FUEGO",31, "masculino"} , 
		{"25/08/2017", "ALTAVISTA", "ARMA DE FUEGO",31, "masculino"} , 
		{"26/08/2017", "LAS ESTANCIAS", "ARMA DE FUEGO",31, "masculino"} ,
		{"02/11/2017", "TRINIDAD", "ARMA DE FUEGO",31, "masculino"} , 
		{"15/11/2017", "ESTACION VILLA", "ARMA DE FUEGO",31, "masculino"} , 
		{"18/12/2017", "BUENOS AIRES", "ARMA DE FUEGO",31, "masculino"} ,
		{"12/11/2017", "LAS GRANJAS", "ARMA DE FUEGO",31, "masculino"} , 
		{"15/02/2017", "GUAYAQUIL", "ARMA BLANCA",32, "masculino"} ,
		{"17/02/2017", "VILLA TINA", "ARMA DE FUEGO",32, "masculino"} ,
		{"25/02/2017", "SANTAFE", "ARMA DE FUEGO",32, "masculino"} ,
		{"25/02/2017", "ALDEA PABLO VI", "ARMA BLANCA",32, "masculino"} ,
		{"25/03/2017", "BARRIO COLON", "ARMA BLANCA",32, "masculino"} ,
		{"16/04/2017", "CERRO VOLADOR", "ARMA BLANCA",32, "masculino"} , 
		{"08/05/2017", "LA GLORIA", "ARMA DE FUEGO",32, "masculino"} , 
		{"25/06/2017", "LA CANDELARIA", "ARMA BLANCA",32, "masculino"} , 
		{"26/07/2017", "LA CANDELARIA", "ARMA BLANCA",32, "masculino"} , 
		{"27/07/2017", "ALTAVISTA", "ARMA DE FUEGO",32, "masculino"} ,
		{"04/08/2017", "LA CASTELLANA", "ARMA DE FUEGO",32, "masculino"} ,
		{"05/08/2017", "AURES 1", "ARMA DE FUEGO",32, "masculino"} , 
		{"13/10/2017", "EL RINCON", "ARMA DE FUEGO",32, "masculino"} ,
		{"14/10/2017", "VILLA NUEVA", "ARMA DE FUEGO",32, "masculino"} ,
		{"30/11/2017", "MIRANDA", "ARMA DE FUEGO",32, "masculino"} ,
		{"14/01/2017", "LOS ALPES", "ARMA DE FUEGO",33,"masculino"}, 
		{"18/02/2017", "BELALCAZAR", "ARMA BLANCA",33, "masculino"} ,
		{"19/04/2017", "CATALUÑA", "ARMA DE FUEGO ",33, "masculino"} ,
		{"22/04/2017", "ESTACION VILLA", "ARMA BLANCA",33, "masculino"},
		{"23/04/2017", "EL PESEBRE", "ARMA DE FUEGO",33, "femenino"} ,
		{"14/05/2017", "CENTRO S.C", "ARMA DE FUEGO",33, "masculino"} , 
		{"23/06/2017", "MIRAMAR", "ARMA DE FUEGO",33, "masculino"} , 
		{"25/06/2017", "LA CANDELARIA", "ARMA BLANCA",33, "masculino"} , 
		{"09/07/2017", "VEINTE DE JULIO", "ARMA BLANCA",33, "masculino"} , 
		{"27/07/2017", "SAN MIGUEL", "ARMA DE FUEGO",33, "masculino"} , 
		{"20/08/2017", "ALTAVISTA", "ARMA DE FUEGO",33, "femenino"} , 
		{"22/08/2017", "ESTACION VILLA", "ARMA BLANCA",33, "masculino"} , 
		{"07/09/2017", "EL RAIZAL", "ARMA DE FUEGO",33, "masculino"} , 
		{"05/11/2017", "EL PESEBRE", "ARMA DE FUEGO",33, "masculino"} ,
		{"31/12/2017", "LA MANSION", "ARMA DE FUEGO",33, "masculino"} ,
		{"12/12/2017", "AURES 2", "ARMA DE FUEGO",33, "masculino"} ,
		{"01/01/2017", "DOCE DE OCTUBRE", " ARMA DE FUEGO",34, "masculino"} ,
		{"07/01/2017", "SAN ISIDRO", "ARMA DE FUEGO",34, "masculino"} , 
		{"02/03/2017", "OLAYA HERRERA", " ARMA DE FUEGO",34, "femenino"} ,
		{"10/04/2017", "CRISTO REY", "ARMA BLANCA",34, "femenino"} ,
		{"26/04/2017", "13 DE NOVIEMBRE", "CUERDA/CADENA",34, "femenino"} ,
		{"18/07/2017", "JESUS NAZARENO", "ARMA BLANCA",34, "masculino"} ,
		{"13/08/2017", "MORAVIA", "CUERDA/CADENA",34, "femenino"} , 
		{"13/09/2017", "PREDEGAL", "ARMA DE FUEGO",34, "masculino"} , 
		{"27/10/2017", "EL PESEBRE", "ARMA DE FUEGO",34, "masculino"} , 
		{"19/12/2017", "EL NOGAL", "ARMA DE FUEGO",34, "masculino"} , 
		{"10/02/2017", "ROBLEDO", "ARMA DE FUEGO",35, "masculino"} ,
		{"20/02/2017", "MIRAVALLE", "ARMA DE FUEGO",35, "masculino"} ,
		{"03/05/2017", "SANTA MARGARITA", "ARMA BLANCA",35, "masculino"} , 
		{"21/07/2017", "PEDREGAL", "ARMA DE FUEGO",35, "masculino"} ,
		{"06/09/2017", "SANTA MONICA", "ARMA BLANCA",35, "masculino"} , 
		{"11/09/2017", "DOCE DE OCTUBRE", "ARMA DE FUEGO",35, "masculino"} ,
		{"28/09/2017", "GRANADA", "ARMA DE FUEGO",35, "masculino"} , 
		{"10/10/2017", "ESTACION VILLA", "ARMA DE FUEGO",35, "masculino"} , 
		{"10/10/2017", "AURES 2", "ARMA DE FUEGO",35, "masculino"} , 
		{"03/11/2017", "EL CHAGUALO","ARMA DE FUEGO",35, "masculino"} , 
		{"27/11/2017", "ESTACION VILLA", "ARMA DE FUEGO",35, "masculino"} , 
		{"01/12/2017", "BOSTON", "ARMA DE FUEGO",35, "masculino"} , 
		{"04/12/2017", "SAN PABLO", "ARMA BLANCA",35, "masculino"} ,
		{"01/01/2017", "13 DE NOVIEMBRE", "ARMA BLANCA",36, "masculino"} ,
		{"14/01/2017", "EL CUCARACHO", "ARMA DE FUEGO",36,"masculino"}, 
		{"25/01/2017", "ARANJUEZ", "ARMA DE FUEGO",36, "masculino"} ,
		{"31/05/2017", "METROPOLITANO", "ARMA DE FUEGO",36, "masculino"} , 
		{"15/07/2017", "NUEVA VILLA DE LA IGUANA", "ARMA DE FUEGO",36, "masculino"} , 
		{"30/07/2017", "LOS ALPES", "ARMA DE FUEGO",36, "masculino"} ,
		{"11/09/2017", "ESTACION VILLA", "ARMA DE FUEGO",36, "masculino"} , 
		{"31/10/2017", "ESTACION VILLA", "ARMA BLANCA",36, "masculino"} , 
		{"08/12/2017", "VDA.LA PALMA", "ARMA DE FUEGO",36, "masculino"} , 
		{"10/12/2017", "VILLA NIZA", "ARMA DE FUEGO",36, "masculino"},
		{"15/12/2017", "FLORIDA NUEVA", "ARMA DE FUEGO",36, "masculino"} , 
		{"15/12/2017", "NARANJAL", "ARMA BLANCA",36, "masculino"} , 
		{"22/01/2017", "ALTAVISTA", "ARMA DE FUEGO",37, "masculino"} , 
		{"23/01/2017", "BARRIO COLON", "CONTUNDENTES",37, "masculino"} ,
		{"07/02/2017", "MONTECLARO", "ARMA DE FUEGO",37, "masculino"} ,
		{"25/03/2017", "SANTA FE", "ARMA DE FUEGO",37, "masculino"} ,
		{"20/06/2017", "CORAZON DE JESUS", "ARMA DE FUEGO",37, "masculino"} ,
		{"02/08/2017", "LA CANDELARIA", "ARMA DE FUEGO",37, "masculino"} , 
		{"23/03/2017", "VDA.SAN JOSE LA LOMA", "ARMA DE FUEGO",37, "masculino"} ,
		{"26/11/2017", "ESTACION VILLA", "CONTUNDENTES",37, "masculino"} , 
		{"16/01/2017", "MANRIQUE 1", "ARMA DE FUEGO",38, "masculino"} ,
		{"15/02/2017", "CASTILLA", "CONTUNDENTES",38, "masculino"} ,
		{"22/02/2017", "GIRARDOT", "ARMA DE FUEGO",38, "masculino"} ,
		{"11/03/2017", "ESTACION VILLA", " ARMA DE FUEGO ",38, "masculino"} ,
		{"07/04/2017", "VEINTE DE JULIO", "ARMA DE FUEGO",38, "masculino"} ,
		{"22/04/2017", "LA ASOMADERA", "ARMA DE FUEGO",38, "masculino"} ,
		{"17/07/2017", "BEMEJAL-LOS ALAMOS", "ARMA DE FUEGO",38, "masculino"} , 
		{"23/07/2017", "EL COMPROMISO", "CONTUNDENTES",38, "masculino"} , 
		{"07/08/2017", "SIMESA", "ARMA BLANCA",38, "masculino"} ,
		
		{"16/08/2017", "ESTACION VILLA", "ARMA BLANCA",38, "masculino"} ,
		{"02/10/2017", "LA HONDONADA", "ARMA DE FUEGO",38, "masculino"} ,
		{"01/12/2017", "ROSALES", "CONTUNDENTES",38, "masculino"} , 
		{"05/12/2017", "BARRIO SAN CRISTOBAL", "ARMA BLANCA",38, "masculino"} , 
		{"08/12/2017", "ESTACION VILLA", "ARMA DE FUEGO",38, "masculino"} , 
		{"17/12/2017", "NUEVA VILLA DE LA IGUANA", "BOLSA PLASTICA",38, "masculino"} , 
		{"22/12/2017", "AURES 2", "ARMA DE FUEGO",38, "masculino"} , 
		{"05/02/2017", "LA AURORA", "ARMA BLANCA",39, "masculino"} ,
		{"03/05/2017", "SAN JAVIER", "ARMA DE FUEGO",39, "masculino"} , 
		{"06/11/2017", "DOCE DE OCTUBRE", "ARMA BLANCA",38, "masculino"} , 
		{"06/07/2017", "ESTADIO", "ARMA DE FUEGO",39, "masculino"} , 
		{"14/07/2017", "GIRARDOT", "ARMA DE FUEGO",39, "masculino"} , 
		{"18/07/2017", "ALTAVISTA", "ARMA DE FUEGO",39, "masculino"} , 
		{"16/09/2017", "LA HONDONADA", "ARMA DE FUEGO",39, "masculino"} , 
		{"01/10/2017", "MONTECLARO", "ARMA BLANCA",39, "masculino"} , 
		{"15/10/2017", "CASTROPOL", "ARMA DE FUEGO",39, "masculino"} , 
		{"15/10/2017", "SAN ISIDRO", "ARMA DE FUEGO",39, "masculino"} , 
		{"15/11/2017", "LA ASOMADERA", "ARMA DE FUEGO",39, "masculino"} , 
		{"20/11/2017", "CALLE NUEVA", "CONTUNDENTES",39, "masculino"} ,
		{"22/12/2017", "GIRARDOT", "BOLSA PLASTICA",39, "masculino"} , 
		{"02/08/2017", "EL PESEBRE", "ARMA DE FUEGO",39, "masculino"} , 
		{"31/01/2017", "CONQUISTADORES", "ARMA DE FUEGO",40, "femenino"} ,
		{"25/06/2017", "PERPETUO SOCORRO", "ARMA BLANCA",40, "masculino"} , 
		{"05/08/2017", "ALTAVISTA", "ARMA DE FUEGO",40, "masculino"} , 
		{"12/08/2017", "EL NOGAL", "ARMA DE FUEGO",40, "masculino"} , 
		{"09/09/2017", "LA FLORIDA", "ARMA DE FUEGO",40, "masculino"} , 
		{"18/09/2017", "LA LIBERTAD", "ARMA DE FUEGO",40, "masculino"} ,
		{"05/11/2017", "NUEVOS CONQUISTADORES", "ARMA BLANCA",40, "masculino"} , 
		{"15/11/2017", "SANTA LUCIA", "ARMA DE FUEGO",40, "masculino"} , 
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
			
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