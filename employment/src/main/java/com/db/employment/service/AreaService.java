package com.db.employment.service;

import com.db.employment.dao.AreaMapper;
import com.db.employment.pojo.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AreaService {

    @Autowired
    private AreaMapper areaMapper;

    public Area getAreabyid(String aid){
        return areaMapper.getAreaByAid(aid);
    }
}
