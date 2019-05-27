package com.cafe24.springcontainer.videosystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Explicit Configuration - XML Config
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:config/videosystem/DVDPlayerConfig.xml"})
public class DVDPlayerXmlConfigTest {
	
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	@Autowired
	@Qualifier("ironMan")
	private DigitalVideoDisc dvd2;
	
	@Autowired
	@Qualifier("avengersInfinityWar")
	private DigitalVideoDisc dvd3;

	@Autowired
	@Qualifier("avengersEndgame")
	private DigitalVideoDisc dvd4;

	@Autowired
	@Qualifier("avengersAgeOfUltron")
	private DigitalVideoDisc dvd5;
	
	@Autowired
	@Qualifier("captainAmerica")
	private DigitalVideoDisc dvd6;
	
	@Autowired
	@Qualifier("avengersDirectorEdition")
	private DigitalVideoDisc dvd7;
	
	@Autowired
	@Qualifier("avengersExpansionPack1")
	private DigitalVideoDisc dvd8;

	@Autowired
	@Qualifier("avengersExpansionPack2")
	private DigitalVideoDisc dvd9;

	@Autowired
	@Qualifier("avengersExpansionPack3")
	private DigitalVideoDisc dvd10;
	
	@Autowired
	private DVDPack dvdPack;
	
	@Autowired
	@Qualifier("dvdPlayer2")
	private DVDPlayer player2;

	@Autowired
	@Qualifier("dvdPlayer3")
	private DVDPlayer player3;

	@Autowired
	@Qualifier("dvdPlayer4")
	private DVDPlayer player4;

	@Autowired
	@Qualifier("dvdPlayer5")
	private DVDPlayer player5;
	
	@Autowired
	@Qualifier("dvdPlayer6")
	private DVDPlayer player6;
	
	@Autowired
	@Qualifier("dvdPlayer7")
	private DVDPlayer player7;

	@Test
	public void testDVD2Null() {
		assertNotNull(dvd2);
	}

	@Test
	public void testDVD3() {
		assertNotNull(dvd3);
		System.out.println(dvd3);
		assertEquals("BlankDisc [title=인피니티워, studio=마블, actors=null]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}

	@Test
	public void testDVD4() {
		assertNotNull(dvd4);
		System.out.println(dvd4);
		assertEquals("BlankDisc [title=엔드게임, studio=마블, actors=null]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}

	@Test
	public void testDVD5() {
		assertNotNull(dvd5);
		System.out.println(dvd5);
		assertEquals("BlankDisc [title=에이지오브울트론, studio=마블, actors=null]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDVD6() {
		assertNotNull(dvd6);
		System.out.println(dvd6);
		assertEquals("BlankDisc [title=캡틴아메리카, studio=마블, actors=null]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDVD7() {
		assertNotNull(dvd7);
		System.out.println(dvd7);
		assertEquals("BlankDisc [title=어벤져스감독판, studio=마블, actors=[로버트다우니주니어, 스칼렛요한슨, 크리스에반스]]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDVD8() {
		assertNotNull(dvd8);
		System.out.println(dvd8);
		assertEquals("BlankDisc [title=어벤져스확장팩1, studio=마블, actors=[로버트다우니주니어, 스칼렛요한슨, 크리스에반스]]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDVD9() {
		assertNotNull(dvd9);
		System.out.println(dvd9);
		assertEquals("BlankDisc [title=어벤져스확장팩2, studio=마블, actors=[로버트다우니주니어, 스칼렛요한슨, 크리스에반스]]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}

	@Test
	public void testDVD10() {
		assertNotNull(dvd10);
		System.out.println(dvd10);
		assertEquals("BlankDisc [title=어벤져스확장팩3, studio=마블, actors=[로버트다우니주니어, 스칼렛요한슨, 크리스에반스]]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDVDPackNull() {
		// 리스트 순서 보장 못함
		assertNotNull(dvdPack);
		System.out.println(dvdPack);
	}

	@Test
	public void testPlayer2Null() {
		assertNotNull(player2);
	}

	@Test
	public void testPlayer3Null() {
		assertNotNull(player3);
	}

	@Test
	public void testPlayer4Null() {
		assertNotNull(player4);
	}

	@Test
	public void testPlayer5Null() {
		assertNotNull(player5);
	}
	
	@Test
	public void testPlayer6Null() {
		assertNotNull(player6);
	}
	
	@Test
	public void testPlayer7Null() {
		assertNotNull(player7);
	}
	
	@Test
	public void testPlay3() {
		player3.play();
		assertEquals("Playing Movie 마블's 아이언맨", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testPlay4() {
		player4.play();
		assertEquals("Playing Movie 마블's 아이언맨", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testPlay5() {
		player5.play();
		assertEquals("Playing Movie 마블's 아이언맨", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testPlay6() {
		player6.play();
		assertEquals("Playing Movie 마블's 인피니티워", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testPlay7() {
		player7.play();
		assertEquals("Playing Movie 마블's 인피니티워", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
}
