package config.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cafe24.springcontainer.user.User;

//웹에서는 패키지로 접근하므로 어노테이션을 달아서 명시해줘야 한다.
@Configuration
public class UserConfig02 {
	
	@Bean	// Bean을 return하는 메소드이다.
	public User user() {
		return new User();
	}
}
