package com.example.test.service;
import com.example.test.bean.UserBean;

/**
 * Created by babywaiting on 2020/7/2 2:51 PM.
 */


public interface UserService {

    UserBean loginIn(String name,String password);

}