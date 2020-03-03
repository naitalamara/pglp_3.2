package uvsq21807569.exo_3_2;

public class Employe {
	private Info_Employe cord ;
	private int annee_anciennte ; 
	
	
	public Employe(Info_Employe cord, int annee_anciennte) {
		super();
		this.cord = cord;
		this.annee_anciennte = annee_anciennte;
	}


	public float calcul_salaire() {
		return (1500+20*annee_anciennte );
	} 
	

}
