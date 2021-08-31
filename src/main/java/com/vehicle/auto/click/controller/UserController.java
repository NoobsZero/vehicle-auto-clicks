package com.vehicle.auto.click.controller;

import com.vehicle.auto.click.service.VehicleInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: vehicle-auto-clicks
 * @Package: com.vehicle.auto.click.controller
 * @ClassName: UserController
 * @Description: 类作用描述
 * @Author: Chen
 * @contact: Afakerchen@em-data.com.cn
 * @software: IntelliJ IDEA
 * @CreateDate: 2021/8/30 16:34
 */
@RequiredArgsConstructor(onConstructor_ = @Autowired)
@RestController
@RequestMapping("/")
public class UserController {

    private final VehicleInfoService vehicleInfoService;

    @RequestMapping("/home")
    String home() {
        return "ui-auto-click is here!";
    }

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

    @RequestMapping("/getShuoming/{id}")
    public String getShuoming(@PathVariable("id") String stuId) {
        return vehicleInfoService.selectCheckInfosShuoming(stuId);
    }
}
