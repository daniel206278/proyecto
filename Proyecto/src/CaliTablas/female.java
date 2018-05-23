package CaliTablas;

import javax.swing.JTable; 
import javax.swing.JScrollPane; 
import javax.swing.JFrame; 
import java.awt.*; 
import java.awt.event.*;
public class female extends JFrame{
	public female() 
	{ 
		super("Cali");

		//Array bidimensional de objetos con los datos de la tabla 
		Object[][] data = {
				
				{"01/08/2017", "LOS CHORROS ", "ARMA DE FUEGO",18, "femenino"}, 
				
				{"01/10/2017", "EL RODEO  ", "ARMA DE FUEGO",18, "femenino"}, 
				
				{"01/12/2017", "CIUDAD CORDOBA ", "ARMA DE FUEGO",21, "femenino"}, 
				 
				{"01/14/2017", "ALTO NAPOLES ", "ARMA BLANCA",35, "femenino"}, 
				
				{"01/19/2017", "URBANIZACION CALIMIO ", "LIQUIDOS",1, "femenino"}, 
			
				{"01/27/2017", "EL REFUGIO ", "ARMA DE FUEGO",38, "femenino"},
				
				{"01/29/2017", "SUCRE ", "CONTUNDENTES",37, "femenino"},
				
				{"02/02/2017", "EL POBLADO II ", "ARMA DE FUEGO",24, "femenino"},
				
				{"02/04/2017", "EL RETIRO ", "ARMA DE FUEGO",13, "femenino"},
		
				{"02/10/2017", "AGUACATAL ", "ARMA DE FUEGO",31, "femenino"},
				{"02/10/2017", "DESEPAZ INVICALI ", "ARMA DE FUEGO",10, "femenino"},
				
				{"02/18/2017", "SAN NICOLAS ", "ARMA DE FUEGO",19, "femenino"},
				
				{"02/20/2017", "TIERRA BLANCA ", "ARMA DE FUEGO",21, "femenino"},
				
				{"02/26/2017", "SAN JUAN BOSCO", "ARMA BLANCA",35, "femenino"},
				
				{"03/09/2017", "PRIMAVERA ", "ARMA DE FUEGO",24, "femenino"},
				
				{"03/13/2017", "VALLADO", "ARMA BLANCA",16, "femenino"},
				
				{"03/19/2017", "URBANIZACION CALIMIO ", "ARMA DE FUEGO",23, "femenino"},
				
				{"03/20/2017", "URB.CIUDAD JARDIN ", "CONTUNDENTES",54, "femenino"},
				
				{"03/29/2017", "LA CAMPIÑA ", "ARMA DE FUEGO",27, "femenino"},
				
				{"03/30/2017", "EDUARDO SANTOS", "ARMA DE FUEGO",37, "femenino"},
		
				{"04/07/2017", "LOS COMUNEROS I", "ARMA DE FUEGO",28, "femenino"},
				
				{"04/09/2017", "SANTA FE", "ARMA BLANCA",29, "femenino"},
			
				{"04/13/2017", "SAN JUAN BOSCO ", "ARMA DE FUEGO",14, "femenino"},
				
				
				{"04/23/2017", "PIZAMOS I ", "ARMA BLANCA",45, "femenino"},
				
				{"04/24/2017", "NORMANDIA ", "ARMA DE FUEGO",39, "femenino"},
				
				{"04/26/2017", "SILOE ", "ARMA BLANCA",24, "femenino"},
				
				{"04/30/2017", "EL RETIRO ", "ARMA DE FUEGO",24, "femenino"},
				
				{"05/02/2017", "LA NUEVA BASE", "ARMA DE FUEGO",32, "femenino"},
				
				{"05/04/2017", "LOS NARANJOS ", "CONTUNDENTES",70, "femenino"},
				
				{"05/12/2017", "CIUDAD TALANGA ", "ARMA DE FUEGO",35, "femenino"},
				{"05/13/2017", "LOS LAGOS ", "ARMA DE FUEGO",53, "femenino"},
				
				{"05/15/2017", "VALLE GRANDE", "ARMA BLANCA",43, "femenino"},
				
				{"05/20/2017", "MARROQUIN I", "ARMA DE FUEGO",26, "femenino"},
				
				{"05/23/2017", "ALFONSO LOPEZ I", "ARMA DE FUEGO",28, "femenino"},
				
				{"05/24/2017", "CIUDADELA FLORALIA", "ARMA DE FUEGO",33, "femenino"},
				
				{"05/28/2017", "INV.LA FLORIDA", "ARMA DE FUEGO",55, "femenino"},
		
				{"06/04/2017", "CIUDAD 2000", "CONTUNDENTES",26, "femenino"},
				
				{"06/07/2017", "CGTO LA BUITRERA", "ARMA DE FUEGO",43, "femenino"},
				
				{"06/08/2017", "JORGE ISAACS", "CONTUNDENTE",21, "femenino"},
				
				{"06/11/2017", "SAN BENITO", "ARMA DE FUEGO",21, "femenino"},
	
				{"06/16/2017", "SAN JUDAS TADEO I", "ARMA DE FUEGO",22, "femenino"},
			
				{"06/17/2017", "EL JORDAN", "ARMA DE FUEGO",50, "femenino"},
				
				{"06/25/2017", "EDUARDO SANTOS", "ARMA DE FUEGO",29, "femenino"},
				{"06/25/2017", "POTRERO GRANDE", "ARMA DE FUEGO",58, "femenino"},
				
				{"07/02/2017", "UNION DE VIVIENDA POPULAR", "ARMA BLANCA",39, "femenino"},
			
				{"07/03/2017", "EL POBLADO", "ARMA DE FUEGO",19, "femenino"},
				
				{"07/10/2017", "LA INDEPENDENCIA", "CONTUNDENTES",23, "femenino"},
				{"07/11/2017", "JOSE M. MARROQUIN", "ARMA DE FUEGO",22, "femenino"},
				
				{"07/12/2017", "URB.SANTA ELENA", "ARMA DE FUEGO",27, "femenino"},
				
				{"07/13/2017", "ALAMEDA", "ARMA BLANCA",7, "femenino"},
			
				{"07/13/2017", "ALAMEDA", "ARMA BLANCA",24, "femenino"},
			
				{"07/23/2017", "CANEY", "CONTUNDENTES",53, "femenino"},
				
				
				{"07/27/2017", "CGTO LOS ANDES", "CONTUNDENTES",38, "femenino"},
			
				{"08/01/2017", "CANEY", "ARMA DE FUEGO",32, "femenino"},
				
				{"08/11/2017", "ANGEL DEL HOGAR", "CONTUNDENTES",32, "femenino"},
				{"08/11/2017", "PORVENIR", "ARMA BLANCA",32, "femenino"},
				
				{"08/13/2017", "LOS COMUNEROS II", "ARMA DE FUEGO",6, "femenino"},
			
				{"08/13/2017", "CIUDAD DE LOS ALAMOS", "CONTUNDENTES",25, "femenino"},
			
				{"08/18/2017", "NUEVA TEQUENDAMA", "ARMA BLANCA",46, "femenino"},
				{"08/19/2017", "LLANO VERDE", "ARMA BLANCA",27, "femenino"},
				
				{"08/23/2017", "MOJICA", "ARMA DE FUEGO",24, "femenino"},
				
				{"08/26/2017", "EL RETIRO", "ARMA DE FUEGO",38, "femenino"},
			
				{"09/08/2017", "SAN VICENTE", "ARMA DE FUEGO",36, "femenino"},
				
				{"09/09/2017", "CAMINO REAL-J BORRERO", "ARMA DE FUEGO",45, "femenino"},
				
				{"09/10/2017", "NAPOLES", "CONTUNDENTES",88, "femenino"},
				
				{"09/19/2017", "LA HACIENDA", "ARMA DE FUEGO",29, "femenino"},
			
				{"09/26/2017", "LAS CEIBAS", "ARMA DE FUEGO",37, "femenino"},
				
				{"10/01/2017", "INV. LA FLORIDA", "ARMA BLANCA",30, "femenino"},
				
				{"10/04/2017", "MARIANO RAMOS", "ARMA DE FUEGO",17, "femenino"},
				
				{"10/09/2017", "BOLIVARIANO", "ARMA BLANCA",15, "femenino"},
				
				{"10/16/2017", "JOSE M. MARROQUIN", "BLANCA",23, "femenino"},
				{"10/16/2017", "SUCRE", "ARMA DE FUEGO",32, "femenino"},
				{"10/16/2017", "SUCRE", "ARMA DE FUEGO",57, "femenino"},
		
		
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
		female frame = new female(); 
		frame.pack(); 
		frame.setVisible(true); 
		} 
		
		}