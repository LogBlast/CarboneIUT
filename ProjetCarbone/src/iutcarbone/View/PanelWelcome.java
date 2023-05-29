package iutcarbone.View;

import java.awt.FlowLayout;


import javax.swing.*;

import iutcarbone.AppMain;
import iutcarbone.Controler.ControllerButtons;
import iutcarbone.Model.Model;

public class PanelWelcome extends JPanel {
	
	private static final long serialVersionUID = -4009538197145142809L;

	public PanelWelcome(AppMain u, Model mod)  {
        super(new FlowLayout());
        JLabel l = new JLabel("Bienvenue !");
        JButton b1 = new JButton("Commencer");
        this.add(l);
        this.add(b1);
        b1.addActionListener(new ControllerButtons(u, mod));
    }
}
