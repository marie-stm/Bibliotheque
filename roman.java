/*package TP4;

public class roman {
	public void ajouter(int X) {

	public static void main(String[] args) {
		int [] T= new int[20];
		T[0]=25;
		T[1]=35;
		T.ajouter(40);
		//T.length
		System.out.ptintln(T.length);
	}
		

	}

}*/
package TP4;

public class roman {
	
	private String titre;
	private String auteur;
	private int nbPages;
	public roman(String titre, String auteur, int nbPages) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.nbPages = nbPages;
	}
	public roman(String titre, String auteur) {
		super();
		this.titre = titre;
		this.auteur = auteur;
	}
	public String getTitre() {
		return titre;
	}
	public String getauteur() {
		return auteur;
	}
	public int getNbPages() {
		return nbPages;
	}
	@Override
	public String toString() {
		return "roman [titre=" + titre + ", auteur=" + auteur + ", nbPages=" + nbPages + "]";
	}
	
}