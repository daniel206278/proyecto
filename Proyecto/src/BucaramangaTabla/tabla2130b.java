package BucaramangaTabla;
import javax.swing.JTable; 
import javax.swing.JScrollPane; 
import javax.swing.JFrame; 
import java.awt.*; 
import java.awt.event.*;

public class tabla2130b extends JFrame {

public tabla2130b() { 
super("Homicidios Bucaramanga ordenados por el intervalo de 21 a 30 años ");

//Array bidimensional de objetos con los datos de la tabla 
Object[][] data = { 
		{"22/02/2017", "LA INDEPENDENCIA", "ARMA BLANCA",21, "masculino"}, 
		{"04/05/2017", "CENTRO", "ARMA BLANCA",21, "masculino"}, 
		{"03/06/2017", "ESPERANZA III", "ARMA DE FUEGO",21, "masculino"}, 
		{"09/07/2017", "KENNEDY", "ARMA DE FUEGO",21, "femenino"}, 
		{"06/08/2017", "CAMPO HERMOSO", "ARMA DE FUEGO",21, "masculino"}, 
		{"07/02/2017", "URB. ESTORAQUES I", "ARMA DE FUEGO",22, "masculino"}, 
		{"25/09/2017", "INV. VILLAS DEL GIRARDOT", "ARMA DE FUEGO",22, "masculino"}, 
		{"01/01/2017", "EL PORVENIR", "ARMA DE FUEGO",23, "masculino"}, 
		{"22/01/2017", "ALFONSO LOPEZ", "ARMA DE FUEGO",23, "femenino"}, 
		{"15/03/2017", "CENTRO", "ARMA BLANCA",23, "masculino"}, 
		{"02/04/2017", "VILLA ROSA", "ARMA BLANCA",23, "masculino"}, 
		{"02/05/2017", "ALVAREZ", "ARMA BLANCA",23, "masculino"}, 
		{"11/12/2017", "SAN MARTIN ", "ARMA BLANCA",23, "masculino"}, 
		{"17/02/2017", "LA INDEPENDENCIA", "ARMA BLANCA",24, "masculino"}, 
		{"15/10/2017", "CAMPO HERMOSO ", "ARMA DE FUEGO",24, "masculino"}, 
		{"05/02/2017", "GRANADA", "ARMA BLANCA",25, "masculino"}, 
		{"17/06/2017", "ALARCON", "ARMA BLANCA",25, "masculino"}, 
		{"29/06/2017", "URB. BAVARIA", "ARMA DE FUEGO",25, "masculino"}, 
		{"17/08/2017", "ALFONSO LOPEZ", "ARMA DE FUEGO",25, "masculino"}, 
		{"03/12/2017", "VILLA FLOR ", "ARMA BLANCA",25, "masculino"}, 
		{"02/07/2017", "PIO XII", "ARMA BLANCA",26, "masculino"},
		{"29/10/2017", "BUCARAMANGA ", "ARMA BLANCA",26, "masculino"}, 
		{"29/04/2017", "CAFÉ MADRID", "ARMA DE FUEGO",27, "masculino"}, 
		{"28/05/2017", "EL PABLON", "ARMA DE FUEGO",27, "masculino"},
		{"06/01/2017", "ESPERANZA", "ARMA DE FUEGO",28, "masculino"}, 
		{"26/11/2017", "COLORADOS ", "ARMA BLANCA",28, "femenino"}, 
		{"30/12/2017", "SAN CRISTOBAL ", "ARMA DE FUEGO",28, "masculino"}, 
		{"03/03/2017", "CAFÉ MADRID", "ARMA BLANCA",29, "masculino"}, 
		{"14/05/2017", "MIRAFLORES", "ARMA DE FUEGO",29, "masculino"}, 
		{"06/08/2017", "CABECERA DEL LLANO", "ARMA DE FUEGO",29, "masculino"}, 
		{"28/01/2017", "LA INDEPENDENCIA", "ARMA DE FUEGO",30, "femenino"}, 
		{"26/02/2017", "OLAS II", "ARMA BLANCA",30, "masculino"}, 
		{"15/10/2017", "VILLA HELENA I ", "ARMA DE FUEGO",30, "masculino"}, 
		{"26/11/2017", "RICAURTE ", "ARMA BLANCA",30, "masculino"}, 
		
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
tabla2130b frame1 = new tabla2130b(); 
frame1.pack(); 
frame1.setVisible(true); 
} 
}