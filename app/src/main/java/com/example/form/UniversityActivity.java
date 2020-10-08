package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Adapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.parceler.Parcels;


public class UniversityActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    EditText asal, faculty, programStudy,address,akreditasi;
    EditText kodePos;
    Spinner city, province;
    TextView debug;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university);
        //Spinner 1:
        Spinner spinner = findViewById(R.id.UniProvince);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.UniProvinces, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        //Spinner 2:
        Spinner spinner2 = findViewById(R.id.UniKota);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.UniKota, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(this);



        asal = findViewById(R.id.UniAsal);
        faculty = findViewById(R.id.UniFaculty);
        city = findViewById(R.id.UniKota);
        province = findViewById(R.id.UniProvince);
        kodePos = findViewById(R.id.UniCodePos);
        address = findViewById(R.id.UniAddress);
        akreditasi = findViewById(R.id.UniAkreditasi);
        programStudy = findViewById(R.id.UniProStudy);
        Parcelable parcelable = getIntent().getParcelableExtra("Deta");
        Student student = Parcels.unwrap(parcelable);
        debug = findViewById(R.id.textView);
        debug.setText(student.getPrtLastName() + student.getSdtLastName() );


    }

    public void openResults(View view) {

        Parcelable parcelable = getIntent().getParcelableExtra("Deta");
        Student student = Parcels.unwrap(parcelable);

        student.setUnivAsal(asal.getText().toString());
        student.setUnivKota(city.getSelectedItem().toString());
        student.setUnivProvince(province.getSelectedItem().toString());
        student.setUnivAddress(address.getText().toString());
        student.setUnivAkreditasi(akreditasi.getText().toString());

        student.setUnivKodePos(Integer.parseInt(kodePos.getText().toString()));

        Parcelable parcelable2 = Parcels.wrap(student);
        Intent intent = new Intent(this, ResultsActivity.class);
        intent.putExtra("Deta", parcelable2);
        startActivity(intent);


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String text = adapterView.getItemAtPosition(i).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }



}

