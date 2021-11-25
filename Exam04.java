import java.util.Random;
import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {

		// 실습 : 가위바위보
		Scanner sc = new Scanner(System.in);
//		String cmp = "주먹";

		System.out.print("무엇을 내실건가요? : ");
		String user = sc.next(); // 사용자가 입력한 값.

//		int[] num = new int[3];
//		System.out.println(num);

//		if(user == "보") { //문자열의 주소라서 비교가 안된다.
//			System.out.println("이겼습니다.");
//		}
		
		Random ran = new Random();
		String cmp[] = {"주먹", "가위", "보"}; 
		int num = ran.nextInt();
		
		if (user.equals("보")) { // 문자열 비교는 기준값.equals 사용해야한다.
			System.out.println("이겼습니다.");

		}else if(user.equals("가위")) {
			System.out.println("졌습니다.");
		}else if(user.equals("주먹")) {
			System.out.println("비겼습니다.");
		}
			

	}
}
