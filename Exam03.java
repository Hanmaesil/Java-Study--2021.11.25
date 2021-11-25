import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 실습 : 회원가입/로그인 프로그램 만들기
		// 1. 회원가입 2.로그인 3.종료

		String[] idArray = {"","",""}; // 오류가 나오기 때문에 값을 넣어놓는다.
		//String[] idArray = new String[3]; 이렇게 하면 스트링 기본값인 null이 들어가서 오류가 나온다.
		int[] password = new int[3];
		int index = 0;

		while (true) {
			System.out.println("1. 회원가입 2. 로그인 3. 종료");
			int num = sc.nextInt();
			if (num == 1) {

				if (index < 3) {
					System.out.println("===회원가입===");
					System.out.print("id 입력 : ");
					idArray[index] = sc.next();
					System.out.print("pw 입력 : ");
					password[index] = sc.nextInt();
					index++;
					System.out.println("가입 완료");
					System.out.println();
				} else {
					System.out.println("종료!");
					break;
				}
			} else if (num == 2) {
				System.out.println("===로그인===");

				while (true) { // 로그인 실패했을때 다시 id와 pw입력을 출력시키기 위한 while문

					System.out.print("id 입력 : ");
					String id = sc.next();
					System.out.print("pw 입력 : ");
					int pw = sc.nextInt();
					int cnt = 0; // while을 빠져나오기 위한 변수
					for (int i = 0; i < 3; i++) {
						if (idArray[i].equals(id) && password[i] == pw) {
							System.out.println("로그인!");
							cnt++; // 로그인에 성공하면 1증가
							break;
						}

					}if(cnt == 0) {
					System.out.println("다시 입력하세요."); //로그인이 실패하면 cnt가 0이기 때문에 실패할때만 출력된다.
					}
					if (cnt > 0) { // 1이 증가했으므로 브레이크가 걸려 while문을 빠져나가 처음 while문으로 나간다.
						break;
					}
				}

			} else if (num == 3) {
				System.out.println("프로그램 종료");
				break;
			}

		}

	}

}
