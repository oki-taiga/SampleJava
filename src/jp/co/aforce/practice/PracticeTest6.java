package jp.co.aforce.practice;

public class PracticeTest6 {
	public static void main(String args[]) {

		//練習問題1
		int fortune=new java.util.Random().nextInt();


		switch(fortune) {
		case 1:
			System.out.println("吉です");
			break;
		case 2:
			System.out.println("中吉です");
			break;
		case 3:
			System.out.println("大吉です");
			break;
		default:
			System.out.println("それ以外の数値は凶です");
		}

		//練習問題2
		int sum=0;

		for(int i=1;i<=100;i++) {
			if(i%7==0)
			System.out.println(i);
			sum+=i;
		}
		System.out.println("7の倍数の総合計は"+sum+"です。");


		//練習問題3
		for(int j=1;j<=9;j++) {
			for(int k=1;k<=9;k++) {
				System.out.println(""+j*k);
			}
			System.out.println();
		}
}
}