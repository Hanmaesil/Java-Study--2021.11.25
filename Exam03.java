import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// �ǽ� : ȸ������/�α��� ���α׷� �����
		// 1. ȸ������ 2.�α��� 3.����

		String[] idArray = {"","",""}; // ������ ������ ������ ���� �־���´�.
		//String[] idArray = new String[3]; �̷��� �ϸ� ��Ʈ�� �⺻���� null�� ���� ������ ���´�.
		int[] password = new int[3];
		int index = 0;

		while (true) {
			System.out.println("1. ȸ������ 2. �α��� 3. ����");
			int num = sc.nextInt();
			if (num == 1) {

				if (index < 3) {
					System.out.println("===ȸ������===");
					System.out.print("id �Է� : ");
					idArray[index] = sc.next();
					System.out.print("pw �Է� : ");
					password[index] = sc.nextInt();
					index++;
					System.out.println("���� �Ϸ�");
					System.out.println();
				} else {
					System.out.println("����!");
					break;
				}
			} else if (num == 2) {
				System.out.println("===�α���===");

				while (true) { // �α��� ���������� �ٽ� id�� pw�Է��� ��½�Ű�� ���� while��

					System.out.print("id �Է� : ");
					String id = sc.next();
					System.out.print("pw �Է� : ");
					int pw = sc.nextInt();
					int cnt = 0; // while�� ���������� ���� ����
					for (int i = 0; i < 3; i++) {
						if (idArray[i].equals(id) && password[i] == pw) {
							System.out.println("�α���!");
							cnt++; // �α��ο� �����ϸ� 1����
							break;
						}

					}if(cnt == 0) {
					System.out.println("�ٽ� �Է��ϼ���."); //�α����� �����ϸ� cnt�� 0�̱� ������ �����Ҷ��� ��µȴ�.
					}
					if (cnt > 0) { // 1�� ���������Ƿ� �극��ũ�� �ɷ� while���� �������� ó�� while������ ������.
						break;
					}
				}

			} else if (num == 3) {
				System.out.println("���α׷� ����");
				break;
			}

		}

	}

}
