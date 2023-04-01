package com.db.employment.service;

import com.db.employment.dao.RecruitMapper;
import com.db.employment.pojo.Recruit;
import com.db.employment.pojo.RecruitView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecruitService {

    @Autowired
    private RecruitMapper recruitMapper;

    public List<Recruit> getAllByPage(int page, int pageSize, int userid){
        int pageBegin = (page - 1) * pageSize;
        return recruitMapper.getAllRecruit(pageBegin,pageSize,userid);
    }

    public List<String> getAllJobType(){
        return recruitMapper.getAllType();
    }

    public List<String> getJob(String jobtype){
        return recruitMapper.getJob(jobtype);
    }

    public int getAllJobCount(){
        return recruitMapper.getAllJobcount();
    }

    public List<Recruit> getRecruit(String job){
        return recruitMapper.getRecruits(job);
    }

    public List<Recruit> getRecruitByname(String jobname, int page, int pageSize){
        int pageBegin = (page - 1) * pageSize;
        return recruitMapper.getRecruitsByJobname(jobname,pageBegin,pageSize);
    }

    public int insertRecruit(Recruit recruit){
        return recruitMapper.insertRecruit(recruit);
    }

    public List<Recruit> getRectuitByCid(int page, int pagesize, int cid){
        int pageBegin = (page - 1) * pagesize;
        return recruitMapper.getAllRecruitByCid(pageBegin,pagesize,cid);
    }

    public List<RecruitView> getRecruitView(int page, int pageSize){
        int pageBegin = (page - 1) * pageSize;
        return recruitMapper.getAllRecruitView(pageBegin,pageSize);
    }

    public int editRecruit(int auditPass,int id){
        return recruitMapper.updateRecruitById(auditPass,id);
    }

    public int Updatecruit(Recruit recruit){
        return recruitMapper.updateRecruit(recruit);
    }

    public int deleteRecruit(int rid){
        return recruitMapper.deleteRecruit(rid);
    }

}
