package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LetterGradeTest2 {
    @Test
    public void BoundaryPartitioningTest() {
        char level;
        level = letterGrade.letterGrade(-1);
        assertEquals('X', level);
        level = letterGrade.letterGrade(101);
        assertEquals('X', level);

        level = letterGrade.letterGrade(0);
        assertEquals('F', level);
        level = letterGrade.letterGrade(10);
        assertEquals('F', level);
        level = letterGrade.letterGrade(59);
        assertEquals('F', level);
        level = letterGrade.letterGrade(60);
        assertEquals('D', level);
        level = letterGrade.letterGrade(69);
        assertEquals('D', level);
        level = letterGrade.letterGrade(70);
        assertEquals('C', level);
        level = letterGrade.letterGrade(79);
        assertEquals('C', level);
        level = letterGrade.letterGrade(80);
        assertEquals('B', level);
        level = letterGrade.letterGrade(89);
        assertEquals('B', level);
        level = letterGrade.letterGrade(90);
        assertEquals('A', level);
        level = letterGrade.letterGrade(99);
        assertEquals('A', level);
        level = letterGrade.letterGrade(100);
        assertEquals('A', level);
    }
}
