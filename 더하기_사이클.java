package practice_2_baekjoon;
import java.util.Scanner;

//백준 더하기 사이클
public class Main {
	int first_o, second_o, new_num;
	int cycle = 0;
	
	public void repeat(int original_N, int N) { //여기서 static안쓴이유는 전역변수 사용하려고
		//여기서 인수를 두 개 받으면서 original_N을 유지하면서 new_num을 갱신할 수 있음!
		if (N == 0) {
			System.out.println(1);
		}else {
			if (original_N == new_num) {
			System.out.println(cycle);
		}else {
			first_o = N%10;
			second_o = N%10 + N/10;
			new_num = first_o*10 + second_o%10;
			cycle++;
			repeat(original_N, new_num);
		}
		}
		//근데 N == new_num이면 재귀 break하고 cycle 출력해야하는디
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		Main rp = new Main(); //인스턴스 생성 
		rp.repeat(N, N);
		//인스턴스란? : 객체지향 프로그래밍에서, 어떤 클래스에 속하는 각 객체
	}
}
