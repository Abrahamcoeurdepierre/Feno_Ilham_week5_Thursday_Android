package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;

import org.parceler.Parcels;

public class MainActivity extends AppCompatActivity {


    private EditText firstName, lastName, city, province,postalCode,country,
    citizenship,phoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName = findViewById(R.id.SdtFirstName);
        lastName = findViewById(R.id.SdtLastName);
        city = findViewById(R.id.SdtCity);
        province = findViewById(R.id.SdtProvince);
        postalCode = findViewById(R.id.SdtPostalCode);
        country = findViewById(R.id.SdtCountry);
        citizenship = findViewById(R.id.SdtCitizenship);
        phoneNumber = findViewById(R.id.SdtPhoneNumber);


    }

    public void openParentActivity(View view) {
        Student student = new Student();

        student.setStdFirstName(firstName.getText().toString());
        student.setSdtLastName(lastName.getText().toString());
        student.setSdtCity(city.getText().toString());
        student.setSdtCitizenship(citizenship.getText().toString());
        student.setSdtProvince(province.getText().toString());
        student.setSdtCountry(country.getText().toString());

        student.setSdtPostalCode(Integer.parseInt(postalCode.getText().toString()));
        student.setSdtPhoneNumber(Integer.parseInt(phoneNumber.getText().toString()));

        Parcelable parcelable = Parcels.wrap(student);
        Intent intent = new Intent(this, ParentActivity.class);
        intent.putExtra("Deta", parcelable);
        startActivity(intent);

    }
}