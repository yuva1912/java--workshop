package com.vetias.basics;

public class Stringname {
   public static void main(String[] args) {
        String Sentence="This program shows how can we split a string into multiple strings";
        String[] words = Sentence.split(" "); 
        String[] sentences=Sentence.split("\\.");
        String[] letter=Sentence.split("");
        System.out.println(words.length);
        System.out.println(sentences.length);
        System.out.println(letter.length);

   }
}
        
