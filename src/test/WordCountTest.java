package com.vetias.java.wrokshop.basics.string;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.vetias.java.workshop.basics.string.WordCount;

public class WordCountTest {
    @Test
    public void testWordcount(){
        WordCount wordCount=new WordCount();
        int count = wordCount.count("this program shows");
        Assertions.assertEquals(12, count);
    }

}