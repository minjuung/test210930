package test;

import java.util.Calendar;

public class Time {
	
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int hour;
		int minute;
		
		hour = now.get(Calendar.HOUR_OF_DAY);
		minute = now.get(Calendar.MINUTE);
		
		System.out.println("���� �ð��� "+hour+"�� "+minute+"���Դϴ�.");
		
		if (4<hour && hour<12) {
			System.out.println("Goood Morning");
		}else if(12<=hour && hour<18) {
			System.out.println("Good Afternoon");
		}else if(18<=hour && hour<20) {
			System.out.println("Good Evening");
		}else {
			System.out.println("Good Night");
		}
	}

}
