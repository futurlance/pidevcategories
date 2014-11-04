/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.pidev.persistance.dao.interfaces;
import  com.esprit.pidev.persistance.model.Categorie;
import java.util.List;
/**
 *
 * @author USER
 */
public interface ICategorieDAO {


     void save(Categorie categorie) ;

     Categorie findBYId(int id);

     void update(Categorie categorie);

     void delete(Categorie categorie);

    List<Categorie> findAll();

}

