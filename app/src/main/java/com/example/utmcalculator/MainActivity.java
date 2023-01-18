package com.example.utmcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText nameCourseET, creditCourseET, gradeCourseET;
    EditText nameCourse2ET, creditCourse2ET, gradeCourse2ET;
    TextView gradePointTV, gradePoint2TV;
    Button calculateGPABtn, resetBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameCourseET = (EditText) findViewById(R.id.courseNameET);
        creditCourseET = (EditText) findViewById(R.id.courseCreditET);
        gradeCourseET = (EditText) findViewById(R.id.courseGradeET);
        nameCourse2ET = (EditText) findViewById(R.id.courseName2ET);
        creditCourse2ET = (EditText) findViewById(R.id.courseCredit2ET);
        gradeCourse2ET = (EditText) findViewById(R.id.courseGrade2ET);

        gradePointTV = (TextView) findViewById(R.id.coursePointTV);
        gradePoint2TV = (TextView) findViewById(R.id.coursePoint2TV);

        calculateGPABtn = (Button) findViewById(R.id.calculateGPABtn);
        resetBtn = (Button) findViewById(R.id.resetBtn);

        displayGradePoint();

        calculateGPABtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                
            }
        });


    }

    private Double getGradePoint(String grade){
        Double gradePoint=0.0;
        switch (grade) {
            case "A+":
                gradePoint = 4.0;
                break;
            case "A":
                gradePoint = 4.0;
                break;
            case "A-":
                gradePoint = 3.67;
                break;
            case "B+":
                gradePoint = 3.33;
                break;
            case "B":
                gradePoint = 3.00;
                break;
            case "B-":
                gradePoint = 2.67;
                break;
            case "C+":
                gradePoint = 2.33;
                break;
            case "C":
                gradePoint = 2.0;
                break;
            case "C-":
                gradePoint = 1.67;
                break;
            case "D+":
                gradePoint = 1.33;
                break;
            case "D":
                gradePoint = 1.00;
                break;
            case "D-":
                gradePoint = 0.67;
                break;
            case "E":
                gradePoint = 0.0;
                break;
        }    
        return gradePoint;
    }

    private boolean isEmpty(int stringLength) {
        if (stringLength==0) return true;
        return false;
    }

    private void displayGradePoint(){
        gradeCourseET.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!isEmpty(creditCourseET.length())) {
                    int credit = Integer.parseInt(creditCourseET.getText().toString());
                    Double gradePoint = credit * getGradePoint(gradeCourseET.getText().toString());
                    gradePointTV.setText(gradePoint.toString());
                }
                else creditCourseET.setError("This field is required");
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

}