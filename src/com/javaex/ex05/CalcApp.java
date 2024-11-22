package com.javaex.ex05;
//	정규표현식으로 해보기
import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	//	스캐너에서 한 줄 입력
    	//	공백 구분자로 분할
    	//	첫번째 토큰 -> 숫자1
    	//	두번째 토큰 -> 연산자 기호
    	//	세번째 토큰 -> 숫자2
    	Scanner scanner = new Scanner(System.in);
    	
    	while(true) {
    		//	한 줄 입력
    		System.out.print(">> ");
    		String line = scanner.nextLine();
    		if (line.equals("/q")) {
    			System.out.println("종료합니다.");
    			break;
    		}
    		
    		String tokens[] = line.split(" ");
    		int leftNum = Integer.valueOf(tokens[0]);
    		int rightNum = Integer.valueOf(tokens[2]);
    		String operator = tokens[1];
    		
    		switch (operator) {
    		case "+" :
    			Add add = new Add();
    			add.setValue(leftNum, rightNum);
    			System.out.println(">> " + add.calculate());
    			break;
    		case "-" :
    			Sub sub = new Sub();
    			sub.setValue(leftNum, rightNum);
    			System.out.println(">> " + sub.calculate());
    			break;
    		case "*" :
    			Mul mul = new Mul();
    			mul.setValue(leftNum, rightNum);
    			System.out.println(">> " + mul.calculate());
    			break;
    		case "/" :
    			Div div = new Div();
    			div.setValue(leftNum, rightNum);
    			System.out.println(">> " + div.calculate());
    			break;
    		default:
    			System.out.println("알 수 없는 연산입니다.");
    			break;
    		}
    	}
    	
    	scanner.close();
    }
}
