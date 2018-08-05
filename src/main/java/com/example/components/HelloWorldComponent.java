/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.components;

import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import org.springframework.stereotype.Component;

/**
 *
 * @author Chonlakorn
 */
@Component
class HelloWorldComponent extends HBox {

    public HelloWorldComponent() {
        getChildren().add(new Label("Hello World"));
    }

}
