MUTATION TESTING ON SOURCE CODE OF DAILY LEETCODE PROBLEMS

The objective of this project is to assess the quality and robustness of test cases designed for LeetCode problems solved during October and November. This is accomplished through mutation testing using the PIT Mutation Testing tool. By identifying weaknesses in the test cases, we ensure improved fault detection in the problem solutions. Mutation testing has been conducted at both unit and integration levels.

Mutation testing aids in improving the quality of test cases, validating problem solutions, and identifying weaknesses in the test suite. We chose PIT as our mutation testing tool because of its seamless integration with Java IDEs like Eclipse, compatibility with JUnit, a comprehensive set of mutation operators, and the ability to generate detailed reports highlighting mutations killed, mutations that survived, and the overall mutation coverage percentage.

Active Mutators Applied by PIT:
The following mutation operators were applied to our codebase by PIT:

    CONDITIONALS_BOUNDARY
    EMPTY_RETURNS
    FALSE_RETURNS
    INCREMENTS
    INVERT_NEGS
    MATH
    NEGATE_CONDITIONALS
    NULL_RETURNS
    PRIMITIVE_RETURNS
    TRUE_RETURNS
    VOID_METHOD_CALLS

To improve mutation coverage, we analyzed the surviving mutants and designed additional test cases to address the gaps. Additionally, we used randomized test case generation to enhance coverage further. As a result, we achieved a mutation coverage of 94%.

Insights from Surviving Mutants:
Most surviving mutants belonged to the Conditionals Boundary Mutator family. Upon further analysis, we identified that many of these surviving mutants were equivalent mutants—mutants that do not alter the program's logical behavior. As such, no test case could kill these mutants.

Individual Contributions:
The problems were divided equally between team members, and each member conducted mutation testing on their assigned problems, generating PIT reports for their respective sections.
