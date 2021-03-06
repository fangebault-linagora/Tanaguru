/*
 * Tanaguru - Automated webpage assessment
 * Copyright (C) 2008-2015  Tanaguru.org
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact us by mail: tanaguru AT tanaguru DOT org
 */

package org.tanaguru.rules.accessiweb22;

import org.tanaguru.ruleimplementation.AbstractPageRuleWithCheckerImplementation;
import org.tanaguru.rules.elementchecker.contrast.ContrastChecker;

/**
 * Implementation of the rule 3.3.1 of the referential Accessiweb 2.2.
 * <br/>
 * For more details about the implementation, refer to <a href="http://www.tanaguru.org/en/content/aw22-rule-3-3-1">the rule 3.3.1 design page.</a>
 * @see <a href="http://www.accessiweb.org/index.php/accessiweb-22-english-version.html#test-3-3-1"> 3.3.1 rule specification</a>
 *
 * @author jkowalczyk
 */

public class Aw22Rule03031 extends AbstractPageRuleWithCheckerImplementation {

    /** The contrast checker with a value of ratio set to 4.5*/
    private final ContrastChecker contrastChecker = 
            new ContrastChecker(4.5f, true, false, true);

    /**
     * Default constructor
     */
    public Aw22Rule03031 () {
        super();
        setElementChecker(contrastChecker);
    }

    @Override
    public int getSelectionSize() {
        return contrastChecker.getElementCounter();
    }

}