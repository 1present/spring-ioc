package com.ioc;
import com.ioc.test.student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class test {
    @Test public void studentTest(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        student s1 = applicationContext.getBean("s1", student.class);
        student s2 = applicationContext.getBean("s2", student.class);
        System.out.println(s1); System.out.println(s2); }
    }
