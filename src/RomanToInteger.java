import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanToInteger {
    public int romanToInt(String s) {
        //Более медленное решение 7 ms
        HashMap<String, Integer> romanMap = new HashMap<>();
        romanMap.put("I", 1);
        romanMap.put("V", 5);
        romanMap.put("X", 10);
        romanMap.put("L", 50);
        romanMap.put("C", 100);
        romanMap.put("D", 500);
        romanMap.put("M", 1000);
        romanMap.put("IV", 4);
        romanMap.put("IX", 9);
        romanMap.put("XL", 40);
        romanMap.put("XC", 90);
        romanMap.put("CD", 400);
        romanMap.put("CM", 900);

        int sum = 0;
        Matcher matcher = Pattern.compile("IV|IX|XL|XC|CD|CM|I|V|X|L|C|D|M")
                .matcher(s);
        List<String> parts = new ArrayList<>();
        while (matcher.find()) {
            parts.add(matcher.group());
        }
        System.out.println(parts);
        if(s.length()>=1  && s.length() <= 15 && !s.isEmpty()) {
            for(int i = 0; i < parts.size(); i++) {
                    sum += romanMap.get((s.substring(i, i + 1)));
                    System.out.println(sum);
            }

        }

        return sum;
//        Более скоростное решение 5 ms
        /*
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = map.get(s.charAt(i));

            // Если есть следующий символ
            if (i + 1 < s.length()) {
                int next = map.get(s.charAt(i + 1));

                // если следующий больше → нужно вычесть
                if (current < next) {
                    sum -= current;
                    continue;
                }
            }

            // иначе прибавить
            sum += current;
        }

        return sum;
    }
}

         */
    }
}
