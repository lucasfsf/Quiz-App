package com.example.android.quizapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
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


        //Verify Checkbox answers
        CheckBox CheckBox_A = (CheckBox) findViewById(R.id.checkBoxA);
        CheckBox CheckBox_B = (CheckBox) findViewById(R.id.checkBoxB);
        CheckBox CheckBox_C = (CheckBox) findViewById(R.id.checkBoxC);
        CheckBox CheckBox_D = (CheckBox) findViewById(R.id.checkBoxD);
        CheckBox CheckBox_E = (CheckBox) findViewById(R.id.checkBoxE);
        if(CheckBox_A.isChecked() && CheckBox_B.isChecked() && CheckBox_C.isChecked() && CheckBox_D.isChecked() && !CheckBox_E.isChecked()){
            finalScore += 2;
        } else {
            finalScore -= 2;
        }

        //Point for Text Input answer
        EditText text = (EditText) findViewById(R.id.question_answer);
        String answer = text.getText().toString().trim();

        if(answer.equals("195")) {
            finalScore += 1;
        } else if (answer.equals("193")) {
            finalScore += 1;
        } else {
            finalScore -= 1;
        }


        // Get user's name
        EditText nameField = (EditText) findViewById(R.id.name_field);
        Editable nameEditable = nameField.getText();
        String name = nameEditable.toString();


        // Get user's Country
        EditText countryField = (EditText) findViewById(R.id.country_field);
        Editable countryEditable = countryField.getText();
        String country = countryEditable.toString();

        // Final score message
        String finalScoreMessage = name + " FROM " + country +  " HAS SCORED " + finalScore +  " POINTS!";

        //Toast message to end Quiz
        Toast toast = Toast.makeText(MainActivity.this,
                finalScoreMessage,
                Toast.LENGTH_LONG);
        toast.show();


        //Restart APP (creates an Intent called "restart" ant then starts this activity)
        Intent restart = getBaseContext().getPackageManager()
                .getLaunchIntentForPackage( getBaseContext().getPackageName() );
        restart.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(restart);

    }

}
