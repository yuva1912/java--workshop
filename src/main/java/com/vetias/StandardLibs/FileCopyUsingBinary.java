package com.vetias.StandardLibs;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyUsingBinary {
    public static void main(String[] args) {
        try(FileInputStream inputStream=new FileInputStream("Screenshot (1).png");
        FileOutputStream outputStream=new FileOutputStream("yuvan.png"))
        {
            byte[] chunk=new byte[1024];
            int byteRead;
            while((byteRead=inputStream.read(chunk))!=-1)
            {
                outputStream.write(chunk,0,byteRead);

            }
        }
        catch(IOException e){
            System.out.println("can't read the file");
        }
    }

}