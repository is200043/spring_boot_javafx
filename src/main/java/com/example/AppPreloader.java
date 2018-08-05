/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import javafx.application.Preloader;
import javafx.application.Preloader.PreloaderNotification;
import javafx.application.Preloader.StateChangeNotification;
import javafx.scene.Scene;
import javafx.scene.control.ProgressIndicator;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Chonlakorn
 */
@SuppressWarnings("restriction")
public class AppPreloader extends Preloader {

    private Stage stage;

    @Override
    public void start(Stage stage) throws Exception {

        this.stage = stage;

        Scene scene = new Scene(new ProgressIndicator(-1), 100, 100);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void handleApplicationNotification(PreloaderNotification pn) {

        if (pn instanceof StateChangeNotification) {
            stage.hide();
        }
    }

}
