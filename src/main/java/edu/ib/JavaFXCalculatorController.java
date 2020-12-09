package edu.ib;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class JavaFXCalculatorController {
    //*****************************************
// za kazda operacja trzeba nacisnac rowna sie
    // ****************************************

    private double score;
    private double data;
    private int operation;

    @FXML
    private TextField display;

    @FXML
    void clear(ActionEvent event) {
        display.setText("");
    }


    @FXML
    void eight(ActionEvent event) {
        display.appendText("8");
    }



    @FXML
    void five(ActionEvent event) {
        display.appendText("5");   }

    @FXML
    void four(ActionEvent event) {
        display.appendText("4");   }


    @FXML
    void nine(ActionEvent event) {
        display.appendText("9");

    }

    @FXML
    void one(ActionEvent event) {
        display.appendText("1");    }



    @FXML
    void seven(ActionEvent event) {
        display.appendText("7");  }

    @FXML
    void six(ActionEvent event) {
        display.appendText("6");   }

    @FXML
    void three(ActionEvent event) {
        display.appendText("3");    }

    @FXML
    void two(ActionEvent event) {
        display.appendText("2");  }

    @FXML
    void zero(ActionEvent event) {

        display.appendText("0");
    }

    @FXML
    void percent(ActionEvent event) {
        double x = Double.parseDouble(display.getText());
        x /= 100;

        display.setText(String.valueOf(x));

    }

    @FXML
    void dot(ActionEvent event) {
        display.appendText(".");
    }

    @FXML
    void plusMinus(ActionEvent event) {
        if (display.getText().charAt(0) == '-')
            display.deleteText(0,1);
        else
            display.insertText(0,"-");

    }

    @FXML
    void plus(ActionEvent event) {
        data = Double.parseDouble(display.getText());
        operation = 1;
        display.setText("");
    }

    @FXML
    void minus(ActionEvent event) {
        data = Double.parseDouble(display.getText());
        operation = 2;
        display.setText("");
    }

    @FXML
    void multiply(ActionEvent event) {
        data = Double.parseDouble(display.getText());
        operation = 3;
        display.setText("");
    }

    @FXML
    void division(ActionEvent event){
        data = Double.parseDouble(display.getText());
        operation = 4;
        display.setText("");
    }



    @FXML
    void equal(ActionEvent event) {
        double secondData = Double.parseDouble(display.getText());
        if (operation==1){
            score = data + secondData;
        }
        if (operation==2){
            score = data - secondData;
        }
        if (operation==3){
            score = data * secondData;
        }
        if (operation==4){
            score = data / secondData;
        }

        NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);
        DecimalFormat df = (DecimalFormat)nf;
        df.applyPattern("0.############");

        display.setText(df.format(score));
        score = 0;
    }

}