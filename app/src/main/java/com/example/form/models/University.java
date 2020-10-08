package com.example.form.models;

import android.os.Parcel;
import android.os.Parcelable;

public class University implements Parcelable{

    private String uni, faculty, studyProgramme, province, city, address, accreditation;
    private int postalCode;

    public University() {
    }

    public University(String uni, String faculty, String studyProgramme, String province, String city, String address, String accreditation, int postalCode) {
        this.uni = uni;
        this.faculty = faculty;
        this.studyProgramme = studyProgramme;
        this.province = province;
        this.city = city;
        this.address = address;
        this.accreditation = accreditation;
        this.postalCode = postalCode;
    }

    protected University(Parcel in) {
        uni = in.readString();
        faculty = in.readString();
        studyProgramme = in.readString();
        province = in.readString();
        city = in.readString();
        address = in.readString();
        accreditation = in.readString();
        postalCode = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(uni);
        dest.writeString(faculty);
        dest.writeString(studyProgramme);
        dest.writeString(province);
        dest.writeString(city);
        dest.writeString(address);
        dest.writeString(accreditation);
        dest.writeInt(postalCode);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<University> CREATOR = new Creator<University>() {
        @Override
        public University createFromParcel(Parcel in) {
            return new University(in);
        }

        @Override
        public University[] newArray(int size) {
            return new University[size];
        }
    };

    public String getUni() {
        return uni;
    }

    public void setUni(String uni) {
        this.uni = uni;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getStudyProgramme() {
        return studyProgramme;
    }

    public void setStudyProgramme(String studyProgramme) {
        this.studyProgramme = studyProgramme;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAccreditation() {
        return accreditation;
    }

    public void setAccreditation(String accreditation) {
        this.accreditation = accreditation;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }
}
