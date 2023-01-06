package ma.enset.act1.metier;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MetierProduitImpl implements IMetier<Produit>{
    List<Produit> produits ;

    public MetierProduitImpl(){
        produits = new ArrayList<>();
    }
    @Override
    public void add(Produit o) {
    produits.add(o);
    }

    @Override
    public List getAll() {
        return produits;

    }

    @Override
    public Produit findById(long id) {
        Iterator<Produit> it = produits.iterator();
        while (it.hasNext()){
            Produit p = (Produit) it.next();
            if(p.getId() == id) return p;
        }
        return null;
    }

    @Override
    public void delete(long id) {



        for (int i = 0; i<produits.size(); i++) {

            if(produits.get(i).getId() == id) produits.remove(i) ;
        }
    }
}
