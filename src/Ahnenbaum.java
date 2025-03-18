import jdk.jfr.ContentType;
import utils.*;
public class Ahnenbaum
{
    private BinaryTree<Ahne> lisasAhnenbaum;
    /**
    Befüllen des ahnenbaums von Lisa Simson
     */
     public  Ahnenbaum() {

         BinaryTree<Ahne> b1 = new BinaryTree<Ahne>(new Ahne("Ja", "Bo", 'M'));
         BinaryTree<Ahne> b2 = new BinaryTree<Ahne>(new Ahne("CL", "Bo", 'W'));
         BinaryTree<Ahne> b3 = new BinaryTree<Ahne>(new Ahne("MA", "Si", 'W'),b1,b2);
         BinaryTree<Ahne> b4 = new BinaryTree<Ahne>(new Ahne("MO", "SI", 'M'));
         BinaryTree<Ahne> b5 = new BinaryTree<Ahne>(new Ahne("AB", "Si", 'M'));
         BinaryTree<Ahne> b6 = new BinaryTree<Ahne>(new Ahne("HO", "Si", 'm'),b4,b5);
         lisasAhnenbaum = new BinaryTree<Ahne>(new Ahne("Lisa", "Sinmson", 'w'),b3,b6 );
     }
/**
ruft die rekursion search auf mit Lisas ahnenbaum
 */
     public void searcW(){
        search(lisasAhnenbaum);
     }

    /**
     * Preoder search gibt erst die wurzel dann den linken und dann den rechten
     * teilbaum aus
     * @param pBinarytree gibt den Baum an der durchsucht werden soll.
     */
     public void search(BinaryTree<Ahne> pBinarytree){
       // falls der Knoten etwas speichert wird der Vorname von dem
         // gespeicherten zurück gegeben
        if(!pBinarytree.isEmpty()){
             System.out.println(pBinarytree.getContent().getvorname());
         }
        // falls der Linke teilbaum etwas specihert wird dieser rekursiv aufgerufen
         if (!pBinarytree.getLeftTree().isEmpty())
         {
             search(pBinarytree.getLeftTree());
         }
         // falls der rechte teilbaum etwas speichert wird dieser rekursiv aufgerufen
         if(!pBinarytree.getRightTree().isEmpty()){
             search(pBinarytree.getRightTree());
         }
     }

    /**
     * Inorder serach gibt den linken teilbaum dann die Wurzel und dann den rechten Teilbaum aus
     * @param pBinarytree gibt den Baum an der durchsucht werden soll
     */
      public void searchin(BinaryTree<Ahne> pBinarytree){
          // falls der Linke teilbaum etwas specihert wird dieser rekursiv aufgerufen
         if (!pBinarytree.getLeftTree().isEmpty())
         {
             searchin(pBinarytree.getLeftTree());
         }
          // falls der Knoten etwas speichert wird der Vorname von dem
          // gespeicherten zurück gegeben
         if(!pBinarytree.isEmpty()){
             System.out.println(pBinarytree.getContent().getvorname());
         }
          // falls der rechte teilbaum etwas speichert wird dieser rekursiv aufgerufen
         if(!pBinarytree.getRightTree().isEmpty()){
             searchin(pBinarytree.getRightTree());
         }

     }

    /**
     * postordersearch durchsucht den Baum gibt links rechts und dann die wurzel aus
     * @param pBinarytree
     */
     public void searchpo(BinaryTree<Ahne> pBinarytree){
         // falls der Linke teilbaum etwas specihert wird dieser rekursiv aufgerufen
         if (!pBinarytree.getLeftTree().isEmpty())
         {
             searchpo(pBinarytree.getLeftTree());
         }
         // falls der rechte teilbaum etwas speichert wird dieser rekursiv aufgerufen
         if(!pBinarytree.getRightTree().isEmpty()){
             searchpo(pBinarytree.getRightTree());
         }
         // falls der Knoten etwas speichert wird der Vorname von dem
         // gespeicherten zurück gegeben
          if(!pBinarytree.isEmpty()){
             System.out.println(pBinarytree.getContent().getvorname());
         }

     }


}