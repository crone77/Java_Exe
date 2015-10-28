/*
 * 插入排序
 */
public class Insert_Sort {
	public static void main(String[] args) {
		int[] numbers = { 9, 8, 7, 5, 6, 4, 2 };
		int n = numbers.length;
		for (int i = 0; i <= n - 2; i++) {	// 循环的总趟数：n-1
		for(int j=0;j<=i;j++){
			if(numbers[i+1]<numbers[j]){
				int temp=numbers[i+1];
				numbers[i+1]=numbers[j];
				numbers[j]=temp;
			}
		}
		}for(int i=0;i<=n-1;i++){
			System.out.print(numbers[i]+"\t");
		}
	}
}
