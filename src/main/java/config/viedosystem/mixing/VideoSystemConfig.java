package config.viedosystem.mixing;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
// VideoSystemConfig를 가져오면 Import시킨 두 개의 클래스도 모두 가져오게 됨
@Import({DVDConfig.class, DVDPlayerConfig.class})
public class VideoSystemConfig {

}
