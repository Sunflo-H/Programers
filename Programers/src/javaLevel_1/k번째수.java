package javaLevel_1;

import java.util.Arrays;

public class k번째수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = {{ 2, 5, 3 },{4, 4, 1},{1, 7, 3}};
		int[] answer = {};
		int[][] arr = new int[commands.length][];
		// commands[0][012] = 2 5 3
		// commands[1][012] = 4 4 1
		// commands[2][012] = 5 6 3
		for (int i = 0; i < commands.length; i++) {
			int a = 0; // arr의 인덱스
			int size = commands[i][1] - commands[i][0] + 1;
			arr[i] = new int[size];
			for (int start = commands[i][0] - 1; start < commands[i][1]; start++) {
				arr[i][a] = array[start];
				a++;
			}
		}
		
		for (int k = 0; k < arr.length; k++) {
			if (arr[k].length == 1)
				continue;
			for (int i = 0; i < arr[k].length - 1; i++) {
				for (int j = 0; j < arr[k].length - 1 - i; j++) {
					if (arr[k][j] > arr[k][j + 1]) {
						int temp = arr[k][j];
						arr[k][j] = arr[k][j + 1];
						arr[k][j + 1] = temp;
					}
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
            Arrays.sort(arr[i]);
        answer = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i].length==1)
                answer[i]=arr[i][0];
            else
                answer[i]=arr[i][commands[i][2]-1];
        }
        
        System.out.println(Arrays.toString(answer));
	}

}
