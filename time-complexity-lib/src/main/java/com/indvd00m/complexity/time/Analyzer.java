package com.indvd00m.complexity.time;

import java.util.ArrayList;
import java.util.List;

import com.indvd00m.complexity.time.api.IAnalyzer;
import com.indvd00m.complexity.time.api.IComplexityElement;

/**
 * @author indvd00m (gotoindvdum[at]gmail[dot]com)
 * @date 2016-Dec-20 11:00:54 PM
 *
 */
public class Analyzer implements IAnalyzer {

	@Override
	public List<IComplexityElement> normalize(List<IComplexityElement> baseComplexity, int newSize) {
		if (newSize <= 0)
			throw new IllegalArgumentException();

		List<IComplexityElement> complexity = new ArrayList<IComplexityElement>(newSize);

		int baseSize = baseComplexity.size();
		if (baseSize > newSize) {
			// simply and stupid
			for (int i = 1; i < newSize + 1; i++) {
				int index = (int) ((double) i * baseSize / newSize);
				if (index >= baseSize)
					index = baseSize - 1;
				complexity.add(baseComplexity.get(index));
			}
		} else if (baseSize < newSize) {
			// TODO realize
			throw new UnsupportedOperationException();
		} else {
			// equals
			complexity.addAll(baseComplexity);
		}
		return complexity;
	}

}
