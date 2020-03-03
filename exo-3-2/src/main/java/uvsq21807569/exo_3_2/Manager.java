package uvsq21807569.exo_3_2;

public class Manager extends Employe{
	
	
	public Manager(Info_Employe cord, int annee_anciennte , int c) {
		super(cord, annee_anciennte);
		nbre=c ; 
	}

	private int nbre ;
	
	@Override 
	
	public float calcul_salaire() {
		return (super.calcul_salaire() +( nbre*100) );
	}

}
