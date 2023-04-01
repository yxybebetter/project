package com.db.employment.dao;

import com.db.employment.pojo.Company;

import java.util.List;

public interface CompanyMapper {

    int insertCompany(Company company);

    int getCompanyByUserid(int userid);

}
