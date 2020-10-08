package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import org.parceler.Parcels;

public class MainActivity extends AppCompatActivity {


    private EditText firstName, lastName,postalCode,country,citizenship,phoneNumber;
    private Spinner spinnerCity, spinnerProvince;
    private RadioGroup rgGender;
    private RadioButton rbMale, rbFemale;
    private String selectedGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        rgGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (radioGroup.getCheckedRadioButtonId()){
                    case R.id.rbMale:
                        if(rbMale.isChecked()){
                            rbFemale.setChecked(false);
                            selectedGender = rbMale.getText().toString();}
                        break;
                    case R.id.rbFemale:
                        if(rbFemale.isChecked()){
                            rbMale.setChecked(false);
                            selectedGender = rbFemale.getText().toString();}
                        break;
                }
            }
        });
    }

    public void init(){
        firstName = findViewById(R.id.SdtFirstName);
        lastName = findViewById(R.id.SdtEmail);
        spinnerCity = findViewById(R.id.spinnerCity);
        spinnerProvince = findViewById(R.id.spinnerProvince);
        postalCode = findViewById(R.id.SdtPostalCode);
        phoneNumber = findViewById(R.id.SdtPhoneNumber);
    }

    public void openParentActivity(View view) {
        Student student = new Student();

        student.setStdFirstName(firstName.getText().toString());
        student.setSdtLastName(lastName.getText().toString());
        student.setSdtCity(spinnerCity.getSelectedItem().toString());
        student.setSdtCitizenship(citizenship.getText().toString());
        student.setSdtProvince(spinnerProvince.getSelectedItem().toString());
        student.setSdtCountry(country.getText().toString());

        student.setSdtPostalCode(Integer.parseInt(postalCode.getText().toString()));
        student.setSdtPhoneNumber(Integer.parseInt(phoneNumber.getText().toString()));

        Parcelable parcelable = Parcels.wrap(student);
        Intent intent = new Intent(this, ParentActivity.class);
        intent.putExtra("Deta", parcelable);
        startActivity(intent);

    }
}