package cartagenatablas;


import javax.swing.JTable; 
import javax.swing.JScrollPane; 
import javax.swing.JFrame; 
import java.awt.*; 
import java.awt.event.*;

public class tablac2130 extends JFrame {

public tablac2130() { 
super("Homicidios Cartagena ordenados por el intervalom 0-10");

//Array bidimensional de objetos con los datos de la tabla 
Object[][] data = { 
	
		{"02/27/2017", "DANIEL LEMAITRE", "ARMA BLANCA",21, "masculino"}, 
		{"03/13/2017", "NUEVO PARAISO", "ARMA DE FUEGO",21, "masculino"}, 
		{"05/28/2017", "LA BOQUILLA", "ARMA DE FUEGO",21, "masculino"}, 
		{"07/07/2017", "S.JOSE DE LOS CAMPANOS", "CONTUNDENTES",21, "masculino"}, 
		{"07/16/2017", "NELSON MANDELA", "ARMA DE FUEGO",21, "masculino"}, 
		{"08/11/2017", "SANTA MARÍA", "ARMA DE FUEGO",21, "masculino"}, 
		{"12/02/2017", "ZARAGOCILLA", "ARMA BLANCA",21, "masculino"}, 
		{"12/18/2017", "S.JOSE DE LOS CAMPANOS", "ARMA BLANCA",21, "masculino"}, 
		{"04/07/2017", "LA ESPERANZA", "ARMA DE FUEGO",22, "masculino"}, 
		{"08/10/2017", "DANIEL LEMAITRE", "ARMA DE FUEGO",22, "masculino"}, 
		{"09/24/2017", "EL MILAGRO", "ARMA DE FUEGO",22, "masculino"}, 
		{"12/01/2017", "LA PAZ", "ARMA DE FUEGO",22, "masculino"}, 
		{"12/09/2017", "ZAPATERO", "ARMA DE FUEGO",22, "masculino"}, 
		{"12/19/2017", "ALBORNOZ", "ARMA DE FUEGO",22, "masculino"}, 
		{"01/09/2017", "TERNERA", "ARMA BLANCA",23, "masculino"}, 
		{"02/10/2017", "CTO.SANTA ANA", "ARMA DE FUEGO",23, "masculino"}, 
		{"04/03/2017", "SECTOR RAFAEL NUÑEZ", "ARMA DE FUEGO",23, "masculino"}, 
		{"04/26/2017", "EL POZON", "ARMA DE FUEGO",23, "masculino"}, 
		{"05/28/2017", "SAN ISIDRO", "ARMA DE FUEGO",23, "masculino"},
		{"07/02/2017", "OLAYA HERRERA", "ARMA BLANCA",23, "masculino"}, 
		{"08/21/2017", "OLAYA HERRERA", "ARMA BLANCA",23, "masculino"}, 
		{"10/08/2017", "PARAGUAY", "CONTUNDENTES",23, "masculino"}, 
		{"12/03/2017", "EL POZON", "ARMA DE FUEGO",23, "masculino"},
		{"12/07/2017", "LAS GAVIOTAS", "ARMA BLANCA",23, "masculino"}, 
		{"02/05/2017", "LOMA FRESCA", "ARMA DE FUEGO",24, "masculino"},
		{"04/02/2017", "EL POZON", "ARMA DE FUEGO",24, "masculino"}, 
		{"06/10/2017", "EL POZON", "ARMA DE FUEGO",24, "masculino"}, 
		{"07/16/2017", "OLAYA HERRERA", "ARMA DE FUEGO",24, "masculino"}, 
		{"07/24/2017", "VISTA HERMOSA", "ARMA DE FUEGO",24, "masculino"}, 
		{"08/23/2017", "LA CANDELARIA", "ARMA DE FUEGO",24, "masculino"},
		{"10/03/2017", "SAN PEDRO", "ARMA DE FUEGO",24, "masculino"}, 
		{"12/10/2017", "EL CAMPESTRE", "CONTUNDENTES",24, "masculino"}, 
		{"12/20/2017", "EL POZON", "ARMA DE FUEGO",24, "masculino"}, 
		{"05/15/2017", "LOMA FRESCA", "ARMA DE FUEGO",25, "masculino"}, 
		{"07/15/2017", "FREDONIA", "ARMA DE FUEGO",25, "masculino"}, 
		{"09/04/2017", "TORICES", "ARMA DE FUEGO",25, "masculino"}, 
		{"10/08/2017", "SECTOR LAS COLINAS", "ARMA DE FUEGO",25, "masculino"},
		{"10/11/2017", "NUEVO PARAISO", "ARMA DE FUEGO",25, "masculino"}, 
		{"10/20/2017", "SAN FRANCISCO", "ARMA DE FUEGO",25, "masculino"},
		{"11/26/2017", "NELSON MANDELA", "ARMA BLANCA",25, "masculino"}, 
		{"12/21/2017", "CAMILO TORRES", "ARMA DE FUEGO",25, "masculino"},
		{"02/07/2017", "OLAYA HERRERA", "ARMA DE FUEGO",26, "masculino"}, 
		{"03/06/2017", "PASEO DE BOLÍVAR", "ARMA DE FUEGO",26, "masculino"}, 
		{"03/12/2017", "CEBALLOS", "ARMA BLANCA",26, "masculino"}, 
		{"03/12/2017", "CEBALLOS", "ARMA BLANCA",26, "masculino"}, 
		{"03/12/2017", "SAN FRANCISCO", "ARMA DE FUEGO",26, "masculino"}, 
		{"05/29/2017", "EL POZON", "ARMA BLANCA",26, "masculino"}, 
		{"06/03/2017", "NELSON MANDELA", "ARMA DE FUEGO",26, "masculino"}, 
		{"06/19/2017", "LA BOQUILLA", "ARMA DE FUEGO",26, "masculino"}, 
		{"07/10/2017", "VILLA HERMOSA", "ARMA DE FUEGO",26, "masculino"}, 
		{"04/23/2017", "MARTINEZ MARTELO", "ARMA BLANCA",27, "masculino"}, 
		{"05/29/2017", "OLAYA HERRERA", "ARMA DE FUEGO",27, "masculino"}, 
		{"06/16/2017", "FREDONIA", "ARMA DE FUEGO",27, "masculino"}, 
		{"06/18/2017", "FREDONIA", "ARMA DE FUEGO",27, "masculino"}, 
		{"07/30/2017", "JUNIN", "ARMA DE FUEGO",27, "masculino"}, 
		{"09/23/2017", "LOS CARACOLES", "CONTUNDENTES",27, "masculino"},
		{"10/05/2017", "NELSON MANDELA", "ARMA DE FUEGO",27, "masculino"}, 
		{"10/19/2017", "Cto PASACABALLOS", "ARMA DE FUEGO",27, "masculino"}, 
		{"11/05/2017", "CENTRO", "ARMA BLANCA",27, "masculino"}, 
		{"11/14/2017", "OLAYA HERRERA", "ARMA BLANCA",27, "masculino"}, 
		{"12/18/2017", "EL CARMELO", "ARMA DE FUEGO",27, "masculino"}, 
		
		{"01/21/2017", "BLAS DE LEZO", "ARMA DE FUEGO",28, "masculino"}, 
		{"02/12/2017", "OLAYA HERRERA", "ARMA DE FUEGO",28, "masculino"}, 
		{"03/19/2017", "HENEQUEN", "ARMA DE FUEGO",28, "masculino"}, 
		{"03/26/2017", "TORICES", "ARMA BLANCA",28, "femenino"}, 
		{"03/26/2017", "VILLA ESTRELLA", "ARMA DE FUEGO",28, "masculino"}, 
		{"03/26/2017", "LA BOQUILLA", "ARMA BLANCA",28, "masculino"},
		{"04/11/2017", "OLAYA HERRERA", "ARMA DE FUEGO",28, "masculino"}, 
		{"06/18/2017", "Cto PASACABALLOS", "ARMA BLANCA",28, "masculino"}, 
		{"07/09/2017", "POLICARPA", "ARMA DE FUEGO",28, "masculino"},
		{"08/31/2017", "OLAYA HERRERA", "CONTUNDENTE",28, "masculino"}, 
		{"09/19/2017", "LA ESPERANZA", "ARMA DE FUEGO",28, "masculino"}, 
		{"11/04/2017", "OLAYA HERRERA", "ARMA BLANCA",28, "masculino"},
		{"12/04/2017", "EL POZON", "ARMA BLANCA",28, "masculino"}, 
		{"12/17/2017", "NELSON MANDELA", "ARMA BLANCA",28, "masculino"},
		{"04/04/2017", "LAS DELICIAS", "CONTUNDENTE",29, "masculino"}, 
		{"05/14/2017", "LA ESPERANZA", "ARMA DE FUEGO",29, "masculino"}, 
		{"05/22/2017", "LOMA FRESCA", "ARMA BLANCA",29, "masculino"}, 
		{"05/25/2017", "EL CARMELO", "ARMA DE FUEGO",29, "masculino"}, 
		{"05/25/2017", "LA ESPERANZA", "ARMA DE FUEGO",29, "masculino"}, 
		{"05/28/2017", "NELSON MANDELA", "ARMA DE FUEGO",29, "masculino"}, 
		{"07/02/2017", "CTO.BARU", "ARMA BLANCA",29, "masculino"}, 
		{"07/21/2017", "FREDONIA", "ARMA DE FUEGO",29, "masculino"}, 
		{"08/06/2017", "EL POZON", "ARMA DE FUEGO",29, "masculino"},
		{"10/10/2017", "FLOR DEL CAMPO E-10", "ARMA BLANCA",29, "masculino"}, 
		{"10/16/2017", "LA BOQUILLA", "ARMA BLANCA",29, "masculino"}, 
		{"11/11/2017", "LA MARÍA", "ARMA BLANCA",29, "masculino"}, 
		{"11/12/2017", "LA ESPERANZA", "ARMA DE FUEGO",29, "masculino"}, 
		{"12/31/2017", "OLAYA HERRERA", "ARMA DE FUEGO",29, "masculino"}, 
		{"12/31/2017", "CHAMBACU", "ARMA DE FUEGO",29, "masculino"}, 
		{"02/19/2017", "OLAYA HERRERA", "ARMA DE FUEGO",30, "masculino"}, 
		{"04/29/2017", "LAS AMERICAS", "ARMA DE FUEGO",30, "masculino"}, 
		{"05/31/2017", "LA ESPERANZA", "ARMA DE FUEGO",30, "masculino"}, 
		{"06/18/2017", "EL POZON", "ARMA DE FUEGO",30, "masculino"}, 
		{"07/16/2017", "EL POZON", "ARMA DE FUEGO",30, "masculino"}, 
		{"08/05/2017", "EL POZON", "ARMA BLANCA",30, "masculino"}, 
		{"08/14/2017", "VILLA ESTRELLA", "ARMA DE FUEGO",30, "masculino"}, 
		{"11/13/2017", "LA ESPERANZA", "ARMA DE FUEGO",30, "masculino"}, 
		{"12/31/2017", "LOMA FRESCA", "ARMA DE FUEGO",30, "masculino"}, 
		
		{"09/28/2017", "PIEDRA DE BOLIVAR", "ARMA DE FUEGO",29, "masculino"}, 
		
		
		
		
		
		{"07/16/2017", "S.PEDRO MARTIR", "ARMA BLANCA",26, "masculino"}, 
		{"07/29/2017", "ZARAGOCILLA", "ARMA DE FUEGO",26, "masculino"},
		{"09/24/2017", "LA CANDELARIA", "ARMA DE FUEGO",26, "masculino"}, 
		{"11/11/2017", "LA CANDELARIA", "ARMA DE FUEGO",26, "masculino"}, 
		{"12/02/2017", "TERNERA", "ARMA BLANCA",26, "femenino"}, 
		
		
		{"04/24/2017", "URB LA CAROLINA", "CONTUNDENTES",22, "masculino"},
		
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
tablac2130 frame1 = new tablac2130(); 
frame1.pack(); 
frame1.setVisible(true); 
} 
}