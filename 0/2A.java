package collections.comparators;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FixedOrderComparatorTest {
	
	@Test
	public void test()  {
		collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
		boolean boolean1 = fixedOrderComparator0.isLocked();
		boolean boolean3 = fixedOrderComparator0.add((java.lang.Object) 'a');
		java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, "hi!" };
		collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(
				objArray6);
		try {
			int int9 = fixedOrderComparator0.compare((java.lang.Object) objArray6, (java.lang.Object) "hi!");
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: Attempting to compare unknown object [Ljava.lang.Object;@57a4d5ee");
		} catch (java.lang.IllegalArgumentException e) {
		}
		org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
		org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
		org.junit.Assert.assertNotNull(objArray6);
	}
}