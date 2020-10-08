package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;

import org.parceler.Parcels;

public class ResultsActivity extends AppCompatActivity {
    private TextView stdFirstName, sdtLastName,sdtCity,sdtProvince,sdtCountry,sdtCitizenship,
            prtFirstName,prtLastName,prtCity,prtProvince,prtCountry,prtCitizenship,prtOccupation,univAsal,faculty,proStudy,
            univProvince,univKota,univAddress,univAkreditasi,sdtPostalCode, sdtPhoneNumber,prtPostalCode, prtPhoneNumber,univKodePos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);


        stdFirstName = findViewById(R.id.studentFirstName);
        sdtLastName = findViewById(R.id.studentLastName);
        sdtCity = findViewById(R.id.studentCity);
        sdtProvince = findViewById(R.id.studentProvince);
        sdtCountry = findViewById(R.id.studentCountry);
        sdtCitizenship = findViewById(R.id.studentCitizenship);
        prtFirstName = findViewById(R.id.parentFirstName);
        prtLastName = findViewById(R.id.ParentLastName);
        prtCity = findViewById(R.id.ParentCity);
        prtProvince = findViewById(R.id.parentProvince);
        prtCountry = findViewById(R.id.parentCountry);
        prtCitizenship = findViewById(R.id.parentCitizenship);
        prtOccupation = findViewById(R.id.parentOccupation);
        univAsal = findViewById(R.id.universitasAsal);
        faculty = findViewById(R.id.universitasFaculty);
        proStudy = findViewById(R.id.programStudy);
        univProvince = findViewById(R.id.universitasProvince);
        univKota = findViewById(R.id.universitasKota);
        univAddress = findViewById(R.id.universitasAddress);
        univAkreditasi = findViewById(R.id.universitasAccreditation);
        sdtPostalCode = findViewById(R.id.studentPostalCode);
        sdtPhoneNumber = findViewById(R.id.studentPhoneNumber);
        prtPostalCode = findViewById(R.id.parentPostalCode);
        prtPhoneNumber = findViewById(R.id.parentPhoneNumber);
        univKodePos = findViewById(R.id.universityPostalCode);


        //Set text:
        Parcelable parcelable = getIntent().getParcelableExtra("Deta");
        Student student = Parcels.unwrap(parcelable);

        stdFirstName.setText(student.getStdFirstName());
        sdtLastName.setText(student.getSdtLastName());
        sdtCity.setText(student.getSdtCity());
        sdtProvince.setText(student.getSdtProvince());
        sdtCountry.setText(student.getSdtCountry());
        sdtCitizenship.setText(student.getSdtCitizenship());
        prtFirstName.setText(student.getPrtFirstName());
        prtCity.setText(student.getPrtCity());
        prtProvince.setText(student.getPrtProvince());
        prtCountry.setText(student.getPrtCountry());
        prtCitizenship.setText(student.getPrtCitizenship());
        prtOccupation.setText(student.getPrtOccupation());
        univAsal.setText(student.getUnivAsal());
        faculty.setText(student.getFaculty());
        proStudy.setText(student.getProStudy());
        univProvince.setText(student.getUnivProvince());
        univKota.setText(student.getUnivKota());
        univAddress.setText(student.getUnivAddress());
        univAkreditasi.setText(student.getUnivAkreditasi());
        sdtPostalCode.setText(student.getSdtPostalCode());
        sdtPhoneNumber.setText(student.getSdtPhoneNumber());
        prtPostalCode.setText(student.getPrtPostalCode());
        prtPhoneNumber.setText(student.getPrtPhoneNumber());
        univKodePos.setText(student.getUnivKodePos());
        prtLastName.setText(student.getPrtLastName());

    }
}