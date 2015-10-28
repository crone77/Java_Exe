/*
 * 分解质因数
 */
public class Factor {
	public static void main(String[] args) {
		factor(15 );
	}

	/**
	 * @param number
	 */
	static void factor(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				System.out.print(i + "\t");
				// 判断number/i是不是素数
				int num = number / i;
				if (isPrime(num)) {
					System.out.print(num+"\t ");
				} else {
					factor(num);
				
				}	return;  //return返回终结循环
			}
		}
	}

	private static boolean isPrime(int number) {
		boolean flag = true;
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				flag=false;
			}
		}
		return flag;
	}
}
