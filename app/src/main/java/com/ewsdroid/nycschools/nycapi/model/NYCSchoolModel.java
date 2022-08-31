package com.ewsdroid.nycschools.nycapi.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class NYCSchoolModel implements Parcelable {
    @SerializedName("dbn")
    public String dbn;

    @SerializedName("school_name")
    public String schoolName;

    @SerializedName("boro")
    public String boro;

    @SerializedName("overview_paragraph")
    public String overviewParagraph;

    @SerializedName("school_10th_seats")
    public String school10thSeats;

    @SerializedName("academicopportunities1")
    public String academicOpportunities1;

    @SerializedName("academicopportunities2")
    public String academicOpportunities2;

    @SerializedName("ell_programs")
    public String ellPrograms;

    @SerializedName("neighborhood")
    public String neighborhood;

    @SerializedName("building_code")
    public String buildingCode;

    @SerializedName("location")
    public String location;

    @SerializedName("phone_number")
    public String phoneNumber;

    @SerializedName("fax_number")
    public String faxNumber;

    @SerializedName("school_email")
    public String schoolEmail;

    @SerializedName("website")
    public String website;

    @SerializedName("subway")
    public String subway;

    @SerializedName("bus")
    public String bus;

    @SerializedName("grades2018")
    public String grades2018;

    @SerializedName("finalgrades")
    public String finalGrades;

    @SerializedName("total_students")
    public String totalStudents;

    @SerializedName("extracurricular_activities")
    public String extracurricularActivities;

    @SerializedName("school_sports")
    public String schoolSports;

    @SerializedName("attendance_rate")
    public String attendanceRate;

    @SerializedName("pct_stu_enough_variety")
    public String pctStuEnoughVariety;

    @SerializedName("pct_stu_safe")
    public String pctStuSafe;

    @SerializedName("school_accessibility_description")
    public String schoolAccessibilityDescription;

    @SerializedName("directions1")
    public String directions1;

    @SerializedName("requirement1_1")
    public String requirement11;

    @SerializedName("requirement2_1")
    public String requirement21;

    @SerializedName("requirement3_1")
    public String requirement31;

    @SerializedName("requirement4_1")
    public String requirement41;

    @SerializedName("requirement5_1")
    public String requirement51;

    @SerializedName("offer_rate1")
    public String offerRate1;

    @SerializedName("program1")
    public String program1;

    @SerializedName("code1")
    public String code1;

    @SerializedName("interest1")
    public String interest1;

    @SerializedName("method1")
    public String method1;

    @SerializedName("seats9ge1")
    public String seats9Ge1;

    @SerializedName("grade9gefilledflag1")
    public String grade9GeFilledFlag1;

    @SerializedName("grade9geapplicants1")
    public String grade9GeApplicants1;

    @SerializedName("seats9swd1")
    public String seats9Swd1;

    @SerializedName("grade9swdfilledflag1")
    public String grade9SwdFilledFlag1;

    @SerializedName("grade9swdapplicants1")
    public String grade9SwdApplicants1;

    @SerializedName("seats101")
    public String seats101;

    @SerializedName("admissionspriority11")
    public String admissionsPriority11;

    @SerializedName("admissionspriority21")
    public String admissionsPriority21;

    @SerializedName("admissionspriority31")
    public String admissionsPriority31;

    @SerializedName("grade9geapplicantsperseat1")
    public String grade9GeApplicantsPerSeat1;

    @SerializedName("grade9swdapplicantsperseat1")
    public String grade9SwdApplicantsPerSeat1;

    @SerializedName("primary_address_line_1")
    public String primaryAddressLine1;

    @SerializedName("city")
    public String city;

    @SerializedName("zip")
    public String zip;

    @SerializedName("state_code")
    public String stateCode;

    @SerializedName("latitude")
    public String latitude;

    @SerializedName("longitude")
    public String longitude;

    @SerializedName("community_board")
    public String communityBoard;

    @SerializedName("council_district")
    public String councilDistrict;

    @SerializedName("census_tract")
    public String censusTract;

    @SerializedName("bin")
    public String bin;

    @SerializedName("bbl")
    public String bbl;

    @SerializedName("nta")
    public String nta;

    @SerializedName("borough")
    public String borough;

    protected NYCSchoolModel(Parcel in) {
        dbn = in.readString();
        schoolName = in.readString();
        boro = in.readString();
        overviewParagraph = in.readString();
        school10thSeats = in.readString();
        academicOpportunities1 = in.readString();
        academicOpportunities2 = in.readString();
        ellPrograms = in.readString();
        neighborhood = in.readString();
        buildingCode = in.readString();
        location = in.readString();
        phoneNumber = in.readString();
        faxNumber = in.readString();
        schoolEmail = in.readString();
        website = in.readString();
        subway = in.readString();
        bus = in.readString();
        grades2018 = in.readString();
        finalGrades = in.readString();
        totalStudents = in.readString();
        extracurricularActivities = in.readString();
        schoolSports = in.readString();
        attendanceRate = in.readString();
        pctStuEnoughVariety = in.readString();
        pctStuSafe = in.readString();
        schoolAccessibilityDescription = in.readString();
        directions1 = in.readString();
        requirement11 = in.readString();
        requirement21 = in.readString();
        requirement31 = in.readString();
        requirement41 = in.readString();
        requirement51 = in.readString();
        offerRate1 = in.readString();
        program1 = in.readString();
        code1 = in.readString();
        interest1 = in.readString();
        method1 = in.readString();
        seats9Ge1 = in.readString();
        grade9GeFilledFlag1 = in.readString();
        grade9GeApplicants1 = in.readString();
        seats9Swd1 = in.readString();
        grade9SwdFilledFlag1 = in.readString();
        grade9SwdApplicants1 = in.readString();
        seats101 = in.readString();
        admissionsPriority11 = in.readString();
        admissionsPriority21 = in.readString();
        admissionsPriority31 = in.readString();
        grade9GeApplicantsPerSeat1 = in.readString();
        grade9SwdApplicantsPerSeat1 = in.readString();
        primaryAddressLine1 = in.readString();
        city = in.readString();
        zip = in.readString();
        stateCode = in.readString();
        latitude = in.readString();
        longitude = in.readString();
        communityBoard = in.readString();
        councilDistrict = in.readString();
        censusTract = in.readString();
        bin = in.readString();
        bbl = in.readString();
        nta = in.readString();
        borough = in.readString();
    }

    public static final Creator<NYCSchoolModel> CREATOR = new Creator<NYCSchoolModel>() {
        @Override
        public NYCSchoolModel createFromParcel(Parcel in) {
            return new NYCSchoolModel(in);
        }

        @Override
        public NYCSchoolModel[] newArray(int size) {
            return new NYCSchoolModel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(dbn);
        dest.writeString(schoolName);
        dest.writeString(boro);
        dest.writeString(overviewParagraph);
        dest.writeString(school10thSeats);
        dest.writeString(academicOpportunities1);
        dest.writeString(academicOpportunities2);
        dest.writeString(ellPrograms);
        dest.writeString(neighborhood);
        dest.writeString(buildingCode);
        dest.writeString(location);
        dest.writeString(phoneNumber);
        dest.writeString(faxNumber);
        dest.writeString(schoolEmail);
        dest.writeString(website);
        dest.writeString(subway);
        dest.writeString(bus);
        dest.writeString(grades2018);
        dest.writeString(finalGrades);
        dest.writeString(totalStudents);
        dest.writeString(extracurricularActivities);
        dest.writeString(schoolSports);
        dest.writeString(attendanceRate);
        dest.writeString(pctStuEnoughVariety);
        dest.writeString(pctStuSafe);
        dest.writeString(schoolAccessibilityDescription);
        dest.writeString(directions1);
        dest.writeString(requirement11);
        dest.writeString(requirement21);
        dest.writeString(requirement31);
        dest.writeString(requirement41);
        dest.writeString(requirement51);
        dest.writeString(offerRate1);
        dest.writeString(program1);
        dest.writeString(code1);
        dest.writeString(interest1);
        dest.writeString(method1);
        dest.writeString(seats9Ge1);
        dest.writeString(grade9GeFilledFlag1);
        dest.writeString(grade9GeApplicants1);
        dest.writeString(seats9Swd1);
        dest.writeString(grade9SwdFilledFlag1);
        dest.writeString(grade9SwdApplicants1);
        dest.writeString(seats101);
        dest.writeString(admissionsPriority11);
        dest.writeString(admissionsPriority21);
        dest.writeString(admissionsPriority31);
        dest.writeString(grade9GeApplicantsPerSeat1);
        dest.writeString(grade9SwdApplicantsPerSeat1);
        dest.writeString(primaryAddressLine1);
        dest.writeString(city);
        dest.writeString(zip);
        dest.writeString(stateCode);
        dest.writeString(latitude);
        dest.writeString(longitude);
        dest.writeString(communityBoard);
        dest.writeString(councilDistrict);
        dest.writeString(censusTract);
        dest.writeString(bin);
        dest.writeString(bbl);
        dest.writeString(nta);
        dest.writeString(borough);
    }
}