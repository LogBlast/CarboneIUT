package iutcarbone.View;


import java.awt.FlowLayout;
import javax.swing.*;

import iutcarbone.AppMain;
import iutcarbone.Controler.ControllerButtons;
import iutcarbone.Model.Model;


public class PanelOrdi extends JPanel {
	private static final long serialVersionUID = -4009538197145142809L;

	private JLabel lab;
	private JRadioButton ordiPerso;
	private JRadioButton ordiIut;
	private JButton b1;
	private ButtonGroup group;
	private Model m;

	public PanelOrdi(AppMain u, Model mod) {
		super(new FlowLayout());
		m = mod;

		lab = new JLabel("Utilisez-vous votre ordinateur portable ou les machines en classes à l'IUT ? ");
		b1 = new JButton("Suivant");

		ordiPerso = new JRadioButton("ordinateur personnel");
		ordiIut = new JRadioButton("ordinateur de l'IUT");
		group = new ButtonGroup();

		this.add(lab);

		group.add(ordiPerso);
		group.add(ordiIut);

		this.add(ordiPerso);
		this.add(ordiIut);
		this.add(b1);

		b1.addActionListener(new ControllerButtons(u, m, this)); // ajouter le panel comme un paramètre
	}

	public String getSelectedOption() { // méthode pour obtenir l'option sélectionnée
		if (ordiPerso.isSelected()) {
			return "ordinateur personnel";
		} else if (ordiIut.isSelected()) {
			return "ordinateur de l'IUT";
		} else {
			return null;
		}
	}
}

