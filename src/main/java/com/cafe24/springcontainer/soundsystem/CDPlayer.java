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
	 * Test 코드의 cd와 CDPlayer의 cd는 전혀 다른 객체이기 때문에
	 * 각각에서 Qualifier를 지정해줘야 한다.
	 * 파라미터에도 Qualifier를 지정할 수 있다.
	 */
//	@Autowired
	public void insertCompactDisc(@Qualifier("sarangbi") CompactDisc cd) {
		this.cd = cd;
	}
	
	public void play() {
		cd.play();
	}
}
