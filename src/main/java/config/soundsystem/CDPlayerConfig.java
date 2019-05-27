package config.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cafe24.springcontainer.soundsystem.Index;

// 클래스를 명시해줘도 @Configuration은 붙여두는 게 좋다.
@Configuration
@ComponentScan(basePackages="com.cafe24.springcontainer.soundsystem")
//@ComponentScan(basePackages={"com.cafe24.springcontainer.soundsystem", "com.cafe24.springcontainer.videosystem"})
// BasePackageClasses에 지정한 클래스가 속한 패키지를 BasePackage로 사용한다.
// 자동 설정  수동과 자동 모두 사용 가능
//@ComponentScan(basePackageClasses=Index.class)
public class CDPlayerConfig {

}
