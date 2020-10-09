package com.example.form.models;

import android.os.Parcel;
import android.os.Parcelable;

public class University implements Parcelable {

    private String uniName, faculty, studyProgramme, province, city, address, accreditation, postalCode, ipk;

    public University() {
    }

    public University(String uniName, String faculty, String studyProgramme, String province, String city, String address, String accreditation, String postalCode, String ipk) {
        this.uniName = uniName;
        this.faculty = faculty;
        this.studyProgramme = studyProgramme;
        this.province = province;
        this.city = city;
        this.address = address;
        this.accreditation = accreditation;
        this.postalCode = postalCode;
        this.ipk = ipk;
    }

    protected University(Parcel in) {
        uniName = in.readString();
        faculty = in.readString();
        studyProgramme = in.readString();
        province = in.readString();
        city = in.readString();
        address = in.readString();
        accreditation = in.readString();
        postalCode = in.readString();
        ipk = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(uniName);
        dest.writeString(faculty);
        dest.writeString(studyProgramme);
        dest.writeString(province);
        dest.writeString(city);
        dest.writeString(address);
        dest.writeString(accreditation);
        dest.writeString(postalCode);
        dest.writeString(ipk);
    }

    public static Creator<University> getCREATOR() {
        return CREATOR;
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

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
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

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getIpk() {
        return ipk;
    }

    public void setIpk(String ipk) {
        this.ipk = ipk;
    }
}

