package com.ocr.ardoise;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;



public class Fenetre extends JFrame {
	 
	  /**
	 * 
	 */
	private static final long serialVersionUID = -2521743229850308459L;
	//LE MENU 
	  private MyMenu menuBar = new MyMenu();
	  


	  //LA BARRE D'OUTILS
	  //JToolBar toolBar = new JToolBar();
	  MyToolbar toolBar = new MyToolbar();
	  
	  JButton square = new JButton(new ImageIcon("images/carre.jpg")),
	    circle = new JButton(new ImageIcon("images/rond.jpg")),
	    red = new JButton(new ImageIcon("images/rouge.jpg")),
	    green = new JButton(new ImageIcon("images/vert.jpg")),
	    blue = new JButton(new ImageIcon("images/bleu.jpg"));
	  
	  //Notre zone de dessin
	  private MyPane drawPanel = new MyPane();
	  

	  public Fenetre(){
	    this.setSize(700, 500);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    // Initialize menu
	    menuBar.initMenu(drawPanel);
	    
	    this.setJMenuBar(menuBar);
	    
	    //Idem pour la barre d'outils
	    toolBar.initToolBar();
	    this.getContentPane().add(toolBar, BorderLayout.NORTH);
	    
	    //On positionne notre zone de dessin
	    this.getContentPane().add(drawPanel, BorderLayout.CENTER);
	    this.setVisible(true);    
	  }




}