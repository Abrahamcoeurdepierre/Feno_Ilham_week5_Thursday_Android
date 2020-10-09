package com.example.form;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.Spinner;

import com.example.form.databinding.ActivityMainBinding;
import com.example.form.models.Student;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding bind;
    DatePickerDialog picker;
    Student std;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Student Info");
        bind = DataBindingUtil.setContentView(this, R.layout.activity_main);
        std = new Student();
        std.setGender("Male");
        std.setNationality("Indonesia");
        //set date picker to date text field
        bind.stdDOB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar calendar = Calendar.getInstance();
                int day = calendar.get(Calendar.DAY_OF_MONTH);
                int month = calendar.get(Calendar.MONTH);
                int year = calendar.get(Calendar.YEAR);
                picker = new DatePickerDialog(MainActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                bind.stdDOB.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                            }
                        }, year, month, day);
                picker.show();
            }
        });

        //set handler of radio button
        bind.rbMale.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    std.setGender("Male");
                    bind.rbFemale.setChecked(false);
                }
            }
        });
        bind.rbFemale.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    std.setGender("Female");
                    bind.rbMale.setChecked(false);
                }

            }
        });
        bind.rbIndonesia.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    std.setNationality("Indonesia");
                    bind.rbForeign.setChecked(false);
                }
            }
        });
        bind.rbForeign.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    std.setNationality("Foreign");
                    bind.rbIndonesia.setChecked(false);
                }
            }
        });
    }
    public void onClickNext(View v){
        Intent intent = new Intent(this, ParentActivity.class);

        std.setName(bind.stdName.getText().toString());
        std.setMajor(bind.stdMajor.getText().toString());
        std.setBirthPlace(bind.stdBirthPlace.getText().toString());
        std.setStudyProgram(bind.stdStudyProgram.getText().toString());
        std.setStatus(bind.stdStatus.getText().toString());
        std.setPassword(bind.stdPassword.getText().toString());
        std.setReason(bind.stdReason2.getText().toString());
        std.setNIK(bind.stdNIK.getText().toString());
        std.setAchievement(bind.stdAchievement.getText().toString());
        std.setDOB(bind.stdDOB.getText().toString());
        std.setRt(bind.stdRT.getText().toString());
        std.setRw(bind.stdRW.getText().toString());
        std.setAddress(bind.stdAddress.getText().toString());
        std.setReason(bind.stdReason2.getText().toString());
        std.setCity(bind.spinnerCity.getSelectedItem().toString());
        std.setProvince(bind.spinnerProvince.getSelectedItem().toString());
        std.setPostalCode(bind.stdPostalCode.getText().toString());
        std.setEmail(bind.stdEmail.getText().toString());
        std.setPhoneNumber(bind.stdPhoneNumber.getText().toString());

        intent.putExtra("STUDENT", std);
        startActivity(intent);
    }
}
