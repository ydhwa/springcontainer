package com.cafe24.springcontainer.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {

	// 와이어링 01
//	@Autowired
	private CompactDisc cd;
	
	public CDPlayer() {
		System.out.println("기본생성자");
	}
	
	// 와이어링 02
	@Autowired
	public CDPlayer(@Qualifier("sarangbi") CompactDisc cd) {
		System.out.println("다른생성자");
		this.cd = cd;
	}
	
	// 와이어링 03
//	@Autowired
	public void setCompactDisc(@Qualifier("sarangbi") CompactDisc cd) {
		this.cd = cd;
	}
	
	// 와이어링 04
	/* 
	 * Autowired 대상을 여러 개를 만들고 그 중 하나를 선택하려고 할 때
	 * (여기서는 CompactDisc 인터페이스를 구현하는 Sarangbi와 MyStyle 중 Sarangbi)
	 * 속성을 부여해주는 메소드의 파라미터에도 @Qualifier를 명시해주어야 한다.
	 */
//	@Autowired
	public void insertCompactDisc(@Qualifier("sarangbi") CompactDisc cd) {
		this.cd = cd;
	}
	
	public void play() {
		cd.play();
	}
}
