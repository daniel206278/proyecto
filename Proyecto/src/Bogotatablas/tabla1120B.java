package Bogotatablas;


import javax.swing.JTable; 
import javax.swing.JScrollPane; 
import javax.swing.JFrame; 
import java.awt.*; 
import java.awt.event.*;

public class tabla1120B extends JFrame {

public tabla1120B() { 
super("Homicidios Bucaramanga ordenados por el intervalo de 0 a 10 años ");

//Array bidimensional de objetos con los datos de la tabla 
Object[][] data = { 
		
		{"23/03/2017", "EL POA", "ARMA BLANCA",11, "femenino"},
		{"26/12/2017", "ESPINOS I", "ARMA BLANCA",11, "femenino"},
		{"20/07/2017", "EDUARDO SANTOS", "ARMA DE FUEGO",13, "masculino"},
		{"22/06/2017", "LA BELLEZA", "ARMA DE FUEGO",14, "femenino"},
		{"14/01/2017", "LA FLORA ALTA", "ARMA DE FUEGO",15, "femenino"},
		{"28/07/2017", "JERUSALÉN", "ARMA DE FUEGO",15, "masculino"},
		{"23/01/2017", "GRAN BRITALIA", "ARMA DE FUEGO",16, "femenino"},
		{"06/02/2017", "SANTA VIVIANA", "ARMA DE FUEGO",16, "masculino"},
		{"06/02/2017", "SANTA VIVIANA", "ARMA DE FUEGO",16, "masculino"},
		{"28/04/2017", "EL CENTENARIO", "ARMA DE FUEGO",16, "masculino"},
		{"19/05/2017", "VILLA MARIA ", "ARMA DE FUEGO",16, "masculino"},
		{"20/05/2017", "CARACOLÍ", "ARMA DE FUEGO",16, "masculino"},
		{"24/05/2017", "SANTA LIBRADA", "ARMA BLANCA",16, "masculino"},
		{"23/07/2017", "URB. UNIR", "ARMA BLANCA",16, "masculino"},
		{"04/08/2017", "LAS BRISAS", "ARMA DE FUEGO",16, "masculino"},
		{"27/08/2017", "LA FISCALA", "ARMA DE FUEGO",16, "masculino"},
		{"27/08/2017", "LA LIBERTAD ", "ARMA DE FUEGO",16, "masculino"},
		{"22/10/2017", "LA ALAMEDA", "ARMA BLANCA",16, "masculino"},
		{"26/02/2017", "VILLAS DEL DORADO", "ARMA BLANCA",17, "masculino"},
		{"11/03/2017", "CENTRO FONTIBÓN", "ARMA BLANCA",17, "masculino"},
		{"12/03/2017", "TOCAIMITA SUR", "ARMA DE FUEGO",17, "masculino"},
		{"18/03/2017", "LOS TRES REYES - I ETAPA", "ARMA DE FUEGO",17, "masculino"},
		{"19/03/2017", "VISTA HERMOSA", "ARMA DE FUEGO",17, "masculino"},
		{"30/03/2017", "YOMASA NORTE", "ARMA BLANCA",17, "masculino"},
		{"26/05/2017", "LISBOA ", "ARMA BLANCA",17, "masculino"},
		{"10/06/2017", "PIAMONTE", "ARMA DE FUEGO",17, "masculino"},
		{"11/06/2017", "SANTA CECILIA", "ARMA DE FUEGO",17, "masculino"},
		{"17/06/2017", "ALFONSO LOPEZ ", "ARMA BLANCA",17, "masculino"},
		{"19/06/2017", "URB. LA CORUÑA", "ARMA BLANCA",17, "masculino"},
		{"15/07/2017", "PRÍNCIPE DE BOCHICA", "ARMA DE FUEGO",17, "masculino"},
		{"21/07/2017", "LA ROSITA", "ARMA BLANCA",17, "masculino"},
		{"13/08/2017", "VILLA DIANA", "ARMA BLANCA",17, "masculino"},
		{"12/09/2017", "GUACAMAYAS I-II ", "ARMA DE FUEGO",17, "masculino"},
		{"16/09/2017", "EL PARAISO", "ARMA DE FUEGO",17, "masculino"},
		{"16/09/2017", "EL PORVENIR", "ARMA DE FUEGO",17, "masculino"},
		{"24/09/2017", "SIERRA MORENA", "ARMA DE FUEGO",17, "masculino"},
		{"21/10/2017", "MARANDU", "ARMA DE FUEGO",17, "masculino"},
		{"09/11/2017", "7 DE AGOSTO", "ARMA DE FUEGO",17, "femenino"},
		{"11/11/2017", "SAMPER MENDOZA", "ARMA BLANCA",17, "masculino"},
		{"07/12/2017", "ALQUERÍA DE LA FRAGUA", "ARMA DE FUEGO",17, "masculino"},
		{"23/12/2017", "MOLINOS DEL SUR", "ARMA DE FUEGO",17, "femenino"},
		{"25/12/2017", "ENGATIVA", "ARMA DE FUEGO",17, "masculino"},
		{"12/01/2017", "SAN RAFAEL SUR", "ARMA DE FUEGO",18, "masculino"},
		{"14/01/2017", "LA FLORA ALTA", "ARMA DE FUEGO",18, "masculino"},
		{"20/01/2017", "LUCERO ALTO", "ARMA DE FUEGO",18, "masculino"},
		{"02/02/2017", "JUAN JOSE RONDON", "ARMA DE FUEGO",18, "masculino"},
		{"24/02/2017", "GUACAMAYAS", "ARMA DE FUEGO",18, "masculino"},
		{"03/03/2017", "VERSALLES", "ARMA DE FUEGO",18, "masculino"},
		{"10/03/2017", "SANTA FE ", "ARMA BLANCA",18, "masculino"},
		{"02/04/2017", "LA PORTADA", "ARMA BLANCA",18, "masculino"},
		{"09/04/2017", "CARVAJAL", "ARMA BLANCA",18, "masculino"},
		{"26/04/2017", "LAURELES LA ESTACIÓN", "ARMA DE FUEGO",18, "masculino"},
		{"29/04/2017", "BRASILIA SUR", "ARMA BLANCA",18, "masculino"},
		{"14/05/2017", "DIVINO NIÑO", "ARMA BLANCA",18, "masculino"},
		{"20/05/2017", "PREDIO LA VEGA", "ARMA DE FUEGO",18, "masculino"},
		{"26/07/2017", "ISLANDIA", "ARMA DE FUEGO",18, "masculino"},
		{"06/08/2017", "EL ANHELO", "ARMA DE FUEGO",18, "masculino"},
		{"20/08/2017", "POTRERITO", "ARMA BLANCA",18, "masculino"},
		{"24/08/2017", "EL TANQUE ", "ARMA BLANCA",18, "masculino"},
		{"25/08/2017", "EL TESORO", "ARMA DE FUEGO",18, "masculino"},
		{"17/10/2017", "LOS NARANJOS", "ARMA DE FUEGO",18, "masculino"},
		{"23/10/2017", "VALPARAISO", "ARMA BLANCA",18, "masculino"},
		{"24/10/2017", "JERUSALÉN", "ARMA BLANCA",18, "masculino"},
		{"23/11/2017", "BOSQUE DE LOS LAGARTOS", "ARMA DE FUEGO",18, "masculino"},
		{"30/11/2017", "RINCON DE BRITALIA", "ARMA BLANCA",18, "masculino"},
		{"17/12/2017", "LUCERO ALTO", "ARMA DE FUEGO",18, "masculino"},
		{"22/12/2017", "URB. LA MERCED SUR", "ARMA DE FUEGO",18, "masculino"},
		{"24/12/2017", "SAN FRANCISCO", "ARMA BLANCA",18, "masculino"},
		
		{"24/12/2017", "SAN FRANCISCO", "ARMA BLANCA",18, "masculino"},
		{"08/01/2017", "COMPARTIR", "ARMA BLANCA",19, "masculino"},
		{"21/01/2017", "MEXICO", "ARMA BLANCA",19, "masculino"},
		{"10/02/2017", "TINTALITO", "ARMA DE FUEGO",19, "masculino"},
		{"12/02/2017", "SANTA FE", "ARMA BLANCA",19, "masculino"},
		{"26/02/2017", "PARQUE LA JOYA", "ARMA DE FUEGO",19, "masculino"},
		{"04/03/2017", "LOS LACHES", "ARMA BLANCA",19, "masculino"},
		{"05/03/2017", "SAN JOSE ", "ARMA BLANCA",19, "masculino"},
		{"12/03/2017", "SANTA ROSA DE LIMA", "ARMA BLANCA",19, "masculino"},
		{"15/03/2017", "VILLA SONIA", "ARMA DE FUEGO",19, "masculino"},
		{"02/04/2017", "URB. PUENTE ARANDA", "ARMA DE FUEGO",19, "masculino"},
		{"25/04/2017", "VILLA DEL CARMEN", "ARMA DE FUEGO",19, "masculino"},
		{"16/05/2017", "CARACOLÍ ", "ARMA BLANCA",19, "masculino"},
		{"03/06/2017", "LA MARIA", "ARMA BLANCA",19, "masculino"},
			{"05/06/2017", "CARVAJAL ", "ARMA DE FUEGO",19, "masculino"},
			{"09/06/2017", "BRASILIA I SECTOR", "ARMA DE FUEGO",19, "masculino"},
			{"10/06/2017", "ARBORIZADORA BAJA", "ARMA DE FUEGO",19, "masculino"},
			{"13/06/2017", "URB. FUCHA ", "ARMA DE FUEGO",19, "masculino"},
			
			
		
				
		{"06/01/2017", "PRADO VERANIEGO", "ARMA DE FUEGO",19, "masculino"},
		
		{"19/10/2017", "MIRADOR - NUTIBARA", "ARMA DE FUEGO",18, "masculino"},
		{"27/06/2017", "LA FORTALEZA", "ARMA DE FUEGO",18, "masculino"},
		
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
tabla1120B frame1 = new tabla1120B(); 
frame1.pack(); 
frame1.setVisible(true); 
} 
}