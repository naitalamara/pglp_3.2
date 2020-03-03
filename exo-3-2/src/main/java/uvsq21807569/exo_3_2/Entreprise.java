package uvsq21807569.exo_3_2;

import java.util.ArrayList;

public class Entreprise {
	
	private ArrayList<Employe> list;

	public Entreprise() {
		list=new ArrayList<Employe>();
		
	}
	public void ajouter(Employe c) {
		list.add(c);
	}
	
	
	public float calcul() {
		float sum =0;
		for(Employe a : list ) {
			sum=sum+a.calcul_salaire();
		}
		return sum ;
	}
	
	

}
