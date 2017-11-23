package com.ocr.ardoise.listeners;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.ocr.ardoise.MyPane;

//ÉCOUTEUR POUR LE CHANGEMENT DE COULEUR
public class CouleurListener implements ActionListener{
	
	MyPane drawPanel;
	Object green,blue;
	
	public CouleurListener(MyPane pn,  Object green, Object blue) {
		
		drawPanel = pn;

		this.green = green;
		this.blue = blue;
	}
	
  public void actionPerformed(ActionEvent e) {
    System.out.println(e.getSource().getClass().getName());
    if(e.getSource().getClass().getName().equals("javax.swing.JMenuItem")){
      System.out.println("OK !");
      if(e.getSource()==green)drawPanel.setPointerColor(Color.green);
      else if(e.getSource()==blue)drawPanel.setPointerColor(Color.blue);
      else drawPanel.setPointerColor(Color.red);
    }

  }    
}