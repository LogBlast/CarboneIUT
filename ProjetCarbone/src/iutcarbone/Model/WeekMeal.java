package iutcarbone.Model;

public class WeekMeal {
	
	
	double nbVegan;
	double nbVegetarien;
	double nbBoeuf;
	double nbAutre;
	
	
	// Énumération des différents types de repas
	
	public enum Meal {
	    VEGAN, VEGETARIEN, BOEUF, AUTRE
	}
	

	// Méthode pour initialiser les compteurs à zéro
	
	public void init() {
		nbVegan = 0;
        nbVegetarien = 0;
        nbBoeuf = 0;
        nbAutre = 0;
	}
	
	// Méthode pour définir le nombre de chaque type de repas
	
	public void setMeal(double veg, double vege, double boe, double aut) {
		this.nbVegan = veg;
		this.nbVegan = vege;
		this.nbVegan = boe;
		this.nbVegan = aut;
	}
	
	// Méthode pour ajouter un certain nombre de repas d'un type donné
	
	public 	void addMeal(Meal m, int q) {
		
		if (q < 0) {		// Vérification que la quantité est positive
            throw new IllegalArgumentException("La quantit� ne peut pas �tre n�gative");
        }
		
		// Incrémentation du compteur approprié en fonction du type de repas
		
		switch (m) {
        case VEGAN:
            nbVegan += q;
            break;
        case VEGETARIEN:
            nbVegetarien += q;
            break;
        case BOEUF:
            nbBoeuf += q;
            break;
        case AUTRE:
            nbAutre += q;
            break;
    }
	}

	
	// Méthode pour obtenir le niveau d'émissions de CO2 d'un type de repas donné
	
	public static double getCO2(Meal m) {
	    switch (m) {
	        case VEGAN:
	            return 0.4;
	        case VEGETARIEN:
	            return 0.5;
	        case BOEUF:
	            return 7.0;
	        case AUTRE:
	            return 1.1;
	        default:
	            return 0.0;
	    }
	}
	
	

	public double computeCO2(Meal m) {
	    return getCO2(m);
	}
	
	
	public double getNbVegan() {
		return nbVegan;
	}
	
	
	

	public void setNbVegan(double nbVegan) {
		this.nbVegan = nbVegan;
	}

	
	
	public double getNbVegetarien() {
		return nbVegetarien;
	}

	public void setNbVegetarien(double nbVegetarien) {
		this.nbVegetarien = nbVegetarien;
	}

	public double getNbBoeuf() {
		return nbBoeuf;
	}

	public void setNbBoeuf(double nbBoeuf) {
		this.nbBoeuf = nbBoeuf;
	}

	public double getNbAutre() {
		return nbAutre;
	}

	public void setNbAutre(double nbAutre) {
		this.nbAutre = nbAutre;
	}
	
	public void setQuantite(double nbVeg, double nbVeget, double nbBoe, double nbAut) {
		this.nbVegan = nbVeg;
		this.nbVegetarien = nbVeget;
		this.nbBoeuf = nbBoe;
		this.nbAutre = nbAut;
	}
	
	
	
	public double computeAllCO2() {
	    double totalCO2Vegan = nbVegan * getCO2(Meal.VEGAN);
	    double totalCO2Vegetarien = nbVegetarien * getCO2(Meal.VEGETARIEN);
	    double totalCO2Boeuf = nbBoeuf * getCO2(Meal.BOEUF);
	    double totalCO2Autre = nbAutre * getCO2(Meal.AUTRE);

	    System.out.println("Le total de CO2 produit par les repas vegan est de : " + totalCO2Vegan);
	    System.out.println("Le total de CO2 produit par les repas végétariens est de : " + totalCO2Vegetarien);
	    System.out.println("Le total de CO2 produit par les repas de boeuf est de : " + totalCO2Boeuf);
	    System.out.println("Le total de CO2 produit par les autres repas est de : " + totalCO2Autre);
	    System.out.println();
	    
	    double tot = totalCO2Vegan + totalCO2Vegetarien + totalCO2Boeuf + totalCO2Autre;
	    return tot;
	    
	}
	
	
}
