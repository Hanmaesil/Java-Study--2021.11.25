import java.util.Arrays;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		// �ǽ� : ���ڰ���
		// ¦���� ¦�� ����� ������ ���, Ȧ���� ����� ��,�� �� �ݺ�(ex 3�̸� ���ڼ�)

		// 1�� ���
//		Scanner sc = new Scanner(System.in);
//		String array[] = { "��", "��" };
//		System.out.println("==== ���� ���� strat ====");
//		System.out.print("���ڸ� �Է����ּ��� : ");
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

		// 2�� ���
		// ����ڰ� ���ڸ� �Է��ϸ�, �Է��� ���ڿ� �°� �迭 ����
		// �迭 �ȿ��� ��, �� �̶�� ���ڰ� ������� ������ ����
		Scanner sc = new Scanner(System.in);
		System.out.println("==== ���� ���� strat ====");
		System.out.print("���ڸ� �Է����ּ��� : ");
		int num = sc.nextInt();
		String[] ary = new String[num];

		for (int i = 0; i < ary.length; i++) {
			if (i % 2 == 0) {
				ary[i] = "��";
			}else
				ary[i] = "��";
		}
//		for(int i = 0; i < num; i++) {
//			System.out.print(ary[i]);
//		}
		
		System.out.println(Arrays.toString(ary)); // �迭�� �ִ� ��� �����͸� �����ִ� ���(import �ϰ� ����ϴ� ��.)
		
	}

}
