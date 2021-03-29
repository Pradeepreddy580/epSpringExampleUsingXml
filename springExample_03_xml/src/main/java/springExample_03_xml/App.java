package springExample_03_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c = new ClassPathXmlApplicationContext("spring.xml");
		
		Vehicle v = (Vehicle)c.getBean("vehicle");
		
		v.drive();
	}

}
