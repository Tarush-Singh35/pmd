/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
package test.net.sourceforge.pmd.rules.codesize;

import net.sourceforge.pmd.Rule;
import test.net.sourceforge.pmd.testframework.SimpleAggregatorTst;

public class NcssMethodCountTest extends SimpleAggregatorTst {
    private Rule rule;

    public void setUp() {
        rule  = findRule("codesize", "NcssMethodCount");
    }

    public void testAll() {
        rule.addProperty("minimum", "13");
        runTests(rule);
    }
}

