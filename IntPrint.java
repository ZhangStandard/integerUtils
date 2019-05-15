import java.util.Scanner;

/**
 * 输入数字：键盘录入数字
 * @author Standard
 *
 */
public class IntPrint {


	/**
	 *  输入数字指令方法,限定上限和下限,包括上限下限
	 * @param limitDown：数字输入下限
	 * @param limitUp：数字输入上限
	 * @return choose:控制台输入的数字
	 */
	public static int putIn(int limitDown,int limitUp) {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		int choose = limitDown-1;
		do {
			String str = sc.next();
			try {
				choose = new Integer(str);
				if (choose < limitDown||choose>limitUp) {
					choose = limitDown-1;
					System.err.print("输入有误，请重新输入：");
				}
			} catch (Exception e) {
				choose = limitDown-1;
				System.err.print("输入有误，请重新输入：");
			}
		} while (choose == limitDown-1);
		return choose;
	}
}
