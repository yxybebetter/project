package com.db.employment.service;

import com.db.employment.dao.CompanyMapper;
import com.db.employment.pojo.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    CompanyMapper companyMapper;

    public int insertCompany(Company company){
        return companyMapper.insertCompany(company);
    }

    public int getCompanyIdByUserid(int userid){
        return companyMapper.getCompanyByUserid(userid);
    }



}
