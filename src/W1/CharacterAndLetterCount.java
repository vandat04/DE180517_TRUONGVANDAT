package W1;

import java.util.HashMap;
import java.util.Map;

public  class CharacterAndLetterCount {

    private String str;
    private Map<String, Integer> mapLetter;
    private Map<Character, Integer> mapCharacter;

    public CharacterAndLetterCount(String str) {
        this.str = str;
        setMapLetter();
        setMapCharacter();
    }


    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Map<String, Integer> getMapLetter() {
        return mapLetter;
    }

    public void setMapLetter() {
        mapLetter = new HashMap<>();
        String arrLetter[] = str.trim().split(" ");
        for (String strLetter : arrLetter) {
            mapLetter.compute(strLetter, (key, value) -> (value == null) ? 1 : value + 1);
        }
    }

    public Map<Character, Integer> getMapCharacter() {      
        return mapCharacter;
    }

    public void setMapCharacter() {
        mapCharacter = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                mapCharacter.compute(str.charAt(i), (key, value) -> (value == null) ? 1 : value + 1);
            }
        }
    }

}
