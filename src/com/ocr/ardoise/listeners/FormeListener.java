package com.ocr.ardoise.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.ocr.ardoise.MyPane;

//ÉCOUTEUR POUR LE CHANGEMENT DE FORME
public class FormeListener implements ActionListener{
	
	MyPane drawPanel;
	Object square,circle;

	public FormeListener(MyPane pn, Object sq, Object cir) {
		
		drawPanel = pn;
		square = sq;
		circle = cir;
	}
	
	
	
  public void actionPerformed(ActionEvent e) {
    if(e.getSource().getClass().getName().equals("javax.swing.JMenuItem")){
      if(e.getSource()==square) drawPanel.setPointerType("SQUARE");
      else drawPanel.setPointerType("CIRCLE");
    }

  }    
}