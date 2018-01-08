package com.ocr.ardoise;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

public class MyToolbar extends JToolBar {

	
	private static final long serialVersionUID = -3804908095297506059L;

	//Les boutons de la barre d'outils
	private JButton   carre = new JButton(new ImageIcon("images/carre.jpg")),
			rond = new JButton(new ImageIcon("images/rond.jpg")),
			bleu = new JButton(new ImageIcon("images/bleu.jpg")),
			rouge = new JButton(new ImageIcon("images/rouge.jpg")),
			vert = new JButton(new ImageIcon("images/vert.jpg"));
	
	// Les fonds de boutons :  
	private Color fondBouton = Color.white, fondBleu = Color.blue, fondRouge = Color.red, fondVert = Color.green;
	  
	private Color curColor = Color.blue;

	// Our constructor
	public MyToolbar() {

		super();
		


	}
	
	public void initToolBar() {
		
		this.carre.setBackground(fondBouton);
		this.rond.setBackground(fondBouton);
		
		this.bleu.setBackground(fondBleu);
		this.rouge.setBackground(fondRouge);
		this.vert.setBackground(fondVert);
		
		// Les formes 
	    this.add(carre);
	    this.add(rond);
	    
	    this.addSeparator();
	    
	    // Les couleurs :
	    this.add(bleu);
	    this.add(rouge);	
	    this.add(vert);	
	    
	    //Ce sont maintenant nos classes internes qui �coutent nos boutons 
	    vert.addActionListener(new BoutonVertListener());
	    bleu.addActionListener(new BoutonBleuListener());
	}
	

	// setter for the color :
	public void setColor(Color theColor) {

		curColor = theColor;
	}
	
	// setter for the color :
	public Color getColor() {

		return curColor;
	}
		
	
	  //Classe �coutant notre premier bouton
	  class BoutonVertListener implements ActionListener{
	    //Red�finition de la m�thode actionPerformed()
	    public void actionPerformed(ActionEvent arg0) {
	      curColor = Color.green;
	    }
	  }
	      
	  //Classe �coutant notre second bouton
	  class BoutonBleuListener implements ActionListener{
	    //Red�finition de la m�thode actionPerformed()
	    public void actionPerformed(ActionEvent e) {
	      curColor = Color.blue; 
	    }
	  }   
	
}
