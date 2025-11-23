
public class Palindrome {
    public boolean isPalindrome(int x) {
            String palindrome = String.valueOf(x);
            String palindrome2 = "";
            for (int i = palindrome.length()-1; i >= 0; i--) {
                palindrome2 = palindrome2+palindrome.charAt(i);
                System.out.println(palindrome2);
            }
        if (palindrome.equals(palindrome2)) {
            return true;
        }else  {
            return false;
        }
        }
    }


