import javax.swing.*;

import java.awt.event.*;

import java.util.*;

import javax.swing.Timer;

public class Temporizador {

	public static void main(String[] args) {
		
		DameLaHora oyente=new DameLaHora();
		
		//instanciamos la clase Timer y creaci?n del objeto mitemporizador
		Timer mitemporizador=new Timer(5000, oyente); 
		
		mitemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener");
		
		System.exit(0);

	}

}
class DameLaHora implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {

			
			Date ahora=new Date();
			
			System.out.println("Te pongo la hora cada 5 sg: "+ahora);
		}
	}


