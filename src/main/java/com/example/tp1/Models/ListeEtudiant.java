package com.example.tp1.Models;

import java.util.ArrayList;

public class ListeEtudiant {

    public static ArrayList<Etudiant> etudiants;

    public boolean addStudent(Etudiant etudiant){

        boolean exist = false;
        for (Etudiant etudiant1 : etudiants) {
            if (etudiant1.getCin() == etudiant.getCin()){
                exist = true;
            }
        }

        if (exist == false){
            etudiants.add(etudiant);
        }

        return exist;
    }

    public void removeStudent(Integer cin){

        for (Etudiant etudiant : etudiants) {
            if (etudiant.getCin() == cin){
                etudiants.remove(etudiant);
            }
        }
    }

}
