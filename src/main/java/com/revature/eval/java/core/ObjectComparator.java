package com.revature.eval.java.core;

import java.util.Comparator;

public class ObjectComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {

		return o1.hashCode() - o2.hashCode();
	}

}
