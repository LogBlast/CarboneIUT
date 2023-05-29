package iutcarbone.Model;


public class Model  {
	 
		    private String mode;
		    private double max;
		    private double min;
		    private WeekMeal wm;

		    public Model() {}

		    
		  //Méthode pour définir le mode de transport et les valeurs max/min correspondantes
		    
		    public void setMode(String mode) {
		        this.mode = mode;

		        switch (mode) {
		            case "Voiture Perso":
		                this.max = Data.maxVoiture;
		                this.min = Data.minVoiture;
		                break;
		            case "Covoiturage":
		                this.max = Data.maxCoVoiture;
		                this.min = Data.minCoVoiture;
		                break;
		            case "Velo":
		                this.max = Data.maxVelo;
		                this.min = Data.minVelo;
		                break;
		            case "Transports en commun":
		                this.max = Data.maxTransportCom;
		                this.min = Data.minTransportCom;
		                break;
		            case "Autre":
		                this.max = Data.maxAutre;
		                this.min = Data.minAutre;
		                break;
		        }
		    }

		    public double getMax() {
		        return max;
		    }

		    public double getMin() {
		        return min;
		    }
		    
		    public void ajoutMax(double val) {
		    	this.max += val;
		    }
		    
		    public void ajoutMin(double val) {
		    	this.min += val;
		    }

		    public void nouveauWeekMeal() {
		    	wm = new WeekMeal();
		    }
		    
		    public WeekMeal getWeakMeal() {
		    	return wm;
		    }
		    
		    
		    
		}