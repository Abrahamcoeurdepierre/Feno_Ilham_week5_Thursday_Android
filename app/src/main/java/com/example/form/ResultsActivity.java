package com.example.form;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.form.databinding.ActivityResultsBinding;
import com.example.form.models.Parents;
import com.example.form.models.University;
import com.example.form.models.Student;

import java.util.Objects;

public class ResultsActivity extends AppCompatActivity {
    ActivityResultsBinding bind;
    Student std;
    Parents parent;
    University university;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        setTitle("DATA OUTPUT");
        bind = DataBindingUtil.setContentView(this,R.layout.activity_results);
        std = (Student) Objects.requireNonNull(getIntent().getExtras().getParcelable("STUDENT"));
        parent = (Parents) Objects.requireNonNull(getIntent().getExtras().getParcelable("PARENT"));
        university = (University) Objects.requireNonNull(getIntent().getExtras().getParcelable("UNIVERSITY"));
        bind.setStudent(std);
        bind.setParent(parent);
        bind.setUniv(university);
    }
    public void onClickBack(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
