//This file is part of the GraphWalker java package
//The MIT License
//
//Copyright (c) 2010 graphwalker.org
//
//Permission is hereby granted, free of charge, to any person obtaining a copy
//of this software and associated documentation files (the "Software"), to deal
//in the Software without restriction, including without limitation the rights
//to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
//copies of the Software, and to permit persons to whom the Software is
//furnished to do so, subject to the following conditions:
//
//The above copyright notice and this permission notice shall be included in
//all copies or substantial portions of the Software.
//
//THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
//AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
//OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
//THE SOFTWARE.

package org.graphwalker.conditions;

import org.graphwalker.conditions.CombinationalCondition;
import org.graphwalker.conditions.NeverCondition;

import junit.framework.TestCase;

public class CombinationalConditionTest extends TestCase {

	public void testConstructor() {
		new CombinationalCondition();
	}

	public void testFulfillment() {
		CombinationalCondition condition = new CombinationalCondition();
		condition.add(new NeverCondition());
		assertEquals(0, condition.getFulfilment(), 0.01);
	}

	public void testIsFulfilled() {
		CombinationalCondition condition = new CombinationalCondition();
		condition.add(new NeverCondition());
		assertEquals(false, condition.isFulfilled());
		condition.add(new NeverCondition());
		assertEquals(false, condition.isFulfilled());
		condition.add(new NeverCondition());
		assertEquals(false, condition.isFulfilled());
	}
}
