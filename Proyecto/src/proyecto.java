import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.ColorUIResource;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;

import acm.graphics.*;
import acm.program.*;
public class proyecto extends GraphicsProgram implements ItemListener{
    private JComboBox combo1;
    private JComboBox combo2;
    public String asesinato(String fecha ,String edad ,String como_murio ,String asesino) {
    	
		return ("fecha de asesinato: "+fecha+ "\nfue asesinado a sus " + edad +" a�os " + como_murio + " \nasesino: " + asesino);
    
    	
    }
   
    public proyecto() {
    	 
    	
    	 UIManager.put("ComboBox.background", new ColorUIResource(247,106,106));
        combo1=new JComboBox();
        combo1.setFont(new Font("Serif", Font.BOLD, 20));
        combo1.setPreferredSize(new Dimension(500, 30));
        combo1.addItem("Escoje");
        combo1.addItem("Amazonas");
        combo1.addItem("Antioquia");
        combo1.addItem("Arauca");
        combo1.addItem("Atlantico");
        combo1.addItem("Bogot� D.C");
        combo1.addItem("Boyaca");
        combo1.addItem("Caldas");
        combo1.addItem("Caquet�");
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
        combo1.addItem("Nari�o");
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
        
        
      
        combo1.addItemListener(this);}
           

    

