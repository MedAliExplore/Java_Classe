package PORTE;

public class Compte{

    private String titulaire;
    private int solde;

    private static int nombreCompte = 0;

    public Compte(String nom, int s){
        this.titulaire = nom;
        this.solde = s;
        nombreCompte++;
    }

    public String getTitulaire(){
        return titulaire;
    }

    public static int nombreCompte(){
        return nombreCompte;
    }

    public int getsolde(){
        return solde;
    }

    public void deposer(int montant){
        solde += montant;
    }




}