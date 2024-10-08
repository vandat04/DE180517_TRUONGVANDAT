package TestW1;

import W1.CharacterAndLetterCount;
import java.util.Scanner;

public class Test_CharacterAndLetterCount {

    public static void main(String[] args) {

        CharacterAndLetterCount s = new CharacterAndLetterCount(new Scanner(System.in).nextLine());
        System.out.println(s.getMapCharacter());
        System.out.println(s.getMapLetter());

    }
}
