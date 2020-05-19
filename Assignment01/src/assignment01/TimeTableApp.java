package assignment01;

import java.util.Calendar;
import java.util.Scanner;

import assignment01.Student.DAYS;

public class TimeTableApp {
	public static void main(String[] args) {
		Lecture lecture[] = new Lecture[10];
		lecture[0] = new Lecture("MONDAY", 1, "OOP", "mr.park", "ITBT808", 20);
		lecture[1] = new Lecture("TUESDAY", 2, "security", "mr.park", "ITBT816", 20);
		lecture[2] = new Lecture("WEDNESDAY", 1, "Datastructure", "mr.park", "ITBT808", 25);
		lecture[3] = new Lecture("THURSDAY", 6, "Network", "mr.yang", "ITBT503", 20);
		lecture[4] = new Lecture("FRIDAY", 9, "computer architecture", "mr.han", "ITBT507", 20);
		lecture[5] = new Lecture("TUESDAY", 5, "Digital logic", "mr.kim", "ITBT401", 15);
		lecture[6] = new Lecture("WEDNESDAY", 2, "OS", "mr.yoon", "ITBT606", 15);
		lecture[7] = new Lecture("THURSDAY", 3, "C-language", "mr.choi", "ITBT503", 20);
		lecture[8] = new Lecture("FRIDAY", 6, "Python", "mr.han", "ITBT504", 15);
		lecture[9] = new Lecture("TUESDAY", 9, "Ski-Board", "mr.kang", "ITBT404", 5);

		Scanner keyboard = new Scanner(System.in);
		String[] weeks = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
		Calendar cal;
		/* u can define variables */
		int enter,studentNum,studentCode,studentCode1,studentCode2,time,toAdd,before;
		boolean endCoin=true;
		String studentName,day,name;
		Student temp=null,temp1=null,temp2=null;
		Lecture temp3=null;
		Student[] students;

		System.out.println("�л����� �Է��ϼ���");
		studentNum=keyboard.nextInt();
		students=new Student[studentNum];
		for(int i=0;i<studentNum;++i) {
			System.out.println((i+1)+" �л��� �̸��� �Է��ϼ���");
			studentName=keyboard.next();
			System.out.println((i+1)+" �л��� �й��� �Է��ϼ���");
			studentCode=keyboard.nextInt();
			students[i]=new Student(studentName,studentCode);
		}
		do {
			System.out.println("\n�л��� �ð�ǥ�� �Է��Ϸ��� 1���� ��������");
			System.out.println("Ư�� ������ �����ϴ� �л����� ����Ϸ��� 2���� ��������");
			System.out.println("�л����� �ð�ǥ�� ���Ϸ��� 3���� ��������");
			System.out.println("�л��� �ð�ǥ�� ������� 4���� ��������");
			System.out.println("�ð�ǥ�� ����Ϸ��� 5���� ��������");
			System.out.println("�ش� �л��� Ư�� ��¥ �ð�ǥ�� ����Ϸ��� 6���� ��������");
			System.out.println("���α׷��� �����Ϸ��� 7���� ��������\n");
			enter=keyboard.nextInt();

			switch (enter) {
			case 1:
				System.out.println("�ð�ǥ�� �Է��� �л��� �й��� �Է��ϼ���");
				studentCode=keyboard.nextInt();
				for(int i=0;i<studentNum;++i) {
					if(studentCode==students[i].getStudentCode()) {
						temp=students[i];
						break;
					}
				}
				System.out.println("���� �� �߰��� �ð�ǥ�� ��ȣ�� �Է��ϼ���\n");
				showClass();
				toAdd=keyboard.nextInt()-1;
				before=lecture[toAdd].getEnrolled();
				temp.setScheduleInformation(lecture[toAdd]);
				if(before!=lecture[toAdd].getEnrolled())System.out.println("�ð��� ���������� �߰��Ǿ����ϴ�.");
				else System.out.println("���Ǹ� �߰��� �� �����ϴ�. : �ִ� ���� �ο� �ʰ�");
				break;
				
			case 2:
				System.out.println("������ �̸��� �Է��ϼ���");
				name=keyboard.next();
				for(int i=0;i<10;++i) {
					if(name.equals(lecture[i].getLectureName())) {
						temp3=lecture[i];
						break;
					}
				}
				System.out.println(name+" ������ �����ϴ� �л��� ���� "+temp3.getEnrolled());
				break;
				
			case 3:
				System.out.println("�ð�ǥ�� ���� ù��° �л��� �й��� �Է��ϼ���");
				studentCode1=keyboard.nextInt();
				System.out.println("�ι�° �л��� �й��� �Է��ϼ���");
				studentCode2=keyboard.nextInt();
				for(int i=0;i<studentNum;++i) {
					if(studentCode1==students[i].getStudentCode()) {
						temp1=students[i];
						break;
					}
				}
				for(int i=0;i<studentNum;++i) {
					if(studentCode2==students[i].getStudentCode()) {
						temp2=students[i];
						break;
					}
				}
				if(temp1.equals(temp2))System.out.println("�� �л��� �ð�ǥ�� �����ϴ�.");
				else System.out.println("�� �л��� �ð�ǥ�� �ٸ��ϴ�.");
				break;
				
			case 4:
				System.out.println("�ð�ǥ�� ������ �л��� �й��� �Է��ϼ���");
				studentCode=keyboard.nextInt();
				for(int i=0;i<studentNum;++i) {
					if(studentCode==students[i].getStudentCode()) {
						temp=students[i];
						break;
					}
				}
				System.out.println("���� �ð�ǥ�� ������ �Է��ϼ���");
				day=keyboard.next();
				System.out.println("���� �ð�ǥ�� �ð��� �Է��ϼ���");
				time=keyboard.nextInt();
				temp.deleteSchedule(day.toUpperCase(),time);
				System.out.println(temp.showTimetable());
				break;

			case 5:
				System.out.println("�ð�ǥ�� ����� �л��� �й��� �Է��ϼ���");
				studentCode=keyboard.nextInt();
				for(int i=0;i<studentNum;++i) {
					if(studentCode==students[i].getStudentCode()) {
						temp=students[i];
						break;
					}
				}
				System.out.println(temp.showTimetable());
				break;
				
			case 6:
				System.out.println("����� �л��� �й��� �Է��ϼ���");
				studentCode=keyboard.nextInt();
				for(int i=0;i<studentNum;++i) {
					if(studentCode==students[i].getStudentCode()) {
						temp=students[i];
						break;
					}
				}
				cal=temp.setInputDate();
				System.out.println("\n"+temp.oneDaySchedule(DAYS.values()[cal.get(Calendar.DAY_OF_WEEK)-2].toString()));
				break;
			case 7:
				endCoin=false;
				break;

			default:
				System.out.println("Try again");
				break;
			}

		} while (endCoin);
	}

	private static void showClass() {
		System.out.println("\n(1) OOP - ������ - 1����");
		System.out.println("(2) security - ȭ���� - 2����");
		System.out.println("(3) Datastructure - ������ - 1����");
		System.out.println("(4) Network - ����� - 1����");
		System.out.println("(5) computer architecture - �ݿ��� - 8����");
		System.out.println("(6) Digital design - ȭ���� - 5����");
		System.out.println("(7) OS - ������ - 2����");
		System.out.println("(8) C-language - ����� - 3����");
		System.out.println("(9) Python - �ݿ��� - 6����");
		System.out.println("(10) Ski-board - ȭ���� - 9����\n");
	}
}
