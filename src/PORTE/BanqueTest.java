package PORTE;

public class BanqueTest{

    public static void main(String[] args){


        Compte compte1 = new Compte("BOUDLAL", 10);
        Compte compte2 = new Compte("BOUD", 20);
        Compte compte3 = new Compte("BOU", 30);

        System.out.println("le nom du compte : "+compte1.getTitulaire()+"   son solde : "+compte1.getsolde());
        System.out.println("le nom du compte : "+compte2.getTitulaire()+"   son solde : "+compte2.getsolde());
        System.out.println("le nom du compte : "+compte3.getTitulaire()+"   son solde : "+compte3.getsolde());

        compte1.deposer(20);

        System.out.println("le nom du compte : "+compte1.getTitulaire()+"   son solde : "+compte1.getsolde());   
        
        System.out.println("le nombre de comptes créés = "+Compte.nombreCompte());



    }
}
