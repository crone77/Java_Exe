/*
 * ��ӡ1-10000֮���ˮ�ɻ���
 *   �磺153=1^3+5^3+3^3
 */
public class Narcissus {
	public static void main(String[] args) {
		for (int number = 100; number <= 10000; number++) {

			int temp = number;
			int sum = 0;
			int n=0;
			for (int i = 1; i <= getLength(number); i++) {
				sum = sum + (int) Math.pow(temp % 10, getLength(number));
				temp = temp / 10;
				
			}
			if (number == sum) {
				System.out.print(number + "\t" );
			}

		}
	}

	/*
	 * �ж����ֵĳ���
	 */
	private static int getLength(int number) {
		int i = 0;
		while (number / 10 > 0) {
			i++;
			number = number / 10;
		}
		return i + 1;
	}

}
