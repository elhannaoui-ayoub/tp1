package ma.enset.act1.presentation;
import java.util.Iterator;
import ma.enset.act1.metier.MetierProduitImpl;
import ma.enset.act1.metier.Produit;

import java.time.Clock;
import java.util.Scanner;

public class Application {
    public static  void main(String args[]){

        MetierProduitImpl m= new MetierProduitImpl();
       m.add(new Produit(1,"p1","dacia",23000,"nouveau",9));
        m.add(new Produit(2,"p2","ford",53000,"nouveau",12));
        int i=1;

         while(i != 0){
             System.out.println("1-Afficher la liste des produits");
             System.out.println("2-Rechercher un produit par son id.");
             System.out.println("3-Ajouter un nouveau produit dans la liste.");
             System.out.println("4-Supprimer un produit par id.");
             System.out.println("5-Quitter ce programme.");
             int j = new Scanner(System.in).nextInt();
             switch (j){
                 case 1 :
                     Iterator<Produit> it =m.getAll().iterator();
                            while (it.hasNext()){
                                Produit p = (Produit) it.next();
                                System.out.println(p);
                            }
                            break;
                 case 2 :
                     System.out.println("Entrer id:");
                     int id= new Scanner(System.in).nextInt();
                     System.out.println(m.findById(id));
                     break;
                 case 3 :
                     System.out.println("Entrer id\n");
                     int idd= new Scanner(System.in).nextInt();
                     System.out.println("Entrer le nom du produit \n");
                     String nom= new Scanner(System.in).nextLine();
                     System.out.println("Entrer la marque \n");
                     String marque= new Scanner(System.in).nextLine();
                     System.out.println("Entrer le prix \n");
                     double prix= new Scanner(System.in).nextDouble();
                     System.out.println("Entrer une description \n");
                     String des= new Scanner(System.in).nextLine();
                     System.out.println("Entrer la quantite en stock \n");
                     int qte = new Scanner(System.in).nextInt();
                     Produit p = new Produit(idd,nom,marque,prix,des,qte);
                     m.add(p);
                     System.out.println("Produit est bien ajouter.");
                     break;
                 case 4 :
                     System.out.println("Entrer id:");
                     Long idds= new Scanner(System.in).nextLong();
                     m.delete(idds);
                     break;
                 case 5 :
                     break;
                 default :
                     break;
             }

             System.out.println("0-Quitter ce programme.,1 continuer");
             i = new Scanner(System.in).nextInt();

         }


    }
}
