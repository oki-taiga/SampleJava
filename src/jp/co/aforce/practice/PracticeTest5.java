package jp.co.aforce.practice;

import java.util.Arrays;

public class PracticeTest5 {
	public static void main(String args[]) {
		//練習問題2
		String[] animal= {"犬","猫","うさぎ","へび",};

		//練習問題3
		String favorite_animal="へび";
		if(Arrays.asList(animal).contains(favorite_animal)){
			System.out.println("へびは含まれています");
		}

		//練習問題4
		String birthday="3月";

		switch(birthday) {
		case "1月":
			System.out.println("元日、成人の日");
			break;
		case "2月":
			System.out.println("建国記念の日、天皇誕生日");
			break;
		case "3月":
			System.out.println("春分の日");
			break;
		case "4月":
			System.out.println("昭和の日");
			break;
		case "5月":
			System.out.println("憲法記念日、みどりの日、こどもの日");
			break;
		case "6月":
			System.out.println("なし");
			break;
		case "7月":
			System.out.println("海の日、スポーツの日");
			break;
		case "8月":
			System.out.println("山の日");
			break;
		case "9月":
			System.out.println("敬老の日、秋分の日");
			break;
		case "10月":
			System.out.println("なし");
			break;
		case "11月":
			System.out.println("文化の日、勤労感謝の日");
			break;
		case "12月":
			System.out.println("なし");
			break;

		}

	}
}
