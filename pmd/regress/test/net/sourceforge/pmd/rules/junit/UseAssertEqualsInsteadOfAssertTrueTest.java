
 /**
  * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
  */
 package test.net.sourceforge.pmd.rules.junit;
 
 import net.sourceforge.pmd.Rule;
 import test.net.sourceforge.pmd.testframework.SimpleAggregatorTst;
 
 public class UseAssertEqualsInsteadOfAssertTrueTest extends SimpleAggregatorTst {
     private Rule rule;
 
     public void setUp() {
         rule = findRule("junit", "UseAssertEqualsInsteadOfAssertTrue");
     }
 
     public void testAll() throws Throwable {
         runTests(rule);
     }
 }
