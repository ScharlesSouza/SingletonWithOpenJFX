/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myappsingletonjavafx.view;

import com.mycompany.myappsingletonjavafx.App;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;


public class MainScene extends AbstractScene {

    public MainScene(App app) {
        super(app);
        
        var btnRelatorios = new Button("Relatorios");
        var btnConfig = new Button("Configurações");
        setRoot(new TilePane(btnRelatorios, btnConfig));
        
        btnRelatorios.setOnAction(event -> app.setScene(new RelatoriosScene(app)));
        btnConfig.setOnAction(event -> app.setScene(new ConfigScene(app)));
    }
    
}
