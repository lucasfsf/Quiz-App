

//Global variaple for score keeping
int finalScore;

public void onRadioButtonClicked(View view) {
    // Is the button now checked?
    boolean checked = ((RadioButton) view).isChecked();

    // Check which radio button was clicked
    switch(view.getId()) {
        //Answers for First Question
        case R.id.1a:
            if (checked)
                // Wrong Answer - Buenos Aires
            break;
        case R.id.1b:
            if (checked)
                // RIGHT ANSWER - Oslo
                finalScore += 1;
            break;
        case R.id.1c:
            if (checked)
                // Wrong Answer - Washington
            break;
        case R.id.1d:
            if (checked)
                // Wrong Answer - Estocolmo
            break;
            
        //Answers for Second Question
        case R.id.2a:
            if (checked)
                // RIGHT ANSWER - Manágua
                finalScore += 1;
            break;
        case R.id.2b:
            if (checked)
                // Wrong Answer - Brasilia
            break;
        case R.id.2c:
            if (checked)
                // Wrong Answer - San José
            break;
        case R.id.2d:
            if (checked)
                // Wrong Answer - San Salvador
            break;
            
         //Answers for Third Question
        case R.id.3a:
            if (checked)
                // Wrong Answer - Hong Kong
            break;
        case R.id.3b:
            if (checked)
                // Wrong Answer - Daegu
            break;
        case R.id.3c:
            if (checked)
                // Wrong Answer - Busan
            break;
        case R.id.3d:
            if (checked)
                // RIGHT ANSWER - Seul
                finalScore += 1;
            break;
            
        //Answers for Fourth Question
        case R.id.4a:
            if (checked)
                // Wrong Answer - Kyoto
            break;
        case R.id.4b:
            if (checked)
                // RIGHT ANSWER - Tokyo
                finalScore += 1;
            break;
        case R.id.4c:
            if (checked)
                // Wrong Answer - Osaka
            break;
        case R.id.4d:
            if (checked)
                // Wrong Answer - Minato
            break;
            
        //Answers for Fifth Question
        case R.id.5a:
            if (checked)
                // Wrong Answer - Punakha
            break;
        case R.id.5b:
            if (checked)
                // Wrong Answer - Paro
            break;
        case R.id.5c:
            if (checked)
                // RIGHT ANSWER - Thimphu
                finalScore += 1;
            break;
        case R.id.5d:
            if (checked)
                // Wrong Answer - Puntshol
            break;
           
    }
}

 public void submitResults(View view) {
        //Toast message to end Quizz
        Toast toast = Toast.makeText(getApplicationContext(),
        "You have finished the Quiz, sending results...",
        Toast.LENGTH_SHORT);
        toast.show();
     
        // Get user's name
        EditText nameField = (EditText) findViewById(R.id.name_field);
        Editable nameEditable = nameField.getText();
        String name = nameEditable.toString();
     
        // Get user's Birthdate
        EditText birtField = (EditText) findViewById(R.id.birth_field);
        Editable birthEditable = birtField.getText();
        String birth = birthEditable.toString();
     
         // Get user's Country
        EditText countryField = (EditText) findViewById(R.id.country_field);
        Editable countryEditable = countryField.getText();
        String country = countryEditable.toString();

        // Finalscore message
        String finalScoreMessage = name + "from " + country + ", who was born in" + country + "has scored" + finalScore;

        // Use an intent to launch an email app.
        // Send the order summary in the email body.
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT,
                getString(R.string.order_summary_email_subject, name, birth, country, ));
        intent.putExtra(Intent.EXTRA_TEXT, finalScoreMessage);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
}
