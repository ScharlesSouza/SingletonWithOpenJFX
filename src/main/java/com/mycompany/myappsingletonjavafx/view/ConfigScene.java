/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myappsingletonjavafx.view;

import com.mycompany.myappsingletonjavafx.App;
import com.mycompany.myappsingletonjavafx.model.Config;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;


public class ConfigScene extends AbstractScene {
    private final Config config = Config.getInstance();

    public ConfigScene(App app) {
        super(app);
        
        var label1 = new Label("Formato de relatorios");
        var fieldFormatoRelatorios = new TextField(config.getFormatRelatorios());
        var label2 = new Label("Tipo de graficos");
        var fieldTipoGraficos = new TextField(config.getTipoGraficos());
        var btnOk = new Button("OK");
        setRoot(new VBox(label1,fieldFormatoRelatorios,label2, fieldTipoGraficos, btnOk));
        
        btnOk.setOnAction(event ->{
            config.setFormatRelatorios(fieldFormatoRelatorios.getText());
            config.setTipoGraficos(fieldTipoGraficos.getText());
            app.setScene(new MainScene(app));
        });
    }
    
}
