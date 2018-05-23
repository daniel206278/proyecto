import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.ColorUIResource;

import Bogotatablas.*;
import Medellintablas.*;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
 
import java.awt.*;
import java.awt.event.*;
import java.util.Collections;

import acm.graphics.*;
import acm.program.*;
import cartagenatablas.*;
import BucaramangaTabla.*;
import CaliTablas.*;

public class ProyectoC extends GraphicsProgram implements ItemListener{
	
    /*constante*/
	private static final String FUENTE_TITULO = "ArialBlack-30";
	private JComboBox combo1;/*se incializa el JCombobox*/
 
    public String asesinato(String fecha ,String edad ,String como_murio ,String asesino) { /*metodo para organizar los datos de la vicitma*/
    	
		return ("fecha de asesinato: "+fecha+ "\nfue asesinado a sus " + edad +" años " + como_murio + " \nasesino: " + asesino);
    
    	
    }
   
    public ProyectoC() { /*constructor sin parametros para alamacenar el Jcombobox*/
    	 
    	/*diseno grafico del combobox*/
    	 UIManager.put("ComboBox.background", new ColorUIResource(247,106,106));
        combo1=new JComboBox();
        combo1.setFont(new Font("Serif", Font.BOLD, 20));
        combo1.setPreferredSize(new Dimension(500, 30));
        /*se agregan los items principales*/
        combo1.addItem("Escoje");
        combo1.addItem("Bogota");
        combo1.addItem("Bucaramanga");
        combo1.addItem("Cali");
        combo1.addItem("Cartagena");
        combo1.addItem("Medellin");
       
        
        
      /*relaciona los eventos con los items*/
        combo1.addItemListener(this);}
           

    
/*metodo principal para interacción usuario -aplicación*/
    public void itemStateChanged(ItemEvent e) {
    	/*condicional para darle una función a cada item*/
       
        if (combo1.getSelectedItem()=="Medellín") {
        	UIManager UI= new UIManager();
        	
        	UI.put("OptionPane.background", new ColorUIResource(14,242,242));
        	UI.put("Panel.background", new ColorUIResource(16,200,242)); 
           

        	UIManager.put("OptionPane.messageFont", new Font("Berlin Sans FB Demi", Font.BOLD, 17));
         
				Object[] victimas1 = {"fecha", "edad", "sexo"};
				String f = (String)JOptionPane.showInputDialog(
				                    null,
				                    "Elige el filtro de tu busqueda",
				                    "Medellín",
				                    JOptionPane.PLAIN_MESSAGE,
				                    null,
				                    victimas1,
				                "");
				if (f=="edad") {
					Object[] intervalos = {"0-10", "11-20", "21-30","31-40","41-50","51-60","61-70","71-80","81-90","91-100"};
					String i = (String)JOptionPane.showInputDialog(
					                    null,
					                    "Elige un intervalo de edad",
					                    "Fecha",
					                    JOptionPane.PLAIN_MESSAGE,
					                    null,
					                    intervalos,
				                  "");
					if(i=="0-10") {
						SimpleTable2 frame = new SimpleTable2(); 
				    	frame.pack(); 
				    	frame.setVisible(true); 

					}
					if(i=="11-20") {
						tabla1120 frame = new tabla1120(); 
				    	frame.pack(); 
				    	frame.setVisible(true); 

					}
					if(i=="21-30") {
						tabla2130 frame = new tabla2130(); 
				    	frame.pack(); 
				    	frame.setVisible(true); 

					}
					if(i=="31-40") {
						tabla3140 frame = new tabla3140(); 
				    	frame.pack(); 
				    	frame.setVisible(true); 

					}
					if(i=="41-50") {
						tabla4150 frame = new tabla4150(); 
				    	frame.pack(); 
				    	frame.setVisible(true); 

					}
					if(i=="51-60") {
						tabal5160 frame = new tabal5160(); 
				    	frame.pack(); 
				    	frame.setVisible(true); 

					}
					if(i=="61-70") {
						tabla6170 frame = new tabla6170(); 
				    	frame.pack(); 
				    	frame.setVisible(true); 

					}
					if(i=="71-80") {
						tabla8190 frame = new tabla8190(); 
				    	frame.pack(); 
				    	frame.setVisible(true); 

					}
					if(i=="81-90") {
						tabla8190 frame = new tabla8190(); 
				    	frame.pack(); 
				    	frame.setVisible(true); 

					}
					if(i=="91-100") {
						tabla91100 frame = new tabla91100(); 
				    	frame.pack(); 
				    	frame.setVisible(true); 

					}
					
					
				
				}
				if(f=="fecha"){
					SimpleTable2 frame = new SimpleTable2(); 
			    	frame.pack(); 
			    	frame.setVisible(true); 
				}
				if(f=="sexo") {
					Object[] intervalos1 = {"masculino", "femenino"};
					String i = (String)JOptionPane.showInputDialog(
					                    null,
					                    "Elige un intervalo de edad",
					                    "sexo",
					                    JOptionPane.PLAIN_MESSAGE,
					                    null,
					                    intervalos1,
					                    
				                  "");
					if(i=="masculino") {
						masculino frame1 = new masculino(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); 
					}
					if(i=="femenino") {
						femenino frame1 = new femenino(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); 
					}
			}
				}
        if (combo1.getSelectedItem()=="Cartagena") {
        	UIManager UI= new UIManager();
        	
        	UI.put("OptionPane.background", new ColorUIResource(14,242,242));
        	UI.put("Panel.background", new ColorUIResource(16,200,242)); 
           

        	UIManager.put("OptionPane.messageFont", new Font("Berlin Sans FB Demi", Font.BOLD, 17));
         
				Object[] victimas1 = {"fecha", "edad", "sexo"};
				String f = (String)JOptionPane.showInputDialog(
				                    null,
				                    "Elige el filtro de tu busqueda",
				                    "cartagena",
				                    JOptionPane.PLAIN_MESSAGE,
				                    null,
				                    victimas1,
				                "");
				if (f=="edad") {
					Object[] intervalos = {"0-10", "11-20", "21-30","31-40","41-50","51-60","61-70","71-80","81-90","91-100"};
					String i = (String)JOptionPane.showInputDialog(
					                    null,
					                    "Elige un intervalo de edad",
					                    "Fecha",
					                    JOptionPane.PLAIN_MESSAGE,
					                    null,
					                    intervalos,
				                  "");
					if(i=="0-10") {
						JOptionPane.showMessageDialog(combo1,
						         "no se registran asesinatos",
						          " 0-10 años ",
						          JOptionPane.PLAIN_MESSAGE);

					}
					if(i=="11-20") {
						tablac1120 frame1= new tablac1120(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); 

					}
					if(i=="21-30") {
						tablac2130 frame1 = new tablac2130(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); 

					}
					if(i=="31-40") {
						tablac3140 frame1 = new tablac3140(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); 

					}
					if(i=="41-50") {
						tablac4150 frame1 = new tablac4150(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); 

					}
					if(i=="51-60") {
						tablac5160 frame1 = new tablac5160(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); 

					}
					if(i=="61-70") {
						tablac6170 frame1 = new tablac6170(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); 

					}
					if(i=="71-80") {
						JOptionPane.showMessageDialog(combo1,
						         "no se registran asesinatos",
						          " 71-80 años ",
						          JOptionPane.PLAIN_MESSAGE);

					}
					if(i=="81-90") {
						JOptionPane.showMessageDialog(combo1,
						         "no se registran asesinatos",
						          " 81-90 años ",
						          JOptionPane.PLAIN_MESSAGE);

					}
					if(i=="91-100") {
						JOptionPane.showMessageDialog(combo1,
						         "no se registran asesinatos",
						          " 91-100 años ",
						          JOptionPane.PLAIN_MESSAGE);

					}
					
					
				
				}
				if(f=="fecha"){
					TablaCartagena frame1 = new TablaCartagena(); 
			    	frame1.pack(); 
			    	frame1.setVisible(true); 
				}
				if(f=="sexo") {
					Object[] intervalos1 = {"masculino", "femenino"};
					String i = (String)JOptionPane.showInputDialog(
					                    null,
					                    "Elige un intervalo de edad",
					                    "sexo",
					                    JOptionPane.PLAIN_MESSAGE,
					                    null,
					                    intervalos1,
					                    
				                  "");
					if(i=="masculino") {
						masculinoc frame1 = new masculinoc(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); 
					}
					if(i=="femenino") {
						femeninoc frame1 = new femeninoc(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); 
					}
			}
				}
        if (combo1.getSelectedItem()=="Bucaramanga") {
        	UIManager UI= new UIManager();
        	
        	UI.put("OptionPane.background", new ColorUIResource(14,242,242));
        	UI.put("Panel.background", new ColorUIResource(16,200,242)); 
           

        	UIManager.put("OptionPane.messageFont", new Font("Berlin Sans FB Demi", Font.BOLD, 17));
         
				Object[] victimas1 = {"fecha", "edad", "sexo"};
				String f = (String)JOptionPane.showInputDialog(
				                    null,
				                    "Elige el filtro de tu busqueda",
				                    "Bucaramanga",
				                    JOptionPane.PLAIN_MESSAGE,
				                    null,
				                    victimas1,
				                "");
				if (f=="edad") {
					Object[] intervalos = {"0-10", "11-20", "21-30","31-40","41-50","51-60","61-70","71-80","81-90","91-100"};
					String i = (String)JOptionPane.showInputDialog(
					                    null,
					                    "Elige un intervalo de edad",
					                    "Fecha",
					                    JOptionPane.PLAIN_MESSAGE,
					                    null,
					                    intervalos,
				                  "");
					if(i=="0-10") {
						tabla010B frame1= new tabla010B(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); 

					}
					if(i=="11-20") {
						tabla1120b frame1= new tabla1120b(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); 

					}
					if(i=="21-30") {
						tabla2130b frame1 = new tabla2130b(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); 

					}
					if(i=="31-40") {
						tabla3140b frame1 = new tabla3140b(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); 

					}
					if(i=="41-50") {
						tabla4150b frame1 = new tabla4150b(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); 

					}
					if(i=="51-60") {
						tabla5160b frame1 = new tabla5160b(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); 

					}
					if(i=="61-70") {
						tabla6170b frame1 = new tabla6170b(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); 

					}
					if(i=="71-80") {
						tabla7180b frame1= new tabla7180b(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); 

					}
					if(i=="81-90") {
						JOptionPane.showMessageDialog(combo1,
						         "no se registran asesinatos",
						          " 81-90 años ",
						          JOptionPane.PLAIN_MESSAGE);

					}
					if(i=="91-100") {
						JOptionPane.showMessageDialog(combo1,
						         "no se registran asesinatos",
						          " 91-100 años ",
						          JOptionPane.PLAIN_MESSAGE);

					}
					
					
				
				}
				if(f=="fecha"){
					BUCARAMANGA frame1 = new BUCARAMANGA(); 
			    	frame1.pack(); 
			    	frame1.setVisible(true); 
				}
				if(f=="sexo") {
					Object[] intervalos1 = {"masculino", "femenino"};
					String i = (String)JOptionPane.showInputDialog(
					                    null,
					                    "Elige un intervalo de edad",
					                    "sexo",
					                    JOptionPane.PLAIN_MESSAGE,
					                    null,
					                    intervalos1,
					                    
				                  "");
					if(i=="masculino") {
						masculinob frame1 = new masculinob(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); 
					}
					if(i=="femenino") {
						femeninob frame1 = new femeninob(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); 
					}
			}
				}
        if (combo1.getSelectedItem()=="Bogota") {
        	UIManager UI= new UIManager();
        	
        	UI.put("OptionPane.background", new ColorUIResource(14,242,242));
        	UI.put("Panel.background", new ColorUIResource(16,200,242)); 
           

        	UIManager.put("OptionPane.messageFont", new Font("Berlin Sans FB Demi", Font.BOLD, 17));
         
				Object[] victimas1 = {"fecha", "edad", "sexo"};
				String f = (String)JOptionPane.showInputDialog(
				                    null,
				                    "Elige el filtro de tu busqueda",
				                    "Bucaramanga",
				                    JOptionPane.PLAIN_MESSAGE,
				                    null,
				                    victimas1,
				                "");
				if (f=="edad") {
					Object[] intervalos = {"0-10", "11-20", "21-30","31-40","41-50","51-60","61-70","71-80","81-90","91-100"};
					String i = (String)JOptionPane.showInputDialog(
					                    null,
					                    "Elige un intervalo de edad",
					                    "Fecha",
					                    JOptionPane.PLAIN_MESSAGE,
					                    null,
					                    intervalos,
				                  "");
					if(i=="0-10") {
						JOptionPane.showMessageDialog(combo1,
				         "no se registran asesinatos",
				          " 0-10 años ",
				          JOptionPane.PLAIN_MESSAGE);

					}
					if(i=="11-20") {
						tabla1120b frame1= new tabla1120b(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); 

					}
					if(i=="21-30") {
						tabla2130b frame1 = new tabla2130b(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); 

					}
					if(i=="31-40") {
						tabla3140b frame1 = new tabla3140b(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); 

					}
					if(i=="41-50") {
						tabla4150b frame1 = new tabla4150b(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); 

					}
					if(i=="51-60") {
						tabla5160b frame1 = new tabla5160b(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); 

					}
					if(i=="61-70") {
						tabla6170b frame1 = new tabla6170b(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); 

					}
					if(i=="71-80") {
						tabla7180b frame1= new tabla7180b(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true);

					}
					if(i=="81-90") {
						JOptionPane.showMessageDialog(combo1,
						         "no se registran asesinatos",
						          " 81-90 años ",
						          JOptionPane.PLAIN_MESSAGE);

					}
					if(i=="91-100") {
						JOptionPane.showMessageDialog(combo1,
						         "no se registran asesinatos",
						          " 91-100 años ",
						          JOptionPane.PLAIN_MESSAGE);

					}
					
					
				
				}
				if(f=="fecha"){
					Bogota frame1 = new Bogota(); 
			    	frame1.pack(); 
			    	frame1.setVisible(true); 
				}
				if(f=="sexo") {
					Object[] intervalos1 = {"masculino", "femenino"};
					String i = (String)JOptionPane.showInputDialog(
					                    null,
					                    "Elige un intervalo de edad",
					                    "sexo",
					                    JOptionPane.PLAIN_MESSAGE,
					                    null,
					                    intervalos1,
					                    
				                  "");
					if(i=="masculino") {
						masculinoB frame1 = new masculinoB(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); 
					}
					if(i=="femenino") {
						femeninoB frame1 = new femeninoB(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); 
					}
			}
				}
        if (combo1.getSelectedItem()=="Cali") {
        	UIManager UI= new UIManager();
        	
        	UI.put("OptionPane.background", new ColorUIResource(14,242,242));
        	UI.put("Panel.background", new ColorUIResource(16,200,242)); 
           

        	UIManager.put("OptionPane.messageFont", new Font("Berlin Sans FB Demi", Font.BOLD, 17));
         
				Object[] victimas1 = {"fecha", "edad", "sexo"};
				String f = (String)JOptionPane.showInputDialog(
				                    null,
				                    "Elige el filtro de tu busqueda",
				                    "Cali",
				                    JOptionPane.PLAIN_MESSAGE,
				                    null,
				                    victimas1,
				                "");
				if (f=="edad") {
					Object[] intervalos = {"0-10", "11-20", "21-30","31-40","41-50","51-60","61-70","71-80","81-90","91-100"};
					String i = (String)JOptionPane.showInputDialog(
					                    null,
					                    "Elige un intervalo de edad",
					                    "Fecha",
					                    JOptionPane.PLAIN_MESSAGE,
					                    null,
					                    intervalos,
				                  "");
					if(i=="0-10") {
						c0_10 frame1= new c0_10(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); 

					}
					if(i=="11-20") {
						c11_20 frame1= new c11_20(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); 

					}
					if(i=="21-30") {
						/*c21_30 frame1 = new c21_30(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); */

					}
					if(i=="31-40") {
						/*tabla3140b frame1 = new tabla3140b(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); */

					}
					if(i=="41-50") {
						/*tabla4150b frame1 = new tabla4150b(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); */

					}
					if(i=="51-60") {
						/*tabla5160b frame1 = new tabla5160b(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); 
*/
					}
					if(i=="61-70") {
						/*tabla6170b frame1 = new tabla6170b(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); */}

					
					if(i=="71-80") {
						/*tabla7180b frame1= new tabla7180b(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); */

					}
					if(i=="81-90") {
						/*JOptionPane.showMessageDialog(combo1,
						         "no se registran asesinatos",
						          " 81-90 años ",
						          JOptionPane.PLAIN_MESSAGE);*/}

					
					if(i=="91-100") {
						/*JOptionPane.showMessageDialog(combo1,
						         "no se registran asesinatos",
						          " 91-100 años ",
						          JOptionPane.PLAIN_MESSAGE);
*/
					}
					
					
				
				}
				if(f=="fecha"){
					CaliTablas frame1 = new CaliTablas(); 
			    	frame1.pack(); 
			    	frame1.setVisible(true); 
				}
				if(f=="sexo") {
					Object[] intervalos1 = {"masculino", "femenino"};
					String i = (String)JOptionPane.showInputDialog(
					                    null,
					                    "Elige un intervalo de edad",
					                    "sexo",
					                    JOptionPane.PLAIN_MESSAGE,
					                    null,
					                    intervalos1,
					                    
				                  "");
					if(i=="masculino") {
						male frame1 = new male(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); 
					}
					if(i=="femenino") {
						female frame1 = new female(); 
				    	frame1.pack(); 
				    	frame1.setVisible(true); 
					}
			}
				}
    }
			
    
    
			
        
			
        
    
    
    

         
        

    //metodo principal donde se ejecuta el programa
    public void run() {
      
    	//estetica de la aplicacion
    	GImage fondoo = new GImage("fondoo.jpg" );//fondo
    	add(fondoo);
    	fondoo.setSize(1500,1200);//estetica de la aplicacion
    	GImage popo= new GImage("fondoo.jpg");
    	add(popo);
    	popo.setSize(500,100);
    	popo.setLocation(100,90);
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


    
