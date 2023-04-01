package com.db.employment.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Recruit {
    private int rid;
    private String jobDetail;
    private String jobRequest;
    private String rjob;
    private String rsalary;
    private String rtype;
    private String rjobtype;
    private int rempnum;
    private Date rdeadline;
    private int rcid;
    private String rplace;
    private int auditPass;
}
