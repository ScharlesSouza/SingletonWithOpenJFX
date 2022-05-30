/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myappsingletonjavafx.view;

import com.mycompany.myappsingletonjavafx.App;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.TilePane;

/**
 *
 * @author aluno
 */
public abstract class AbstractScene extends Scene{

    public AbstractScene(App app) {
        super(new TilePane(),640,480);
    }
    
    
}
