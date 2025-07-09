

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CharacterBasedReaderExample{
    public static void main(String[] args) {
    try(BufferedReader reader=new BufferedReader(new FileReader("README.md")))
    {
       String line;
       while ((line=reader.readLine())!=null){
            System.out.println(line);
        } 
    }
    catch(IOException e){
        System.out.println("Can't read the file");
    }
}
}

