package cn.rickie.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class SkySecondController {

    /**
     * 调用service-b
     * @param serviceName 传递过去的是service-a
     * @return
     */
    @RequestMapping(value = "/getSendInfo", method = RequestMethod.GET)
    String getSendInfo(@RequestParam("serviceName") String serviceName,
                       @RequestParam(value = "random", required = false, defaultValue = "10") int random){
        Random rand = new Random(random);
        int i;
        i=rand.nextInt(1000) + 100;
        try {
            Thread.sleep(i);
            System.out.println("sleep ... " + i + "ms");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return  serviceName + " ----> " + "service-b";
    }
}
