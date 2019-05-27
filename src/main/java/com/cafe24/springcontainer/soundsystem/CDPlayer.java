package com.cafe24.springcontainer.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
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
//	@Autowired
	public CDPlayer(CompactDisc cd) {
		System.out.println("다른생성자");
		this.cd = cd;
	}
	
	// 와이어링 03
//	@Autowired
	public void setCompactDisc(CompactDisc cd) {
		this.cd = cd;
	}
	
	// 와이어링 04
	@Autowired
	public void insertCompactDisc(CompactDisc cd) {
		this.cd = cd;
	}
	
	public void play() {
		cd.play();
	}
}
