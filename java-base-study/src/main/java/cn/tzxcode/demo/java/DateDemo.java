package cn.tzxcode.demo.java;

import org.springframework.cache.annotation.CacheAnnotationParser;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @Author tuzongxun
 * @Date 2021/12/28
 */
public class DateDemo {
	/**
	 * 根据用户输入的年、月、日，打印出当前月的日历，当前日期标*号
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入年");
		int year=scanner.nextInt();
		System.out.println("请输入月");
		int month=scanner.nextInt();
		System.out.println("请输入日期");
		int day=scanner.nextInt();

		Calendar calendar=Calendar.getInstance();
		String [] weekArr={"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		for (String s : weekArr) {
			System.out.print(s+" ");
		}
		System.out.println();
		calendar.set(Calendar.YEAR,year);
		calendar.set(Calendar.MONTH,month-1);
		calendar.set(Calendar.DAY_OF_MONTH,1);
		int firstDayOfWeek=getWeek(calendar);
		for(int i=0;i<firstDayOfWeek*4;i++){
				System.out.print(" ");
		}
		System.out.print(1+"   ");
		if(firstDayOfWeek==6){
			System.out.println();
		}

		int maxDay=calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		for (int i = 2; i <= maxDay; i++) {
			calendar.set(Calendar.DAY_OF_MONTH,i);
			if(i<10){
				if(i==day) {
					System.out.print(i + "*  ");
				}else{
					System.out.print(i + "   ");
				}
			}else{
				if(i==day){
					System.out.print(i+"* ");
				}else{
					System.out.print(i+"  ");
				}
			}
			if(getWeek(calendar)==6){
				System.out.println();
			}
		}
	}

	private static int getWeek(Calendar calendar){
		int week=0;
		if(calendar.getFirstDayOfWeek() == Calendar.SUNDAY){
			week=calendar.get(Calendar.DAY_OF_WEEK)-1;
			if(week==0){
				week=7;
			}
		}
		return week;
	}
}
