/*
 * 选择排序  1、每趟循环找出最小数  2、判断最小数的位置  3、交换数字
 */
public class Select_Sort {
	public static void main(String[] args) {
		int[] numbers = { 24, 8, 50, 6, 1, 4, 32 };
		int n = numbers.length;
		
		for (int i = 0; i <= n - 2; i++) { // 循环n-1趟
			int min = numbers[i]; // 先假设第一个数为最小数
			for (int j = i + 1; j <= n - 1; j++) {
				if (min > numbers[j]) {
					min = numbers[j];
				}
			}
			// 判断最小数位置
			int j;
			for (j = i; j <= n - 1; j++) {
				if (min == numbers[j]) {
					break;
				}

			}
			// 交换数字
			if (j > i) {
				int temp = numbers[j];
				numbers[j] = numbers[i];
				numbers[i] = temp;
			}
		}
		for (int k = 0; k <= n - 1; k++) {
			System.out.print(numbers[k] + "\t");
		}
	}
}
