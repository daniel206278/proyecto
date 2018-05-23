package Medellintablas;
import javax.swing.JTable; 
import javax.swing.JScrollPane; 
import javax.swing.JFrame; 
import java.awt.*; 
import java.awt.event.*;

public class tabla2130 extends JFrame {
public tabla2130() { 
super("Homicidios Medellín ordenados por el intervalo de 21-30 años");

//Array bidimensional de objetos con los datos de la tabla 
Object[][] data = { 
		{"09/02/2017", "AURES 1", "ARMA DE FUEGO",21, "masculino"} , 
		{"15/02/2017", "LA COLINA", "ARMA DE FUEGO",21, "masculino"} ,
		{"26/02/2017", "PAJARITO", "ARMA DE FUEGO",21, "masculino"} ,
		{"02/04/2017", "AURES", "ARMA DE FUEGO",21, "masculino"} ,
		{"06/04/2017", "SAN BERNARDO", "ARMA DE FUEGO",21, "masculino"} ,
		{"29/04/2017", "LA FRANCIA", "ARMA BLANCA",21, "masculino"} ,
		{"31/05/2017", "HECTOR ABAD GOMEZ", "ARMA BLANCA",21, "masculino"} , 
		{"13/06/2017", "CERRO EL VOLADOR", "ARMA DE FUEGO",21, "masculino"} , 
		{"08/09/2017", "AURES 1", "ARMA DE FUEGO",21, "masculino"} , 
		{"19/09/2017", "SANTANDER", "ARMA DE FUEGO",21, "masculino"} , 
		{"05/10/2017", "ESTACION VILLA", "ARMA BLANCA",21, "masculino"} , 
		{"06/10/2017", "EL SOCORRO", "ARMA DE FUEGO",21, "masculino"} , 
		{"09/10/2017", "EL SALADO", "ARMA DE FUEGO",21, "masculino"} , 
		{"17/10/2017", "BELENCITO", "ARMA DE FUEGO",21, "masculino"} , 
		{"20/10/2017", "TOSCANA", "ARMA DE FUEGO",21, "masculino"} , 
		{"18/11/2017", "CENTRO ADMINISTRATIVO", "ARMA BLANCA",21, "masculino"} , 
		{"06/12/2017", "CASTILLA", "ARMA DE FUEGO",21, "masculino"} , 
		{"15/12/2017", "SAN RAFAEL", "ARMA DE FUEGO",21, "masculino"} , 
		{"17/12/2017", "VDA.SAN JOSE DE LA LOMA", "ARMA DE FUEGO",21, "masculino"} , 
		{"01/01/2017", "EL RINCON", "ARMA DE FUEGO",22, "masculino"}, 
		{"22/01/2017", "LA COLINA", "ARMA DE FUEGO",22, "masculino"}, 
		{"20/02/2017", "VIA AL MAR", "ARMA DE FUEGO",22, "masculino"} ,
		{"10/04/2017", "PALERMO", "BOLSA PLASTICA",22, "masculino"} ,
		{"01/05/2017", "LAS ESTANCIAS", "ARMA DE FUEGO",22, "masculino"} , 
		{"31/05/2017", "EL VELODROMO", "CONTUNDENTES",22, "masculino"} ,
		{"07/06/2017", "DOCE DE OCTUBRE", "ARMA BLANCA",22, "masculino"},
		{"15/06/2017", "VDA. SAN JOSE LA LOMA S.C", "ARMA DE FUEGO",22, "masculino"} , 
		{"09/07/2017", "ALFONSO LOPEZ", "ARMA DE FUEGO",22, "masculino"} , 
		{"24/07/2017", "VDA.LA GABRIELA S.C", "ARMA DE FUEGO",22, "masculino"} , 
		{"07/08/2017", "ESTACION VILLA", "ARMA DE FUEGO",22, "masculino"} , 
		{"12/08/2017", "LAS INDEPENDENCIAS", "ARMA DE FUEGO",22, "masculino"} , 
		{"14/08/2017", "AURES", "ARMA DE FUEGO",22, "masculino"} , 
		{"23/08/2017", "TRICENTENARIO", "ARMA DE FUEGO",22, "masculino"} , 
		{"26/08/2017", "VDA.SAN PEDRO LA LOMA", "ARMA DE FUEGO",22, "masculino"} , 
		{"12/09/2017", "PABLO VI", "ARMA BLANCA",22, "femenino"} , 
		
		{"27/09/2017", "ESTACION VILLA", "ARMA DE FUEGO",22, "masculino"} , 
		{"08/10/2017", "NUEVOS CONQUISTADORES", "ARMA DE FUEGO",22, "masculino"} , 
		{"29/10/2017", "ESTACION VILLA", "CONTUNDENTES",22, "femenino"} , 
		{"08/11/2017", "VILLA SOFIA", "ARMA DE FUEGO",22, "masculino"} , 
		{"09/11/2017", "PRADO", "ARMA DE FUEGO",22, "masculino"} ,   
		{"12/11/2017", "LIMONAR 1", "ARMA DE FUEGO",22, "masculino"} , 
		{"13/11/2017", "MORAVIA", "ARMA BLANCA",22, "masculino"} , 
		{"03/12/2017", "VDA. SAN JOSE DE LA LOMA", "ARMA DE FUEGO",22, "masculino"} , 
		{"14/12/2017", "SAN BENITO", "ARMA BLANCA",22, "masculino"} , 
		{"14/01/2017", "SAN JAVIER 1", "ARMA BLANCA",23,"masculino"}, 
		{"14/01/2017", "KENNDEY", "ARMA DE FUEGO",23,"masculino"}, 
		{"17/01/2017", "SAN JOSE DE LA CIMA", "ARMA DE FUEGO",23, "masculino"} ,
		{"04/04/2017", "ESTACION VILLA", "ARMA DE FUEGO",23, "masculino"} ,
		{"21/04/2017", "LIMONAR","ARMA BLANCA",23, "masculino"} ,
		{"13/06/2017", "CARIBE", "ARMA DE FUEGO",23, "masculino"} , 
		{"29/06/2017", "TEJELO", "ARMA DE FUEGO ",23, "masculino"} , 
		{"11/07/2017", "AURES 1", "ARMA DE FUEGO",23, "masculino"} , 
		{"26/07/2017", "CARLOS E.RESTREPO", "BOLSA PLASTICA",23, "masculino"} , 
		{"09/08/2017", "ALTAVISTA", "ARMA DE FUEGO",23, "masculino"} , 
		{"14/08/2017", "NUEVOS CONQUISTADORES", "ARMA DE FUEGO",23, "masculino"} , 
		{"14/08/2017", "VDA. SAN JOSÉ DEL MANZANILLO", "ARMA DE FUEGO",23, "masculino"} ,      
		{"30/08/2017", "SAN PEDRO", "ARMA DE FUEGO",23, "masculino"} , 
		{"07/09/2017", "LA AGUACATELA", "ARMA BLANCA",23, "masculino"} , 
		{"09/09/2017", "AURES 1", "ARMA DE FUEGO",23, "masculino"} ,
		{"16/09/2017", "LA GLORIA", "ARMA DE FUEGO",23, "masculino"} , 
		{"17/09/2017", "PALERMO", "ARMA DE FUEGO",23, "masculino"} , 
		{"14/10/2017", "BARICHARA", "CONTUNDENTES",23, "femenino"} , 
		{"29/10/2017", "OLEODUCTO", "ARMA DE FUEGO",23, "masculino"} , 
		{"05/11/2017", "ANTONIO NARIÑO", "ARMA DE FUEGO",23, "masculino"} , 
		{"01/01/2017", "DOCE DE OCTUBRE", "ARMA DE FUEGO",24, "masculino"}, 
		{"05/02/2017", "LA ESPERANZA", "ARMA DE FUEGO",24, "masculino"} ,
		{"12/02/2017", "EL CHAGUALO", "ARMA DE FUEGO",24, "masculino"} ,
		{"13/02/2017", "VILLA SOFIA", "ARMA DE FUEGO",24, "masculino"} ,
		{"28/02/2017", "VDA.SAN JOSE DE LA MONTAÑA", "ARMA DE FUEGO",24, "masculino"} ,
		{"20/03/2017", "TRINIDAD C", "ARMA DE FUEGO",24, "masculino"} ,
		{"26/03/2017", "TRINIDAD", "ARMA DE FUEGO",24, "masculino"} ,
		{"07/04/2017", "BOMBONA", "ARMA BLANCA",24, "masculino"} ,
		{"17/04/2017", "VDA.MEDIA LUNA LAS PALMAS", "ARMA BLANCA",24, "masculino"} ,
		{"05/05/2017", "AURES 1", "ARMA DE FUEGO",24, "masculino"} , 
		{"11/05/2017", "JUAN XXIII", "ARMA BLANCA",24, "masculino"} ,
		{"21/05/2017", "LA CANDELARIA", "CONTUNDENTES",24, "masculino"} , 
		{"22/05/2017", "JORGE ELIECER GAITAN", "ARMA DE FUEGO",24, "masculino"} , 
		{"02/06/2017", "LA ESPERANZA", "ARMA DE FUEGO",24, "masculino"} , 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		{"11/06/2017", "VDA.PAJARITO S.C", "ARMA DE FUEGO",24, "masculino"} , 
		{"13/06/2017", "CERRO EL VOLADOR", "ARMA DE FUEGO",24, "masculino"},
		{"29/06/2017", "BOMBONA", "ARMA DE FUEGO ",24, "masculino"} , 
		{"09/07/2017", "VILLA TINA", "ARMA DE FUEGO",24, "masculino"} , 
		{"12/07/2017", "CERRO EL VOLADOR", "ARMA DE FUEGO",24, "masculino"} , 
		{"26/07/2017", "CARLOS E.RESTREPO", "BLOSA PLASTICA",24, "masculino"} , 
		{"27/07/2017", "LOS ALPES", "ARMA DE FUEGO",24, "masculino"} , 
		{"08/09/2017", "KENNEDY", "ARMA DE FUEGO",24, "masculino"} ,
		{"25/09/2017", "SAN BENITO", "ARMA DE FUEGO",24, "femenino"} , 
		{"03/12/2017", "ANTONIO NARIÑO", "ARMA DE FUEGO",24, "masculino"} , 
		{"13/12/2017", "CORDOBA", "ARMA DE FUEGO",24, "masculino"} , 
		{"20/12/2017", "LA FLORESTA", "ARMA DE FUEGO",24, "masculino"} , 
		{"21/12/2017", "CASTILLA", "ARMA DE FUEGO",24, "masculino"} , 
		{"11/01/2017", "VDA.PAJARITO", "ARMA DE FUEGO",25, "masculino"}, 
		{"22/01/2017", "LA COLINA", "ARMA DE FUEGO",25,"masculino"}, 
		{"28/01/2017", "ALTAVISTA", "ARMA DE FUEGO",25, "femenino"} ,
		{"02/02/2017", "SAN BENITO", "CINTURON",25, "femenino"} ,
		{"04/02/2017", "PERPETUO SOCORRO", "ARMA DE FUEGO",25, "masculino"} ,
		{"02/08/2017", "OLAYA HERRERA", "ARMA DE FUEGO",25, "masculino"} ,
		
		
		{"18/02/2017", "ESTACION VILLA", "ARMA DE FUEGO",25, "masculino"} ,
		{"22/02/2017", "VILLA NUEVA", "ARMA BLANCA",25, "masculino"} ,
		{"26/02/2017", "VDA.LA CUCHILLA", "ARMA BLANCA",25, "masculino"} ,
		{"11/03/2017", "LA CANDELARIA", " ARMA DE FUEGO ",25, "masculino"} ,
		{"04/04/2017", "BUENOS AIRES", "ARMA DE FUEGO",25, "masculino"} ,
		{"07/06/2017", "NUEVA VILLA DE LA IGUANA", "ARMA DE FUEGO",25, "masculino"} , 
		{"15/06/2017", "EL PLAYON DE LOS COMUNEROS", "ARMA DE FUEGO",25, "masculino"} , 
		{"23/06/2017", "FUENTE CLARA", "ARMA DE FUEGO",25, "masculino"} , 
		{"12/07/2017", "LA LOMA DE LOS BERNAL", "ARMA DE FUEGO",25, "masculino"} , 
		{"30/07/2017", "LOS ALPES", "ARMA DE FUEGO",25, "masculino"} , 
		{"02/08/2017", "OLAYA HERRERA", "ARMA DE FUEGO",25, "masculino"} , 
		{"10/08/2017", "ALTAVISTA", "ARMA DE FUEGO",25, "masculino"} , 
		{"19/08/2017", "LAS PALMAS", "ARMA BLANCA",25, "femenino"} , 
		{"26/08/2017", "VDA.SAN PEDRO LA LOMA", "ARMA DE FUEGO",25, "masculino"} , 
		{"24/10/2017", "FLORENCIA", "ARMA DE FUEGO",25, "masculino"} , 
		{"28/10/2017", "DOCE DE OCTUBRE", "ARMA DE FUEGO",25, "masculino"} , 
		{"31/10/2017", "BARRIO COLON", "ARMA BLANCA",25, "masculino"} , 
		{"09/11/2017", "CORDOBA", "ARMA DE FUEGO",25, "masculino"} , 
		{"23/11/2017", "AURES 1", "ARMA DE FUEGO",25, "masculino"} , 
		{"01/12/2017", "ESTACION VILLA", "ARMA BLANCA",25, "masculino"} , 
		{"01/02/2017", "ROBLEDO", "ARMA DE FUEGO",26, "masculino"} ,
		{"10/02/2017", "CAMPO VALDES", "ARMA DE FUEGO",26, "masculino"} ,
		{"24/05/2017", "EL DANUBIO", "ARMA DE FUEGO",26, "masculino"} , 
		{"24/05/2017", "VDA.EL PICACHO S.C", "ARMA DE FUEGO",26, "masculino"} , 
		{"12/07/2017", "LA LOMA DE LOS BERNAL", "ARMA DE FUEGO",26, "masculino"} , 
		{"16/07/2017", "DOCE DE OCTUBRE", "ARMA BLANCA",26, "masculino"} , 
		{"17/08/2017", "EL RINCON", "ARMA DE FUEGO",26, "masculino"} , 
		{"23/08/2017", "LAS ACACIAS", "ARMA DE FUEGO",26, "masculino"} , 
		{"27/09/2017", "GUAYAQUIL", "ARMA BLANCA",26, "masculino"} , 
		{"29/09/2017", "CASTILLA", "ARMA DE FUEGO",26, "masculino"} , 
		{"06/10/2017", "EL SOCORRO", "ARMA DE FUEGO",26, "masculino"} , 
		{"09/10/2017", "VDA.SAN JOSÉ DEL MANZANILLO", "ARMA DE FUEGO",26, "masculino"} ,    
		{"30/10/2017", "VILLA SOFIA", "ARMA DE FUEGO",26, "masculino"} ,
		{"10/11/2017", "PRADO", "ARMA DE FUEGO",26, "masculino"} , 
		{"08/12/2017", "EL PLAYON DE LOS COMUNEROS", "ARMA BLANCA",26, "masculino"} , 
		{"17/12/2017", "FATIMA", "BOLSA PLASTICA",26, "masculino"} , 
		{"01/01/2017", "EL RINCON", "ARMA BLANCA",27, "masculino"}, 
		{"31/01/2017", "NUEVOS CONQUISTADORES", "ARMA DE FUEGO",27, "masculino"} ,
		{"09/02/2017", "ESTACION VILLA", "ARMA BLANCA",27, "masculino"} ,
		{"04/04/2017", "PALO BLANCO", "ARMA BLANCA ",27, "masculino"} ,
		{"09/04/2017", "VDA.MEDIA LUNA PARTE ALTA", "ARMA DE FUEGO",27, "femenino"} , 
		{"21/04/2017", "BELALCAZAR", "CONTUNDENTES",27, "masculino"} ,
		{"12/05/2017", "CRISTO REY", "ARMA DE FUEGO",27, "masculino"} , 
		{"21/05/2017", "LAS GRANJAS", "ARMA BLANCA",27, "masculino"} , 
		{"21/05/2017", "EL RAIZAL", "ARMA BLANCA",27, "masculino"} , 
		{"15/06/2017", "EL PLAYON DE LOS COMUNEROS", "ARMA DE FUEGO",27, "masculino"} , 
		{"01/07/2017", "ESTACION VILLA", "ARMA BLANCA",27, "masculino"} , 
		{"01/08/2017", "LAS PALMAS", "ARMA BLANCA",27, "masculino"} ,
		{"19/08/2017", "SAN JAVIER", "ARMA DE FUEGO",27, "masculino"} , 
		{"21/08/2017", "SANTO DOMINGO", "ARMA BLANCA",27, "masculino"} , 
		{"23/08/2017", "ALTAVISTA", "ARMA DE FUEGO",27, "masculino"} , 
		{"31/08/2017", "EL CHAGUALO", "CUERDA/CADENA",27, "masculino"} ,
		{"08/09/2017", "AURES 1", "ARMA DE FUEGO",27, "masculino"} , 
		{"14/09/2017", "LAS BRISAS", "ARMA DE FUEGO",27, "masculino"} , 
		{"16/10/2017", "VDA.SAN JOSE DEL MANZANILLO", "ARMA DE FUEGO",27, "masculino"} , 
		{"17/10/2017", "CAMPO VALDES", "ARMA DE FUEGO",27, "masculino"} , 
		{"23/10/2017", "VILLA SOFIA", "ARMA DE FUEGO",27, "masculino"} , 
		{"08/11/2017", "EL RINCON", "ARMA DE FUEGO",27, "masculino"} , 
		{"29/11/2017", "ESTACION VILLA", "ARMA DE FUEGO",27, "masculino"} ,
		{"22/12/2017", "GIRARDOT", "BOLSA PLASTICA",27, "masculino"} ,
		{"16/01/2017", "EL PESEBRE", "ARMA DE FUEGO",28, "masculino"} ,
		{"05/02/2017", "LA ESPERANZA", "ARMA DE FUEGO",28, "masculino"} ,
		{"05/02/2017", "LA ESPERANZA", "ARMA DE FUEGO",28, "masculino"} ,
		{"03/03/2017", "VDA.PAJARITO S.C", "ARMA BLANCA ",28, "masculino"} ,
		{"06/03/2017", "SAN JOAQUIN", "ARMA DE FUEGO",28, "masculino"} ,
		{"30/03/2017", "ESTACION VILLA", "ARMA DE FUEGO",28, "masculino"} ,
		{"10/05/2017", "AURES 1", "ARMA DE FUEGO",28, "femenino"} , 
		{"03/06/2017", "LA PIÑUELA", "CINTAS/CINTURON",28, "femenino"} ,
		{"06/07/2017", "LA CAPILLA", "ARMA BLANCA",28, "masculino"} , 
		{"16/07/2017", "SANTA CRUZ", "ARMA BLANCA",28, "masculino"} ,
		{"25/07/2017", "LORETO", "ARMA DE FUEGO",28, "masculino"} , 
		{"25/07/2017", "LORETO", "ARMA DE FUEGO",28, "masculino"} , 
		{"19/10/2017", "ESTACION VILLA", "ARMA DE FUEGO",28, "masculino"} , 
		{"28/10/2017", "ROBLEDO", "ARMA DE FUEGO",28, "masculino"} , 
		{"26/11/2017", "EL PLAYON DE LOS COMUNEROS", "CONTUNDENTES",28, "masculino"} , 
		{"03/12/2017", "VDA.PIEDRAS BLANCAS", "ARMA DE FUEGO",28, "masculino"} , 
		{"10/12/2017", "KENNEDY", "ARMA DE FUEGO",28, "masculino"} ,
		{"12/12/2017", "SEVILLA", "ARMA DE FUEGO",28, "masculino"} , 
		{"18/12/2017", "SANTA MARGARITA", "ARMA DE FUEGO",28, "masculino"} , 
		{"29/03/2017", "LA FRANCIA", "ARMA DE FUEGO",29, "masculino"} ,
		{"11/06/2017", "CORDOBA", "ARMA BLANCA",29, "femenino"} , 
		{"02/08/2017", "JORGE ELIECER GAITAN", "ARMA BLANCA",29, "masculino"} , 
		{"02/10/2017", "ALTAMIRA", "ARMA DE FUEGO",29, "masculino"} , 
		{"16/10/2017", "BLANQUIZAL", "ARMA DE FUEGO",29, "masculino"} , 
		{"20/10/2017", "SANTA RITA", "ARMA DE FUEGO",29, "masculino"} , 
		{"08/11/2017", "HECTOR ABAD GOMEZ", "ARMA DE FUEGO",29, "masculino"} , 
		{"21/01/2017", "PALERMO", "ARMA BLANCA",30, "masculino"} ,
		{"31/01/2017", "LAS VIOLETAS", "ARMA DE FUEGO",30, "masculino"} ,
		{"25/02/2017", "ESTACION VILLA", "ARMA DE FUEGO",30, "femenino"} ,
		{"13/03/2017", "VDA.SAN JOSÉ DEL MANZANILLO","ARMA BLANCA",30,"masculino"} ,    
		{"02/04/2017", "JARDIN BOTANICO", "ARMA DE FUEGO",30, "masculino"} ,
		{"25/05/2017", "SAN BENITO", "ARMA DE FUEGO",30, "masculino"} , 
		{"22/06/2017", "OLAYA HERRERA", "ARMA DE FUEGO",30, "masculino"}, 
		{"08/07/2017", "HECTOR ABAD GOMEZ", "ARMA BLANCA",30, "masculino"} , 
		{"23/07/2017", "ESTACION VILLA", "ARMA DE FUEGO",30, "masculino"} , 
		{"02/08/2017", "ANTONIO NARIÑO", "ARMA DE FUEGO",30, "masculino"} , 
		{"04/08/2017", "JUAN XXIII", "ARMA DE FUEGO",30, "masculino"} , 
		{"17/08/2017", "SAN BENITO", "CUERDA/CADENA",30, "masculino"} ,
		{"28/09/2017", "LORENA", "ARMA DE FUEGO",30, "masculino"} , 
		{"27/10/2017", "ROSALES", "BOLSA PLASTICA",30, "masculino"} ,          
		
		
		
		
		
		
		
		
		
	
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