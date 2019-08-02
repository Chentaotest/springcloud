package com.example.service.impl;

import com.example.service.SchedualService;
import org.springframework.stereotype.Component;


@Component
public class SchedualServiceImpl implements SchedualService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "hi,"+name+",sorry服务出现错误,熔断器已经生效";
    }

}
