package config.user;

import org.springframework.context.annotation.Bean;

import com.cafe24.springcontainer.user.User;

public class UserConfig01 {
	
	@Bean	// Bean을 return하는 메소드이다.
	public User user() {
		return new User();
	}
}
