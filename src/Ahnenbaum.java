import jdk.jfr.ContentType;
import utils.*;
public class Ahnenbaum
{
    private BinaryTree<Ahne> lisasAhnenbaum;
     public  Ahnenbaum() {

         BinaryTree<Ahne> b1 = new BinaryTree<Ahne>(new Ahne("Ja", "Bo", 'M'));
         BinaryTree<Ahne> b2 = new BinaryTree<Ahne>(new Ahne("CL", "Bo", 'W'));
         BinaryTree<Ahne> b3 = new BinaryTree<Ahne>(new Ahne("MA", "Si", 'W'),b1,b2);
         BinaryTree<Ahne> b4 = new BinaryTree<Ahne>(new Ahne("MO", "SI", 'M'));
         BinaryTree<Ahne> b5 = new BinaryTree<Ahne>(new Ahne("AB", "Si", 'M'));
         BinaryTree<Ahne> b6 = new BinaryTree<Ahne>(new Ahne("HO", "Si", 'm'),b4,b5);
         lisasAhnenbaum = new BinaryTree<Ahne>(new Ahne("Lisa", "Sinmson", 'w'),b3,b6 );
     }

}