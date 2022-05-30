/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myappsingletonjavafx.view;

import com.mycompany.myappsingletonjavafx.App;
import com.mycompany.myappsingletonjavafx.model.Config;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;


public class RelatoriosScene extends AbstractScene {
    private final Config config = Config.getInstance();

    public RelatoriosScene(App app) {
        super(app);
        
        var label = new Label("Formato de relatorios = "+config.getFormatRelatorios());
        var btnVoltar = new Button("Voltar");
        setRoot(new TilePane(label, btnVoltar));
        
        btnVoltar.setOnAction(event -> app.setScene(new MainScene(app)));
    }
    
}
