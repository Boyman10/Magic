package com.ocr.ardoise;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JToolBar;

import com.ocr.ardoise.listeners.*;

public class Fenetre extends JFrame {
	 
	  /**
	 * 
	 */
	private static final long serialVersionUID = -2521743229850308459L;
	//LE MENU 
	  private MyMenu menuBar = new MyMenu();
	  


	  //LA BARRE D'OUTILS
	  JToolBar toolBar = new JToolBar();

	  JButton square = new JButton(new ImageIcon("images/carre.jpg")),
	    circle = new JButton(new ImageIcon("images/rond.jpg")),
	    red = new JButton(new ImageIcon("images/rouge.jpg")),
	    green = new JButton(new ImageIcon("images/vert.jpg")),
	    blue = new JButton(new ImageIcon("images/bleu.jpg"));
	  
	  //Notre zone de dessin
	  private MyPane drawPanel = new MyPane();
	  
	  //LES ÉCOUTEURS
	  private FormeListener fListener = new FormeListener(drawPanel,square,circle);
	  private CouleurListener cListener = new CouleurListener(drawPanel,green, blue);



	  public Fenetre(){
	    this.setSize(700, 500);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    // Initialize menu
	    menuBar.initMenu(drawPanel);
	    
	    this.setJMenuBar(menuBar);
	    
	    //Idem pour la barre d'outils
	    this.initToolBar();
	    //On positionne notre zone de dessin
	    this.getContentPane().add(drawPanel, BorderLayout.CENTER);
	    this.setVisible(true);    
	  }


	  //Initialise la barre d'outils
	  private void initToolBar(){


	    square.addActionListener(fListener);
	    circle.addActionListener(fListener);
	    red.addActionListener(cListener);
	    green.addActionListener(cListener);
	    blue.addActionListener(cListener);

	    toolBar.add(square);
	    toolBar.add(circle);

	    toolBar.addSeparator();
	    toolBar.add(red);
	    toolBar.add(blue);
	    toolBar.add(green);

	    this.getContentPane().add(toolBar, BorderLayout.NORTH);
	  }



}