package config.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cafe24.springcontainer.user.User;

public class JavaConfigtTest01 {

	public static void main(String[] args) {
		testUser01();
		testUser02();
	}

	// Explicit(명시적)=================================
	public static void testUser01() {
		// 클래스로 접근
		ApplicationContext appCtx = new AnnotationConfigApplicationContext(UserConfig01.class);
		
		User user = appCtx.getBean(User.class);
		System.out.println(user);
		
		// 굳이 닫지 않아도 되긴 함
		((ConfigurableApplicationContext) appCtx).close();
	}
	public static void testUser02() {
		// 패키지로 접근
		ApplicationContext appCtx = new AnnotationConfigApplicationContext("config.user");
		
		User user = appCtx.getBean(User.class);
		System.out.println(user);
		
		((ConfigurableApplicationContext) appCtx).close();
	}
	// =================================================
}
