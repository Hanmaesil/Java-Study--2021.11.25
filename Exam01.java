import java.util.Arrays;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		// 실습 : 수박게임
		// 짝수면 짝수 수대로 수박이 출력, 홀수면 수대로 수,박 이 반복(ex 3이면 수박수)

		// 1번 방법
//		Scanner sc = new Scanner(System.in);
//		String array[] = { "수", "박" };
//		System.out.println("==== 수박 게임 strat ====");
//		System.out.print("숫자를 입력해주세요 : ");
//		int num = sc.nextInt();
//
//		for (int i = 1; i <= num; i++) {
//		
//			if (i % 2 == 0) {
//			System.out.print(array[1]);
//			}else 
//				System.out.print(array[0]);
//			
//		}

		// 2번 방법
		// 사용자가 숫자를 입력하면, 입력한 숫자에 맞게 배열 생성
		// 배열 안에는 수, 박 이라는 글자가 순서대로 들어가도록 생성
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 수박 게임 strat ====");
		System.out.print("숫자를 입력해주세요 : ");
		int num = sc.nextInt();
		String[] ary = new String[num];

		for (int i = 0; i < ary.length; i++) {
			if (i % 2 == 0) {
				ary[i] = "수";
			}else
				ary[i] = "박";
		}
//		for(int i = 0; i < num; i++) {
//			System.out.print(ary[i]);
//		}
		
		System.out.println(Arrays.toString(ary)); // 배열에 있는 모든 데이터를 보여주는 기능(import 하고 사용하는 것.)
		
	}

}
