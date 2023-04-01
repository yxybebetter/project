package com.db.employment.controller;

import com.db.employment.pojo.Company;
import com.db.employment.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(allowCredentials = "true")
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @PostMapping("/uploadCompany")
    public String uploadCompany(@RequestBody Company company){
        int i = companyService.insertCompany(company);
        if(i>0){
            return "上传成功！";
        }else{
            return "上传失败！";
        }
    }

    @GetMapping("/getcompanyid")
    public int getcompanyid(int userid){
        return companyService.getCompanyIdByUserid(userid);
    }

}
