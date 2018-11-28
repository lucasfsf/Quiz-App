package com.example.android.quizapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Global variaple for score keeping
    int finalScore;

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            //Answers for First Question
            case R.id.first_question_a:
            if (checked)
                // Wrong Answer - Buenos Aires
                break;
            case R.id.first_question_b:
            if (checked)
                // RIGHT ANSWER - Oslo
                finalScore += 1;
                break;
            case R.id.first_question_c:
            if (checked)
                // Wrong Answer - Washington
                break;
            case R.id.first_question_d:
                if (checked)
                    // Wrong Answer - Estocolmo
                    break;

                //Answers for Second Question
            case R.id.second_question_a:
            if (checked)
                // RIGHT ANSWER - Manágua
                finalScore += 1;
                break;
            case R.id.second_question_b:
            if (checked)
                // Wrong Answer - Brasilia
                break;
            case R.id.second_question_c:
            if (checked)
                // Wrong Answer - San José
                break;
            case R.id.second_question_d:
                if (checked)
                    // Wrong Answer - San Salvador
                    break;

                //Answers for Third Question
            case R.id.third_question_a:
            if (checked)
                // Wrong Answer - Hong Kong
                break;
            case R.id.third_question_b:
            if (checked)
                // Wrong Answer - Daegu
                break;
            case R.id.third_question_c:
            if (checked)
                // Wrong Answer - Busan
                break;
            case R.id.third_question_d:
                if (checked)
                    // RIGHT ANSWER - Seul
                    finalScore += 1;
                break;

            //Answers for Fourth Question
            case R.id.fourth_question_a:
            if (checked)
                // Wrong Answer - Kyoto
                break;
            case R.id.fourth_question_b:
            if (checked)
                // RIGHT ANSWER - Tokyo
                finalScore += 1;
                break;
            case R.id.fourth_question_c:
            if (checked)
                // Wrong Answer - Osaka
                break;
            case R.id.fourth_question_d:
                if (checked)
                    // Wrong Answer - Minato
                    break;

                //Answers for Fifth Question
            case R.id.fifth_question_a:
            if (checked)
                // Wrong Answer - Punakha
                break;
            case R.id.fifth_question_b:
            if (checked)
                // Wrong Answer - Paro
                break;
            case R.id.fifth_question_c:
            if (checked)
                // RIGHT ANSWER - Thimphu
                finalScore += 1;
                break;
            case R.id.fifth_question_d:
                if (checked)
                    // Wrong Answer - Puntshol
                    break;

        }
    }

    public void submitResults(View view) {

        // Get user's name
        EditText nameField = (EditText) findViewById(R.id.name_field);
        Editable nameEditable = nameField.getText();
        String name = nameEditable.toString();


        // Get user's Country
        EditText countryField = (EditText) findViewById(R.id.country_field);
        Editable countryEditable = countryField.getText();
        String country = countryEditable.toString();

        // Final score message
        String finalScoreMessage = name + " from " + country +  " has scored " + finalScore +  "points!";

        //Toast message to end Quiz
        Toast toast = Toast.makeText(getApplicationContext(),
                finalScoreMessage,
                Toast.LENGTH_SHORT);
        toast.show();

        finalScore = 0;
    }
}
