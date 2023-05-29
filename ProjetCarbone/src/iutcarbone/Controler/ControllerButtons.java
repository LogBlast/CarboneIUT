package iutcarbone.Controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import iutcarbone.AppMain;
import iutcarbone.Model.Model;
import iutcarbone.Model.WeekMeal;
import iutcarbone.View.PanelOrdi;
import iutcarbone.View.PanelWeekMeal;


public class ControllerButtons implements ActionListener {
	
	private AppMain appM;
	private Model mod;
	private PanelWeekMeal pwm;
	private PanelOrdi po;
	

	public ControllerButtons(AppMain appM, Model mode) {
		this.appM = appM;
		mod = mode;
	}
	
	
	public ControllerButtons(AppMain appM, Model mode, PanelWeekMeal pwm) {
		this.appM = appM;
		mod = mode;
		this.pwm = pwm;
	}
	
	
	public ControllerButtons(AppMain appM, Model mode, PanelOrdi po) {
		this.appM = appM;
		mod = mode;
		this.po = po;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// Si c'est le Panel WeekMeal (avec son bouton "Suite")
		
		if (e.getActionCommand().equals("Suite")) {
			double vegan;
			double vege;
			double boeuf;
			double autre;

	        mod.nouveauWeekMeal();
	        WeekMeal wm = mod.getWeakMeal();
	        
	        if(!pwm.getVeganTextArea().getText().isEmpty() && !pwm.getVegetarianTextArea().getText().isEmpty() && !pwm.getBeefTextArea().getText().isEmpty() && !pwm.getOtherTextArea().getText().isEmpty()) {
	        	vegan = Double.parseDouble(pwm.getVeganTextArea().getText());
	        	vege = Double.parseDouble(pwm.getVegetarianTextArea().getText());
	        	boeuf = Double.parseDouble(pwm.getBeefTextArea().getText());
	        	autre = Double.parseDouble(pwm.getOtherTextArea().getText());
	        	wm.setQuantite(vegan, vege, boeuf, autre);
	        	
	        	double co2 = wm.computeAllCO2();
	        	mod.ajoutMax(co2);
	        	mod.ajoutMin(co2);
	        	
	        	appM.changePanel();
				mod.setMode(e.getActionCommand());
				appM.updateAff(mod);
	        }
	        
	     // Si c'est le Panel Ordi (avec son bouton "Suivant")
	        
		} else if (e.getActionCommand().equals("Suivant")) {
			String optionSelected = po.getSelectedOption();
			
			if (optionSelected != null) {
				double co2Ordi = optionSelected.equals("ordinateur personnel") ? 2.5 : 5;
				
				System.out.println("Le C02 produit par votre ordinateur est " + co2Ordi);
				
				mod.ajoutMax(co2Ordi);
				mod.ajoutMin(co2Ordi);
			}
			
			appM.changePanel();
			mod.setMode(e.getActionCommand());
			appM.updateAff(mod);
			
			// Pour les autres Panels
			
		} else {
			appM.changePanel();
			mod.setMode(e.getActionCommand());
			appM.updateAff(mod);
		}
	}
}

