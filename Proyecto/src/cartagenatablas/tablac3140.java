package cartagenatablas;


import javax.swing.JTable; 
import javax.swing.JScrollPane; 
import javax.swing.JFrame; 
import java.awt.*; 
import java.awt.event.*;

public class tablac3140 extends JFrame {

public tablac3140() { 
super("Homicidios Cartagena ordenados por el intervalom 31-40");

//Array bidimensional de objetos con los datos de la tabla 
Object[][] data = { 
		{"01/13/2017", "ESCALLON VILLA", "ARMA BLANCA",31, "masculino"}, 
		{"02/07/2017", "VISTA HERMOSA", "ARMA DE FUEGO",31, "masculino"}, 
		{"02/15/2017", "ALCIBIA", "CONTUNDENTE",31, "masculino"}, 
		{"03/21/2017", "OLAYA HERRERA", "ARMA DE FUEGO",31, "masculino"}, 
		{"04/24/2017", "LOS CARACOLES", "ARMA BLANCA",31, "masculino"}, 
		{"08/07/2017", "EL POZON", "ARMA DE FUEGO",31, "masculino"}, 
		{"09/22/2017", "BOSTON", "ARMA DE FUEGO",31, "masculino"},
		{"10/09/2017", "URB.CIUDADELA 2000", "ARMA DE FUEGO",31, "masculino"}, 
		{"10/14/2017", "VILLA HERMOSA", "ARMA DE FUEGO",31, "masculino"}, 
		{"10/22/2017", "ARROZ BARATO", "ARMA BLANCA",31, "masculino"}, 
		{"11/10/2017", "EL PORVENIR", "ARMA BLANCA",31, "masculino"}, 
		{"11/29/2017", "BAZURTO", "ARMA BLANCA",31, "masculino"}, 
		{"11/30/2017", "LA ESPERANZA", "ARMA DE FUEGO",31, "masculino"}, 
		{"12/11/2017", "ESPAÑA", "ARMA DE FUEGO",31, "masculino"}, 
		{"08/31/2017", "OLAYA HERRERA", "CONTUNDENTE",32, "masculino"}, 
		{"09/16/2017", "LA QUINTA", "ARMA BLANCA",32, "masculino"}, 
		{"09/20/2017", "FLOR DEL CAMPO E-10", "ARMA DE FUEGO",32, "masculino"}, 
		{"10/17/2017", "MAMONAL", "ARMA DE FUEGO",32, "masculino"}, 
		{"01/16/2017", "LA ESPERANZA", "ARMA DE FUEGO",33, "masculino"}, 
		{"02/19/2017", "OLAYA HERRERA", "CCONTUNDENTE",33, "masculino"}, 
		{"03/03/2017", "BOSQUE INDUSTRIAL", "ARMA BLANCA",33, "masculino"}, 
		{"03/28/2017", "EL POZON", "ARMA DE FUEGO",33, "masculino"}, 
		{"06/03/2017", "NELSON MANDELA","ARMA DE FUEGO",33, "masculino"}, 
		{"06/03/2017", "Cto PASACABALLOS", "ARMA DE FUEGO",33, "masculino"}, 
		{"06/19/2017", "PIEDRA DE BOLIVAR", "ARMA BLANCA",33, "masculino"}, 
		{"07/13/2017", "NUEVA PARAISO", "ARMA DE FUEGO",33, "femenino"}, 
		{"07/26/2017", "EL POZON", "ARMA DE FUEGO",33, "masculino"}, 
		{"08/07/2017", "OLAYA HERRERA", "ARMA DE FUEGO",33, "masculino"}, 
		{"03/03/2017", "LAS PALMERAS", "ARMA BLANCA",34, "masculino"}, 
		{"03/16/2017", "EL CAMPESTRE", "ARMA DE FUEGO",34, "masculino"}, 
		{"05/04/2017", "BOSTON", "ARMA DE FUEGO",34, "masculino"}, 
		{"07/09/2017", "Cto PASACABALLOS", "ARMA DE FUEGO",34, "masculino"}, 
		{"11/13/2017", "LA MARIA", "ARMA BLANCA",34, "masculino"}, 
		{"12/17/2017", "LA CONSOLATA", "ARMA BLANCA",34, "masculino"}, 
		{"12/17/2017", "S. JOSE DE LOS CAMPANOS", "ARMA DE FUEGO",34, "masculino"},
		{"01/29/2017", "LAS DELICIAS", "ARMA BLANCA",35, "masculino"}, 
		{"02/06/2017", "REP.VENEZUELA", "ARMA DE FUEGO",35, "masculino"}, 
		{"03/22/2017", "LA CANDELARIA", "ARMA DE FUEGO",35, "masculino"},
		{"06/24/2017", "BOSTON", "ARMA DE FUEGO",35, "masculino"}, 
		{"11/13/2017", "LO AMADOR", "ARMA BLANCA",35, "masculino"}, 
		{"12/24/2017", "LA ESPERANZA", "ARMA DE FUEGO",35, "masculino"},
		{"10/16/2017", "LA ESPERANZA", "ARMA DE FUEGO",36, "masculino"}, 
		{"12/16/2017", "NELSON MANDELA", "ARMA DE FUEGO",36, "masculino"}, 
		{"01/18/2017", "ALCIBIA", "ARMA DE FUEGO",37, "masculino"}, 
		{"04/01/2017", "EL POZON", "ARMA BLANCA",37, "masculino"},
		{"05/07/2017", "LA BOQUILLA", "ARMA BLANCA",37, "masculino"}, 
		{"10/01/2017", "PABLO VI  1", "ARMA BLANCA",37, "masculino"}, 
		{"10/16/2017", "FREDONIA", "ARMA DE FUEGO",37, "masculino"}, 
		{"11/17/2017", "NUEVO BOSQUE", "CONTUNDENTES",37, "masculino"},
		{"08/26/2017", "LOS CALAMARES", "ARMA DE FUEGO",38, "masculino"}, 
		{"11/06/2017", "BLAS DE LEZO", "ARMA DE FUEGO",38, "masculino"}, 
		{"12/24/2017", "LA ESPERANZA", "ARMA DE FUEGO",38, "masculino"}, 
		{"02/10/2017", "CTO. SANTA ANA", "ARMA DE FUEGO",39, "masculino"}, 
		{"04/12/2017", "LOS CERROS", "ARMA DE FUEGO",39, "masculino"}, 
		{"05/22/2017", "LA ESPERANZA", "ARMA DE FUEGO",39, "masculino"}, 
		{"06/05/2017", "EL POZON", "ARMA DE FUEGO",39, "masculino"},
		{"04/26/2017", "LOS ALPES", "CONTUNDENTES",40, "masculino"}, 
		{"08/09/2017", "EL LAGUITO", "SIN EMPLEO DE ARMAS",40, "masculino"}, 
		{"01/23/2017", "AMBERES", "ARMA DE FUEGO",41, "masculino"},
		{"08/31/2017", "OLAYA HERRERA", "ARMA DE FUEGO",41, "masculino"},
		
		{"12/20/2017", "LA CASTELLANA", "CONTUNDENTES",35, "masculino"}, 
		
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
tablac3140 frame1 = new tablac3140(); 
frame1.pack(); 
frame1.setVisible(true); 
} 
}