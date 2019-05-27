package com.cafe24.springcontainer.soundsystem;

import org.springframework.stereotype.Component;

// 따로 명시하지 않으면 알아서 이름이 지어짐. 소문자로.
@Component("myStyle")
//@Named("myStyle")
public class MyStyle implements CompactDisc {
	private String title = "어쩌다";
	private String artist = "브라운아이드걸스";

	@Override
	public void play() {
		System.out.printf("Playing %s by %s\n", title, artist);
	}

}
