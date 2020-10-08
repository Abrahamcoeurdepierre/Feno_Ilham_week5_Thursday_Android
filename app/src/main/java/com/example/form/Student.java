package com.example.form;

import android.os.Parcel;
import android.os.Parcelable;

public class Student implements Parcelable {
    private String stdFirstName, sdtLastName,sdtCity,sdtProvince,sdtCountry,sdtCitizenship,
    prtFirstName,prtLastName,prtCity,prtProvince,prtCountry,prtCitizenship,prtOccupation,univAsal,faculty,proStudy,
    univProvince,univKota,univAddress,univAkreditasi;
    private int sdtPostalCode, sdtPhoneNumber,prtPostalCode, prtPhoneNumber,univKodePos;


    protected Student(Parcel in) {

        sdtPostalCode = in.readInt();
        sdtPhoneNumber = in.readInt();
        prtPostalCode = in.readInt();
        prtPhoneNumber = in.readInt();
        univKodePos = in.readInt();

        stdFirstName  = in.readString();
        sdtLastName  = in.readString();
        sdtCity  = in.readString();
        sdtProvince  = in.readString();
        sdtCountry  = in.readString();
        sdtCitizenship  = in.readString();
        prtFirstName  = in.readString();
        prtLastName  = in.readString();
        prtCity  = in.readString();
        prtProvince  = in.readString();
        prtCountry  = in.readString();
        prtCitizenship  = in.readString();
        prtOccupation  = in.readString();
        univAsal  = in.readString();
        faculty  = in.readString();
        proStudy  = in.readString();
        univProvince  = in.readString();
        univKota  = in.readString();
        univAddress  = in.readString();
        univAkreditasi  = in.readString();

    }

    public Student() {

    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

        parcel.writeInt(sdtPostalCode);
        parcel.writeInt(sdtPhoneNumber);
        parcel.writeInt(prtPostalCode);
        parcel.writeInt(prtPhoneNumber);
        parcel.writeInt(univKodePos);

        parcel.writeString(stdFirstName);
        parcel.writeString(sdtLastName);
        parcel.writeString(sdtCity);
        parcel.writeString(sdtProvince);
        parcel.writeString(sdtCountry);
        parcel.writeString(sdtCitizenship);
        parcel.writeString(prtFirstName);
        parcel.writeString(prtLastName);
        parcel.writeString(prtCity);
        parcel.writeString(prtProvince);
        parcel.writeString(prtCountry);
        parcel.writeString(prtCitizenship);
        parcel.writeString(prtOccupation);
        parcel.writeString(univAsal);
        parcel.writeString(faculty);
        parcel.writeString(proStudy);
        parcel.writeString(univProvince);
        parcel.writeString(univKota);
        parcel.writeString(univAddress);
        parcel.writeString(univAkreditasi);
    }


    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };


    @Override
    public int describeContents() {
        return 0;
    }

    public void setStdFirstName(String stdFirstName) {
        this.stdFirstName = stdFirstName;
    }

    public void setSdtLastName(String sdtLastName) {
        this.sdtLastName = sdtLastName;
    }

    public void setSdtCity(String sdtCity) {
        this.sdtCity = sdtCity;
    }

    public void setSdtProvince(String sdtProvince) {
        this.sdtProvince = sdtProvince;
    }

    public void setSdtCountry(String sdtCountry) {
        this.sdtCountry = sdtCountry;
    }

    public void setSdtCitizenship(String sdtCitizenship) {
        this.sdtCitizenship = sdtCitizenship;
    }

    public void setPrtFirstName(String prtFirstName) {
        this.prtFirstName = prtFirstName;
    }

    public void setPrtLastName(String prtLastName) {
        this.prtLastName = prtLastName;
    }

    public void setPrtCity(String prtCity) {
        this.prtCity = prtCity;
    }

    public void setPrtProvince(String prtProvince) {
        this.prtProvince = prtProvince;
    }

    public void setPrtCountry(String prtCountry) {
        this.prtCountry = prtCountry;
    }

    public void setPrtCitizenship(String prtCitizenship) {
        this.prtCitizenship = prtCitizenship;
    }

    public void setPrtOccupation(String prtOccupation) {
        this.prtOccupation = prtOccupation;
    }

    public void setUnivAsal(String univAsal) {
        this.univAsal = univAsal;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setProStudy(String proStudy) {
        this.proStudy = proStudy;
    }

    public void setUnivProvince(String univProvince) {
        this.univProvince = univProvince;
    }

    public void setUnivKota(String univKota) {
        this.univKota = univKota;
    }

    public void setUnivAddress(String univAddress) {
        this.univAddress = univAddress;
    }

    public void setUnivAkreditasi(String univAkreditasi) {
        this.univAkreditasi = univAkreditasi;
    }

    public void setSdtPostalCode(int sdtPostalCode) {
        this.sdtPostalCode = sdtPostalCode;
    }

    public void setSdtPhoneNumber(int sdtPhoneNumber) {
        this.sdtPhoneNumber = sdtPhoneNumber;
    }

    public void setPrtPostalCode(int prtPostalCode) {
        this.prtPostalCode = prtPostalCode;
    }

    public void setPrtPhoneNumber(int prtPhoneNumber) {
        this.prtPhoneNumber = prtPhoneNumber;
    }

    public void setUnivKodePos(int univKodePos) {
        this.univKodePos = univKodePos;
    }

    public static Creator<Student> getCREATOR() {
        return CREATOR;
    }

    public String getStdFirstName() {
        return stdFirstName;
    }

    public String getSdtLastName() {
        return sdtLastName;
    }

    public String getSdtCity() {
        return sdtCity;
    }

    public String getSdtProvince() {
        return sdtProvince;
    }

    public String getSdtCountry() {
        return sdtCountry;
    }

    public String getSdtCitizenship() {
        return sdtCitizenship;
    }

    public String getPrtFirstName() {
        return prtFirstName;
    }

    public String getPrtLastName() {
        return prtLastName;
    }

    public String getPrtCity() {
        return prtCity;
    }

    public String getPrtProvince() {
        return prtProvince;
    }

    public String getPrtCountry() {
        return prtCountry;
    }

    public String getPrtCitizenship() {
        return prtCitizenship;
    }

    public String getPrtOccupation() {
        return prtOccupation;
    }

    public String getUnivAsal() {
        return univAsal;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getProStudy() {
        return proStudy;
    }

    public String getUnivProvince() {
        return univProvince;
    }

    public String getUnivKota() {
        return univKota;
    }

    public String getUnivAddress() {
        return univAddress;
    }

    public String getUnivAkreditasi() {
        return univAkreditasi;
    }

    public int getSdtPostalCode() {
        return sdtPostalCode;
    }

    public int getSdtPhoneNumber() {
        return sdtPhoneNumber;
    }

    public int getPrtPostalCode() {
        return prtPostalCode;
    }

    public int getPrtPhoneNumber() {
        return prtPhoneNumber;
    }

    public int getUnivKodePos() {
        return univKodePos;
    }


}
