import java.util.Random;
import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {

		// �ǽ� : ����������
		Scanner sc = new Scanner(System.in);
//		String cmp = "�ָ�";

		System.out.print("������ ���ǰǰ���? : ");
		String user = sc.next(); // ����ڰ� �Է��� ��.

//		int[] num = new int[3];
//		System.out.println(num);

//		if(user == "��") { //���ڿ��� �ּҶ� �񱳰� �ȵȴ�.
//			System.out.println("�̰���ϴ�.");
//		}
		
		Random ran = new Random();
		String cmp[] = {"�ָ�", "����", "��"}; 
		int num = ran.nextInt();
		
		if (user.equals("��")) { // ���ڿ� �񱳴� ���ذ�.equals ����ؾ��Ѵ�.
			System.out.println("�̰���ϴ�.");

		}else if(user.equals("����")) {
			System.out.println("�����ϴ�.");
		}else if(user.equals("�ָ�")) {
			System.out.println("�����ϴ�.");
		}
			

	}
}
