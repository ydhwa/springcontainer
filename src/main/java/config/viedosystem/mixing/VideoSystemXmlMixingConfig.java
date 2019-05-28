package config.viedosystem.mixing;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import({DVDPlayerConfig.class})
@ImportResource({"classpath:/config/videosystem/DVDConfig.xml"})
public class VideoSystemXmlMixingConfig {

}
