package TP4;

public class etagere {

	private roman[] T;
	private int nbroman;
	
	public etagere(int taille) {
		
	T =new roman[taille];
	}
	 public int taille() {
		 return T.length;
	 }
	 public int nbroman() {
		 return this.nbroman;
	 }
	 public void ajouter(roman r) {
		 if(this.T.length > this.nbroman) {
			T[this.nbroman]=r;
			this.nbroman++;
		 }
	 }
	
public roman récupérer(int pos) {
	if(this.nbroman>=pos)
		return T[pos-1];
	return null;
}
 public int rechercher(String titre, String auteur) {
	 for(int i=0;i<this.nbroman;i++) {
     if (this.T[i].getTitre()==titre && this.T[i].getauteur().equals(auteur)) {
    	 return i+1;
    	 }
     }
	 return 0;
 }
 
public int rechercher(String titre) {
	 for(int i=0;i<this.nbroman;i++) {
    if (this.T[i].getTitre()==titre) {
   	 return i+1;
   	 }
    }
	 return 0;
}
public int[] rechercherTab(String titre, String auteur) {
	int j=0;
	int[] T1=new int[this.nbroman];
	 for(int i=0;i<this.nbroman;i++) {
    if (this.T[i].getTitre()==titre && this.T[i].getauteur().equals(auteur)) {
   	 T1[j]=i+1;
   	 j++;
   	 }
	 }
	 return T1;
}}
