

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
            break;
            
        //Answers for Fourth Question
        case R.id.4a:
            if (checked)
                // Wrong Answer - Kyoto
            break;
        case R.id.4b:
            if (checked)
                // RIGHT ANSWER - Tokyo
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
            break;
        case R.id.5d:
            if (checked)
                // Wrong Answer - Puntshol
            break;
            
    }
}
