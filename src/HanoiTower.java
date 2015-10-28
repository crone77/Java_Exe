/*
 * 汉诺塔
 */
public class HanoiTower {
	static int i=0;
	public static void main(String[] args) {
		HanoiTower ht=new HanoiTower();
		ht.hanoi(5, "A杆", "B杆", "C杆");
		System.out.println("总共移动了"+i+"次");
	}

	public void hanoi(int n, String src, String mid, String dest) {
		if (n == 1) {
			i++;
			System.out.println(src + "-->" + dest);
		} else {
			/*
			 * ①.src上的n-1个盘子通过dest移动到mid上
			 * ②.src上的最后一个盘子直接移动到dest上
			 * ③.mid上个的n-1个盘子通过src移动到dest上
			 */
			hanoi(n-1,src,dest,mid);
			hanoi(1,src,mid,dest);
			hanoi(n-1,mid,src,dest);
		}
	}
}
