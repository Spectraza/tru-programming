package com.example.lab_activity_2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

//Valeriia Savych
//TRU ID: T00739110

public class MainActivity extends AppCompatActivity {
    Button convert;
    TextView result;
    EditText editTextTextTemp;
    EditText editTextText2;
    EditText value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextTextTemp = findViewById(R.id.editTextText);
        editTextText2 = findViewById(R.id.editTextText2);
        value = findViewById(R.id.editTextText3);
        convert = findViewById(R.id.button);
        convert.setOnClickListener(this::onClick);
        result = findViewById(R.id.textView3);
//      Here, we create variables, to where we can put our inputs from the application
    }

    public void onClick(View v) { //a function(?) for button to convert fron Fahrenheit to Celsius and backwords
        String textInputOne = editTextTextTemp.getText().toString().trim();
        String textInputTwo = editTextText2.getText().toString().trim();
        String valueInput = value.getText().toString().trim();
//        Taking all the inputs we got from the user

        if (textInputOne.isEmpty() || textInputTwo.isEmpty() || valueInput.isEmpty()) {
            Toast.makeText(MainActivity.this, getText(R.string.toast_message_errorone), Toast.LENGTH_LONG).show();
            result.setText(R.string.errortext);
            return;
        }
//        creating the list of errors that may come in our way
        List<String> errors = new ArrayList<>();

//        Checking if we have generally the word Fahrenheit in our input
        if (!textInputOne.equalsIgnoreCase("Fahrenheit") && !textInputTwo.equalsIgnoreCase("Fahrenheit")) {
            errors.add("At least one text input must be Fahrenheit");
        }

//        The same goes for Celsius
        if (!textInputOne.equalsIgnoreCase("Celsius") && !textInputTwo.equalsIgnoreCase("Celsius")) {
            errors.add("At least one text input must be Celsius");
        }
//In this input, we convert our value that user typed into double.
// If it is not a number, it will catch an error and handle it properly by adding the error message to the list
        double input = 0;
        try {
            input = Double.parseDouble(valueInput);
        } catch (NumberFormatException e) {
            errors.add("Please enter a proper number");
        }

//        If the error list is not empty, it will show all the possible errors that we made in there
        if (!errors.isEmpty()) {
            new androidx.appcompat.app.AlertDialog.Builder(MainActivity.this)
                    .setTitle(R.string.titleError)
                    .setMessage(String.join("\n", errors))
                    .setPositiveButton("OK", null)
                    .show();
            result.setText(R.string.errortext);
            return;
        }
//in this one, we checking the Fahrenheit so we can know if we have it on the first input or not.
// If yes, then the second input contains Celsius in it.
        boolean toC = textInputOne.equalsIgnoreCase("Fahrenheit");

//        Here, we are picking proper values depending on what we convert into
        double lowerBound = toC ? -459.0 : -273.0; //lower bound for both Celsius and Fahrenheit
        double higherBound = toC ? 134 : 56; //higher bound for both Celsius and Fahrenheit
        String symbol = toC ? "C" : "F"; //symbols for both Celsius and Fahrenheit


        if (input <= lowerBound) { // if it's too low, the error is added to the list
            errors.add("Input is too low");
        } else if (higherBound <= input) { // if it's too high, the error is added to the list
            errors.add("Input is too high");
        }

        if (!errors.isEmpty()) { //if error list is not empty, it will show all the errors that user has made
            new androidx.appcompat.app.AlertDialog.Builder(MainActivity.this)
                    .setTitle(R.string.titleError)
                    .setMessage(String.join("\n", errors))
                    .setPositiveButton(R.string.OK_button_error, null)
                    .show();
            result.setText(R.string.errortext);
            return;
        }

//        that is where we use our separated methods, and also depending on what we convert into
        double converted = toC ? toCelsius(input) : toFahrenheit(input);
        result.setText(String.format("%.2f " + symbol, converted));
        editTextTextTemp.setText("");
        editTextText2.setText("");
        value.setText("");

//        the last three lines are for resetting our inputs (the places where user typed all the texts)
    }

    //simplified way to put our formula into separated method for Fahrenheit and Celsius
    public double toFahrenheit(double x) {
        return (x * 9.0 / 5.0) + 32.0;
    }

    public double toCelsius(double x) {
        return (x - 32.0) * 5.0 / 9.0;
    }
}