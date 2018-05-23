package BucaramangaTabla;

import javax.swing.JTable; 
import javax.swing.JScrollPane; 
import javax.swing.JFrame; 
import java.awt.*; 
import java.awt.event.*;

public class BUCARAMANGA extends JFrame {

public BUCARAMANGA() { 
super("Homicidios en Bucaramanga , ordenados por fechas");

//Array bidimensional de objetos con los datos de la tabla 
Object[][] data = { 
		{"01/01/2017", "EL PORVENIR", "ARMA DE FUEGO",23, "masculino"}, 
		{"06/01/2017", "ESPERANZA", "ARMA DE FUEGO",28, "masculino"}, 
		{"15/01/2017", "NUEVA COLOMBIA", "ARMA DE FUEGO",46, "masculino"}, 
		{"20/01/2017", "ALARCON", "ARMA BLANCA",41, "masculino"}, 
		{"22/01/2017", "ALFONSO LOPEZ", "ARMA DE FUEGO",23, "femenino"}, 
		{"22/01/2017", "TRANSICION II", "ARMA BLANCA",61, "masculino"}, 
		{"25/01/2017", "VILLAS DE SAN IGNACIO", "ARMA DE FUEGO",33, "masculino"}, 
		{"28/01/2017", "LA INDEPENDENCIA", "ARMA DE FUEGO",30, "femenino"}, 
		{"02/02/2017", "OLAS II", "ARMA DE FUEGO",39, "masculino"}, 
		{"05/02/2017", "GRANADA", "ARMA BLANCA",25, "masculino"}, 
		{"06/02/2017", "VDA.EL NOGAL(COLORADOS)", "ARMA BLANCA",52, "masculino"}, 
		{"07/02/2017", "URB. ESTORAQUES I", "ARMA DE FUEGO",22, "masculino"}, 
		{"10/02/2017", "LA JUVENTUD", "ARMA DE FUEGO",18, "masculino"}, 
		{"16/02/2017", "LA JUVENTUD", "ARMA DE FUEGO",46, "masculino"}, 
		{"17/02/2017", "LA INDEPENDENCIA", "ARMA BLANCA",24, "masculino"}, 
		{"18/02/2017", "URB.MARSELLA REAL", "ARMA DE FUEGO",20, "masculino"}, 
		{"22/02/2017", "LA INDEPENDENCIA", "ARMA BLANCA",21, "masculino"}, 
		{"22/02/2017", "SANTANDER", "ARMA DE FUEGO",42, "masculino"}, 
		{"26/02/2017", "GIRARDOT", "ARMA DE FUEGO",40, "masculino"}, 
		{"26/02/2017", "OLAS II", "ARMA BLANCA",30, "masculino"}, 
		{"03/03/2017", "CAFÉ MADRID", "ARMA BLANCA",29, "masculino"}, 
		{"04/03/2017", "OLAS II", "ARMA DE FUEGO",78, "femenino"}, 
		{"05/03/2017", "QUINTADANIA", "ARMA DE FUEGO",46, "masculino"}, 
		{"06/03/2017", "GARCIA ROVIRA", "ARMA BLANCA",31, "masculino"}, 
		{"12/03/2017", "CHAPINERO", "ARMA BLANCA",34, "masculino"}, 
		{"15/03/2017", "CENTRO", "ARMA BLANCA",23, "masculino"}, 
		{"02/04/2017", "VILLA ROSA", "ARMA BLANCA",23, "masculino"}, 
		{"09/04/2017", "ESPERANZA III", "ARMA DE FUEGO",37, "masculino"}, 
		{"14/04/2017", "TRANSICION IV", "ARMA DE FUEGO",39, "masculino"}, 
		{"29/04/2017", "CAFÉ MADRID", "ARMA DE FUEGO",27, "masculino"}, 
		{"29/04/2017", "CAFÉ MADRID", "ARMA DE FUEGO",34, "masculino"}, 
		{"02/05/2017", "ALVAREZ", "ARMA BLANCA",23, "masculino"}, 
		{"04/05/2017", "CENTRO", "ARMA BLANCA",21, "masculino"}, 
		{"07/05/2017", "CHAPINERO", "CONTUNDENTES",37, "masculino"}, 
		{"14/05/2017", "MIRAFLORES", "ARMA DE FUEGO",29, "masculino"}, 
		{"18/05/2017", "CENTRO", "ARMA BLANCA",35, "masculino"},
		{"21/05/2017", "SAN ALONSO", "ARMA BLANCA",31, "masculino"}, 
		{"28/05/2017", "EL PABLON", "ARMA DE FUEGO",27, "masculino"}, 
		{"02/06/2017", "QUINTA ESTRELLA", "VENENO",6, "femenino"}, 
		{"03/06/2017", "ESPERANZA III", "ARMA DE FUEGO",21, "masculino"}, 
		{"03/06/2017", "TRANSICON IV", "ARMA DE FUEGO",43, "masculino"}, 
		{"05/06/2017", "MIRAFLORES", "ARMA DE FUEGO",33, "masculino"}, 
		{"06/06/2017", "ALVAREZ", "ARMA BLANCA",17, "masculino"}, 
		{"17/06/2017", "ALARCON", "ARMA BLANCA",25, "masculino"}, 
		{"25/06/2017", "LA JOYA", "ARMA DE FUEGO",34, "masculino"}, 
		{"29/06/2017", "URB. BAVARIA", "ARMA DE FUEGO",25, "masculino"}, 
		{"01/07/2017", "CENTRO", "CONTUNDENTES",25, "femenino"}, 
		{"02/07/2017", "PIO XII", "ARMA BLANCA",26, "masculino"}, 
		{"02/07/2017", "BOLIVAR", "ARMA BLANCA",67, "masculino"}, 
		{"05/07/2017", "ESPERANZA II", "ARMA DE FUEGO",20, "masculino"}, 
		{"09/07/2017", "KENNEDY", "ARMA DE FUEGO",21, "femenino"}, 
		{"10/07/2017", "COMUNEROS", "ARMA DE FUEGO",33, "masculino"}, 
		{"14/07/2017", "VILLA HELENA I", "ARMA DE FUEGO",18, "masculino"}, 
		{"28/07/2017", "ALARCON", "ARMA DE FUEGO",31, "masculino"}, 
		{"04/08/2017", "SAN RAFAEL", "ARMA DE FUEGO",33, "masculino"}, 
		{"06/08/2017", "CABECERA DEL LLANO", "ARMA DE FUEGO",29, "masculino"}, 
		{"06/08/2017", "CAMPO HERMOSO", "ARMA DE FUEGO",21, "masculino"}, 
		{"17/08/2017", "ALFONSO LOPEZ", "ARMA DE FUEGO",25, "masculino"}, 
		{"22/08/2017", "LA INDEPENDENCIA", "ARMA DE FUEGO",20, "masculino"}, 
		{"02/09/2017", "ZARABANDA", "ARMA DE FUEGO",19, "masculino"}, 
		{"08/09/2017", "ALARCON", "ARMA DE FUEGO",46, "masculino"}, 
		{"09/09/2017", "SAN FRANCISCO", "ARMA DE FUEGO",19, "masculino"}, 
		{"15/09/2017", "CENTRO", "ARMA DE FUEGO",60, "femenino"}, 
		{"19/09/2017", "CLAVERIANO", "ARMA DE FUEGO",20, "masculino"}, 
		{"25/09/2017", "ALFONSO LOPEZ", "ARMA DE FUEGO",37, "masculino"}, 
		{"25/09/2017", "INV. VILLAS DEL GIRARDOT", "ARMA DE FUEGO",22, "masculino"}, 
		{"27/09/2017", "VILLA ROMERO", "ARMA DE FUEGO",40, "femenino"}, 
		{"03/10/2017", "LAS HAMACAS", "ARMA DE FUEGO",35, "masculino"}, 
		{"07/10/2017", "FONTANA", "ARMA DE FUEGO",20, "masculino"}, 
		{"08/10/2017", "COLORADOS", "ARMA DE FUEGO",33, "masculino"}, 
		{"09/10/2017", "CHORRERAS DE DON JUAN", "ARMA DE FUEGO",43, "masculino"}, 
		{"14/10/2017", "LA INDEPENDENCIA ", "ARMA DE FUEGO",47, "masculino"},                        
		{"15/10/2017", "VILLA HELENA I ", "ARMA DE FUEGO",30, "masculino"}, 
		{"15/10/2017", "CAMPO HERMOSO ", "ARMA DE FUEGO",24, "masculino"}, 
		{"21/10/2017", "JOSE MARIA CORDOBA ", "ARMA BLANCA",20, "masculino"}, 
		{"21/10/2017", "ALARCON ", "ARMA BLANCA",33, "masculino"}, 
		{"29/10/2017", "BUCARAMANGA ", "ARMA BLANCA",26, "masculino"}, 
		{"30/10/2017", "JOSE ANTONIO GALAN ", "ARMA DE FUEGO",18, "masculino"}, 
		{"31/10/2017", "CLAVERIANO  ", "ARMA DE FUEGO",36, "masculino"}, 
		{"05/11/2017", "ALARCON ", "ARMA DE FUEGO",19, "masculino"}, 
		{"05/11/2017", "GAITAN ", "ARMA BLANCA",35, "masculino"}, 
		{"26/11/2017", "COLORADOS ", "ARMA BLANCA",28, "femenino"}, 
		{"26/11/2017", "RICAURTE ", "ARMA BLANCA",30, "masculino"}, 
		{"03/12/2017", "VILLA FLOR ", "ARMA BLANCA",25, "masculino"}, 
		{"03/12/2017", "GRANADA ", "ARMA BLANCA",17, "masculino"}, 
		{"11/12/2017", "CIUDAD VENECIA ", "ARMA BLANCA",53, "masculino"}, 
		{"11/12/2017", "SAN MARTIN ", "ARMA BLANCA",23, "masculino"}, 
		{"20/12/2017", "ALFONSO LOPEZ ", "CONTUNDENTES",72, "masculino"}, 
		{"25/12/2017", "QUEBRADA LA IGLESIA ", "ARMA BLANCA",43, "masculino"}, 
		{"26/12/2017", "DIAMANTE I ", "ARMA BLANCA",16, "masculino"}, 
		{"30/12/2017", "SAN CRISTOBAL ", "ARMA DE FUEGO",28, "masculino"}, 
};

//Array de String con los titulos de las columnas 
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
BUCARAMANGA frame = new BUCARAMANGA(); 
frame.pack(); 
frame.setVisible(true); 
} 
}