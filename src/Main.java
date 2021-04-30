import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String input = "GeeksForGeeks";

    public static void main(String[] main) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            String character = String.valueOf(input.charAt(i));
            if (map.containsKey(character)) {
                map.put(String.valueOf(input.charAt(i)), map.get(character) + 1);
            } else {
                map.put(character, 0);
            }
        }
        for (int i = 0; i < map.size(); i++){
            if(map.get(String.valueOf(input.charAt(i))) == 0){
                System.out.println("First non repeating character is: " + input.charAt(i));
                return;
            }
        }
        System.out.println("No unique character");
    }
}
