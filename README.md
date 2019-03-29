# text-formatter-filters
Java Filter for TextFormatter

This has a filter you can give as a paramater to a TextFormatter that you can 
set as the TextFormatter for a TextField.  It lets you make the TextField 
only accept 1 digit 0 through 9.  If you delete or replace the digit, you can 
enter a new digit.  If you add or import the class SingleDigitFilter I wrote 
that is in this repo, you can do it all in one line of code.
Now there is Single1to9Filter that only accepts digits 1 through 9.

Knowledge that overriding UnaryOperator<TextFormatter.Change>'s 
apply method is how to implemnt a filter for a TextFormatter
THANKS to:
Karim, github user karimsqualli96
https://github.com/karimsqualli96
from his gist at
https://gist.github.com/karimsqualli96
"DoubleFormattedTextField.java".

One class here is the SingleDigitFilter that accepts digits.
Another class is Single1to9Filter that only accepts digits 1 through 9.
The other class demo's the SingleDigitFilter in a simple GUI.
