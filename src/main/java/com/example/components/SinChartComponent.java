/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.components;

import javafx.collections.ObservableList;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.HBox;
import org.springframework.stereotype.Component;

/**
 *
 * @author Chonlakorn
 */
@Component
public class SinChartComponent extends HBox {

    public SinChartComponent() {

        NumberAxis xAxis = new NumberAxis();
        xAxis.setLabel("x");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("y");

        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName("Sine");

        ObservableList<XYChart.Data<Number, Number>> data = series.getData();

        for (double x = -Math.PI; x < Math.PI; x += 0.5) {
            data.add(new XYChart.Data<Number, Number>(x, 10 * Math.sin(x)));
        }

        LineChart<Number, Number> lineChart = new LineChart<Number, Number>(xAxis, yAxis);
        lineChart.setTitle("Sine function");
        lineChart.getData().add(series);

        getChildren().add(lineChart);
    }

}
