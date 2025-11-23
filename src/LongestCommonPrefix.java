
import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        /*
        List<String> strList = new ArrayList<>();
        String strValue = "";
        if (strs == null || strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        if (strs.length <= 200) {

            for (String str : strs) {
                strList.add(str.toLowerCase());
            }
            System.out.println(strList);
            for (int i = 0; i < strList.size(); ) {
                strValue = strList.get(i);
                String strValue2  = strList.get(i);
                if (strValue.substring(0, 2).equals(strValue2.substring(0, 2))) {
                    return strValue.substring(0, 2);
                } else {
                    return "";
                }
            }
        }
        return new String();

         */
        //Правильное решение

                if (strs == null || strs.length == 0) return "";

                String prefix = strs[0]; // начинаем с первой строки

                for (int i = 1; i < strs.length; i++) {
                    // уменьшаем prefix, пока текущая строка не начнется с него
                    while (!strs[i].startsWith(prefix)) {
                        prefix = prefix.substring(0, prefix.length() - 1);
                        if (prefix.isEmpty()) return "";
                    }
                }
                return prefix;
            }
        }

