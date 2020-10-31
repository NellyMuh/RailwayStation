/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.List;
import org.hibernate.Session;
import UTIL.NewHibernateUtil;

/**
 *
 * @author Nelly
 */
public class GenericDao<X> {
    
   public void create (X obj){
        Session ss = NewHibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.save(obj);
        ss.getTransaction().commit();
        ss.close();
    }

 public void update (X obj){
        Session ss = NewHibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.update(obj);
        ss.getTransaction().commit();
        ss.close();
    }    
 public void delete (X obj){
        Session ss = NewHibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.delete(obj);
        ss.getTransaction().commit();
        ss.close();
    }    
 
  public List<X> findAll(){
    Session ss = NewHibernateUtil.getSessionFactory().openSession();
    List<X> list = ss.createQuery("from passenger").list();
    
    ss.close();
    return list;
 }
  
  public List<X>all(String x){
      
           return NewHibernateUtil.getSessionFactory().openSession().createQuery(x).list();
      
      }

    
    
    
}
