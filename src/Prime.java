/*
 * 打印100以内的素数
 */
public class Prime {
	public static void main(String[] args) {
		int n = 0;
		for (int i = 2; i <= 100; i++) {
			if (isPrime(i)) {
				n++;
				System.out.print(i + "\t");
				if (n % 10 == 0) {
					System.out.println();
				}

			}
		}
	}

	// 判断是否为素数的方法
	private static boolean isPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
