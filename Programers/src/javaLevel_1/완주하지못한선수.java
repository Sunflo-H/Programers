package javaLevel_1;

import java.util.Arrays;

public class �����������Ѽ��� {

	public static void main(String[] args) {
		//������ ������ �������� �����濡 �����Ͽ����ϴ�. �� �� ���� ������ �����ϰ�� ��� ������ �������� �����Ͽ����ϴ�.
		//�����濡 ������ �������� �̸��� ��� �迭 participant�� ������ �������� �̸��� ��� �迭 completion�� �־��� ��,
		//�������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
		
//		���ѻ���
//		������ ��⿡ ������ ������ ���� 1�� �̻� 100,000�� �����Դϴ�.
//		completion�� ���̴� participant�� ���̺��� 1 �۽��ϴ�.
//		�������� �̸��� 1�� �̻� 20�� ������ ���ĺ� �ҹ��ڷ� �̷���� �ֽ��ϴ�.
//		������ �߿��� ���������� ���� �� �ֽ��ϴ�.
		String answer="";

		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion= {"stanko", "ana", "mislav"};
		
//		ArrayList<String> pList = new ArrayList<String>();
//      ArrayList<String> cList = new ArrayList<String>();
     
//      for(int i=0;i<participant.length;i++)
//          pList.add(participant[i]);
//      for(int i=0;i<completion.length;i++)
//          cList.add(completion[i]);
     
//      //cList�� pList�� ���ؼ� �ߺ��� ���� ������ pList���� ������
//      //�׷� �������ε� �ذ����
//      //�ߺ� = ����
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
