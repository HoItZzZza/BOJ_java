import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int M = in.nextInt();
		int A = in.nextInt();
		
		if (H+(M+A)/60<24) {
			System.out.println(H+(M+A)/60+" "+(M+A)%60);
		}else if(H+(M+A)/60>24) {
			System.out.println((H+(M+A)/60-24)+" "+(M+A)%60);
		}else {
			System.out.println(0+" "+(M+A)%60);
		}
		// 1. 더해지는 분에 따라서 총 시간이 24시간이 넘어갈 때, 아닐 때 만들고
		// 2. 안넘어가면 그대로 출력
		// 3. 넘어가면 시간에 분의 몫 더해서 출력
		// 일단 이르케 알고리즘 짜고 내일 계속 할까?
		// 연속해서 몇 문제 풀었더니 힘드네요,.,.,
		// 2884번 알람시계
	}
}