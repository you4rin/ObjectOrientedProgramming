package assignment01;

import java.util.Calendar;
import java.util.Scanner;

public class Student {
	private String studentName;
	private int studentCode;
	Lecture timeTable[][] = new Lecture[10][5];

	public enum DAYS {
		MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY
	};

	public Student() {
		for(int i=0;i<5;++i)for(int j=0;j<10;++j)timeTable[j][i]=new Lecture();
	}

	public Student(String studentName, int studentCode) {
		this();
		setStudentName(studentName);
		setStudentCode(studentCode);
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}

	public int getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(int studentCode) {
		this.studentCode=studentCode;
	}

	public void setScheduleInformation(Lecture lecture) {
		if(lecture.getMaxEnrolled()<=lecture.getEnrolled())return;
		if(!timeTable[lecture.getTime()-1][DAYS.valueOf(lecture.getDay()).ordinal()].checkLecture())return;
		lecture.incEnrolled();
		timeTable[lecture.getTime()-1][DAYS.valueOf(lecture.getDay()).ordinal()]=lecture;
	}
	public String showTimetable() {
		String s="  ";
		for(int i=0;i<5;++i) {
			int len=DAYS.values()[i].toString().length();
			for(int j=0;j<22-len;++j)s+=" ";
			s+=DAYS.values()[i].toString();
		}
		for(int i=0;i<10;++i) {
			s+="\n";
			if(i>8)s+=(i+1);
			else s+=" "+(i+1);
			for(int j=0;j<5;++j) {
				int len=timeTable[i][j].getLectureName().length();
				for(int k=0;k<22-len;++k)s+=" ";
				s+=timeTable[i][j].getLectureName();
			}
		}
		return s;
	}

	public boolean equals(Student stu) {
		for(int i=0;i<5;++i)for(int j=0;j<10;++j)if(!timeTable[j][i].equals(stu.timeTable[j][i]))return false;
		return true;
	}
	
	public void deleteSchedule(String day, int period)
	{
		if(timeTable[period-1][DAYS.valueOf(day).ordinal()].checkLecture())return;
		timeTable[period-1][DAYS.valueOf(day).ordinal()].decEnrolled();
		timeTable[period-1][DAYS.valueOf(day).ordinal()]=new Lecture();
	}
	
	public Calendar setInputDate()
	{
		Calendar cal=Calendar.getInstance();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the date:");
		int year,month,date=keyboard.nextInt();
		year=date/10000;date%=10000;
		month=date/100;date%=100;
		cal.set(year,month-1,date);
		return cal;
	}
	
	public String oneDaySchedule(String day) {
		String s=day;
		int idx=DAYS.valueOf(day).ordinal();
		for(int i=0;i<10;++i)s+="\n"+timeTable[i][idx].getLectureName();
		return s;
	}

}
