package edu.ib;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class JavaFXCalculatorController {


    private double score;
    private double data;
    private int operation;

    @FXML
    private TextField display;

    @FXML
    private Button CBtn;

    @FXML
    private Button plusMinusBtn;

    @FXML
    private Button percentBtn;

    @FXML
    private Button divisionBtn;

    @FXML
    private Button sevenBtn;

    @FXML
    private Button eightBtn;

    @FXML
    private Button nineBtn;

    @FXML
    private Button multiplyBtn;

    @FXML
    private Button fourBtn;

    @FXML
    private Button fiveBtn;

    @FXML
    private Button sixBtn;

    @FXML
    private Button minusBtn;

    @FXML
    private Button oneBtn;

    @FXML
    private Button twoBtn;

    @FXML
    private Button threeBtn;

    @FXML
    private Button plusBtn;

    @FXML
    private Button zeroBtn;

    @FXML
    private Button dotBtn;

    @FXML
    private Button equalBtn;

    @FXML
    void clear(ActionEvent event) {
        display.setText("");
    }



    @FXML
    void dot(ActionEvent event) {
        display.appendText(".");
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

        display.setText(String.valueOf(score));
        score = 0;
    }
    @FXML
    void nine(ActionEvent event) {
        display.appendText("9");

    }

    @FXML
    void one(ActionEvent event) {
        display.appendText("1");    }

    @FXML
    void percent(ActionEvent event) {
        double x = Double.parseDouble(display.getText());
        x /= 100;

        display.setText(String.valueOf(x));

    }



    @FXML
    void plusMinus(ActionEvent event) {
        if (display.getText().charAt(0) == '-')
            display.deleteText(0,1);
        else
        display.insertText(0,"-");

    }

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

}