package com.ptb.miaosha;

import com.ptb.miaosha.dao.UserDOMapper;
import com.ptb.miaosha.dataobject.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"com.ptb.miaosha"})
@RestController
@MapperScan("com.ptb.miaosha.dao")
public class App {

    @Autowired
    private UserDOMapper userDOMapper;

    @RequestMapping("/")
    public String home(){
        UserDO userDO = userDOMapper.selectByPrimaryKey(1);
        if (userDO == null){
            return "用户对象不存在";
        }else{
            return userDO.getName();
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        SpringApplication.run(App.class,args);
    }
}
