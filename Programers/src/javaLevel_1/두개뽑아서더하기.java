package javaLevel_1;
import java.util.ArrayList;
import java.util.Arrays;

public class 두개뽑아서더하기 {

	public static void main(String[] args) {
		int[] numbers = { 2, 1, 3, 4, 1 };
		int[] answer = {};

		// 0 2 5 7
		// i=0 j=1,2,3 count[0]=2 [1]=5 [2]=7
		// i=1 j= 2,3 [3]=7 [4] =9
		// i=2 j=3 [5]=12
		ArrayList<Integer> sumList = new ArrayList<Integer>(); // 더한 값을 다 넣었어
		int count = 0; // 4-1=3
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				sumList.add(numbers[i] + numbers[j]);
				count++;
			}
		}
		// 중복을 제거해
		ArrayList<Integer> resultList = new ArrayList<Integer>();// 중복제거한 값을 넣는 리스트
		for (int i = 0; i < sumList.size(); i++) {
			if (resultList.contains(sumList.get(i)) == false)
				resultList.add(sumList.get(i));
		}
		//중복을 제거한 리스트를 int[] answer에 넣자
        answer=new int[resultList.size()];
        for(int i=0;i<resultList.size();i++)
            answer[i]=resultList.get(i);
        
		for (int i = 0; i < answer.length - 1; i++) {
			for (int j = 0; j < answer.length - 1 - i; j++) {
				if (answer[j] > answer[j + 1]) {
					int temp = answer[j];
					answer[j] = answer[j + 1];
					answer[j + 1] = temp;
				}
			}
		}

		// 출력해보자
//		for(int i=0;i<numbers.length;i++)
//			System.out.println(numbers[i]);

		// System.out.println(sumArray);
		System.out.println(sumList);
		System.out.println(resultList);
		System.out.println(Arrays.toString(answer));

	}

}
