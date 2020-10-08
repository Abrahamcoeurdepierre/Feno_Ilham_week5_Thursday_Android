package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;

import org.parceler.Parcels;

public class ParentActivity extends AppCompatActivity {
    private EditText firstName, lastName, city, province,postalCode,country,
            citizenship,phoneNumber,occupation;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent);



        firstName = findViewById(R.id.PrtFirstName);
        lastName = findViewById(R.id.PrtLastName);
        city = findViewById(R.id.PrtCity);
        province = findViewById(R.id.PrtProvince);
        postalCode = findViewById(R.id.PrtPostalCode);
        country = findViewById(R.id.PrtCountry);
        citizenship = findViewById(R.id.PrtCitizenship);
        phoneNumber = findViewById(R.id.PrtPhoneNumber);
        occupation = findViewById(R.id.PrtOccupation);

    }
    public void openUniversityActivity(View view) {
        Parcelable parcelable = getIntent().getParcelableExtra("Deta");
        Student student = Parcels.unwrap(parcelable);

        student.setPrtFirstName(firstName.getText().toString());
        student.setPrtLastName(lastName.getText().toString());
        student.setPrtCity(city.getText().toString());
        student.setPrtCitizenship(citizenship.getText().toString());
        student.setPrtProvince(province.getText().toString());
        student.setPrtCountry(country.getText().toString());
        student.setPrtOccupation(occupation.getText().toString());

        student.setPrtPostalCode(Integer.parseInt(postalCode.getText().toString()));
        student.setPrtPhoneNumber(Integer.parseInt(phoneNumber.getText().toString()));

        Parcelable parcelable2 = Parcels.wrap(student);
        Intent intent = new Intent(this, UniversityActivity.class);
        intent.putExtra("Deta", parcelable2);
        startActivity(intent);

    }
}