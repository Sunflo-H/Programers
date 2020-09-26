package javaLevel_1;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = new char[s.length()];
        arr = s.toCharArray();
        
        for(int i=0;i<arr.length-1;i++)
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    char temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
         
        for(int i=0;i<arr.length;i++)
            answer += arr[i];

        System.out.println(answer);
    
        char c = 65;
        System.out.println(c);

        return answer;
    }
}