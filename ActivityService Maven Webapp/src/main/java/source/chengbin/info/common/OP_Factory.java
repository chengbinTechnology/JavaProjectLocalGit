package source.chengbin.info.common;

import java.util.ArrayList;
import java.util.List;

public class OP_Factory {
	private List<Integer> list = new ArrayList<Integer>();

	public OP_Factory addQueue(Integer ize) {
		list.add(ize);
		return this;
	}

	public String toBinaryString() {
		return BinaryMath.getOrResult(list);
	}

}
