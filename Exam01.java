
public class Exam01 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		// 1~100 ������ 3 ����� ���� ���
		for (i = 3; i <= 100; i++) {
			if (i % 3 == 0) {
				sum = sum + i;
				System.out.println(i);
			}
		}
		System.out.println("���� : " + sum);
	}
}
