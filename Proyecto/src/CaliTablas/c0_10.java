package CaliTablas;


import javax.swing.JTable; 
import javax.swing.JScrollPane; 
import javax.swing.JFrame; 
import java.awt.*; 
import java.awt.event.*;
public class c0_10 extends JFrame{
	public c0_10() 
	{ 
		super("Cali");

		//Array bidimensional de objetos con los datos de la tabla 
		Object[][] data = {
				{"01/19/2017", "URBANIZACION CALIMIO ", "LIQUIDOS",1, "femenino"}, 
				{"04/23/2017", "PIZAMOS I ", "ARMA BLANCA",5, "masculino"},
				{"04/30/2017", "LOS CONQUISTADORES", "ARMA DE FUEGO",5, "masculino"},
				{"08/13/2017", "LOS COMUNEROS II", "ARMA DE FUEGO",6, "femenino"},
				{"07/13/2017", "ALAMEDA", "ARMA BLANCA",7, "femenino"},
				{"07/13/2017", "ALAMEDA", "ARMA BLANCA",9, "masculino"},
				{"02/10/2017", "DESEPAZ INVICALI ", "ARMA DE FUEGO",10, "femenino"},
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
		c0_10 frame = new c0_10(); 
		frame.pack(); 
		frame.setVisible(true); 
		} 
		
		}

