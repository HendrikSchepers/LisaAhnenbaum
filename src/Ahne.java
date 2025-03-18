import utils.*;
public class Ahne
{
    private String vorname;
    private String nachname;
    private char geschlecht;

     public  Ahne(String pVN, String pNN, char pG) {
         vorname = pVN;
         nachname =pNN;
         geschlecht = pG;
     }
     public void setvorname(String pvorname)
    {vorname= pvorname;}
     public void setnachname(String pnachname)
    {nachname= pnachname;}
    public void setgeschlecht(char pgeschlecht)
    {
        geschlecht = pgeschlecht;
    }
    public String getvorname(){return vorname;}
    public String getnachrame(){return nachname;}
    public char getGeschlecht(){return geschlecht;}
}