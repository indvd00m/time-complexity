package com.indvd00m.complexity.time;

import com.indvd00m.complexity.time.api.IComplexityElement;

/**
 * @author indvd00m (gotoindvdum[at]gmail[dot]com)
 * @date 2016-Dec-20 11:02:10 PM
 *
 */
public class ComplexityElement implements IComplexityElement {

	public ComplexityElement(long size, long time) {
		this.size = size;
		this.time = time;
	}

	long size;
	long time;

	@Override
	public long getSize() {
		return size;
	}

	@Override
	public long getTime() {
		return time;
	}

	@Override
	public String toString() {
		return String.format("%,d times at %,d size", time, size);
	}

}
