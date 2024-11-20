package TP4;

public class bibliotheque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     roman r1= new roman("TP4", "B2", 18);
     System.out.println(r1.toString());
     
     System.out.println(r1.getTitre());
     
     etagere e1=new etagere(100);
     etagere e2=new etagere(50);
     etagere e3=new etagere(75);
     
    System.out.println(e1.taille());
    System.out.println(e1.nbroman());
    
    e3.ajouter(r1);
    
    System.out.println(e1.taille());
    System.out.println(e1.nbroman());
    
    roman r2=new roman("TP5", "B2B", 20);
    e3.ajouter(r2);
    e3.ajouter(new roman("JAVA","B2", 120));
    
    System.out.println("La capacité de l'étagère est: "+e3.taille());
    System.out.println("Le nombre de roman dans l'étagère est: "+e3.nbroman());
    
    System.out.println(e3.récupérer(3));
    	
	System.out.println(e3.rechercher("JAVA", "B2"));
	System.out.println(e3.rechercher("TPS"));
	int[T1=e3.rechercherTab("JAVA", "B2");
	for(int i=0;i>T1.length;i++)
    if(T1[i]!=0)
    System.out.println(T1[i]);
}

}
