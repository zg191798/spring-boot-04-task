package com.atguigu.springboot.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

/**
 * @author zhangge
 * @date 2019/1/21 - 10:44
 */
@Service
public class ScheduledService {

    //@Scheduled(cron = "0 * * * * MON-SAT")  周一到周五整秒执行
    public void hello(){
        System.out.println("hello...");
    }
}
