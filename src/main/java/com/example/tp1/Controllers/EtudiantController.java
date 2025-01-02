package com.example.tp1.Controllers;

import com.example.tp1.Models.Etudiant;
import com.example.tp1.Models.ListeEtudiant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller("/")
public class EtudiantController {

    @PostMapping("/login/")
    public String login(@RequestParam Integer cin, @RequestParam String password){

        for (Etudiant etudiant : ListeEtudiant.etudiants) {
            if (etudiant.getCin() == cin && etudiant.getPassword() == password){
                return "login success";
            }else {
                return "login failed";
            }
        }
    }

 /*   @GetMapping


    @PutMapping


    @DeleteMapping
*/

}
