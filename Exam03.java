
public class Exam03 {

	public static void main(String[] args) {
		// ������ 2�����
		int i = 0;
		int j = 0;
		int result = 0;
		for (i = 2; i < 10; i++) {

			System.out.println("==" + i + "��==");

			for (j = 1; j < 10; j++) {
				result = i * j;
				System.out.println(i + "*" + j + "=" + result);

			}
			System.out.println();
		}
	}
}
