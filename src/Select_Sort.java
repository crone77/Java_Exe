/*
 * ѡ������  1��ÿ��ѭ���ҳ���С��  2���ж���С����λ��  3����������
 */
public class Select_Sort {
	public static void main(String[] args) {
		int[] numbers = { 24, 8, 50, 6, 1, 4, 32 };
		int n = numbers.length;
		
		for (int i = 0; i <= n - 2; i++) { // ѭ��n-1��
			int min = numbers[i]; // �ȼ����һ����Ϊ��С��
			for (int j = i + 1; j <= n - 1; j++) {
				if (min > numbers[j]) {
					min = numbers[j];
				}
			}
			// �ж���С��λ��
			int j;
			for (j = i; j <= n - 1; j++) {
				if (min == numbers[j]) {
					break;
				}

			}
			// ��������
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
