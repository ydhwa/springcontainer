package com.cafe24.springcontainer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.cafe24.springcontainer.user.User;
import com.cafe24.springcontainer.user.User1;

public class ContainerTest {

	public static void main(String[] args) {
		// BeanFactory와 ApplicationContext 사용해보기
//		testBeanFactory();
		testApplicationContext();
	}
	
	public static void testApplicationContext() {
		// 패키지 경로 지정해주면 알아서 찾아줌.
//		ApplicationContext appContext = new ClassPathXmlApplicationContext("config/user/applicationContext.xml");	// 바로 밑에 있는 자동 설정법
		ApplicationContext appContext = new ClassPathXmlApplicationContext("config/user/applicationContext2.xml");	// xml 설정법
		
		/* 
		 * id로 가져오기
		 * 오류: 빈설정 id나 name설정을 해야 한다. 
		 */
//		User1 user = (User1) appContext.getBean("user1");
//		System.out.println(user.getName());
		
		/* 
		 * 클래스 이름으로 가져오기 
		 */
		User1 user1 = (User1) appContext.getBean(User1.class);
		System.out.println(user1.getName());
		
		/* 
		 * name으로 가져오기
		 */
		User user = (User) appContext.getBean("user");
		System.out.println(user);
		
		/*
		 * id로 가져오기
		 * (name보다는 id를 사용하여 가져오는 방법을 권장한다.)
		 */
		user = (User) appContext.getBean("usr");
		System.out.println(user);
		
		/*
		 * 오류: 같은 타입의 빈이 2개 이상 존재하면 타입으로 Bean을 가져올 수 없다.
		 */
//		user = appContext.getBean(User.class);
		
		// 생성자 1개
		User user2 = (User)appContext.getBean("usr2");
		System.out.println(user2);
		
		// 생성자 2개
		User user3 = (User)appContext.getBean("usr3");
		System.out.println(user3);
		
		// property setting
		User user4 = (User)appContext.getBean("usr4");
		System.out.println(user4);
		
		((ConfigurableApplicationContext)appContext).close();
	}

	public static void testBeanFactory() {		
		/*
		 * Auto-Configuration(Scanning)인 경우
		 * Bean의 id를 따로 설정하지 않는다면 자동으로 id가 부여된다.
		 * id의 디폴트값은 클래스명의 소문자이다.
		 */
		BeanFactory bf1 = new XmlBeanFactory(new ClassPathResource("config/user/applicationContext.xml"));
		User1 user = (User1) bf1.getBean("user1");	// id로 지정하면 Object로 반환되므로 다운캐스팅 해줘야한다.
		System.out.println(user.getName());
		
		/*
		 * XML Bean 설정(수동 설정)인 경우에는 id가 자동으로 부여되지 않는다.
		 */
		BeanFactory bf2 = new XmlBeanFactory(new ClassPathResource("config/user/applicationContext2.xml"));
//		user = (User1) bf2.getBean("user1");
//		System.out.println(user.getName());
		user = (User1) bf2.getBean(User1.class);
		System.out.println(user.getName());
		
		
	}
	
	

}
