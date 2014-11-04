/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.pidev.persistance.model;

/**
 *
 * @author USER
 */
public class Categorie {
    
    private int id;
    private String nom;
    private String type;

    public Categorie() {
    }
    
    public Categorie(int id, String nom, String type) {
        this.id = id;
        this.nom = nom;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Categorie{" + "id=" + id + ", nom=" + nom + ", type=" + type + '}';
    }

   
    
    
    
    
    
}
