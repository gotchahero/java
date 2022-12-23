package com.gyoo.java.bam;
//관례처럼 구분하기 위해서 사용
//개성이 없음

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("== 프로그램 시작 ==");
		
		Scanner sc = new Scanner(System.in);
		//사용자 입력 받기
		
		while(true) {
			System.out.printf("명령어) ");
			String cmd = sc.nextLine();
			
			if(cmd.equals("article list")) {
				article_list();
			}
			else if(cmd.equals("write")) {
				article_read();
			}
			else {
				System.out.println("존재하지 않은 명령어입니다.")
			}
		
			if(cmd.equals("exit")) {
				break;
			}
		}
		
		System.out.println("== 프로그램 끝 ==");
		
		sc.close();
	}
}
//ctrl+space ==> 자동완성
// ctrl+shift+f ==> 자동 들여쓰기
// F11 OR CRTL+F11 OR 프로젝트 우클릭 RUN AS ~ 컴파일