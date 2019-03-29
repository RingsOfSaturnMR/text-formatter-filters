/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textformatterfilters;

import java.util.function.UnaryOperator;
import javafx.scene.control.TextFormatter;

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
public class SingleDigitFilter implements UnaryOperator<TextFormatter.Change> {

    @Override
    public TextFormatter.Change apply(TextFormatter.Change textFormatter) {

        if (textFormatter.isReplaced()) {
            if (Character.isDigit(textFormatter.getControlNewText().charAt(0))) {
                textFormatter.setText(Character.toString(textFormatter.getControlNewText().charAt(0)));
            } else if (textFormatter.getControlText().length() > 0) {
                textFormatter.setText(textFormatter.getControlText());
            } else {
                textFormatter.setText("");
            }
        } else if (textFormatter.isAdded()) {
            if (textFormatter.getControlText().length() > 0) {
                textFormatter.setText("");
            } else if (Character.isDigit(textFormatter.getControlNewText().charAt(0))) {
                textFormatter.setText(Character.toString(textFormatter.getControlNewText().charAt(0)));
            } else {
                textFormatter.setText("");
            }
        }

        return textFormatter;
    }

}
