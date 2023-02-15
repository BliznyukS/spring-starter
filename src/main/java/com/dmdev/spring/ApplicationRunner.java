package com.dmdev.spring;

import com.dmdev.spring.database.pool.ConnectionPool;
import com.dmdev.spring.database.repository.CompanyRepository;
import com.dmdev.spring.database.repository.UserRepository;
import com.dmdev.spring.ioc.Container;
import com.dmdev.spring.service.UserService;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.Serializable;

public class ApplicationRunner {

    public static void main(String[] args) {

        try( var context = new ClassPathXmlApplicationContext("application.xml")) {
            var connectionPool = context.getBean("pool1", ConnectionPool.class);
            System.out.println(connectionPool);

            var companyRepository = context.getBean("companyRepository", CompanyRepository.class);
            System.out.println(companyRepository);
        }

//        String value = "hello";
//        System.out.println(CharSequence.class.isAssignableFrom(value.getClass()));
//        System.out.println(BeanFactoryPostProcessor.class.isAssignableFrom(value.getClass()));
//        System.out.println(Serializable.class.isAssignableFrom(value.getClass()));


//        var container = new Container();
//
////        var connectionPool = container.get(ConnectionPool.class);
////        var userRepository = container.get(UserRepository.class);
////        var companyRepository = container.get(CompanyRepository.class);
////        var userService = container.get(UserService.class);
//
////        var connectionPool = new ConnectionPool();
////        var userRepository = new UserRepository(connectionPool);
////        var companyRepository = new CompanyRepository(connectionPool);
////        var userService = new UserService(userRepository, companyRepository);
//
//        var userService = container.get(UserService.class);

    }
}
