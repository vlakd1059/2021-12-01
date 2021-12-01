
public class Exam01 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		// 1~100 까지의 3 배수의 총합 출력
		for (i = 3; i <= 100; i++) {
			if (i % 3 == 0) {
				sum = sum + i;
				System.out.println(i);
			}
		}
		System.out.println("총합 : " + sum);
	}
}
