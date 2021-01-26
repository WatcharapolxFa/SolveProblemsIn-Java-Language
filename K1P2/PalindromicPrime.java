import java.util.ArrayList;

public class PalindromicPrime {
    public static void main(String[] args) {
        ArrayList<Integer> palindromicPrime = new ArrayList<>();

        for (int i = 2;; i++) {
            if (palindromicPrime.size() >= 100) {
                break;
            }
            if (isPrime(i)) {
                if (isPalindrome(String.valueOf(i))) {
                    palindromicPrime.add(i);
                }
            }
        }
        for (int i = 1; i <= palindromicPrime.size(); i++) {
            System.out.print(palindromicPrime.get(i - 1) + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }

    }

    public static boolean isPrime(int num) {
        num = Math.abs(num);
        if (num == 2) {
            return true;
        } else if (num % 2 == 0 || num == 1) {
            return false;
        } else {
            for (int i = 3; i <= Math.sqrt(num); i += 2) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean isPalindrome(String fa) {
        int left = 0, right = fa.length() - 1;
        while (left < right) {
            if (fa.charAt(left) != fa.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
