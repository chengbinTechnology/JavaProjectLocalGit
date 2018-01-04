package source.chengbin.info.common.util;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionUtil<T> {
	
	
	
	
	public TreeSet<T> ListToTreeSet(Collection<T> list){
		TreeSet<T> set=new TreeSet<T>();
		set.addAll(list);
		return set;
	}

}
