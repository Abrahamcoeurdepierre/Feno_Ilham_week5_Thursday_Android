package com.example.form.models;


import android.os.Parcel;
import android.os.Parcelable;

public class Parents implements Parcelable{

    private String fatherName, motherName, fatherJob, motherJob, fatherEdu, motherEdu, email, city,
            province, rt, rw, fatherNIK,motherNIK,phoneNum, yearBornFather,yearBornMother;
    private String postalCode;

    public Parents() {
    }

    public Parents(String fatherName, String motherName, String fatherJob, String motherJob, String fatherEdu, String motherEdu, String email, String city, String province, String rt, String rw, String fatherNIK, String motherNIK, String phoneNum, String yearBornFather, String yearBornMother, String postalCode) {
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.fatherJob = fatherJob;
        this.motherJob = motherJob;
        this.fatherEdu = fatherEdu;
        this.motherEdu = motherEdu;
        this.email = email;
        this.city = city;
        this.province = province;
        this.rt = rt;
        this.rw = rw;
        this.fatherNIK = fatherNIK;
        this.motherNIK = motherNIK;
        this.phoneNum = phoneNum;
        this.yearBornFather = yearBornFather;
        this.yearBornMother = yearBornMother;
        this.postalCode = postalCode;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getFatherJob() {
        return fatherJob;
    }

    public void setFatherJob(String fatherJob) {
        this.fatherJob = fatherJob;
    }

    public String getMotherJob() {
        return motherJob;
    }

    public void setMotherJob(String motherJob) {
        this.motherJob = motherJob;
    }

    public String getFatherEdu() {
        return fatherEdu;
    }

    public void setFatherEdu(String fatherEdu) {
        this.fatherEdu = fatherEdu;
    }

    public String getMotherEdu() {
        return motherEdu;
    }

    public void setMotherEdu(String motherEdu) {
        this.motherEdu = motherEdu;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getRt() {
        return rt;
    }

    public void setRt(String rt) {
        this.rt = rt;
    }

    public String getRw() {
        return rw;
    }

    public void setRw(String rw) {
        this.rw = rw;
    }

    public String getFatherNIK() {
        return fatherNIK;
    }

    public void setFatherNIK(String fatherNIK) {
        this.fatherNIK = fatherNIK;
    }

    public String getMotherNIK() {
        return motherNIK;
    }

    public void setMotherNIK(String motherNIK) {
        this.motherNIK = motherNIK;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getYearBornFather() {
        return yearBornFather;
    }

    public void setYearBornFather(String yearBornFather) {
        this.yearBornFather = yearBornFather;
    }

    public String getYearBornMother() {
        return yearBornMother;
    }

    public void setYearBornMother(String yearBornMother) {
        this.yearBornMother = yearBornMother;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public static Creator<Parents> getCREATOR() {
        return CREATOR;
    }

    protected Parents(Parcel in) {
        fatherName = in.readString();
        motherName = in.readString();
        fatherJob = in.readString();
        motherJob = in.readString();
        fatherEdu = in.readString();
        motherEdu = in.readString();
        email = in.readString();
        city = in.readString();
        province = in.readString();
        rt = in.readString();
        rw = in.readString();
        fatherNIK = in.readString();
        motherNIK = in.readString();
        phoneNum = in.readString();
        yearBornFather = in.readString();
        yearBornMother = in.readString();
        postalCode = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(fatherName);
        dest.writeString(motherName);
        dest.writeString(fatherJob);
        dest.writeString(motherJob);
        dest.writeString(fatherEdu);
        dest.writeString(motherEdu);
        dest.writeString(email);
        dest.writeString(city);
        dest.writeString(province);
        dest.writeString(rt);
        dest.writeString(rw);
        dest.writeString(fatherNIK);
        dest.writeString(motherNIK);
        dest.writeString(phoneNum);
        dest.writeString(yearBornFather);
        dest.writeString(yearBornMother);
        dest.writeString(postalCode);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Parents> CREATOR = new Creator<Parents>() {
        @Override
        public Parents createFromParcel(Parcel in) {
            return new Parents(in);
        }

        @Override
        public Parents[] newArray(int size) {
            return new Parents[size];
        }
    };
}
