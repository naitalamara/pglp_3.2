package uvsq21807569.exo_3_2;

public class Info_Employe {
	private String nom ;
	private String prenom ;
	private String adresse ;
	public Info_Employe(String nom, String prenom, String adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	@Override
	public String toString() {
		return "Info_Employe [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + "]";
	}
	

}
