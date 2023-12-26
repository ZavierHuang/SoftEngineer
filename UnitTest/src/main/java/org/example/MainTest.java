package org.example;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;


public class MainTest {

    @Test
    public void TestNormalMethod() {
        String input = "85\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);

        System.setIn(inputStream);
        System.setOut(printStream);

        letterGrade.main(new String[]{});

        assertEquals("Enter the score = The grade of 85 is B" + System.lineSeparator(), outputStream.toString());
    }

    @Test
    public void TestNumberException() {
        String input = "K\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);

        System.setIn(inputStream);
        System.setOut(printStream);

        letterGrade.main(new String[]{});

        assertEquals("Enter the score = Not an integer!" + System.lineSeparator(), outputStream.toString());

    }

    @Test
    public void testIOException() {
        InputStream inputStream = new IOExceptionInputStream();
        System.setIn(inputStream);
        letterGrade.main(new String[]{});
    }

    public class IOExceptionInputStream extends InputStream {
        @Override
        public int read() throws IOException {
            throw new IOException("Simulated IOException in InputStream");
        }
    }


}
