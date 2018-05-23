import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.ColorUIResource;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
 
import java.awt.*;
import java.awt.event.*;
import java.util.Collections;

import acm.graphics.*;
import acm.program.*;

public class proyecto extends GraphicsProgram implements ItemListener{
    /*constante*/
	private static final String FUENTE_TITULO = "ArialBlack-30";
	private JComboBox combo1;/*se incializa el JCombobox*/
 
    public String asesinato(String fecha ,String edad ,String como_murio ,String asesino) { /*metodo para organizar los datos de la vicitma*/
    	
		return ("fecha de asesinato: "+fecha+ "\nfue asesinado a sus " + edad +" años " + como_murio + " \nasesino: " + asesino);
    
    	
    }
   
    public proyecto() { /*constructor sin parametros para alamacenar el Jcombobox*/
    	 
    	/*diseño grafico del combobox*/
    	 UIManager.put("ComboBox.background", new ColorUIResource(247,106,106));
        combo1=new JComboBox();
        combo1.setFont(new Font("Serif", Font.BOLD, 20));
        combo1.setPreferredSize(new Dimension(500, 30));
        /*se agregan los items principales*/
        combo1.addItem("Escoje");
        combo1.addItem("Amazonas");
        combo1.addItem("Antioquia");
        combo1.addItem("Arauca");
        combo1.addItem("Atlantico");
        combo1.addItem("Bogotá D.C");
        combo1.addItem("Boyaca");
        combo1.addItem("Caldas");
        combo1.addItem("Caquetá");
        combo1.addItem("Cauca");
        combo1.addItem("Cesar");
        combo1.addItem("Choco");
        combo1.addItem("Cordoba");
        combo1.addItem("Cundinamarca");
        combo1.addItem("Guajira");
        combo1.addItem("Guania");
        combo1.addItem("Guaviare");
        combo1.addItem("Huila");
        combo1.addItem("Magdalena");
        combo1.addItem("Meta");
        combo1.addItem("Nariño");
        combo1.addItem("Norte De Santander");
        combo1.addItem("Putumayo");
        combo1.addItem("Quindio");
        combo1.addItem("Risaralda");
        combo1.addItem("San Andres Y Providencia");
        combo1.addItem("Santander");
        combo1.addItem("Sucre");
        combo1.addItem("Tolima");
        combo1.addItem("Valle Del Cauca");
        combo1.addItem("Vaupes");
        combo1.addItem("Vichada");
        
        
      /*relaciona los eventos con los items*/
        combo1.addItemListener(this);}
           

    
/*metodo principal para interacción usuario -aplicación*/
    public void itemStateChanged(ItemEvent e) {
    	/*condicional para darle una función a cada item*/
        if (combo1.getSelectedItem()=="Amazonas") {
        	UIManager UI= new UIManager();
        	UI.put("OptionPane.background", new ColorUIResource(14,242,242));/*diseño del pane*/
        	UI.put("Panel.background", new ColorUIResource(16,200,242)); /*diseño del pane*/

        	UIManager.put("OptionPane.messageFont", new Font("Berlin Sans FB Demi", Font.BOLD, 17));/*diseño del pane*/
        	  

        
        	Object[] CapitalAMAZONAS = {"Leticia"};
        	Object s = (Object)JOptionPane.showInputDialog(
        	                    null 
        	                    ,
        	                    "Escoje La capital de Amazonas"//mensaje del pane
        	                    ,
        	                    "AMAZONAS",//titulo
        	                    JOptionPane.PLAIN_MESSAGE,
        	                    null, CapitalAMAZONAS, //lista
        	                    "");
        
        
			if (s=="Leticia") {
				Object[] victimas1 = {"Lindo Mar Galindo Silva", "Jean Carlos Caceres Vergara", "Wilson Galeano Rodriguez"};
				String f = (String)JOptionPane.showInputDialog(
				                    null,
				                    "Estos son los asesinatos registrados en el 2017 en Leticia:",
				                    "LETICIA",
				                    JOptionPane.PLAIN_MESSAGE,
				                    null,
				                    victimas1,
				                "");
				if (f=="Lindo Mar Galindo Silva") {
					JOptionPane.showMessageDialog(combo1,
						    asesinato("30/10/2017","22",", se le propinó una herida letal con un cuchillo a la altura del tórax","primo de 13 años"),
						    "Lindo Mar Galindo Silva",
						    JOptionPane.PLAIN_MESSAGE);}
				if(f=="Jean Carlos Caceres Vergara"){
					JOptionPane.showMessageDialog(combo1,
						    asesinato("01/07/2017", "41" ,", fue hallado con  multiples heridas a la altura de la cabeza y una herida en el flanco izquierdo, al parecer causadas con arma blanca","se desconoce"),
						    "Jean Carlos Caceres Vergara",
						    JOptionPane.PLAIN_MESSAGE);}
				if(f=="Wilson Galeano Rodriguez") {
					JOptionPane.showMessageDialog(combo1,
						    "*01/01/2017 se desconoce datos de la víctima y del asesino",
						    "Wilson Galeano Rodriguez",
						    JOptionPane.PLAIN_MESSAGE);}
			}
			
        }
			
        if (combo1.getSelectedItem()=="Antioquia") {
        	UIManager UI= new UIManager();
        	
        	UI.put("OptionPane.background", new ColorUIResource(14,242,242));
        	UI.put("Panel.background", new ColorUIResource(16,200,242)); 
           

        	UIManager.put("OptionPane.messageFont", new Font("Berlin Sans FB Demi", Font.BOLD, 17));
           Object[] municipiosAntioquia = {"Medellín"};
          
        	String s = (String)JOptionPane.showInputDialog(
        	                    combo1,
        	                    "Escoje la capital de antioquia"
        	                    ,
        	                    "Antioquia",
        	                    JOptionPane.PLAIN_MESSAGE,
        	                    null, municipiosAntioquia,
        	                    "");
        	
        
			
			
			if(s=="Medellín") {
				
				Object[] victimas= {"Adrián Felipe Londoño","Adriana Sofia Hinestroza","Alejandro Sepúlveda Quintero","Alias 'la gomela'",
						"Alias 'Tazmania'","Alias’cachorro’","Alicia López Guisao","Ana Felisa Tamayo","Anderson Estiven","Anderson Suárez Arredondo",
						"Andrés Camilo Pineda ","Andrés Felipe Agudelo Díaz","Andrés Felipe Flórez Idarraga","Andrés Ortiz Álvarez","Ángelo Darwin Londoño Galeano",
						"Brayam Smith Arenas Rengifo","Carlos Alberto Barrios","Carlos Arturo Andrade Asprilla","Carlos Villamizar Mantilla","Conrado Calle Ocampo",
						"Cristian Alexis Jaramillo Sánchez","Dahian Alexander Carrero  ","Daihan Ferney Chaverra Marín ","Daniel Lopera Pineda ","Daniel Rojas Blandón ",
						"Daniel Stiven Rico Uribe","Deivy Christian Osorio","Edilson Danilo Murillo García","Edison Quintero Zapata ","Eduardo Alberto Oviedo Ávila",
						"Edwin Schneider Mejía Ramírez","Elcy Yamile Olaya Bolívar ","Erdinc Alper Yildiz","Estefanía Bernal Gaspar","Evelyn Dayana Yarce Molina ",
						"Federman Vanegas","Fernando Escobar Cardona","Ferney Herrera Escobar","Gabriel Martínez Franco","Gladys Yanteh Quintero Jaramillo","Gloria Elena Contreras Gutiérrez "
						,"Gustavo Adolfo Callejas Salas","Gustavo Adolfo Sossa Sampedro","Hernán Alexánder Cardona Pizarro","Isabel Cristina Cano Correa","Iván Darío Marín Buitrago",
						"Jaime Nelson Delgado","Jairo Alonso Aristizábal Morales ","Javier Andrés Lopera Barrera ","Jenifer Vanesa Vargas","Jesús Maldonado Garcés ","Jhon Alexander Múnera",
						"Jhonary Fernando Montoya Mejía","Johan Esteban Botero ","John Alexander Caro Correa","John Fernando Rodríguez Ruiz","John Freddy Ballesteros Córdova  ","John Jairo Gómez Suárez",
						"Jonatan Andrés Valle Mesa ","Jorge Enrique Sossa Martínez ","José Alexander Espinosa","José Antonio Ocampo ","José Guillermo García Rúa","José Manuel Rodríguez Navia",
						"Juan Camilo Guzmán Zapata","Juan Carlos Herrera Londoño","Juan Carlos Valera Triana","Juan David Ramírez Marín","Juan David Rios Higinio","Juan Esteban Bedoya Gutiérrez",
						"Juan Gabriel Cardona Restrepo","Juan Manuel Cano","Juan Wilson Espinal Hernández","Kavir Alonso Díaz Jiménez","Kelly Vanesa Henao ","Kevin Estrada Morales ",
						"Leidy Laura Burgos Chancí","Libardo Mariana Pastrana","Lina Patricia Ochoa Zea","Luis Albeiro Gómez","Luis Eduardo bolaños","Luis Felipe Cárdenas Vargas","Manuel Rodríguez Navia","Marlen Yesenia Diosa Cruz",
						"Nelson Darío Suárez ","Oscar  Cano Obando ","Óscar Darío Marín Arias ","Otoniel de Jesús Tirado Garcés","Paulina Tascón","Robin Alexander Estrada Ospina"};
				
				String f =(String)JOptionPane.showInputDialog(combo1,"Estos son los asesinatos registrados en medellin en el 2017",
						"MEDELLIN", JOptionPane.PLAIN_MESSAGE,
						null, victimas,"");
			
			
				if (f==" Andrés Camilo Pineda ") {//barrio 12 de ocutubre
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("01/01/2017","24","por una bala perdida","desconocido"),
				          " Andrés Camilo Pineda ",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f==" John Alexander Caro Correa") {//clínica el rosario 
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("01/01/2017","36","con un arma cortopunzante ","desconocido"),
				          " John Alexander Caro Correa.",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f==" Libardo Mariana Pastrana") {//barrio trinidad
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("01/01/2017","22","con un arma blanca","desconocido"),
				          " Libardo Mariana Pastrana",
				          JOptionPane.PLAIN_MESSAGE);}
				 
				if (f=="John Jairo Gómez Suárez"){//doce de octubre 
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("01/01/2017","34","con un arma de fuego ","desconocido"),
				          "  John Jairo Gómez Suárez",
				          JOptionPane.PLAIN_MESSAGE);}

				 

				if (f=="  Yiver Jiménez Díaz"){//bello horizonte
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("03/01/2017","4","por un golpe con una varilla metálica","enfermo mental(se desconoce el nombre"),
				          "  Yiver Jiménez Díaz",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f=="   Andrés Felipe Flórez Idarraga"){ //san isidro 
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("07/01/2017","34","por dos disparos en la cabeza","se desconoce"),
				          "   Andrés Felipe Flórez Idarraga",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f=="   Óscar Darío Marín Arias") {//Manrique
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("11/01/2017","34","por varias heridas de arma blanca","hijastro(se desconoce el nombre"),
				          "   Óscar Darío Marín Arias",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f=="   Alejandro Sepúlveda Quintero"){//loreto 
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("10/01/2017","25","por dos impactos de bala en el estomago y en las piernas","se desconoce"),
				          "   Alejandro Sepúlveda Quintero ",
				          JOptionPane.PLAIN_MESSAGE);}

