package javaLevel_1;

import java.util.Arrays;

public class 완주하지못한선수 {

	public static void main(String[] args) {
		//수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
		//마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
		//완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
		
//		제한사항
//		마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
//		completion의 길이는 participant의 길이보다 1 작습니다.
//		참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
//		참가자 중에는 동명이인이 있을 수 있습니다.
		String answer="";

		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion= {"stanko", "ana", "mislav"};
		
//		ArrayList<String> pList = new ArrayList<String>();
//      ArrayList<String> cList = new ArrayList<String>();
     
//      for(int i=0;i<participant.length;i++)
//          pList.add(participant[i]);
//      for(int i=0;i<completion.length;i++)
//          cList.add(completion[i]);
     
//      //cList를 pList랑 비교해서 중복된 값이 있으면 pList에서 삭제해
//      //그럼 동명이인도 해결되지
//      //중복 = 완주
//          for(int i=0 ;i<pList.size();i++){
//              if(cList.contains(pList.get(i))){
//                  String p = pList.get(i);
//                  cList.remove(p);
//                  //System.out.println(cList);
//              }
//              else 
//                  answer=pList.get(i);                
//          }
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for(int i=0;i<completion.length;i++) {
			if(!participant[i].equals(completion[i])) {
				answer = participant[i];
				break;
			}
			answer = participant[i+1];
		}
		System.out.println(answer);
	}

}
