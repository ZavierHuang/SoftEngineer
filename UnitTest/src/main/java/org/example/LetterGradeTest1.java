package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LetterGradeTest1 {
    @Test
    public void EquivalencePartitioningTest() {
        char level;
        level = letterGrade.letterGrade(-1);
        assertEquals('X', level);
        level = letterGrade.letterGrade(101);
        assertEquals('X', level);

        level = letterGrade.letterGrade(0);
        assertEquals('F', level);
        level = letterGrade.letterGrade(10);
        assertEquals('F', level);
        level = letterGrade.letterGrade(20);
        assertEquals('F', level);
        level = letterGrade.letterGrade(30);
        assertEquals('F', level);
        level = letterGrade.letterGrade(40);
        assertEquals('F', level);
        level = letterGrade.letterGrade(50);
        assertEquals('F', level);
        level = letterGrade.letterGrade(60);
        assertEquals('D', level);
        level = letterGrade.letterGrade(70);
        assertEquals('C', level);
        level = letterGrade.letterGrade(80);
        assertEquals('B', level);
        level = letterGrade.letterGrade(90);
        assertEquals('A', level);
    }
}
