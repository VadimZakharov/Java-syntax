package src.Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Test4 {
    public static void main(String[] args) {
        try {
            run();
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("Одна обработка исключения + мультикэч");

        }catch (ParseException e){
            System.out.println("Другая обработка исключения");
        }

        }
            // исключения наследуются от IOException
    public static void run() throws IOException, ParseException,IllegalArgumentException {

    }
}
