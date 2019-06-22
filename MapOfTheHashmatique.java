  
import java.util.HashMap;
import java.util.Set;

public class MapOfTheHashmatique{
    public static void trackLineUp(){  
        HashMap<String, String> setList = new HashMap<String, String>();
        setList.put("My Best Friend's Girl", "When she's dancing 'neath the starry sky, she'll make you flip.");
        setList.put("Bennie & The Jets", "She's got electric boots, a mohair suit, You know I read it in a magazine!");
        setList.put("Dancing With Myself", "Oh, oh, dancing with myself. If I had the chance I'd ask the world to dance.");
        setList.put("Space Oddity", "This is Ground Control to Major Tom. You've really made the grade!");

        String titleTrack = setList.get("My Best Friend's Girl");
        System.out.println("Lyrics from their latest Title Track!");
        System.out.println(titleTrack);
        System.out.println("The Set list is the following:");

        Set<String> keys = setList.keySet();
        for(String key : keys){
            System.out.println(key);
            System.out.println(setList.get(key));
        }
    }
    public static void main(String[] args){
        trackLineUp();
    }
}
