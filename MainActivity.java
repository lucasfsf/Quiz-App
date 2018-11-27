

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
                // Right Answer - Oslo
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
                // Right answer - Manágua
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
                // Pirates are the best
            break;
        case R.id.3b:
            if (checked)
                // Ninjas rule
            break;
        case R.id.3c:
            if (checked)
                // Pirates are the best
            break;
        case R.id.3d:
            if (checked)
                // Ninjas rule
            break;
            
        //Answers for Fourth Question
        case R.id.4a:
            if (checked)
                // Pirates are the best
            break;
        case R.id.4b:
            if (checked)
                // Ninjas rule
            break;
        case R.id.4c:
            if (checked)
                // Pirates are the best
            break;
        case R.id.4d:
            if (checked)
                // Ninjas rule
            break;
            
        //Answers for Fifth Question
        case R.id.5a:
            if (checked)
                // Pirates are the best
            break;
        case R.id.5b:
            if (checked)
                // Ninjas rule
            break;
        case R.id.5c:
            if (checked)
                // Pirates are the best
            break;
        case R.id.5d:
            if (checked)
                // Ninjas rule
            break;
            
    }
}
