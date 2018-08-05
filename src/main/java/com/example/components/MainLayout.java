/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.components;

import javafx.scene.layout.GridPane;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Chonlakorn
 */
@Component
public class MainLayout extends GridPane {

    private final HelloWorldComponent helloWorldComponent;

    private final SinChartComponent sinChartComponent;

    @Autowired
    public MainLayout(HelloWorldComponent helloWorldComponent, SinChartComponent sinChartComponent) {

        this.helloWorldComponent = helloWorldComponent;
        this.sinChartComponent = sinChartComponent;
    }

    @PostConstruct
    public void initComponent() {

        add(this.helloWorldComponent, 0, 0);
        add(this.sinChartComponent, 0, 1);
    }
}
