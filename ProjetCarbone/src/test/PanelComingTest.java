package test;


	import org.junit.Test;
	import org.junit.Assert;

	import iutcarbone.AppMain;
import iutcarbone.Model.Model;
import iutcarbone.View.PanelComing;

	public class PanelComingTest {

		@Test
		public void testPanelComing() {
			AppMain u = new AppMain();
			Model m = u.getMod();
			PanelComing panel = new PanelComing(u, m);
			
			Assert.assertNotNull(panel);
			Assert.assertEquals("Transports pour venir a l'IUT", panel.getText().getText());
			Assert.assertEquals("Voiture Perso", panel.getB1().getText());
			Assert.assertEquals("Covoiturage", panel.getB2().getText());
			Assert.assertEquals("Velo", panel.getB3().getText());
			Assert.assertEquals("Transports en commun", panel.getB4().getText());
			Assert.assertEquals("Autre", panel.getB5().getText());
		}
		
		@Test
		public void testPanelComingButtons() {
			AppMain u = new AppMain();
			Model m = u.getMod();
			PanelComing panel = new PanelComing(u, m);
			
			// Test de la r�action des boutons aux �v�nements
			panel.getB1().doClick();
			Assert.assertEquals("Voiture Perso", panel.getLastButtonPressed());
			panel.getB2().doClick();
			Assert.assertEquals("Covoiturage", panel.getLastButtonPressed());
			panel.getB3().doClick();
			Assert.assertEquals("Velo", panel.getLastButtonPressed());
			panel.getB4().doClick();
			Assert.assertEquals("Transports en commun", panel.getLastButtonPressed());
			panel.getB5().doClick();
			Assert.assertEquals("Autre", panel.getLastButtonPressed());
		}
	}

	