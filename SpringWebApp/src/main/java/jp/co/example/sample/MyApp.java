package jp.co.example.sample;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		MyBean bean=(MyBean)context.getBean("mybean");
		bean.hello();
	}

}
