package com.atguigu.springboot.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author zhangge
 * @date 2019/1/21 - 10:38
 */
@Service
public class AsyncService {

    @Async  // spring就会开启一个线程处理该方法
    public void hello(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("数据处理中...");
    }
}
