package com.example.form;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.form.databinding.ActivityUniversityBinding;
import com.example.form.models.Parents;
import com.example.form.models.University;
import com.example.form.models.Student;

import java.util.Objects;

public class UniversityActivity extends AppCompatActivity {
    ActivityUniversityBinding bind;
    Student std;
    Parents parent;
    University university;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university);
        setTitle("University Information");
        bind = DataBindingUtil.setContentView(this, R.layout.activity_university);
        std = (Student) Objects.requireNonNull(getIntent().getExtras().getParcelable("STUDENT"));
        parent = (Parents) Objects.requireNonNull(getIntent().getExtras().getParcelable("PARENT"));
        university = new University();
    }
    public void openResults(View v){
        Intent intent = new Intent(this, ResultsActivity.class);
        university.setUniName(bind.UniName.getText().toString());
        university.setFaculty(bind.UniFaculty.getText().toString());
        university.setStudyProgramme(bind.UniProStudy.getText().toString());
        university.setProvince(bind.UniProvince.getSelectedItem().toString());
        university.setCity(bind.UniCity.getSelectedItem().toString());
        university.setAddress(bind.UniAddress.getText().toString());
        university.setPostalCode(bind.UniCodePos.getText().toString());
        university.setAccreditation(bind.UniAkreditasi.getText().toString());
        university.setIpk(bind.UniIPK.getText().toString());
        intent.putExtra("STUDENT", std);
        intent.putExtra("PARENT", parent);
        intent.putExtra("UNIVERSITY", university);
        startActivity(intent);
    }
}