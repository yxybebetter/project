package com.db.employment.pojo;

import lombok.Data;

import java.time.Year;

@Data
public class Student {

    private int sId;
    private String sName;
    private int sAge;
    private String sSex;
    private String sEmail;
    private String sPhone;
    private String sDegree;
    private String sSchool;
    private Year sGraduateyear;
    private int sUserid;
    private String sMajor;
}
