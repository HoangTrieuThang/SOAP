package com.example.springbootsoapdemo.springbootsoapexample.service;

import com.thang.demo.spring_boot_soap_example.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private static final Map<String, Float> users = new HashMap<>();
    @PostConstruct
    public void initialize() {
        User admin = new User();
        admin.setTenChuThe("HoangThang");
        admin.setKieuThe("VIP");
        admin.setSoThe(12000);
        admin.setSoCVC(5567);
        admin.setNgayHetHan(25-03-2020);

        float veMayBay = 500000;
        float phiDuLich = veMayBay/10+veMayBay;

        users.put(admin.getTenChuThe(),phiDuLich);

    }
    public Float getUsers(String name) {
        return users.get(name);
    }
}
