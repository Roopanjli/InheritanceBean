package com.ruby.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ruby.bean.HelloJava;
import com.ruby.bean.HelloWorld;

public class Test {

	public static void main(String[] args) {
BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/ruby/cfg/ApplicationContext.xml"));
HelloWorld world=factory.getBean("world",HelloWorld.class);
HelloJava java=factory.getBean("java",HelloJava.class);
System.out.println(world);
System.out.println(java);
	}

}
