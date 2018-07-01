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

    int score = 0;  //Counts the scores
    int clicks = 0; //Keeps track of the number of times the submit button is clicked

    //Button Declaration for each Question, the number corresponds to the question number
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
    Button submitButton; //The submit Button

    //Declare RadioGroup instances, the number corresponds to the question number
    RadioGroup radioGroup1;
    RadioGroup radioGroup2;
    RadioGroup radioGroup4;
    RadioGroup radioGroup5;
    RadioGroup radioGroup6;
    RadioGroup radioGroup7;
    RadioGroup radioGroup8;
    RadioGroup radioGroup9;

    //Declare CheckBox Instances, the number corresponds to the question number and then options
    CheckBox question3a1;
    CheckBox question3a2;
    CheckBox question3a3;
    CheckBox question3a4;


    //The Edit View
    EditText editText;
    //String to be used with the edit view
    String answer10 = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get Button Objects from the Button View
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
        submitButton = findViewById(R.id.sub);

        //Get the RadioGroup Objects from the RadioGroup View
        radioGroup1 = findViewById(R.id.group1);
        radioGroup2 = findViewById(R.id.group2);
        radioGroup4 = findViewById(R.id.group4);
        radioGroup5 = findViewById(R.id.group5);
        radioGroup6 = findViewById(R.id.group6);
        radioGroup7 = findViewById(R.id.group7);
        radioGroup8 = findViewById(R.id.group8);
        radioGroup9 = findViewById(R.id.group9);

        //Get the CheckBox Objects from The CheckBox View
        question3a1 = this.findViewById(R.id.question3a);
        question3a2 = this.findViewById(R.id.question3b);
        question3a3 = this.findViewById(R.id.question3c);
        question3a4 = this.findViewById(R.id.question3d);

        editText = findViewById(R.id.edit10);


    }


    //Question 1 Score Calculation
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


    //Question 2 Score Calculation
    RadioButton question2a;
    boolean answer2 = false;

    public void calcQuestion2(View v) {
        question2a = this.findViewById(R.id.question2a);
        answer2 = question2a.isChecked();
        if (answer2) {

            score = score + 1;
        } else {

            score = score + 0;
        }
    }


    //Question 3 score Calculation

    boolean answer31 = false;
    boolean answer32 = false;
    boolean answer33 = false;
    boolean answer34 = false;

    public void calcQuestion3(View v) {
        answer31 = question3a1.isChecked();
        answer32 = question3a2.isChecked();
        answer33 = question3a3.isChecked();
        answer34 = question3a4.isChecked();

        if ((answer31 && !answer32) || (answer31 && !answer34)) {

            score = score + 1;
        } else if ((answer33 && !answer32) || (answer33 && !answer34)) {

            score = score + 1;

        } else {

            score = score + 0;
        }
    }

    //Question 4 Score Calculation
    RadioButton question4c;
    boolean answer4 = false;

    public void calcQuestion4(View v) {
        question4c = this.findViewById(R.id.question4c);
        answer4 = question4c.isChecked();
        if (answer4) {

            score = score + 1;
        } else {


            score = score + 0;
        }

    }

    //Question 5 Score Calculation
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

    //Question 6 Score Calculation
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

    //Question 7 Score Calculation
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

    //Question 8 Score Calculation
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

    //Question 9 Score Calculation
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


    //Question 10 Score Calculation


    public void calcQuestion10(View v) {

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

    //Disabling the The answers
    private void answerDisable() {

//Looping through the RadioGroups to disable the Radio Buttons
        for (int i = 0; i < radioGroup1.getChildCount(); i++) {
            radioGroup1.getChildAt(i).setEnabled(false);
        }

        for (int i = 0; i < radioGroup2.getChildCount(); i++) {
            radioGroup2.getChildAt(i).setEnabled(false);
        }

        for (int i = 0; i < radioGroup4.getChildCount(); i++) {
            radioGroup4.getChildAt(i).setEnabled(false);
        }

        for (int i = 0; i < radioGroup5.getChildCount(); i++) {
            radioGroup5.getChildAt(i).setEnabled(false);
        }

        for (int i = 0; i < radioGroup6.getChildCount(); i++) {
            radioGroup6.getChildAt(i).setEnabled(false);
        }

        for (int i = 0; i < radioGroup7.getChildCount(); i++) {
            radioGroup7.getChildAt(i).setEnabled(false);
        }

        for (int i = 0; i < radioGroup8.getChildCount(); i++) {
            radioGroup8.getChildAt(i).setEnabled(false);
        }

        for (int i = 0; i < radioGroup9.getChildCount(); i++) {
            radioGroup9.getChildAt(i).setEnabled(false);
        }

        for (int i = 0; i < radioGroup1.getChildCount(); i++) {
            radioGroup1.getChildAt(i).setEnabled(false);
        }

        //The EditView is Disabled
        editText.setEnabled(false);

        //CheckBox objects are Disabled
        question3a1.setEnabled(false);
        question3a2.setEnabled(false);
        question3a3.setEnabled(false);
        question3a4.setEnabled(false);


    }

    //Making the answer buttons visible
    private void showAnswerButtons() {

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

    }


    //Enabling the The answers i.e Radio Buttons,Checkboxes and Edit View
    private void answerEnable() {

        //Looping through the RadioGroups to enable the individual radio buttons
        for (int i = 0; i < radioGroup1.getChildCount(); i++) {
            radioGroup1.getChildAt(i).setEnabled(true);
        }

        for (int i = 0; i < radioGroup2.getChildCount(); i++) {
            radioGroup2.getChildAt(i).setEnabled(true);
        }

        for (int i = 0; i < radioGroup4.getChildCount(); i++) {
            radioGroup4.getChildAt(i).setEnabled(true);
        }

        for (int i = 0; i < radioGroup5.getChildCount(); i++) {
            radioGroup5.getChildAt(i).setEnabled(true);
        }

        for (int i = 0; i < radioGroup6.getChildCount(); i++) {
            radioGroup6.getChildAt(i).setEnabled(true);
        }

        for (int i = 0; i < radioGroup7.getChildCount(); i++) {
            radioGroup7.getChildAt(i).setEnabled(true);
        }

        for (int i = 0; i < radioGroup8.getChildCount(); i++) {
            radioGroup8.getChildAt(i).setEnabled(true);
        }

        for (int i = 0; i < radioGroup9.getChildCount(); i++) {
            radioGroup9.getChildAt(i).setEnabled(true);
        }

        for (int i = 0; i < radioGroup1.getChildCount(); i++) {
            radioGroup1.getChildAt(i).setEnabled(true);
        }

        //Enabling the EditView object
        editText.setEnabled(true);

        //Enabling The Check boxes
        question3a1.setEnabled(true);
        question3a2.setEnabled(true);
        question3a3.setEnabled(true);
        question3a4.setEnabled(true);


    }

    //Hiding the Answer Buttons
    private void hideAnswerButtons() {

        button_1.setVisibility(View.INVISIBLE);
        button_2.setVisibility(View.INVISIBLE);
        button_3.setVisibility(View.INVISIBLE);
        button_4.setVisibility(View.INVISIBLE);
        button_5.setVisibility(View.INVISIBLE);
        button_6.setVisibility(View.INVISIBLE);
        button_7.setVisibility(View.INVISIBLE);
        button_8.setVisibility(View.INVISIBLE);
        button_9.setVisibility(View.INVISIBLE);
        button_10.setVisibility(View.INVISIBLE);


    }


    //Clears all the Answers
    private void answerReset() {

        //Resets the radio buttons
        radioGroup1.clearCheck();
        radioGroup2.clearCheck();
        radioGroup4.clearCheck();
        radioGroup5.clearCheck();
        radioGroup6.clearCheck();
        radioGroup7.clearCheck();
        radioGroup8.clearCheck();
        radioGroup9.clearCheck();

        //Reset the EditView
        editText.setText("");


        //Resets the Checkboxes
        question3a1.setChecked(false);
        question3a2.setChecked(false);
        question3a3.setChecked(false);
        question3a4.setChecked(false);

        //Resets the scores
        score = 0;

        //Resets the number of times the submit button is clicked
        clicks = 0;


    }

    //Submits the Entire Quiz
    public void onSubmit(View v) {

        //Makes sure that the "calcQuestion10(editText)" does not increase the score each time the submit button is clicked on
        if (clicks == 0) {
            calcQuestion10(editText);   //Submit the edit view
            showAnswerButtons();        //Shows the Answer Buttons
            answerDisable();            //Makes sure no more answering after submitting
            display();                  //Displays the total score
            clicks++;
        } else {
            display();
            showAnswerButtons();
            answerDisable();

        }

    }

    // Calls the Methods that do the resetting
    public void onReset(View v) {
        answerEnable();             //Will enable the the buttons and edit view
        hideAnswerButtons();        //Will Hide the answer buttons
        answerReset();              //Makes sure all answers are discarded
    }

    //Show Answer for Question 1

    public void setAnswer1(View v) {

        if (answer1) {
            Toast.makeText(this, "Horray, You got it Right!!!", Toast.LENGTH_SHORT).show();
        } else {

            Toast.makeText(this, "The right Answer is Option A", Toast.LENGTH_SHORT).show();

        }

    }

    //Show Answer for Question 2
    public void setAnswer2(View v) {

        if (answer2) {
            Toast.makeText(this, "Horray, You got it Right!!!", Toast.LENGTH_SHORT).show();


        } else {

            Toast.makeText(this, "The right Answer is Option A", Toast.LENGTH_SHORT).show();

        }
    }


    //Show Answer for Question 3

    public void setAnswer3(View v) {

        if (answer31 && !answer32 && answer33 && !answer34) {

            Toast.makeText(this, "Excellent!!!, That Was Owesome", Toast.LENGTH_SHORT).show();


        } else if ((answer31 && !answer32) || (answer31 && !answer34)) {

            Toast.makeText(this, "Nice Try, You got one Correct though, the other Option was C", Toast.LENGTH_SHORT).show();

        } else if ((answer33 && !answer32) || (answer33 && !answer34)) {
            Toast.makeText(this, "Nice Try, You got one Correct though, the other Option was A", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this, "The Right Options are A and C", Toast.LENGTH_SHORT).show();
        }

    }

    //Show Answer for Question 4

    public void setAnswer4(View v) {


        if (answer4) {
            Toast.makeText(this, "Horray, You got it Right!!!", Toast.LENGTH_SHORT).show();
        } else {

            Toast.makeText(this, "The right Answer is Option C", Toast.LENGTH_SHORT).show();

        }


    }

    //Show Answer for Question 5

    public void setAnswer5(View v) {


        if (answer5) {
            Toast.makeText(this, "Horray, You got it Right!!!", Toast.LENGTH_SHORT).show();
        } else {

            Toast.makeText(this, "The right Answer is Option B", Toast.LENGTH_SHORT).show();

        }

    }


    //Show Answer for Question 6

    public void setAnswer6(View v) {

        if (answer6) {
            Toast.makeText(this, "Horray, You got it Right!!!", Toast.LENGTH_SHORT).show();
        } else {

            Toast.makeText(this, "The right Answer is Option D", Toast.LENGTH_SHORT).show();

        }

    }


    //Show Answer for Question 7

    public void setAnswer7(View v) {

        if (answer7) {
            Toast.makeText(this, "Horray, You got it Right!!!", Toast.LENGTH_SHORT).show();
        } else {

            Toast.makeText(this, "The right Answer is Option B", Toast.LENGTH_SHORT).show();

        }

    }

    //Show Answer for Question 8

    public void setAnswer8(View v) {

        if (answer8) {
            Toast.makeText(this, "Horray, You got it Right!!!", Toast.LENGTH_SHORT).show();
        } else {

            Toast.makeText(this, "The right Answer is Option E", Toast.LENGTH_SHORT).show();

        }

    }

    //Show Answer for Question 9

    public void setAnswer9(View v) {

        if (answer9) {
            Toast.makeText(this, "Horray, You got it Right!!!", Toast.LENGTH_SHORT).show();
        } else {

            Toast.makeText(this, "The right Answer is Option E", Toast.LENGTH_SHORT).show();

        }

    }
    //Show Answer for Question 10

    public void setAnswer10(View v) {
        if (answer10.equals("TextView")) {
            Toast.makeText(this, "Excellent", Toast.LENGTH_SHORT).show();
        } else {

            Toast.makeText(this, "The right answer is TextField", Toast.LENGTH_SHORT).show();
        }
    }

}
