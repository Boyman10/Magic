package com.ocr.ardoise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import com.ocr.ardoise.listeners.CouleurListener;
import com.ocr.ardoise.listeners.FormeListener;

public class MyMenu extends JMenuBar {


	private static final long serialVersionUID = 4939441333646325543L;

	private FormeListener fListener ;
	private CouleurListener cListener ;


	JMenu   fichier = new JMenu("Fichier"),
			edition = new JMenu("Edition"),
			forme = new JMenu("Forme du pointeur"),
			couleur = new JMenu("Couleur du pointeur");

	JMenuItem   nouveau = new JMenuItem("Effacer"),
			quitter = new JMenuItem("Quitter"),
			rond = new JMenuItem("Rond"),
			carre = new JMenuItem("Carré"),
			bleu = new JMenuItem("Bleu"),
			rouge = new JMenuItem("Rouge"),
			vert = new JMenuItem("Vert");


	public MyMenu () {

		super();
	}

	// Initialize menu
	public void initMenu(MyPane jp) {

		  //LES ÉCOUTEURS
		 fListener = new FormeListener(jp,carre,rond);
		 cListener = new CouleurListener(jp,vert, bleu);


		
		
		nouveau.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				jp.erase();
			}      
		});

		nouveau.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));

		quitter.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}      
		});
		quitter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, KeyEvent.CTRL_DOWN_MASK));

		fichier.add(nouveau);
		fichier.addSeparator();
		fichier.add(quitter);
		fichier.setMnemonic('F');

		carre.addActionListener(fListener);
		rond.addActionListener(fListener);
		forme.add(rond);
		forme.add(carre);

		rouge.addActionListener(cListener);
		vert.addActionListener(cListener);
		bleu.addActionListener(cListener);
		couleur.add(rouge);
		couleur.add(vert);
		couleur.add(bleu);

		edition.setMnemonic('E');
		edition.add(forme);
		edition.addSeparator();
		edition.add(couleur);

		// add elements to our Menu instance :
		this.add(fichier);
		this.add(edition);

	}


}
