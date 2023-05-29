package iutcarbone.View;


import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.JFrame;
import iutcarbone.AppMain;
import iutcarbone.Model.Model;


public class PanelHandler{
	
	protected AppMain appM;
	
	// Initialisation des différents panneaux
	
	private PanelWelcome panWel;
	private PanelComing panCom;
	private PanelAffichage panAff;
	private PanelWeekMeal panWeak;
	private PanelOrdi panOrd;
	
	// Initialisation du gestionnaire de layout et du conteneur
	
	private CardLayout card;
	private Container c;
	
	//////////////////////////////////////////////////////////////////////
	
	public PanelHandler(AppMain u, JFrame frame, Model mod) {
		
	    this.appM = u;
	    
	    // Récupération du conteneur principal et initialisation du gestionnaire de layout
	    
	    
        c = u.frame.getContentPane();
        card = new CardLayout();

        c.setLayout(card);
       
        // Création des différents panneaux et ajout dans le conteneur principal
        
        panWel = new PanelWelcome(appM, mod);
        panCom = new PanelComing(appM,mod);
        panWeak = new PanelWeekMeal(appM,mod);
        panAff = new PanelAffichage(appM, mod);
        panOrd = new PanelOrdi(appM,mod);
        
        c.add(panWel);
        c.add(panCom);
        c.add(panOrd);
        c.add(panWeak);
        c.add(panAff);
	}
	
	// Fonction pour changer de panneau
	
	public void changePanel() {
		card.next(c);
	}
	
	// Fonction pour mettre à jour le panneau d'affichage
	
	public void updateAff(Model model) {
        panAff.updatePanel(model);
    }
	
	// Fonction pour récupérer le panneau de la semaine de repas
	
	public PanelWeekMeal getPanelWeekMeal() {
		return this.panWeak;
	}
	
}