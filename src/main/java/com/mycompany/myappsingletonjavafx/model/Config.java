/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myappsingletonjavafx.model;

/**
 *
 * @author aluno
 */
public class Config {
    //atributo instance que sera retornado quando alguem precisar acessa a este singleton
    //private static final Config instance = new Config();
    private volatile static Config instance;//a palavra-chave volatile garante que varios segmentos lidem com a variavel corretamente
    
    private String formatRelatorios = "html";
    private String tipoGraficos = "pizza";
    
    
    //construtor privado.
    private Config(){};

    //ao adicionar a palavra chave synchronized ao metodo getInstance(), força os segmentos a esperar sua vez.
    public static synchronized Config getInstance() {
        if(instance == null)
            instance = new Config();
        return instance;
    }
    
    

    public String getFormatRelatorios() {
        return formatRelatorios;
    }

    public void setFormatRelatorios(String formatRelatorios) {
        this.formatRelatorios = formatRelatorios;
    }

    public String getTipoGraficos() {
        return tipoGraficos;
    }

    public void setTipoGraficos(String tipoGraficos) {
        this.tipoGraficos = tipoGraficos;
    }
    
    
}
