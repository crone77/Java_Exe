/*
 * ��ŵ��
 */
public class HanoiTower {
	static int i=0;
	public static void main(String[] args) {
		HanoiTower ht=new HanoiTower();
		ht.hanoi(5, "A��", "B��", "C��");
		System.out.println("�ܹ��ƶ���"+i+"��");
	}

	public void hanoi(int n, String src, String mid, String dest) {
		if (n == 1) {
			i++;
			System.out.println(src + "-->" + dest);
		} else {
			/*
			 * ��.src�ϵ�n-1������ͨ��dest�ƶ���mid��
			 * ��.src�ϵ����һ������ֱ���ƶ���dest��
			 * ��.mid�ϸ���n-1������ͨ��src�ƶ���dest��
			 */
			hanoi(n-1,src,dest,mid);
			hanoi(1,src,mid,dest);
			hanoi(n-1,mid,src,dest);
		}
	}
}
