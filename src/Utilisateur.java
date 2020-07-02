
/**
 * classe Utilisateur
 * 
 * @author INTIFORMATION
 *
 */
public class Utilisateur {

	/* ________________ props _________________________ */
	private int id;
	private String nom;
	private String prenom;
	private String telephone;

	/* _______________ ctors _________________________ */

	public Utilisateur() {
	}

	public Utilisateur(int id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}

	public Utilisateur(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	/* _________________ getters/setters __________________ */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	

}// end class
