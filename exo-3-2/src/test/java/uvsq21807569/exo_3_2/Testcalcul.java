package uvsq21807569.exo_3_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testcalcul {

	@Test
	public void test() {
		Info_Employe cora=new Info_Employe("sam","al","paris");
		Employe a=new Employe(cora,1);
		assertTrue(a.calcul_salaire()==1520);
		
		Info_Employe corb=new Info_Employe("wall","bin","tokyo");
		Vendeur b = new Vendeur(corb ,1,20);
		assertTrue(b.calcul_salaire()==1540);
		
		
		Info_Employe corc=new Info_Employe("hcen","ben","paris");
		Manager c = new Manager(corc ,1,1);
		assertTrue(c.calcul_salaire()==1620);
		
		Entreprise apt = new Entreprise();
		apt.ajouter(a);
		apt.ajouter(b);
		apt.ajouter(c);
		
		assertTrue(apt.calcul()==4680);
		
	}

}
