package academy.devdojo.maratonajava.javacore.Oexception.exeption.test;

import java.io.File;
import java.io.IOException;

public class ExeptionTest01 {
    public static void main(String[] args) {
      criarNovoArquivo();
    }

    private static void  criarNovoArquivo(){
        File file = new File("a\\teste.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " +isCriado);
        }catch (IOException e){
          e.printStackTrace();
        }

    }
}
