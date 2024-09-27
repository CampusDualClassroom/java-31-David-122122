package com.campusdual.classroom;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Exercise31 {

    public static void main(String[] args) {


        File file  = new File("src/main/resources/lorem.txt");

        try (FileReader fr = new FileReader(file)){
            BufferedReader br = new BufferedReader(fr);
            String linea=br.readLine();
            while (linea!=null){
                System.out.println(linea);
                linea=br.readLine();

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
