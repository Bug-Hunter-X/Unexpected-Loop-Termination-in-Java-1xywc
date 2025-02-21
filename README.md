# Unexpected Loop Termination Bug in Java

This repository demonstrates a subtle bug in Java related to loop termination and variable increment within a loop condition. The bug is easily missed and can lead to unexpected behavior.

## Bug Description

The `UncommonBug.java` file contains a `while` loop that intends to iterate until the variable `x` reaches 10. However, due to a specific condition and the placement of the increment operator, the loop might terminate prematurely.

## Solution

The solution, found in `UncommonBugSolution.java`, addresses the issue by ensuring that the loop always operates as expected.