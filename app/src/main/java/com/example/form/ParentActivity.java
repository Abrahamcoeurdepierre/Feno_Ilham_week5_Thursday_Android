package com.example.form;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;

import com.example.form.MainActivity;
import com.example.form.R;
import com.example.form.databinding.ActivityParentBinding;
import com.example.form.models.Parents;
import com.example.form.models.Student;

import java.util.Objects;

public class ParentActivity extends AppCompatActivity {
    ActivityParentBinding bind;
    Student std;
    Parents parent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent);
        setTitle("Parent Info");
        bind = DataBindingUtil.setContentView(this, R.layout.activity_parent);
        std = (Student) Objects.requireNonNull(getIntent().getExtras().getParcelable("STUDENT"));
        parent = new Parents();
    }
    public void onClickNext(View v){
        Intent intent = new Intent(this, UniversityActivity.class);

        parent.setFatherName(bind.parFatherName.getText().toString());
        parent.setMotherName(bind.parMotherName.getText().toString());

        parent.setFatherNIK(bind.parFatherNIK.getText().toString());
        parent.setMotherNIK(bind.parMotherNIK.getText().toString());

        parent.setFatherJob(bind.parFatherJob.getText().toString());
        parent.setMotherJob(bind.parMotherJob.getText().toString());

        parent.setFatherEdu(bind.parFatherEducation.getText().toString());
        parent.setMotherEdu(bind.parFatherEducation.getText().toString());

        parent.setPhoneNum(bind.parPhone.getText().toString());
        parent.setEmail(bind.parEmail.getText().toString());

        parent.setProvince(bind.spinnerProvince.getSelectedItem().toString());
        parent.setCity(bind.spinnerCity.getSelectedItem().toString());

        parent.setRt(bind.parRT.getText().toString());
        parent.setRw(bind.parRW.getText().toString());
        parent.setPostalCode(bind.parPostalCode.getText().toString());


        parent.setYearBornFather(bind.parYearFather.getText().toString());
        parent.setYearBornMother(bind.parYearMom.getText().toString());

        intent.putExtra("STUDENT", std);
        intent.putExtra("PARENT", parent);
        startActivity(intent);
    }
}