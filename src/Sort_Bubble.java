/*
 * ð���������������ѭ�����������ڲ�ѭ��
 */
public class Sort_Bubble {
	public static void main(String[] args) {
		Sort_Bubble s=new Sort_Bubble();
		s.sort();
	
		}
	
	public void sort(){
		int[]  numbers={9,8,7,6,5,4,3,2,1};
		int n=numbers.length;
		for(int i=0;i<n-1;i++){ //�ܹ�length-1��ѭ��
			for(int j=0;j<n-i-1;j++){
				int temp=numbers[j];
				numbers[j]=numbers[j+1];
				numbers[j+1]=temp;
			}
		}
		for(int i=0;i<=n-1;i++){
			System.out.print(numbers[i]+"\t");
		}
		
	}
	}
