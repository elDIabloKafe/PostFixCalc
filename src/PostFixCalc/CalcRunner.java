/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PostFixCalc;


//
// QUDRAT RABBI
// PROF: JOHN BAUGH
// CIS 296
// ASSIGNMENT THREE - JAVAFX POST FIX CALCULATOR
//

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author shamr
 */
public class CalcRunner extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
       Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));
       Scene scene =  new Scene(root);
       stage.setTitle("Post-Fix Calculator");
       stage.setScene(scene);
       stage.show();
    
    }
}
