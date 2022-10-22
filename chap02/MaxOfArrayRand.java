package Algorithm.java.chap02;

import java.util.Random;
//import java.util.Scanner;

public class MaxOfArrayRand {
	//배열 a의 최댓값을 구하여 반환
	static int maxOf(int a[]) {
		int max = a[0];
		for (int i = 1; i < a.length; i++)
			if (a[i] > max)
				max = a[i];
		return max;
	}
	public static void main(String[] args) {
		Random rand = new Random();
//		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.println("=================");
//		System.out.println("사람 수: ");
//		int num = stdIn.nextInt();
		int num = 1 + rand.nextInt(20); //0~19까지의 난수 생성
		
		int[] height = new int[num]; // 요솟수가 num인 배열을 생성
		
		System.out.println("사람 수는" + num + "명입니다.");
		System.out.println("킷값은 아래와 같습니다.");
		for (int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90); //0~89까지의 난수 생성
			System.out.println("height[" + i + "]: " + height[i]);
		}
		
		System.out.println("최댓값은 " + maxOf(height) + "입니다.");
	}

}
