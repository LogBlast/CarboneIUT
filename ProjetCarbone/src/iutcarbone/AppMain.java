package iutcarbone;

import javax.swing.JFrame;

import iutcarbone.Model.Model;
import iutcarbone.View.PanelHandler;




public class AppMain {
	
	public JFrame frame; // Fenetre principale de l'interface graphique
	protected PanelHandler panHand; // Instance de la classe PanelHandler pour gerer les panneaux
	private String lastButtonPressed;
	private Model mod;

	
	

	public AppMain() {
		mod = new Model();
	    frame = new JFrame();
	    panHand = new PanelHandler(this, frame,mod);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(700, 100);
	    frame.setLocationRelativeTo(null);
	    frame.setVisible(true);
	}
	
	public void changePanel() {
		panHand.changePanel();
	}
	
	public void updateAff(Model model) {
        panHand.updateAff(model);
    }
	
	
	
	public static void main (String[] args){
		new AppMain(); 
	}
	

    public void setLastButtonPressed(String buttonName) {
        lastButtonPressed = buttonName;
    }

    public String getLastButtonPressed() {
        return lastButtonPressed;
    }
    
    public Model getMod() {
    	return mod;
    }
    
    public void setMod(Model mod) {
    	this.mod = mod;
    }
   
}
