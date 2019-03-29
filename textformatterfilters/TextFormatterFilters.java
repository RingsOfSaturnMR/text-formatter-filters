/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textformatterfilters;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
Knowledge that overriding UnaryOperator<TextFormatter.Change>'s 
apply method is how to implemnt a filter for a TextFormatter
THANKS to:
Karim, github user karimsqualli96
https://github.com/karimsqualli96
from his gist at
https://gist.github.com/karimsqualli96
"DoubleFormattedTextField.java"
*/

/**
 *
 * @author mattroberts
 */
public class TextFormatterFilters extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        VBox root = new VBox();
        
        root.setSpacing(20);
        
        HBox hBox1=new HBox();
        
        hBox1.setAlignment(Pos.CENTER);
        hBox1.setSpacing(20);
        Label filter1Label=new Label("SingleDigitFilter used for textfield: ");
        TextField txtField1=new TextField();
        
        HBox hBox2=new HBox();
        
        hBox2.setAlignment(Pos.CENTER);
        hBox2.setSpacing(20);
        Label filter2Label=new Label("Single1to9Filter used for textfield: ");
        TextField txtField2=new TextField();
        
        //Add the text formatter with filter with 1 line of code!!
        txtField1.setTextFormatter(new TextFormatter<>(new SingleDigitFilter()));
        txtField2.setTextFormatter(new TextFormatter<>(new Single1to9Filter()));
        
        hBox1.getChildren().addAll(filter1Label, txtField1);
        hBox2.getChildren().addAll(filter2Label, txtField2);
        
        root.getChildren().addAll(hBox1, hBox2);
        
        
        Scene scene = new Scene(root, 600, 600);
        
        primaryStage.setTitle("Text Formatter Filters");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
