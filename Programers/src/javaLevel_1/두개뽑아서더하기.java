package javaLevel_1;
import java.util.ArrayList;
import java.util.Arrays;

public class �ΰ��̾Ƽ����ϱ� {

	public static void main(String[] args) {
		int[] numbers = { 2, 1, 3, 4, 1 };
		int[] answer = {};

		// 0 2 5 7
		// i=0 j=1,2,3 count[0]=2 [1]=5 [2]=7
		// i=1 j= 2,3 [3]=7 [4] =9
		// i=2 j=3 [5]=12
		ArrayList<Integer> sumList = new ArrayList<Integer>(); // ���� ���� �� �־���
		int count = 0; // 4-1=3
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				sumList.add(numbers[i] + numbers[j]);
				count++;
			}
		}
		// �ߺ��� ������
		ArrayList<Integer> resultList = new ArrayList<Integer>();// �ߺ������� ���� �ִ� ����Ʈ
		for (int i = 0; i < sumList.size(); i++) {
			if (resultList.contains(sumList.get(i)) == false)
				resultList.add(sumList.get(i));
		}
		//�ߺ��� ������ ����Ʈ�� int[] answer�� ����
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

		// ����غ���
//		for(int i=0;i<numbers.length;i++)
//			System.out.println(numbers[i]);

		// System.out.println(sumArray);
		System.out.println(sumList);
		System.out.println(resultList);
		System.out.println(Arrays.toString(answer));

	}

}
