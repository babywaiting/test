package com.example.test.mapper;
import com.example.test.bean.UserBean;

/**
 * Created by babywaiting on 2020/7/2 2:40 PM.
 */


public interface UserMapper {

    UserBean getInfo(String name,String password);

}