    public void itemStateChanged(ItemEvent e) {
    	
        if (combo1.getSelectedItem()=="Amazonas") {
        	UIManager UI= new UIManager();
        	UI.put("OptionPane.background", new ColorUIResource(14,242,242));
        	UI.put("Panel.background", new ColorUIResource(16,200,242)); 

        	UIManager.put("OptionPane.messageFont", new Font("Berlin Sans FB Demi", Font.BOLD, 17));
        	  
        	//String Leticia = "<html><body><b style= \"font-size:14;color:black;\">Leticia </b></body></body></html>";
        
        	Object[] municipiosAMAZONAS = {"Territorio","El Encanto","La Chorrera" ,"La Pedrera","La Victoria","Leticia" ,"Mirit�-Paran�" ,"Puerto Alegr�a" ,"Puerto Nari�o","Puerto Santander","Tarapac�"};

        	Object s = (Object)JOptionPane.showInputDialog(
        	                    combo1
        	                    ,
        	                    "Escoje Un Muncipio,Ciudad o Corregimiento territorial"
        	                    ,
        	                    "AMAZONAS",
        	                    JOptionPane.PLAIN_MESSAGE,
        	                    null, municipiosAMAZONAS,
        	                    "");
        
        
			if (s=="Leticia") {
				Object[] victimas1 = {"Lindo Mar Galindo Silva", "Jean Carlos Caceres Vergara", "Wilson Galeano Rodriguez"};
				String f = (String)JOptionPane.showInputDialog(
				                    combo1,
				                    "Estos son los asesinatos registrados en el 2017 en Leticia:",
				                    "LETICIA",
				                    JOptionPane.PLAIN_MESSAGE,
				                    null,
				                    victimas1,
				                "");
				if (f=="Lindo Mar Galindo Silva") {
					JOptionPane.showMessageDialog(combo1,
						    asesinato("30/10/2017","22",", se le propin� una herida letal con un cuchillo a la altura del t�rax","primo de 13 a�os"),
						    "Lindo Mar Galindo Silva",
						    JOptionPane.PLAIN_MESSAGE);}
				if(f=="Jean Carlos Caceres Vergara"){
					JOptionPane.showMessageDialog(combo1,
						    asesinato("01/07/2017", "41" ,", fue hallado con  multiples heridas a la altura de la cabeza y una herida en el flanco izquierdo, al parecer causadas con arma blanca","se desconoce"),
						    "Jean Carlos Caceres Vergara",
						    JOptionPane.PLAIN_MESSAGE);}
				if(f=="Wilson Galeano Rodriguez") {
					JOptionPane.showMessageDialog(combo1,
						    "*01/01/2017 se desconoce datos de la v�ctima y del asesino",
						    "Wilson Galeano Rodriguez",
						    JOptionPane.PLAIN_MESSAGE);}
			}
			
			if (s=="Puerto Nari�o") {
				JOptionPane.showMessageDialog(combo1,
					    "No se registran asesinatos en el 2017",
					    "Puerto Nari�o",
					    JOptionPane.PLAIN_MESSAGE);
				}
			if(s=="El Encanto") {
				JOptionPane.showMessageDialog(combo1,
					    "No se registran asesinatos en el 2017",
					    "El Encanto",
					    JOptionPane.PLAIN_MESSAGE);}
			if(s=="La Chorrera") {
				JOptionPane.showMessageDialog(combo1,
					    "No se registran asesinatos en el 2017",
					    "La Chorrera",
					    JOptionPane.PLAIN_MESSAGE);}
			if(s=="La Pedrera") {
				JOptionPane.showMessageDialog(combo1,
					    "No se registran asesinatos en el 2017",
					    "La Pedrera",
					    JOptionPane.PLAIN_MESSAGE);}
			if(s=="La Victoria") {
				JOptionPane.showMessageDialog(combo1,
					    "No se registran asesinatos en el 2017",
					    "La Victoria",
					    JOptionPane.PLAIN_MESSAGE);}
			if(s=="Mirit�-Paran�") {
				JOptionPane.showMessageDialog(combo1,
					    "No se registran asesinatos en el 2017",
					    "Mirit�-Paran�",
					    JOptionPane.PLAIN_MESSAGE);
				if (s=="Puerto Alegr�a") {
					Object[] victimas = {"Robinson Trujillo Cubillos"};
					String f = (String)JOptionPane.showInputDialog(
					                    combo1,
					                    "Estos son los asesinatos registrados en el 2017 en Puerto Alegr�a:",
					                    "PUERTO ALEGRIA",
					                    JOptionPane.PLAIN_MESSAGE,
					                    null,
					                    victimas,
					                "");
					if (f=="Robinson Trujillo Cubillos") {
						JOptionPane.showMessageDialog(combo1,
							    asesinato("06/11/2017","34",", con un arma blanca durante una discusi�n","Ismael Perdomo Ram�rez(yerno)"),
							    "Robinson Trujillo Cubillos",
							    JOptionPane.PLAIN_MESSAGE);}
				}
				
			}
				if(s=="Puerto Santander") {
					Object[] victimas = {"Camilo Rodriguez Efaiteque","Ernesto Evelio Linares Villanueva","Jes�s Eliezer Linares Vald�s"};
					String f = (String)JOptionPane.showInputDialog(
					                    combo1,
					                    "Estos son los asesinatos registrados en el 2017 en Puerto Santander:",
					                    "PUERTO ALEGRIA",
					                    JOptionPane.PLAIN_MESSAGE,
					                    null,
					                    victimas,
					                "");
					if (f=="Camilo Rodriguez Efaiteque") {
						JOptionPane.showMessageDialog(combo1,
							    asesinato("23/01/2017","17",",se desconocen las causas del asesinato","Alezander Tafur Trochez"),
							    "Camilo Rodriguez Efaiteque",
							    JOptionPane.PLAIN_MESSAGE);}
					if (f=="Ernesto Evelio Linares Villanueva") {
						JOptionPane.showMessageDialog(combo1,
							    asesinato("19/10/2017","23","con un arma de fuego(la victima era venezolana)" , "parrillero(se desconoce)"),
							    "Ernesto Evelio Linares Villanueva",
							    JOptionPane.PLAIN_MESSAGE);}
					if (f=="Jes�s Eliezer Linares Vald�s") {
						JOptionPane.showMessageDialog(combo1,
							    asesinato("19/10/2017","23","con un arma de fuego(la vicitma era venezolana)" , "parrillero(se desconoce)"),
							    "Jes�s Eliezer Linares Vald�s",
							    JOptionPane.PLAIN_MESSAGE);}}
				if(s=="Tarapac�") {
					JOptionPane.showMessageDialog(combo1,
						    "No se registran asesinatos en el 2017",
						    "Tarapac�",
						    JOptionPane.PLAIN_MESSAGE);}
				}
			
        if (combo1.getSelectedItem()=="Antioquia") {
        	UIManager UI= new UIManager();
        	
        	UI.put("OptionPane.background", new ColorUIResource(14,242,242));
        	UI.put("Panel.background", new ColorUIResource(16,200,242)); 
           

        	UIManager.put("OptionPane.messageFont", new Font("Berlin Sans FB Demi", Font.BOLD, 17));
           Object[] municipiosAntioquia = {"Territorio","Abejorral","Abriaqu�","Alejandr�a","Argelia De Mar�a","Amalfi" 
        		   ,"Amag�",".Anor�",".Andes",".Angel�polis",".Angostura",".Anz�",".Arboletes",".Armenia",
        		   ".Apartad�",".Barbosa",".Bello",".Belmira",".Betania",".Betulia",".Brice�o",".Buritic�",".Caceres" 
        		   ,".Caicedo",".Caldas",".Campamento",".Ca�asgordas",".Caracol�",".Caramanta",".Carolina Del Pr�ncipe",
        		   ".Carepa",".Chigorod�",".Caucasia",".Cisneros",".Ciudad Bol�var",".Cocorn�",".Concepci�n",".Concordia",
        		   ".Dabeiba",".Donmat�as",".Ebejic�",".El Bagre",".El Carmen de Viboral",".El Pe�ol",".El Retiro",".El santuario", ".Entrerr�os",
        		   ".Envigado" ,".Fredonia",".Frontino",".Giraldo",".G�mez Plata",".Granada",".Guadalupe",".Guatap�",
        		   ".Heliconia",".Hispania",".Itag�i",".Ituango",".Jard�n",
        		   ".Jeric�",".La ceja",".La estrella",".La pintada",".La Uni�n",
        		   ".Liborina",".Maceo",".Marinilla",".Medellin",".Montebello",".Murind�",".Mutat�",
        		   ".Nari�o",".Nech�",".Necocli",".Olaya",".Peque",".Pueblorrico",".Puerto Berr�o",
        		   ".Puerto Nare",".Puerto Triunfo",".Puerto Valdivia",".Nari�o",".Nech�",".Remedios",
        		   ".Rionegro",".Sabanalarga",".Sabaneta",".Salgar",".San Andres De Cuerquita",".San Carlos",".San Francisco",
        		   ".San Jer�nimo",".San Jos� De La Monta�a",".San Juan De Urab�",".San Luis",".San Pedro De Urab�",".San Pedro De Los Milagros",".San Rafael"
        		   ,".Santa barbara",".Santa Fe De Antioquia",".Santo Domingo",".San Rosa De Osos",".San Vicente",".Segovia",".Sons�n",".Sopetr�n",".T�mesis",
        		   "Tapart�",".Taraz�",".Tarso",".Titiribi",".Toledo",".Turbo",".Uramita",".Urrao",
        		   ".Remedios",".Valdivia",".Valpara�so",".Venecia","Vegachi",".Vig�a Del Fuente",".Yal�","Yarumal",".Yolomb�",".Yond�",".Zaragoza"};
          
        	String s = (String)JOptionPane.showInputDialog(
        	                    combo1,
        	                    "Escoje Un Muncipio,Ciudad o Corregimiento territorial"
        	                    ,
        	                    "Antioquia",
        	                    JOptionPane.PLAIN_MESSAGE,
        	                    null, municipiosAntioquia,
        	                    "");
        	
        
			if (s=="Abejorral") {
				JOptionPane.showMessageDialog(combo1,
					    "No se registran asesinatos en el 2017",
					    "ABEJORRAL",
					    JOptionPane.PLAIN_MESSAGE);}
			if (s=="Abriaqu�") {
				JOptionPane.showMessageDialog(combo1,
					    "Lleva 13 a�os sin homicidios , puedes creerlo?",
					    "ABRIAQU�",
					    JOptionPane.PLAIN_MESSAGE);}
			if (s=="Alejandr�a") {
				JOptionPane.showMessageDialog(combo1,
					    "No se registran asesinatos en el 2017",
					    "ALEJANDR�A",
					    JOptionPane.PLAIN_MESSAGE);}
			if (s=="Argelia De Mar�a") {
				JOptionPane.showMessageDialog(combo1,
					    "No se registran asesinatos en el 2017",
					    "ARGELIA",
					    JOptionPane.PLAIN_MESSAGE);}
			if (s=="Amalfi") {
				Object[] victimas = {"Oscar Fernando Arboleda Villegas"};
				String f = (String)JOptionPane.showInputDialog(
				                    combo1,
				                    "Estos son los asesinatos registrados en el 2017 en Amalfi:",
				                    "AMALFI",
				                    JOptionPane.PLAIN_MESSAGE,
				                    null,
				                    victimas,
				                "");
				if (f=="Oscar Fernando Arboleda Villegas") {
					JOptionPane.showMessageDialog(combo1,
						    asesinato("04/05/2017","58",", con un arma de fuego","el presunto asesino podria ser un vecino."),
						    "Oscar Fernando Arboleda Villegas",
						    JOptionPane.PLAIN_MESSAGE);}
			}
			if (s=="Amag�") { //lastimosamente faltaron como 5 casos sueltos
				Object[] victimas = {"","Anonimos","Francisco Javier L�pez Palacios","Luisa Fernada Mej�a"};
				String f = (String)JOptionPane.showInputDialog(
				                    combo1,
				                    "Estos son los asesinatos registrados en el 2017 en Amag�:",
				                    "AMAG�",
				                    JOptionPane.PLAIN_MESSAGE,
				                    null,
				                    victimas,
				                "");
				if (f=="Luisa Fernada Mej�a") {
					JOptionPane.showMessageDialog(combo1,
						    asesinato("19/12/2017","13",", por varias pu�aladas en la espalda con un cuchillo","Juan Diego Zapata Mart�nez"),
						    "Luisa Fernanda Mej�a",
						    JOptionPane.PLAIN_MESSAGE);}
				if (f=="Francisco Javier L�pez Palacios") {
					JOptionPane.showMessageDialog(combo1,
						    asesinato("18/02/2017","25"," con un arma de fuego","Juan Daniel Fl�rez Cano"),
						    "Luisa Fernanda Mej�a",
						    JOptionPane.PLAIN_MESSAGE);}
				if(f=="Anonimos") {
					JOptionPane.showMessageDialog(combo1,
						    "*Un hombre fue asesinado con una granada el 6 de junio de 2017",
						    "Anonimos",
						    JOptionPane.PLAIN_MESSAGE);}
			}
			if(s=="Medellin") {
				Object[] victimas= {"",""};
				String f =(String)JOptionPane.showInputDialog(combo1,"Estos son los asesinatos registrados en medellin en el 2017",
						"MEDELLIN", JOptionPane.PLAIN_MESSAGE,
						null, victimas,"");
				if (f=="") {
					JOptionPane.showMessageDialog(combo1, 
							asesinato("","","",""),"",JOptionPane.PLAIN_MESSAGE);
				}
					
				}
					
				
			}
        
        }
			
    
			
            
        
    
        
 
   
    public void nombre2(ItemEvent z) {
        if (combo2.getSelectedItem()=="Leticia") {
         println("hola mundo");
         
        }
    }
    
    public void actionPerformed(ActionEvent e) {
    
    	if(e.getActionCommand().equals("cerrar")) {
    		combo2.setVisible(false);
    	}
    	
    }
    public void run() {
      
    	GImage fondo = new GImage("fondo.jpg" );
    	add(fondo);
    	fondo.setSize(1500,1200);
    	//setBackground(Color.BLUE);
    	add(combo1,50,50);
    	// add(new JButton("cerrar"),NORTH);
    	addActionListeners();
  
       
  
        }    
}
    
