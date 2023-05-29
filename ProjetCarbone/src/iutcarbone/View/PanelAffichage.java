package iutcarbone.View;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import iutcarbone.AppMain;
import iutcarbone.Controler.ControllerButtons;
import iutcarbone.Model.Model;

public class PanelAffichage extends JPanel {
	
	private static final long serialVersionUID = -4009538197145142809L;

	private ControllerButtons cb;				// Contr�leur pour g�rer les boutons
	private AppMain appM;						// Instance de la classe AppMain
	JLabel ack;
		
   public PanelAffichage(AppMain u, Model mod) {
	   super(new FlowLayout());
	   
	   this.appM = u;
	   this.ack = new JLabel();
	   
	   JButton b2 = new JButton("Recommencer");
	   
	   this.add(ack);
	   this.add(b2);
	   
	   cb = new ControllerButtons(appM, mod);
	   b2.addActionListener(cb);
	}

   
   
   public void updatePanel(Model model) {
		ack.setText("Vous �mettez entre "+ model.getMin() +" et " + model.getMax() +"kg de C02 par semaine");
   }
	
}
