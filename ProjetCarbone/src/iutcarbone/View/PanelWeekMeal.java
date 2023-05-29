package iutcarbone.View;

import java.awt.FlowLayout;
import javax.swing.*;

import iutcarbone.AppMain;
import iutcarbone.Controler.ControllerButtons;
import iutcarbone.Model.Model;


public class PanelWeekMeal extends JPanel {

    private static final long serialVersionUID = 1L;
	private JLabel textGlo;
    private JPanel veganPanel;
    private JPanel vegetarianPanel;
    private JPanel beefPanel;
    private JPanel otherPanel;
    private JButton b1;
    private JTextArea veganTextArea;
    

	private JTextArea vegetarianTextArea;
    private JTextArea beefTextArea;
    private JTextArea otherTextArea;
    
    private Model m;

    public PanelWeekMeal(AppMain u, Model mod) {

        super(new FlowLayout());
        
        m = mod;

        textGlo = new JLabel("Indiquer le nombre de repas de chaque type pris par semaine");

        JLabel veganLabel = new JLabel("Vegan");
        veganTextArea = new JTextArea(1, 5);
        veganPanel = new JPanel();
        veganPanel.setLayout(new BoxLayout(veganPanel, BoxLayout.Y_AXIS));
        veganPanel.add(veganLabel);
        veganPanel.add(veganTextArea);

        JLabel vegetarianLabel = new JLabel("Végétarien");
        vegetarianTextArea = new JTextArea(1, 5);
        vegetarianPanel = new JPanel();
        vegetarianPanel.setLayout(new BoxLayout(vegetarianPanel, BoxLayout.Y_AXIS));
        vegetarianPanel.add(vegetarianLabel);
        vegetarianPanel.add(vegetarianTextArea);

        JLabel beefLabel = new JLabel("A base de boeuf");
        beefTextArea = new JTextArea(1, 5);
        beefPanel = new JPanel();
        beefPanel.setLayout(new BoxLayout(beefPanel, BoxLayout.Y_AXIS));
        beefPanel.add(beefLabel);
        beefPanel.add(beefTextArea);

        JLabel otherLabel = new JLabel("A base d'une autre viande ou d'un poisson");
        otherTextArea = new JTextArea(1, 5);
        otherPanel = new JPanel();
        otherPanel.setLayout(new BoxLayout(otherPanel, BoxLayout.Y_AXIS));
        otherPanel.add(otherLabel);
        otherPanel.add(otherTextArea);

        b1 = new JButton("Suite");

        this.add(textGlo);

        this.add(veganPanel);
        this.add(vegetarianPanel);
        this.add(beefPanel);
        this.add(otherPanel);

        this.add(b1);

        b1.addActionListener(new ControllerButtons(u, mod, this));
      
    }

	public JTextArea getVeganTextArea() {
		// TODO Auto-generated method stub
		return veganTextArea;
	}
	
	public JTextArea getVegetarianTextArea() {
		return vegetarianTextArea;
	}

	public void setVegetarianTextArea(JTextArea vegetarianTextArea) {
		this.vegetarianTextArea = vegetarianTextArea;
	}

	public JTextArea getBeefTextArea() {
		return beefTextArea;
	}

	public void setBeefTextArea(JTextArea beefTextArea) {
		this.beefTextArea = beefTextArea;
	}

	public JTextArea getOtherTextArea() {
		return otherTextArea;
	}

	public void setOtherTextArea(JTextArea otherTextArea) {
		this.otherTextArea = otherTextArea;
	}

	public void setVeganTextArea(JTextArea veganTextArea) {
		this.veganTextArea = veganTextArea;
	}
	

}


