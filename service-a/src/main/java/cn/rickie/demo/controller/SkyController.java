package cn.rickie.demo.controller;


import cn.rickie.demo.service.SkyFeignSerivece;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("skyController")
public class SkyController {

    @Autowired
    private SkyFeignSerivece skyFeignSerivece;

    @RequestMapping(value = "/getInfo")
    public String getInfo(){

        return skyFeignSerivece.getSendInfo("service-a");
    }
}
