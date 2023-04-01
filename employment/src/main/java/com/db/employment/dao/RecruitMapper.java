package com.db.employment.dao;

import com.db.employment.pojo.Recruit;
import com.db.employment.pojo.RecruitView;

import java.util.List;

public interface RecruitMapper {

    List<Recruit> getAllRecruit(int pageBegin, int pagesize, int userid);
    List<String> getAllType();
    List<String> getJob(String jobtype);
    int getAllJobcount();
    List<Recruit> getRecruits(String job);
    List<Recruit> getRecruitsByJobname(String job,int pageBegin, int pageSize);
    int insertRecruit(Recruit recruit);
    List<Recruit> getAllRecruitByCid(int pageBegin, int pagesize, int cid);
    List<RecruitView> getAllRecruitView(int pageBegin, int pageSize);
    int updateRecruitById(int audit_pass,int id);
    int updateRecruit(Recruit recruit);
    int deleteRecruit(int rid);
}
