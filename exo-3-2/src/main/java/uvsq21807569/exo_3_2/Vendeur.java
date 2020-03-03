package uvsq21807569.exo_3_2;

public class Vendeur extends Employe{
	public Vendeur(Info_Employe cord, int annee_anciennte,float c) {
		super(cord, annee_anciennte);
		commission=c ;
	}


	private float commission  ;
	
	
	@Override
	public float calcul_salaire() {
		return super.calcul_salaire()+commission ;
		
	}
}
