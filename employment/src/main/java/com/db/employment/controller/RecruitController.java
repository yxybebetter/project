package com.db.employment.controller;

import com.alibaba.fastjson.JSON;
import com.db.employment.pojo.Recruit;
import com.db.employment.pojo.RecruitView;
import com.db.employment.service.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@CrossOrigin(allowCredentials = "true")
public class RecruitController {

    @Autowired
    private RecruitService recruitService;

    @GetMapping("/getjobtype")
    public List<String> getAllJobtype(){
        return recruitService.getAllJobType();
    }

    @GetMapping("/getjobs")
    public List<String> getAllJob(String jobtype){
        return recruitService.getJob(jobtype);
    }

    @GetMapping("/getjobscount")
    public int getAllJobCount(){
        return recruitService.getAllJobCount();
    }

    @GetMapping("/getjob")
    public String getJob(String job){
        List<Recruit> recruits = recruitService.getRecruit(job);
        return JSON.toJSONString(recruits);
    }

    @PostMapping("/getjobbyname")
    public String getJobByName(String jobname, int page, int pageSize){
        List<Recruit> recruits = recruitService.getRecruitByname(jobname,page,pageSize);
        return JSON.toJSONString(recruits);
    }

    @PostMapping("/uploadrecruit")
    public String uploadRecuit(@RequestBody Recruit form) throws ParseException {
        int i = recruitService.insertRecruit(form);
        if(i>0){
            return "上传成功！";
        }else{
            return "上传失败！";
        }
    }

    @GetMapping("/getrcruitbycid")
    public String getrCruitByCid(int page,int cid){
        List<Recruit> rectuitByCid = recruitService.getRectuitByCid(page, 5, cid);
        return JSON.toJSONString(rectuitByCid);
    }

    @GetMapping("/getrecruitview")
    public String getRecruitView(int page, int pageSize){
        List<RecruitView> recruitView = recruitService.getRecruitView(page, pageSize);
        return JSON.toJSONString(recruitView);
    }

    @PostMapping("/editrecruit")
    public String editRecruit(int auditpass,int id){
        int i = recruitService.editRecruit(auditpass,id);
        if(i>0){
            return "编辑成功！";
        }else {
            return "编辑失败！";
        }
    }

    @GetMapping("/getRecruitbycid")
    public String getReceuitByCid(int page, int pageSize, int userid){
        List<Recruit> recruits = recruitService.getAllByPage(page, pageSize, userid);
        return JSON.toJSONString(recruits);
    }

    @PostMapping("/updaterecruit")
    public String updateRecruit(@RequestBody Recruit recruit){
        System.out.println(recruit);
        int row = recruitService.Updatecruit(recruit);
        if(row > 0){
            return "编辑成功！";
        }else{
            return "编辑失败！";
        }
    }

    @GetMapping("/deleterecruit")
    public String deleteRecruit(int rid){
        int i = recruitService.deleteRecruit(rid);
        if(i >0 ){
            return "删除成功！";
        }else{
            return "删除失败！";
        }
    }
}
