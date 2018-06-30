package com.example.bruce.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    //Button Declaration
    Button button_1;
    Button button_2;
    Button button_3;
    Button button_4;
    Button button_5;
    Button button_6;
    Button button_7;
    Button button_8;
    Button button_9;
    Button button_10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get Button Id from the Button View
        button_1 = findViewById(R.id.button1);
        button_2 = findViewById(R.id.button2);
        button_3 = findViewById(R.id.button3);
        button_4 = findViewById(R.id.button4);
        button_5 = findViewById(R.id.button5);
        button_6 = findViewById(R.id.button6);
        button_7 = findViewById(R.id.button7);
        button_8 = findViewById(R.id.button8);
        button_9 = findViewById(R.id.button9);
        button_10 = findViewById(R.id.button10);
    }

    //Question 1 Calculation
    RadioButton question1a;
    boolean answer1 = false;

    public void calcQuestion1(View v) {
        question1a = this.findViewById(R.id.question1a);
        answer1 = question1a.isChecked();

        if (answer1) {
            score = score + 1;
        } else {

            score = score + 0;
        }

    }


    //Question 2 Calculation
    RadioButton question2a;
    boolean answer2 = false;

    public void calcQuestion2(View v) {
        question2a = this.findViewById(R.id.question2a);
        answer2 = question2a.isChecked();
        if (answer2) {

            score = score + 1;
        } else {

            score = score + 1;
        }
    }


    //Calculation For Question 3
    CheckBox question3a1;
    CheckBox question3a2;
    CheckBox question3a3;
    CheckBox question3a4;

    boolean answer31 = false;
    boolean answer32 = false;
    boolean answer33 = false;
    boolean answer34 = false;

    public void calcQuestion3(View v) {
        question3a1 = this.findViewById(R.id.question3a);
        question3a2 = this.findViewById(R.id.question3b);
        question3a3 = this.findViewById(R.id.question3c);
        question3a4 = this.findViewById(R.id.question3d);

        answer31 = question3a1.isChecked();
        answer32 = question3a2.isChecked();
        answer33 = question3a3.isChecked();
        answer34 = question3a4.isChecked();

        if (answer31 && !answer32 && answer33 && !answer34) {


            score = score + 2;

        } else if ((answer31 && !answer32) || (answer31 && !answer34)) {

            score = score + 1;
        } else if ((answer33 && !answer32) || (answer33 && !answer34)) {

            score = score + 1;

        } else {

            score = score + 0;
        }
    }

    //Question 4 Calculation
    RadioButton question4c;
    boolean answer4 = false;

    public void calcQuestion4(View v) {
        question4c = this.findViewById(R.id.question6c);
        answer4 = question4c.isChecked();
        if (answer4) {

            score = score + 1;
        } else {


            score = score + 0;
        }

    }

    //Question 5 Calculation
    RadioButton question5b;
    boolean answer5 = false;

    public void calcQuestion5(View v) {
        question5b = this.findViewById(R.id.question5b);
        answer5 = question5b.isChecked();
        if (answer5) {

            score = score + 1;
        } else {

            score = score + 0;
        }
    }

    //Question 6 Calculation
    RadioButton question6d;
    boolean answer6 = false;

    public void calcQuestion6(View v) {
        question6d = this.findViewById(R.id.question6d);
        answer6 = question6d.isChecked();
        if (answer6) {

            score = score + 1;
        } else {

            score = score + 0;
        }
    }

    //Question 7 Calculation
    RadioButton question7b;
    boolean answer7;

    public void calcQuestion7(View v) {
        question7b = this.findViewById(R.id.question7b);
        answer7 = question7b.isChecked();
        if (answer7) {

            score = score + 1;
        } else {

            score = score + 0;
        }
    }

    //Question 8 Calculation
    RadioButton question8e;
    boolean answer8 = false;

    public void calcQuestion8(View v) {
        question8e = this.findViewById(R.id.question8e);
        answer8 = question8e.isChecked();

        if (answer8) {

            score = score + 1;
        } else {


            score = score + 0;
        }
    }

    //Question 9 Calculation
    RadioButton question9e;
    boolean answer9 = false;

    public void calcQuestion9(View v) {
        question9e = this.findViewById(R.id.question9e);
        answer9 = question9e.isChecked();
        if (answer9) {

            score = score + 1;
        } else {


            score = score + 0;
        }

    }


    //Question 10 Calculation

    EditText editText;
    String answer10 = "";

    public void calcQuestion10(View v) {
        editText = this.findViewById(R.id.edit10);
        answer10 = editText.getText().toString();

        if (answer10.equals("TextView")) {

            score = score + 1;
        } else {

            score = score + 0;
        }

    }


    public int setScore() {
        return score;
    }

    public void display() {
        Toast.makeText(this, "Your Score is " + setScore() + " out of 11", Toast.LENGTH_SHORT).show();

    }


    public void onSubmit(View v) {
        calcQuestion10(editText);
        button_1.setVisibility(View.VISIBLE);
        button_2.setVisibility(View.VISIBLE);
        button_3.setVisibility(View.VISIBLE);
        button_4.setVisibility(View.VISIBLE);
        button_5.setVisibility(View.VISIBLE);
        button_6.setVisibility(View.VISIBLE);
        button_7.setVisibility(View.VISIBLE);
        button_8.setVisibility(View.VISIBLE);
        button_9.setVisibility(View.VISIBLE);
        button_10.setVisibility(View.VISIBLE);
        display();

    }


    //Show Answer for Question 1


    public void setAnswer1(View v) {
        RadioGroup radioGroup1 = this.findViewById(R.id.group1);
        int idGroup1 = radioGroup1.getCheckedRadioButtonId();


        if (idGroup1 != -1) {

            if (answer1) {
                Toast.makeText(this, "Horray, You got it Right!!!", Toast.LENGTH_SHORT).show();
            } else {

                Toast.makeText(this, "The right Answer is Option A", Toast.LENGTH_SHORT).show();

            }

        } else {
            Toast.makeText(this, "Please Answer the Question First!!!", Toast.LENGTH_SHORT).show();

        }
    }

    //Show Answer for Question 2
    public void setAnswer2(View v) {
        RadioGroup radioGroup2 = this.findViewById(R.id.group2);
        int idGroup2 = radioGroup2.getCheckedRadioButtonId();


        if (idGroup2 != -1) {

            if (answer2) {
                Toast.makeText(this, "Horray, You got it Right!!!", Toast.LENGTH_SHORT).show();
            } else {

                Toast.makeText(this, "The right Answer is Option A", Toast.LENGTH_SHORT).show();

            }

        } else {
            Toast.makeText(this, "Please Answer the Question First!!!", Toast.LENGTH_SHORT).show();

        }
    }


    //Show Answer for Question 3

    public void setAnswer3(View v) {
        if (answer31 || answer32 || answer33 || answer34) {

            if (answer31 && !answer32 && answer33 && !answer34) {

                Toast.makeText(this, "Excellent!!!, That Was Owesome", Toast.LENGTH_SHORT).show();


            } else if ((answer31 && !answer32) || (answer31 && !answer34)) {

                Toast.makeText(this, "Nice Try, You got one Correct though, the other Option was C", Toast.LENGTH_SHORT).show();

            } else if ((answer33 && !answer32) || (answer33 && !answer34)) {
                Toast.makeText(this, "Nice Try, You got one Correct though, the other Option was A", Toast.LENGTH_SHORT).show();

            } else {
                Toast.makeText(this, "The Right Options are A and C", Toast.LENGTH_SHORT).show();
            }

            //Toast.makeText(this, "Answer : A", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this, "Answer the Question First", Toast.LENGTH_SHORT).show();

        }
    }

    //Show Answer for Question 4

    public void setAnswer4(View v) {
        RadioGroup radioGroup4 = this.findViewById(R.id.group4);
        int idGroup4 = radioGroup4.getCheckedRadioButtonId();


        if (idGroup4 != -1) {

            if (answer4) {
                Toast.makeText(this, "Horray, You got it Right!!!", Toast.LENGTH_SHORT).show();
            } else {

                Toast.makeText(this, "The right Answer is Option C", Toast.LENGTH_SHORT).show();

            }

        } else {
            Toast.makeText(this, "Please Answer the Question First!!!", Toast.LENGTH_SHORT).show();

        }
    }

    //Show Answer for Question 5

    public void setAnswer5(View v) {
        RadioGroup radioGroup5 = this.findViewById(R.id.group5);
        int idGroup5 = radioGroup5.getCheckedRadioButtonId();


        if (idGroup5 != -1) {

            if (answer5) {
                Toast.makeText(this, "Horray, You got it Right!!!", Toast.LENGTH_SHORT).show();
            } else {

                Toast.makeText(this, "The right Answer is Option B", Toast.LENGTH_SHORT).show();

            }

        } else {
            Toast.makeText(this, "Please Answer the Question First!!!", Toast.LENGTH_SHORT).show();

        }
    }


    //Show Answer for Question 6

    public void setAnswer6(View v) {
        RadioGroup radioGroup6 = this.findViewById(R.id.group6);
        int idGroup6 = radioGroup6.getCheckedRadioButtonId();


        if (idGroup6 != -1) {

            if (answer6) {
                Toast.makeText(this, "Horray, You got it Right!!!", Toast.LENGTH_SHORT).show();
            } else {

                Toast.makeText(this, "The right Answer is Option D", Toast.LENGTH_SHORT).show();

            }

        } else {
            Toast.makeText(this, "Please Answer the Question First!!!", Toast.LENGTH_SHORT).show();

        }
    }


    //Show Answer for Question 7

    public void setAnswer7(View v) {
        RadioGroup radioGroup7 = this.findViewById(R.id.group7);
        int idGroup7 = radioGroup7.getCheckedRadioButtonId();


        if (idGroup7 != -1) {

            if (answer7) {
                Toast.makeText(this, "Horray, You got it Right!!!", Toast.LENGTH_SHORT).show();
            } else {

                Toast.makeText(this, "The right Answer is Option B", Toast.LENGTH_SHORT).show();

            }

        } else {
            Toast.makeText(this, "Please Answer the Question First!!!", Toast.LENGTH_SHORT).show();

        }
    }

    //Show Answer for Question 8

    public void setAnswer8(View v) {
        RadioGroup radioGroup8 = this.findViewById(R.id.group8);
        int idGroup8 = radioGroup8.getCheckedRadioButtonId();


        if (idGroup8 != -1) {

            if (answer8) {
                Toast.makeText(this, "Horray, You got it Right!!!", Toast.LENGTH_SHORT).show();
            } else {

                Toast.makeText(this, "The right Answer is Option E", Toast.LENGTH_SHORT).show();

            }

        } else {
            Toast.makeText(this, "Please Answer the Question First!!!", Toast.LENGTH_SHORT).show();

        }
    }

    //Show Answer for Question 9

    public void setAnswer9(View v) {
        RadioGroup radioGroup9 = this.findViewById(R.id.group9);
        int idGroup9 = radioGroup9.getCheckedRadioButtonId();


        if (idGroup9 != -1) {

            if (answer9) {
                Toast.makeText(this, "Horray, You got it Right!!!", Toast.LENGTH_SHORT).show();
            } else {

                Toast.makeText(this, "The right Answer is Option E", Toast.LENGTH_SHORT).show();

            }

        } else {
            Toast.makeText(this, "Please Answer the Question First!!!", Toast.LENGTH_SHORT).show();

        }
    }
    //Show Answer for Question 10

    public void setAnswer10(View v) {
        calcQuestion10(editText);

        if (answer10 != null && !answer10.isEmpty() && !answer10.equals("null") || answer10 == " ") {
            Toast.makeText(this, "Answer the Question First", Toast.LENGTH_SHORT).show();
        } else {

            if (answer10.equals("TextView")) {
                Toast.makeText(this, "Excellent", Toast.LENGTH_SHORT).show();
            } else {

                Toast.makeText(this, "The right answer is TextField", Toast.LENGTH_SHORT).show();
            }
        }
    }

}
