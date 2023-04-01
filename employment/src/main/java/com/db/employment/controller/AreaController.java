package com.db.employment.controller;

import com.alibaba.fastjson.JSON;
import com.db.employment.pojo.Area;
import com.db.employment.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(allowCredentials = "true")
public class AreaController {

    @Autowired
    AreaService areaService;

    @GetMapping("/getArea")
    public String getArea(String aid){
        Area area = areaService.getAreabyid(aid);
        return JSON.toJSONString(area);
    }
}
