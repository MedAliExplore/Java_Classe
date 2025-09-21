package Med;
public class App {

    public String myString;
    public String First_Name;
    public String Last_Name;
    public Integer age;
    public Integer x=0;

    public App(){

    }

    public App(String monMot, String FN, String LN, Integer Ag ){
        this.myString = monMot;
        this.First_Name = FN;
        this.Last_Name = LN;
        this.age = Ag;
    }

    public void afficheMot(){
        System.out.println(myString+"  "+First_Name+"  "+Last_Name+"  Tu as bien :  "+age);
    }

    public void Maj(String mot){
        mot = mot.toUpperCase();
        x = mot.length();
        System.out.println(mot+ " nombre de caracteres : "+x);
    }

    public void inverse(String valeur){

        char[] tab = new char[valeur.length()];

        for (int i=0; i<valeur.length();i++){

            tab[valeur.length()-1-i]= valeur.charAt(i);
        }
        
        String motinverse = new String(tab);

        System.out.println("le mot : "+valeur+" a lenvers egale a :"+ motinverse );
    }


    public void boucleWhile(String s){
        int i=0;
        while(i < s.length()){
            System.out.println("Hello");
            print(i);
            i++;
        }

    }

    public void boucledowhile(int x){
        int i = 0;
        do{
            System.out.println("Bonjour"+i);
            i++;
        }while(i < x);
        

    }

    public void print(int i){
        System.out.println(i);
    }

    public void switchN(int i){

        switch(i){

            case 1 : System.out.println("Bonjour 1");
            break;
            case 2 : System.out.println("Bonsoir 2");
            break;
            default : System.out.println("Bonjour sans nombre");
        }
    }
}
  