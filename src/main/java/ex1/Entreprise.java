package ex1;

import java.util.Date;

public class Entreprise {


	/** Usage : The SIRET number
	*   int : siret
	*/
	public int siret;
	
	/** Usage : The name of the entreprise
	*   String : nom
	*/
	public String nom;
	
	/** Usage : THe address of the entreprise
	*   String : adresse
	*/
	public String adresse;
	
	/** Usage : The date of creation of the entreprise
	*   Date : dateCreation
	*/
	public Date dateCreation;
	
	/** Usage : The max capital of any entreprise
	*   int : CAPITAL_MAX
	*/
	public static final int CAPITAL_MAX = 3000000;
	

	/**
	 * Do nothing
	 */
	public void afficherStatut(){
		
	}
	
	
}
