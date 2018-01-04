package source.chengbin.info.common;

import java.util.List;

public class BinaryMath {

	/**
	 * 返回若干的int或后的二级值字符串
	 * 
	 * @param list
	 * @return
	 */
	public static String getOrResult(List<Integer> list) {
		int source = 0;
		for (int i = 0; i < list.size(); i++) {
			source = source | list.get(i);
		}
		return Integer.toBinaryString(source);
	}

	/**
	 * 获取俩个二进制数的与的结果
	 * 
	 * @param one
	 * @param tow
	 * @return
	 */
	public static boolean getAndResult(int one, int tow) {
		int s = 0;
		s = one & tow;
		if (s > 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 获取俩个二进制字符的与的结果
	 * 
	 * @param one
	 * @param tow
	 * @return
	 */
	public static boolean getAndResult(String one, String tow) {
		return getAndResult(Integer.parseInt(one, 2), Integer.parseInt(tow, 2));
	}

}
