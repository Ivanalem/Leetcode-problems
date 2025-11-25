import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) {
            return false;
        }
        char [] tArray = t.toCharArray();
        char [] sArray = s.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        for(int i=0;i<sArray.length;i++) {
            if(sArray[i]!=tArray[i]) {
                return false;

            }
        }
        return true;
    }
}
