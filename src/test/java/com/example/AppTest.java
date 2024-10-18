package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;


public class AppTest 
{
    @Test
    public void table(){
        App tb = new App();
        List<String> expected = Arrays.asList(
            "5 * 0 = 0",
            "5 * 1 = 5", 
            "5 * 2 = 10", 
            "5 * 3 = 15", 
            "5 * 4 = 20", 
            "5 * 5 = 25", 
            "5 * 6 = 30", 
            "5 * 7 = 35", 
            "5 * 8 = 40", 
            "5 * 9 = 45", 
            "5 * 10 = 50"
        );
        assertEquals(expected, tb.Table(5) );
    }
}
