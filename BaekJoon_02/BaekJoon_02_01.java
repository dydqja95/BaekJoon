package BaekJoon_02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BaekJoon_02_01 {
	
	public static void main(String[] args) throws IOException{
		
		
		// 들어오는 변수를 받아서 br객체에 넣는다.
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		// br객체를 " " 기준으로 나눠 temp 배열에 넣는다.
		String[] temp = br.readLine().split(" ");
		
		// String타입이였던 temp의 각 원소들을 받아 Integer 타입으로 변경해 각각 할
		int A = Integer.parseInt(temp[0]);
		int B = Integer.parseInt(temp[1]);
		
		if(A > B) {
			System.out.println(">");
		}
		else if(A < B) {
			System.out.println("<");
		}
		else if(A == B) {
			System.out.println("=");
		}
	}
}
