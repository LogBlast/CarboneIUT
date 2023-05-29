package iutcarbone.View;

import java.awt.FlowLayout;
import javax.swing.*;

import iutcarbone.AppMain;
import iutcarbone.Controler.ControllerButtons;
import iutcarbone.Model.Model;

public class PanelComing extends JPanel {
	
	
private JLabel text;
private JButton b1;
private JButton b2;
private JButton b3;
private JButton b4;
private JButton b5;

private String lastButtonPressed;

	
private static final long serialVersionUID = -4009538197145142809L;

	
	public PanelComing(AppMain u, Model mod) {
		super(new FlowLayout());
		

        text = new JLabel("Transports pour venir a l'IUT");
        b1 = new JButton("Voiture Perso");
        b2 = new JButton("Covoiturage");
        b3 = new JButton("Velo");
        b4 = new JButton("Transports en commun");
        b5 = new JButton("Autre");
        
        this.add(text);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        
        b1.addActionListener(new ControllerButtons(u, mod));
        b2.addActionListener(new ControllerButtons(u, mod));
        b3.addActionListener(new ControllerButtons(u, mod));
        b4.addActionListener(new ControllerButtons(u, mod));
        b5.addActionListener(new ControllerButtons(u, mod));
        
	}


	public JLabel getText() {
		return text;
	}


	public void setText(JLabel text) {
		this.text = text;
	}


	public JButton getB1() {
		return b1;
	}


	public void setB1(JButton b1) {
		this.b1 = b1;
	}


	public JButton getB2() {
		return b2;
	}


	public void setB2(JButton b2) {
		this.b2 = b2;
	}


	public JButton getB3() {
		return b3;
	}


	public void setB3(JButton b3) {
		this.b3 = b3;
	}


	public JButton getB4() {
		return b4;
	}


	public void setB4(JButton b4) {
		this.b4 = b4;
	}


	public JButton getB5() {
		return b5;
	}


	public void setB5(JButton b5) {
		this.b5 = b5;
	}


	public void setLastButtonPressed(String buttonName) {
        lastButtonPressed = buttonName;
    }

    public String getLastButtonPressed() {
        return lastButtonPressed;
    }
	
	
	

}
