package config.viedosystem.mixing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cafe24.springcontainer.videosystem.Avengers;
import com.cafe24.springcontainer.videosystem.BlankDisc;

/**
 * DVD에 대한 설정
 */
@Configuration
public class DVDConfig {
	/*
	 * Java로 할 때는 명시적인 걸 많이 씀
	 */
	@Bean
	public Avengers avangers() {
		return new Avengers();
	}
	
	@Bean(name="avengersInfinityWar")
	public BlankDisc blankDisc() {
		BlankDisc blankDisc = new BlankDisc();
		
		blankDisc.setTitle("인피니티워");
		blankDisc.setStudio("마블");
		
		return blankDisc;
	}
}
