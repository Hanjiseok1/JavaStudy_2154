package a05_입력;

import java.util.Scanner;

/*
 * import 단축키 Ctrl + Shift + o
 * 
 */

public class UserInfo {

	public static void main(String[] args) {
		/**
		 * username(아이디)
		 * password(비밀번호)
		 * year(년도)
		 * month(월)
		 * day(일)
		 * name(이름)
		 * address(주소) 부산 동래구 사직동
		 */
		Scanner scanner = new Scanner(System.in);
		String username = null;
		String password = null;
		int year = 0;
		int month = 0;
		int day = 0;
		String name = null;
		String address = null;
		
		System.out.print("아이디 입력: ");
		username = scanner.next();
		System.out.print("아이디 입력: ");
		password = scanner.next();
		System.out.print("아이디 입력: ");
		year = scanner.nextInt();
		System.out.print("아이디 입력: ");
		month = scanner.nextInt();
		System.out.print("아이디 입력: ");
		day = scanner.nextInt();
		System.out.print("아이디 입력: ");
		name = scanner.next();
		scanner.nextLine();
		System.out.print("아이디 입력: ");
		address = scanner.nextLine();
		
		System.out.println("아이디: " + username);
		System.out.println("비밀번호: " + password);
		System.out.println("생년월일: " + year + "/" + month + "/" + day);
		System.out.println("이름: " + name);
		System.out.println("주소: " + address);
	}

}
