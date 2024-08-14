package Day08.Ex02_MultiImplement;

import java.text.MessageFormat;

// 다중 구현
// public class 클래스명 implements 인터페이스A, 인터페이스B .. { }
public class SmartTelevision implements SmartRemoteControl, Searchable {
	
	int volume;				// 볼륨
	int channel;			// 채널
	String keyword;			// 검색어
	int x, y;				// 터치패트 좌표
	
	
	@Override
	public void turnOn() {
		System.out.println("전원 ON");
	}
	@Override
	public void turnOff() {
		System.out.println("전원 OFF");
	}
	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("volume : " + volume);
	}
	@Override
	public void setChannel(int channel) {
		this.channel = channel;
		System.out.println("channel : " + channel);
	}
	@Override
	public String receiveVoice(String voice) {
		System.out.println("음성 입력 : " + voice);
		return "voice : " + voice;
	}
	@Override
	public int channelSearch(String keyword) {
		int channel = 0;
		switch (keyword) {
			case "SBS": channel = 5;	break;
			case "KBS": channel = 7;	break;
			case "MBC": channel = 11;	break;
			case "Mnet": channel = 27;	break;
			case "ENA": channel = 30;	break;
		}
		return channel;
	}
	@Override
	public String[] contentSerach(String keyword) {
		String[] movieContents = {"아이언맨", "타짜", "인셉션", "데드풀", "반지의제왕","범죄도시"};
		String[] idolContents = {"에스파", "아이브", "뉴진스", "소녀시대", "BTS", "2NE1"};
		String[] recommendContend = {"메타 코미디 클럽", "경영자들", "피식대학", "코빅", "개콘", "먹방"};
		String[] choiceContents;
		switch(keyword) {
			case "영화" : 
				choiceContents = movieContents;	
				break;
			case "아이돌" : 
				choiceContents = idolContents;	
				break;
			default:
				choiceContents = recommendContend;
				break;
		}
		return choiceContents;
	}
	@Override
	public void touch(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("(x,y) : " + MessageFormat.format("({}, {})", x, y));
		// System.out.println("(" + x + ", " + y + ")");
	}
	
	

}