				if (f=="   Federman Vanegas"){ //belen alta vista
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("13/01/2017","29","por cinco impactos de bala ","se desconoce"), 
				          "   Federman Vanegas",
				          JOptionPane.PLAIN_MESSAGE);}

				if (f==" Carlos Arturo Andrade Asprilla"){// En Robledo, en el barrio Cucaracho
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("15/01/2017","36","con un arma de fuego ","se desconoce"), 
				          "   Carlos Arturo Andrade Asprilla",
				          JOptionPane.PLAIN_MESSAGE);}


				if (f==" Daniel Stiven Rico Uribe"){// Barrio kenndey comuna doce de octubre
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("15/01/2017","23","por varios impactos de balas","se desconoce"), 
				          " Daniel Stiven Rico Uribe",
				          JOptionPane.PLAIN_MESSAGE);}

				if (f==" Uriel Antonio Arenas Guisao"){ //comuna 13 san javier
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("15/01/2017","23"," por resistirse a un robo con un arma blanca","se desconoce"), 
				          "   Uriel Antonio Arenas Guisao ",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f=="  Rodolfo Campillo Gambín"){ //barrio san fernando
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("15/01/2017","27","por multiples golpes de varios tipos  que tenían palos y bates","se desconocen los nombres de los agresores"), 
				          "   Rodolfo Campillo Gambín ",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f=="  Gustavo Adolfo Sossa Sampedro") {//kennedy 
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("15/01/2017","?","con un arma blanca por 5 puñaladas en los brazos abdomen y cabeza "," Robinson Arley Oquendo Sossa "),
				          "  Gustavo Adolfo Sossa Sampedro ",
				          JOptionPane.PLAIN_MESSAGE);}
				 
				if (f=="  Víctor Julio Hoyos Maz") {//  aranjuez 
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("25/01/2017","36","con un arma de fuego","  se desconoce "),
				          "  Víctor Julio Hoyos Maz ",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f=="  Johan Esteban Botero " ){   //  aranjuez 
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("26/01/2017","11","y arrollado por un camión","  se desconoce "),
				          "  Johan Esteban Botero ",
				          JOptionPane.PLAIN_MESSAGE);}


				if (f=="   Stephanie Moreno Castro"){ //belen
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("28/01/2017","25","por 3 disparos con arma de fuego","pareja sentimental"), 
				          "   Stephanie Moreno Castro",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f=="   Jhon Alexander Múnera"){//belen
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("30/01/2017","37","con un arma blanca","pareja sentimental"), 
				          "   Jhon Alexander Múnera",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f=="   Gladys Yanteh Quintero Jaramillo"){ // sector de conquistadores
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("31/01/2017","40","con un arma de fuego","pistoleros no identificados"), 
				          "   Gladys Yanteh Quintero Jaramillo",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f=="   Carlos Alberto Barrios"){ // sector de conquistadores
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("31/01/2017","45","con un arma blanca","  Ramiro de Jesús González Álvarez,"), 
				          "   Carlos Alberto Barrios",
				          JOptionPane.PLAIN_MESSAGE);}


				if (f=="   Sebastián Madrid Bedoya"){ // belen
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("31/01/2017","29","por varios impactos de bala con arma de fuego","  se desconoce"), 
				          "   Sebastián Madrid Bedoya",
				          JOptionPane.PLAIN_MESSAGE);}


				if (f=="   Samuel David Henao") {// comuna 13 san javier
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("31/01/2017","26","por 10 impactos de bala con arma de fuego","  se desconoce"), 
				          "   Samuel David Henao",
				          JOptionPane.PLAIN_MESSAGE);}

				 if (f=="  William Esteban Correa Cano"){//doce de octubre 
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("2/02/2017","27","por heridas con cuhillo , botellas y mano propia (esto se lo hicieron el primero de enero pero falleció el 2 de febrero "," José Andrés Buitrago Arango y Jhoana Andrea Tovar Pérez"),
				          "  William Esteban Correa Cano ",
				          JOptionPane.PLAIN_MESSAGE);}

				if (f=="Jaime Nelson Delgado"){ // barrio floresta
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("2/02/2017","45","con un arma de fuego al parecer por pertenecer a las AUC","  se desconoce"), 
				          " Jaime Nelson Delgado",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f=="Víctor Estiven Bedoya Zapata" ){// robledo
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("2/02/2017","27","por 5 impactos de bala dos en el pecho, una en el rostro, una en el cuello y otra en el brazo izquierdo y además fue golpeado" ," se desconoce"), 
				          " Víctor Estiven Bedoya Zapata",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f=="Paulina Tascón"){ // tejedo
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("3/02/2017","18","por un disparo en la boca" ," William David Pulgarín Upegui"), 
				          " Paulina Tascón",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f=="Conrado Calle Ocampo"){// robledo
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("5/02/2017","35","por varias puñaladas con cuchillas","  Durveney y Jhon Alexander David"), 
				          "Conrado Calle Ocampo",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f=="Juan Camilo Guzmán Zapata") {// barrio la esperanza comuna 12
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("5/02/2017","28","por un arma de fuego", " se desconoce"), 
				          "   Juan Camilo Guzmán Zapata",
				          JOptionPane.PLAIN_MESSAGE);}

				if (f=="Edwin Schneider Mejía Ramírez") {// barrio la esperanza comuna 12
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("5/02/2017","24","por un arma de fuego",  "se desconoce"), 
				          "    Edwin Schneider Mejía Ramírez",
				          JOptionPane.PLAIN_MESSAGE);}





				if (f=="Erdinc Alper Yildiz"){ // barrio colombia
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("4/02/2017","25","por varios impactos de bala(la vicitma era un turco)",  "se desconocen los nombres (iban en motocicleta)"), 
				          "    Erdinc Alper Yildiz",
				          JOptionPane.PLAIN_MESSAGE);}

				if (f=="Andrés Ortiz Álvarez" ){// bello 
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("9/02/2017","25","con un arma blanca", "David Andrés Arias Monsalve "  ), 
				          "Andrés Ortiz Álvarez",
				          JOptionPane.PLAIN_MESSAGE);}

				if (f==" Cristian Alexis Jaramillo Sánchez" ){// robledo diamante
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("9/02/2017","17","con un arma blanca", "se desconoce")  , 
				"Cristian Alexis Jaramillo Sánchez",
				          JOptionPane.PLAIN_MESSAGE);}

				if (f=="Deivy Christian Osorio"){// barrio Brasilia comuna 4 aranjuez
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("10/02/2017","26","con un arma de fuego", "se desconoce")  , 
				"Deivy Christian Osorio",
				          JOptionPane.PLAIN_MESSAGE);}

				if (f=="José Alexander Espinosa"){// barrio bello horizonte
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("10/02/2017","35","con un arma de fuego", "se desconoce")  , 
				"José Alexander Espinosa",
				          JOptionPane.PLAIN_MESSAGE);}
				 
                if (f=="Roberto Alirio Tapias Orrego") {//
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("10/02/2017","55","por actos desconocidos (encontraron al cadaver en descomposición)","Andrés Alexander Tobón Álvarez"),
				          "Roberto Alirio Tapias Orrego ",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f==" Brayam Smith Arenas Rengifo"){// aures 2 
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("15/02/2017","24","con un arma de fuego ","se desconoce")  , 
				" Brayam Smith Arenas Rengifo",
				          JOptionPane.PLAIN_MESSAGE);}





				if (f==" Juan Carlos Herrera Londoño"){// aures 2 
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("17/02/2017","32","mientras usaba el uniforme(era polica) en un enfrentamiento a bala  contra un grupo de delincuentes  ","menor de 17 años(se desconoce el nombre)"  ), 
				"Juan Carlos Herrera Londoño",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f==" John Fernando Rodríguez Ruiz"){// aures 2 
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("17/02/2017","27","Por impactos de bala en un enfrentamiento de la policía y grupo delincuencial ","se desconoce")  , 
				" John Fernando Rodríguez Ruiz",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f==" Luis Fernando Restrepo Henao"){// barrio Ocho de Marzo, en la comuna de Buenos Aires
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("16/02/2017","50","por una puñalada con un cuchillo en el pecho ","Jhorman Estiven Restrepo Acevedo(hijastro)"  ), 
				" Luis Fernando Restrepo Henao",
				          JOptionPane.PLAIN_MESSAGE);}

				if (f=="alias 'Tazmania'"){// Guayaquil , parque de las luces
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("17/02/2017","20-25","con un arma blanca",  "habitante de calle (se desconoce el nombre) "  ), 
				" alias 'Tazmania '",
				          JOptionPane.PLAIN_MESSAGE);}

				if (f=="Juan Carlos Varela Triana"){// barrio Belalcázar
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("18/02/2017","32","fue violentamente agredido y torturado hallado muerto en dentro de una maleta dentro de su carro ", "se desconoce")  , 
				" Juan Carlos Varela Triana ",
				          JOptionPane.PLAIN_MESSAGE);}



				if (f=="Carlos Villamizar Mantilla"){// barrio la floresta
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("18/02/2017","50","con un arma blanca", "se desconoce")  , 
				" Carlos Villamizar Mantilla ",
				          JOptionPane.PLAIN_MESSAGE);}

				/*if(f=="Fernando Escobar Cardona"){//comuna de Aranjuez
				JOptionPane.showMessageDialog(combo1,
				 " Fernando Escobar Cardona ",
				          JOptionPane.PLAIN_MESSAGE);}*/

				if(f=="Otoniel de Jesús Tirado Garcés"){//picacho
				JOptionPane.showMessageDialog(combo1,
				          asesinato("18/02/2017","54","por impactos con arma de fuego en Tórax y abdomen", "un hombre de tez trigueña y de unos 28 años de edad ( se desconoce el nombre)"  ), 
				" Otoniel de Jesús Tirado Garcés",
				          JOptionPane.PLAIN_MESSAGE);}

				if(f=="Santiago de Jesús Uribe"){//barrio Estación villa
				JOptionPane.showMessageDialog(combo1,
				          asesinato("18/02/2017","?","por cuatro impactos de bala con arma de fuego","se desconoce"), 
				"Santiago de Jesús Uribe Zapata",
				          JOptionPane.PLAIN_MESSAGE);}

				if(f=="Luis Albeiro Gómez"){//puente madera
				JOptionPane.showMessageDialog(combo1,
				          asesinato("21/02/2017","59","con un arma de fuego", "se desconoce" ), 
				"Luis Albeiro Gómez",
				          JOptionPane.PLAIN_MESSAGE);}







				if (f==" José Manuel Rodríguez Navia"){// comuna 13
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("28/02/2017","17","con un arma de fuego", "se desconoce"), 
				" José Manuel Rodríguez Navia",
				          JOptionPane.PLAIN_MESSAGE);

				if (f=="  Juan Gabriel Cardona Restrepo") {//  girardot 
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("22/02/2017","38","con un arma de fuego","  se desconoce "),
				          "  Juan Gabriel Cardona Restrepo",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f=="  Pedro José Córdoba Murillo") {//  comuna 13
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("21/02/2017","56","a golpes","  integrantes de grupos delicuenciales ( se desconoce nombres "),
				          "  Pedro José Córdoba Murillo",
				          JOptionPane.PLAIN_MESSAGE);}
				 
				if (f=="  Gustavo Adolfo Callejas Salas") {//  san antonio de prado
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("23/02/2017","?","con un arma de fuego","se desconoce"),
				          "  Gustavo Adolfo Callejas Salas",
				          JOptionPane.PLAIN_MESSAGE);}
				 
				 
				if (f=="  Juan David Ramírez Marín") {//  barrio Santa Fe de la Comuna 15-Guayabal
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("26/02/2017","?","con un arma de fuego por un disparo en la cabeza"," se desconoce"),
				          "  Juan David Ramírez Marín ",
				          JOptionPane.PLAIN_MESSAGE);}
				 
				 
				if (f=="  Yuliana Andrea Agudelo") {//  castilla 
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("27/02/2017","28","con un arma de fuego, 3 impactos de bala"," se desconoce"), 
				          "  Yuliana Andrea Agudelo ",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f=="  Manuel Rodríguez Navia") {//  comuna 13
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("28/02/2017","17","con un arma de fuego adentro de un autobús, recibió una bala en el pecho y dos en el cuello "," se desconoce"), 
				          "  Manuel Rodríguez Navia",
				          JOptionPane.PLAIN_MESSAGE);}
				 
				if (f=="  Alicia López Guisao") {//  barrio Olaya herrera comuna 7     
				JOptionPane.showMessageDialog(combo1,
				          asesinato("2/03/2017","32","con un arma de fuego "," sicarios encampuchados (se descon desconocen nombres)"),
				          "  Alicia López Guisao",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f==" Javier Andrés Lopera Barrera ") {// comuna 7 sector pajarito
				  JOptionPane.showMessageDialog(combo1,
				          asesinato("4/03/2017","28","con un arma blanca , tenia varia heridas con armas cortopulzantes ","se desconoce"),
				          "  Javier Andrés Lopera Barrera",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f==" Ricardo Franco López ") {// barrio belen la palma
				  JOptionPane.showMessageDialog(combo1,
				          asesinato("5/03/2017","68","con un arma de fuego por evitar un robo ","se desconoce"),
				          "  Ricardo Franco López",
				          JOptionPane.PLAIN_MESSAGE);}
				 
				if (f==" Yeison Stiven Cano Pérez ") {// Comuna 11 – Laureles – Estadio 
				JOptionPane.showMessageDialog(combo1,
				          asesinato("7/03/2017","27","con un arma de fuego ","se desconoce"),
				          "  Yeison Stiven Cano Pérez",
				          JOptionPane.PLAIN_MESSAGE);}
				 
				if (f==" Gloria Elena Contreras Gutiérrez ") {// comuna 4 barrio san pedro
				  JOptionPane.showMessageDialog(combo1,
				          asesinato("10/03/2017","50","por un fuerte golpe en la cabeza con un extintor  ","se desconoce"),
				          "  Alicia López Guisao",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f==" José Guillermo García Rúa") {//   
					JOptionPane.showMessageDialog(combo1,
				          asesinato("10/03/2017","53","por varios impactos de bala ","se desconoce"),
				          "  Alicia López Guisao",
				          JOptionPane.PLAIN_MESSAGE);}
				 
				if (f==" John Freddy Ballesteros Córdova ") {//   comuna la candelaria
				JOptionPane.showMessageDialog(combo1,
				          asesinato("12/03/2017","37","con 5 impactos  de bala  ","se desconoce"),
				          "  John Freddy Ballesteros Córdova ",
				          JOptionPane.PLAIN_MESSAGE);}
				 if (f=="Juan Manuel Cano") {//barrio robledo
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("13/03/2017","17","por arma de fuego y otras lesiones ","banda criminal los Triana de Robledo"),
				          " Juan Manuel Cano",
				          JOptionPane.PLAIN_MESSAGE);}


				if (f==" Andrés Felipe Agudelo Díaz ") {// san antonio de prado
				  JOptionPane.showMessageDialog(combo1,
				          asesinato("14/03/2017","30","con un arma de fuego ","se desconoce"),
				          "  Andrés Felipe Agudelo Díaz ",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f==" Jairo Alonso Aristizábal Morales ") {//  san antonio de prado
				  JOptionPane.showMessageDialog(combo1,
				          asesinato("14/03/2017","31","con un arma de fuego ","se desconoce"),
				          "  Alicia López Guisao",
				          JOptionPane.PLAIN_MESSAGE);}
				 
				if (f=="   Estefanía Bernal Gaspar") {//  barrio san javier
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("21/03/2017","13","con un arma de fuego ","su hermano de 15 años ( se desconoce el nombre)"),
				          "   Estefanía Bernal Gaspar",
				          JOptionPane.PLAIN_MESSAGE);}
				 
				if (f=="Weimar Darío Tejada Álvarez ") {// la loma – san cristobal
				   JOptionPane.showMessageDialog(combo1,
				          asesinato("24/03/2017","21","con un arma de fuego ","se desconoce"),
				          "  Weimar Darío Tejada Álvarez",
				          JOptionPane.PLAIN_MESSAGE);}
				 
				if (f==" Nelson Darío Suárez ") {//  
					JOptionPane.showMessageDialog(combo1,
				          asesinato("2/03/2017","49","con un arma de fuego ","se desconoce"),
				          "  Nelson Darío Suárez",
				          JOptionPane.PLAIN_MESSAGE);}
				 
				if (f=="Dahian Alexander Carrero  ") {//  santa cruz
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("28/03/2017","20","con un arma de fuego ","se desconoce"),
				          "  Alicia López Guisao",
				          JOptionPane.PLAIN_MESSAGE);}

				if (f==" Daihan Ferney Chaverra Marín ") {//  barrio picacho – san cristobal
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("28/03/2017","17","con un arma de fuego ","se desconoce"),
				          "  Alicia López Guisao",
				          JOptionPane.PLAIN_MESSAGE);}
				 
				if (f==" Jonatan Andrés Valle Mesa ") {//  sector Moravia
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("2/04/2017","30","por dos tiros en la cabeza con arma de fuego ","Fabio Alexánder Ramírez Higuita"),
				          "  Jonatan Andrés Valle Mesa  ",
				          JOptionPane.PLAIN_MESSAGE);}
				 
				if (f==" Sebastián Villa Godoy ") {//  buenos aires
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("4/04/2017","25","por 3 impactos de bala","se desconoce"),
				          "  Sebastián Villa Godoy  ",
				          JOptionPane.PLAIN_MESSAGE);}

				 
				if (f==" Weimar Emilio Henao Pardo ") {// comuna 10 
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("4/04/2017","23","por dos tiros en la cabeza con arma de fuego ","se desconoce"),
				          "  Jonatan Andrés Valle Mesa  ",
				          JOptionPane.PLAIN_MESSAGE);}




				if (f==" Sebastián Muñoz González") {// corregimineto san antonio de prado 
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("4/04/2017","27","por multiples heridas( se desconoce el arma que se uso) fuego ","se desconoce"),
				          "  Sebastián Muñoz González",
				          JOptionPane.PLAIN_MESSAGE);}

				if (f==" Stela Garcia Rojas") {// la palma , belen
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("6/04/2017","59","por arma de fuego , dos impactos de bala en la cabeza ","se desconoce"),
				          "  Stela Garcia Rojas",
				          JOptionPane.PLAIN_MESSAGE);}

				if (f==" Luis Felipe Cárdenas Vargas") {// barrio san bernardo
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("6/04/2017","21","por arma de fuego ","se desconoce"),
				          "  Luis Felipe Cárdenas Vargas",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f=="Juan Wilson Espinal Hernández") {// corregimiento san cristobal
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("7/04/2017","49","por 3 impactos de bala , dos en el cuello una en la cabeza ","se desconoce"),
				          "  Juan Wilson Espinal Hernández ",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f=="  Kavir Alonso Díaz Jiménez") {// barrio 20 de Julio de la comuna 13 San Javier.

				 JOptionPane.showMessageDialog(combo1,
				          asesinato("7/04/2017","38","por arma de fuego, tiro en la cabeza ","se desconoce"),
				          "  Kavir Alonso Díaz Jiménez",
				          JOptionPane.PLAIN_MESSAGE);}


				if (f=="Anderson Estiven") {//barrio villa nueva
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("7/04/2017","30-35","linchado, cuando intento robar una moto ","varias personas desconocidas "),
				          "Anderson Estiven",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f==" Kelly Vanesa Henao ") {//corregimiento santa elena
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("7/04/2017","27"," con un arma de fuego ( se dice que ella misma pagò para que la asesinaran","se desconoce"),
				          " Kelly Vanesa Henao ",
				          JOptionPane.PLAIN_MESSAGE);}

				if (f=="Elcy Yamile Olaya Bolívar ") {//barrio la colina
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("10/04/2017","34","por 10 puñaladas","Jhon Jairo Gonzalo Restrepo"),
				          " Elcy Yamile Olaya Bolívar ",
				          JOptionPane.PLAIN_MESSAGE);}

				if (f=="William de Jesús Muñoz Ardila") {//barrio nuevos conquistadores
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("10/04/2017","61","aparentemente ahorcado con un cable ","se desconoce"),
				          " William de Jesús Muñoz Ardila",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f=="Daniel Lopera Pineda ") {// santa elena
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("18/04/2017","24","con arma blanca "," se desconoce"),
				          " Daniel Lopera Pineda ",
				          JOptionPane.PLAIN_MESSAGE);}

				if (f=="Gabriel Martínez Franco") {//barrio guayabal
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("20/04/2017","52","con arma de fuego "," se desconoce"),
				          " Gabriel Martínez Franco ",
				          JOptionPane.PLAIN_MESSAGE);}

				if (f=="Manuel Antonio Gutiérrez Céspedes") { //
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("20/04/2017","77","con un arma cortopulzante","se desconoce"),
				          "  Manuel Antonio Gutiérrez Céspedes",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f==" Gabriel Martínez Franco") { //barrio Guayabal
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("20/04/2017","50","con arma de fuego , ocho disparos","se desconoce"),
				          "  Gabriel Martínez Franco",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f==" Ángelo Darwin Londoño Galeano") {//barrio cataluña
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("20/04/2017","33","por un tiro en la cabeza","se desconoce"),
				          "   Ángelo Darwin Londoño Galeano",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f=="José Antonio Ocampo ") { //el tesoro
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("22/04/2017","79","con arma de fuego ","se desconoce"),
				          " José Antonio Ocampo ",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f=="Sandra Patricia Córdoba Mosquera") {//barrio pesebre
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("24/04/2017","35","con un mazo de hierro","Alberto Roldán Torres Quiñones"),
				          " Sandra Patricia Córdoba Mosquera ",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f=="Leidy Laura Burgos Chancí") {//
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("20/04/2017","15","por una herida mortal a la altura del cuello y más varias en el tórax","se dice que fue Omar Andrés Henao Castaño"),
				          " Leidy Laura Burgos Chancí ",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f=="Adriana Sofia Hinestroza") {//
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("30/04/2017","2","por quemaduras en espalda y piernas y trauma craneoencefálico","Jessica Sepúlveda"),
				          " Adriana Sofia Hinestroza ",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f=="Jesús Maldonado Garcés ") {//san javier 2
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("5/05/2017","39","con un arma de fuego"," se desconoce"),
				          " Jesús Maldonado Garcés ",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f==" Juan David Rios Higinio") { //belen
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("7/05/2017","20","por un impacto de bala en su tórax ","se desconoce"),
				          " Juan David Rios Higinio ",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f=="Yorman Leandro Montoya") { //barrio aures 2
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("5/05/2017","?","por varios disparos"," se desconoce"),
				          " Yorman Leandro Montoya ",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f=="Pedro Leonel Muñoz Mesa") { //belen
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("7/05/2017","62","con arma blanca "," se desconoce"),
				          "  Pedro Leonel Muñoz Mesa ",
				          JOptionPane.PLAIN_MESSAGE);}

				if (f=="Adrián Felipe Londoño") {//
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("8/05/2017","32","por arma de fuego, 4 tiros ","se desconoce"),
				          " Adrián Felipe Londoño",
				          JOptionPane.PLAIN_MESSAGE);}

				if (f=="Ana Felisa Tamayo") {//barrio aranjuez
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("9/05/2017","94","por lesiones ocacionadas  ","se desconocen"),
				          " Ana Felisa Tamayo",
				          JOptionPane.PLAIN_MESSAGE);}

				if (f=="Evelyn Dayana Yarce Molina ") {//buenos aires
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("10/04/2017","36","fue hallada muerta por causas sospechosas ","se desconoce"),
				          " Evelyn Dayana Yarce Molina ",
				          JOptionPane.PLAIN_MESSAGE);}

				if (f=="Oscar  Cano Obando ") {//comuna 10
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("11/05/2017","32","por arma de fuego ", "se desconoce"),
				          " Oscar  Cano Obando ",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f==" Jhonary Fernando Montoya Mejía") {//barrio castilla
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("11/04/2017","31","por arma de fuego, tiro en la cabeza ","se desconoce"),
				          " Jhonary Fernando Montoya Mejía  ",
				          JOptionPane.PLAIN_MESSAGE);}

				if (f=="Iván Darío Marín Buitrago") {//belen
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("11/04/2017","?","por arma de fuego "," se desconoce"),
				          " Iván Darío Marín Buitrago ",
				          JOptionPane.PLAIN_MESSAGE);}

				if (f=="Ferney Herrera Escobar") {//san cristobal
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("11/05/2017","25","por arma de fuego","se desconoce"),
				          " Ferney Herrera Escobar  ",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f==" Wirgen Luis Villalba Hernández") {//
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("11/05/2017","19","por arma de fuego ","se desconoce"),
				          " Wirgen Luis Villalba Hernández ",
				          JOptionPane.PLAIN_MESSAGE);}

				if (f==" Marlen Yesenia Diosa Cruz") {// barrio san benito
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("12/05/2017","21","por arma de fuego, tiro en la cabeza "," se desconoce"),
				          " Marlen Yesenia Diosa Cruz ",
				          JOptionPane.PLAIN_MESSAGE);}



				if (f==" Weimar Alexis Álvarez Velásquez") {// barrio san benito
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("12/05/2017","26","por 54 heridas con arma blanca ","se desconoce"),
				          " Weimar Alexis Álvarez Velásquez",
				          JOptionPane.PLAIN_MESSAGE);}


				if (f=="Pedro Julio Correa Uribe ") {// san cristobal
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("13/05/2017","46","por ataques violentos desconocidos ","se desconoce"),
				          " Pedro Julio Correa Uribe  ",
				          JOptionPane.PLAIN_MESSAGE);}

				if (f=="Santiago Álvarez Rivera") {//nuevos conquistadores comuna 13
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("13/05/2017","23","por arma de fuego "," Yefrin Eduardo Serna Martinez"),
				          " Santiago Álvarez Rivera ",
				          JOptionPane.PLAIN_MESSAGE);}

				if (f=="Hernán Alexánder Cardona Pizarro") {//barrio trinidad
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("14/05/2017","27","por arma de fuego ","se desconoce"),
				          " Hernán Alexánder Cardona Pizarro",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f=="Juan Manuel Cano") {//barrio robledo
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("13/03/2017","17","por arma de fuego y otras lesiones ","banda criminal los Triana de Robledo"),
				          " Juan Manuel Cano",
				          JOptionPane.PLAIN_MESSAGE);}


				if (f=="Sergio Andrés Gómez Serna ") {//san cristobal
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("14/05/2017","28","por arma de fuego ","se desconoce"),
				          " Sergio Andrés Gómez Serna",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f=="Jenifer Vanesa Vargas") {//centro de medellin
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("14/05/2017","22","por arma blanca","se desconoce"),
				          " Jenifer Vanesa Vargas",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f==" Edison Quintero Zapata ") {//francisco antonio zea
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("16/05/2017","21","por arma de fuego ","se desconoce"),
				          "  Edison Quintero Zapata  ",
				          JOptionPane.PLAIN_MESSAGE);}

				if (f=="Kevin Estrada Morales ") {//barrio trinidad
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("17/05/2017","19","por arma de fuego ","se desconoce"),
				          " Kevin Estrada Morales ",
				          JOptionPane.PLAIN_MESSAGE);}

				if (f=="  Isabel Cristina Cano Correa") {// barrio san benito
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("19/05/2017","42","por tortura , se desconocen los detalles","Jhonatan Vargas Muñoz"),
				          "  Isabel Cristina Cano Correa ",
				          JOptionPane.PLAIN_MESSAGE);}
				 
				if (f=="  Luis Eduardo bolaños") {// manrique
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("21/05/2017","25","con un arma de fuego ","se desconoce"),
				          "  Luis Eduardo bolaños  ",
				          JOptionPane.PLAIN_MESSAGE);}
				 
				if (f==" Eduardo Alberto Oviedo Ávila") {// manrique
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("21/05/2017","25","con un arma de fuego ","se desconoce"),
				          " Eduardo Alberto Oviedo Ávila ",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f==" Yovany Rivas Ríos") { // Mirador de Calasanz
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("21/05/2017","20","con un arma de fuego ","se desconoce"),
				          " Yovany Rivas Ríos",
				          JOptionPane.PLAIN_MESSAGE);}
				 
				 
				 
				if (f=="   Juan Esteban Bedoya Gutiérrez") {//  el rincon
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("24/05/2017","15","por 6 impactos de bala  ","se desconoce"),
				          "  Juan Esteban Bedoya Gutiérrez ",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f=="  Anderson Suárez Arredondo") {//  barrio robledo
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("25/05/2017","16","con un arma de fuego ","se desconoce"),
				          "  Anderson Suárez Arredondo ",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f==" Jorge Enrique Sossa Martínez ") {//  barrio villahermosa
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("25/05/2017","59","con un arma de fuego ","se desconocen nombres"),
				          "  Jorge Enrique Sossa Martínez ",
				          JOptionPane.PLAIN_MESSAGE);}
				 
				if (f==" Daniel Rojas Blandón ") {//  san cristobal
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("25/05/2017","26","con un arma de fuego ","se desconoce"),
				          "  Daniel Rojas Blandón  ",
				          JOptionPane.PLAIN_MESSAGE);}
				 
				if (f==" Alias ‘la gomela´") {//  la candelaria
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("25/05/2017","16","con un arma de fuego ","se desconoce"),
				          "  Alias ‘la gomela´",
				          JOptionPane.PLAIN_MESSAGE);}
				 
				 
				if (f==" Alias’cachorro’") {//  la candelaria
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("25/05/2017","30","con un arma de fuego ","se desconoce"),
				          "  Alias’cachorro’",
				          JOptionPane.PLAIN_MESSAGE);}
				if (f==" Edilson Danilo Murillo García") {// villa del socorro
				 JOptionPane.showMessageDialog(combo1,
				          asesinato("29/05/2017","20","en un exorcismo en una iglesia cristiana , por razones desconocidads ","se desconocen nombres"),
				          " Edilson Danilo Murillo García ",
				          JOptionPane.PLAIN_MESSAGE);}
				////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				if (f=="Robin Alexander Estrada Ospina") {//barrio belen rincon
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("01/01/2017","22","con dos disparos en la cabeza","desconocido"),
				          " Robin Alexander Estrada Ospina ",
				          JOptionPane.PLAIN_MESSAGE);}
                if (f=="Cristian Alexander Tabares Vanegas ") {//barrio el salado
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("02/06/2017","20","por 9 impactos de bala ","desconocido"),
				          " Cristian Alexander Tabares Vanegas",
				          JOptionPane.PLAIN_MESSAGE);}
               
                if (f==" Juan José Guerra Pulgarín ") {//altavista
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("05/06/2017","17","con arma de fuego ","desconocido"),
				          " Juan José Guerra Pulgarín",
				          JOptionPane.PLAIN_MESSAGE);}
              
                if (f==" Juan Pablo Jiménez Flórez ") {//pueblito paisa
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("02/06/2017","?","con arma de fuego ","un policia"),
				          "Juan Pablo Jiménez Flórez",
				          JOptionPane.PLAIN_MESSAGE);}
              
                if (f=="Brahian Alexis Correa Sánchez") {//la esperanza
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("07/06/2017","18","por 9 impactos de bala ","desconocido"),
				          "Brahian Alexis Correa Sánchez",
				          JOptionPane.PLAIN_MESSAGE);}
                if (f=="Maritza Mesa Zapata") {//la esperanza
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("07/06/2017","14","por 5 impactos de bala ","desconocido"),
				          " ",
				          JOptionPane.PLAIN_MESSAGE);}
                if (f=="Jorge Andrés Mendoza Vallejo") {// nueva villa
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("07/06/2017","26","por 7 impactos de bala ","desconocido"),
				          "Jorge Andrés Mendoza Vallejo",
				          JOptionPane.PLAIN_MESSAGE);}
                if (f=="Carlos Alberto Granados Chaverra") {//barrio san martin - comuna 6
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("09/06/2017","22","con arma de fuego ","desconocido"),
				          "Carlos Alberto Granados Chaverra",
				          JOptionPane.PLAIN_MESSAGE);}
                if (f=="Sinthia Alexa Gallo Garcés") {// barrio castilla
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("11/06/2017","29","con arma blanca ","Cristian Eduardo Vanegas Muñoz"),
				          "Sinthia Alexa Gallo Garcés",
				          JOptionPane.PLAIN_MESSAGE);}
                if (f=="Brayan Stiven Gómez Pérez ") {//la rosa
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("11/06/2017","18","con arma blanca ","desconocido"),
				          "Brayan Stiven Gómez Pérez",
				          JOptionPane.PLAIN_MESSAGE);}
                if (f=="Edwin Santiago Higuita Muñoz") {//san cristobal
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("11/06/2017","19","con arma de fuego ","desconocido"),
				          " ",
				          JOptionPane.PLAIN_MESSAGE);}
                if (f=="Pío Alexander López") {//el poblado
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("11/06/2017","31","con arma blanca","desconocido"),
				          "Pío Alexander López",
				          JOptionPane.PLAIN_MESSAGE);}
                if (f=="Diego Mauricio Gómez de Ossa") {// robledo
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("13/06/2017","24","con arma de fuego","desconocido"),
				          "Diego Mauricio Gómez de Ossa",
				          JOptionPane.PLAIN_MESSAGE);}
                if (f=="Alejandro Galeano Gómez Muñoz") {// robledo
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("13/06/2017","20","con arma de fuego ","desconocido"),
				          "Alejandro Galeano Gómez Muñoz",
				          JOptionPane.PLAIN_MESSAGE);}
                if (f=="Duvan Alexander Londoño Llano") {// robledo
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("13/06/2017","21","con arma de fuego ","desconocido"),
				          "Duvan Alexander Londoño Llano",
				          JOptionPane.PLAIN_MESSAGE);}
                
                if (f=="Didi Stiven Jiménez") {// caribe comuna 5
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("13/06/2017","23","con arma de fuego(tiro en la cabeza)","desconocido"),
				          "Didi Stiven Jiménez",
				          JOptionPane.PLAIN_MESSAGE);}
                if (f=="Julián Andrés Pérez") {//playon de los comuneros
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("15/06/2017","27","con arma de fuego ","desconocido"),
				          "Julián Andrés Pérez",
				          JOptionPane.PLAIN_MESSAGE);}
                if (f=="Johan Andrés Galeano Cuartas") {//san cristobal
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("15/06/2017","22","con arma de fuego ","desconocido"),
				          "Johan Andrés Galeano Cuartas",
				          JOptionPane.PLAIN_MESSAGE);}
                if (f=="Alejandro Martínez Barrientos") {//san cristobal
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("15/06/2017","17","con arma de fuego","desconocido"),
				          "Alejandro Martínez Barrientos",
				          JOptionPane.PLAIN_MESSAGE);}
                if (f=="León Mauricio Bolívar") {//verda predegal de san cristobal(
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("15/06/2017","20","con arma de fuego","desconocido"),
				          "León Mauricio Bolívar",
				          JOptionPane.PLAIN_MESSAGE);}
                
                if (f=="Carolina Murillo Mendoza") {//barrio villa liliam couna 8
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("19/06/2017","15","con arma de fuego(bala perdida) ","desconocido"),
				          "Carolina Murillo Mendoza",
				          JOptionPane.PLAIN_MESSAGE);}
                
                if (f=="Juan David Legarda Mejía") {//
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("19/06/2017","20","con arma de fuego ","desconocido"),
				          "Juan David Legarda Mejía",
				          JOptionPane.PLAIN_MESSAGE);}
                
                if (f=="Edison Estíven Vásquez") {//
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("20/06/2017","20","con arma de fuego(disparo en la boca) ","desconocido"),
				          "Edison Estíven Vásquez",
				          JOptionPane.PLAIN_MESSAGE);}
                
                if (f==" ") {//
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("02/06/2017","0","con arma de fuego ","desconocido"),
				          " ",
				          JOptionPane.PLAIN_MESSAGE);}
                
                if (f=="  ") {//
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("02/06/2017","0","con arma de fuego ","desconocido"),
				          " ",
				          JOptionPane.PLAIN_MESSAGE);}
                
                if (f=="  ") {//
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("02/06/2017","0","con arma de fuego ","desconocido"),
				          " ",
				          JOptionPane.PLAIN_MESSAGE);}
                
                if (f=="  ") {//
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("02/06/2017","0","con arma de fuego ","desconocido"),
				          " ",
				          JOptionPane.PLAIN_MESSAGE);}
                
              
                if (f=="Lina Patricia Ochoa Zea") {//
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("05/07/2017","41","con arma de fuego ","desconocido"),
				          " ",
				          JOptionPane.PLAIN_MESSAGE);}
              
              
                if (f=="  ") {//
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("02/06/2017","0","con arma de fuego ","desconocido"),
				          " ",
				          JOptionPane.PLAIN_MESSAGE);}
              
                if (f=="  ") {//
				     JOptionPane.showMessageDialog(combo1,
				          asesinato("02/06/2017","0","con arma de fuego ","desconocido"),
				          " ",
				          JOptionPane.PLAIN_MESSAGE);}
              
                
               


			}
			}
        }
    
    }
    

         
        

    //metodo principal donde se ejecuta el programa
    public void run() {
      
    	//estetica de la aplicacion
    	GImage fondoo = new GImage("fondoo.jpg" );
    	add(fondoo);
    	fondoo.setSize(1500,1200);//estetica de la aplicacion
    	GLabel bienvenida = new GLabel("Homicidios del 2017 en  las capitales de los departamentos de Colombia");
       bienvenida.setColor(Color.BLACK);//estetica de la aplicacion
       bienvenida.setFont(FUENTE_TITULO);//estetica de la aplicacion
    	add(bienvenida,29,29);//estetica de la aplicacion
    	//setBackground(Color.BLUE);
    	add(combo1,60,60);//se agrega el comobo box de los departamentos
    	// add(new JButton("cerrar"),NORTH);
    	addActionListeners();// se agrega los eventos que se realizar en itemsevents
  
       
  
        }    
    
}

    
