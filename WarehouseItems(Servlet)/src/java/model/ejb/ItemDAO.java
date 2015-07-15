package model.ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Item;

/**
 *
 * @author bagnes
 */
@Stateless
@LocalBean
public class ItemDAO {

    @PersistenceContext private EntityManager em;
    
    public void addItem(Item item) {
        em.persist(item);
    }
    public void editItem(Item item){
        em.merge(item);
    }
    public void deleteItem(String id){
        Item item = em.find(Item.class, id);
        em.remove(item);
    }
    public Item getItem(String id){
        return em.find(Item.class, id);
    }
    public List getAllItem(){
        return em.createNamedQuery("Item.getAll").getResultList();
    }

    public void deleteItem(Item item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
