package Practica2;

import java.awt.FlowLayout;



import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana extends JFrame implements ActionListener{
	JButton btn1, btn2, btn3, btn4;
	JLabel lb;
	
	public Ventana() {
		super ("Torres de Hanoi");
		ensamblar();
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	
	}
	 public void ensamblar(){
		 setLayout(new GridBagLayout());
		 GridBagConstraints con = new GridBagConstraints();
		// btn1.setFont(new Font ("Dialog",1,16));
		 btn1 = new JButton("Jugar");
		 btn2 = new JButton("Reglamento");
		 btn3= new JButton("Estadisticas");
		 btn4= new JButton("Ejemplo de juego");
		 lb= new JLabel();
		 
		 con.gridx=1;
		 con.gridy=0;
		 con.gridheight=1;
		 con.gridwidth=1;
		 con.weightx=0.0;
		 con.weighty=0.0;
		 con.fill= GridBagConstraints.NONE;
		 add(btn1, con);
				 
		 con.gridx=5;
		 con.gridy=0;
		 con.gridheight=1;
		 con.gridwidth=1;
		 con.weightx=2;
		 con.weighty=2;
		 con.fill= GridBagConstraints.NONE;
		 add(btn2,con);
		 
				 
		 con.gridx=1;
		 con.gridy=2;
		 con.gridheight=1;
		 con.gridwidth=1;
		 con.weightx=2;
		 con.weighty=2;
		 con.fill= GridBagConstraints.NONE;
		 add(btn3, con);
		 
		 con.gridx=5;
		 con.gridy=2;
		 con.gridheight=1;
		 con.gridwidth=1;
		 con.weightx=2;
		 con.weighty=2;
		 con.fill= GridBagConstraints.NONE;
		 add(btn4,con);
		 
		 
		 btn1.addActionListener(this);
		 btn2.addActionListener(this);
	 }
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1){
			Niveles nl=new Niveles();			
		}
		else if(e.getSource()==btn2){
			Reglas regla=new Reglas();
		}
		else if(e.getSource()==btn3){
			
		}
		else if(e.getSource()==btn4){
			
		}
	}

}
