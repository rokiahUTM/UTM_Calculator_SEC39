package com.example.utmcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nameCourseET = (EditText) findViewById(R.id.courseNameET);
        EditText creditCourseET = (EditText) findViewById(R.id.courseCreditET);
        EditText gradeCourseET = (EditText) findViewById(R.id.courseGradeET);
        EditText nameCourse2ET = (EditText) findViewById(R.id.courseName2ET);
        EditText creditCourse2ET = (EditText) findViewById(R.id.courseCredit2ET);
        EditText gradeCourse2ET = (EditText) findViewById(R.id.courseGrade2ET);

        TextView gradePointTV = (TextView) findViewById(R.id.coursePointTV);
        TextView gradePoint2TV = (TextView) findViewById(R.id.coursePoint2TV);

        Button calculateGPABtn = (Button) findViewById(R.id.calculateGPABtn);
        Button resetBtn = (Button) findViewById(R.id.resetBtn);





    }
}