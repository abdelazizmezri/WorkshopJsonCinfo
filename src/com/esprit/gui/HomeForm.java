/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.gui;

import com.codename1.ui.Button;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.layouts.BoxLayout;

/**
 *
 * @author abdel
 */
public class HomeForm extends Form {
    
    private Button btnAddPerson;
    private Button btnShowPerson;

    public HomeForm() {
        super("Home", BoxLayout.y());
        OnGui();
        addActions();
    }
    
    private void OnGui() {
        btnAddPerson = new Button("Ajouter");
        btnShowPerson = new Button("Afficher");
        this.addAll(new Label("Choisissez une option :"), btnAddPerson, btnShowPerson);
    }
    
    private void addActions() {
        btnAddPerson.addActionListener((evt) -> {
            new AjoutPersonneForm(this).show();
        });
        btnShowPerson.addActionListener((evt) -> {
            new AffichePersonnesForm(this).show();
        });
    }
    
}
