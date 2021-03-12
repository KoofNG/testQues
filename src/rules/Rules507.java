/* Copyright (c) 2021 oasomefun@futa.edu.ng. All Rights Reserved.
 * Redistribution of original or derived work requires permission.
 * Credits: MIT
 */
package rules;

/**
 * Rules507 represents the coding policy of CPE 507
 */
public class Rules507 {
     
    /**
     * Judge whether a given piece of code may be used or not in a problem
     * set or team project, according to the code-review policy of CPE 507
     * 
     * @param writtenByMe true if the code in question was written by
     *        yourself or, in the case of a team project, your teammates,
     *        otherwise false.
     * @param usedByOthers if not writtenByMe, was the code in question publicly
     *        or privately made available for your use by another student or an external source.
     *        Otherwise ignored.
     * @param citedSource if not writtenByMe, did you
     *        properly cite your source. Otherwise ignored.
     * @param implementedFeature whether you implemented the specific feature(s)
     *        required in the problem question(s).
     * @return Whether or not, based on the information provided in the
     *         arguments, the code in question in your assignment, 
     *         would be accepted according to the CPE 507 code review policy.
     */
    public static boolean mayUseCodeIn507(boolean writtenByMe,
                                          boolean usedByOthers, boolean citedSource,
                                          boolean implementedFeature) {

        // TODO: Fill in this method, then remove the exception below
        throw new RuntimeException("implement me!");
    }
    
    /**
     * Main method of the class.
     * 
     * Runs the mayUseCodeIn507 method.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        final boolean canSubmit;
        canSubmit = Rules507.mayUseCodeIn507(true, false,
                true, true);
        System.out.println("You certainly can submit this code: " + canSubmit);
    }
}
