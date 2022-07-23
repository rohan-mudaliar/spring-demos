package com.shapes;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
public static void main(String[] args) {

	BeanFactory beanFac =  new XmlBeanFactory(new FileSystemResource("H:/demoproj/Spring3Example/src/main/resources/SpringBeans.xml"));
	Triangle tngle  = (Triangle) beanFac.getBean("triangle");
	tngle.Draw();
}
}
