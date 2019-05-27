package com.cafe24.springcontainer.soundsystem;

import org.springframework.stereotype.Component;

// 따로 명시하지 않으면 알아서 이름이 지어짐. 소문자로.
@Component("sarangbi")
//@Named("sarangbi")
public class Sarangbi implements CompactDisc {
	private String title = "사랑비";
	private String artist = "김태우";

	@Override
	public void play() {
		System.out.printf("Playing %s by %s\n", title, artist);
	}

}
