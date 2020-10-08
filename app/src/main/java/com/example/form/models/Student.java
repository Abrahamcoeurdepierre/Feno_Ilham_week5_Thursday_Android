package com.example.form.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Student implements Parcelable {
    private String name,email,birthPlace,DOB,password, rt
            , rw, major,achievement, studyProgram, reason, gender, nationality, province, city;

    private int NIK, postalCode, phoneNumber;
    public Student(String name, String email, String birthPlace, String DOB, String password, String rt, String rw, String major, String achievement, String studyProgram, String reason, String gender, String nationality, String province, String city, int NIK, int postalCode, int phoneNumber) {
        this.name = name;
        this.email = email;
        this.birthPlace = birthPlace;
        this.DOB = DOB;
        this.password = password;
        this.rt = rt;
        this.rw = rw;
        this.major = major;
        this.achievement = achievement;
        this.studyProgram = studyProgram;
        this.reason = reason;
        this.gender = gender;
        this.nationality = nationality;
        this.province = province;
        this.city = city;
        this.NIK = NIK;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
    }

    protected Student(Parcel in) {
        name = in.readString();
        email = in.readString();
        birthPlace = in.readString();
        DOB = in.readString();
        password = in.readString();
        rt = in.readString();
        rw = in.readString();
        major = in.readString();
        achievement = in.readString();
        studyProgram = in.readString();
        reason = in.readString();
        gender = in.readString();
        nationality = in.readString();
        province = in.readString();
        city = in.readString();
        NIK = in.readInt();
        postalCode = in.readInt();
        phoneNumber = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(email);
        dest.writeString(birthPlace);
        dest.writeString(DOB);
        dest.writeString(password);
        dest.writeString(rt);
        dest.writeString(rw);
        dest.writeString(major);
        dest.writeString(achievement);
        dest.writeString(studyProgram);
        dest.writeString(reason);
        dest.writeString(gender);
        dest.writeString(nationality);
        dest.writeString(province);
        dest.writeString(city);
        dest.writeInt(NIK);
        dest.writeInt(postalCode);
        dest.writeInt(phoneNumber);
    }

    @Override
    public int describeContents() {
        return 0;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }

    public String getStudyProgram() {
        return studyProgram;
    }

    public void setStudyProgram(String studyProgram) {
        this.studyProgram = studyProgram;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
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

    public int getNIK() {
        return NIK;
    }

    public void setNIK(int NIK) {
        this.NIK = NIK;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
