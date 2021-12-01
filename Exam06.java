
public class Exam06 {

	public static void main(String[] args) {
		// 공포의 별찍기
		// 빈공백 채우기
		for (int j = 0; j <= 4; j++) {
			for (int i = 1; i <= 4 - j; i++) {
				System.out.print(" ");
			}
			for (int a = 1; a <= 1 + j; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}