package com.example.tp1.Models;

import lombok.AllArgsConstructor;

public class Etudiant {

    private Integer cin;
    private String nom;
    private String classe;
    private Double moyenne;
    private String password;



    public Etudiant(String password) {
        this.password = password;
    }

    public Etudiant(Integer cin, String nom, String classe, Double moyenne, String password) {
        this.cin = cin;
        this.nom = nom;
        this.classe = classe;
        this.moyenne = moyenne;
        this.password = password;
    }

    public Integer getCin() {
        return cin;
    }

    public void setCin(Integer cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(Double moyenne) {
        this.moyenne = moyenne;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
