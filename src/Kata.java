/**
 * Created by melaniejohnson on 8/8/16.
 */
public class Kata {
    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && hour > 20) {
            return true;

        } else if (talking && hour < 7) {
            return true;

        } else {
            return false;
        }
    }

    public boolean makes10(int a, int b) {
        if (a == 10 || b == 10 || a + b == 10) {
            return true;

        } else {
            return false;
        }
    }

    public int sumDouble(int a, int b) {
        if (a != b) {
            return a + b;
        } else {
            return 2 * (a + b);
        }
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (!aSmile == bSmile) {
            return false;
        } else {
            return true;
        }
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {


        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }
    public String describeDay(int day) { //return "What day is it?";

        if (day >= 2 && day < +6) {
            return "it is a weekday";

        } else if (day == 1 || day == 7) {
            return "it is a weekend";

        } else {
            return "it is the 2nd tuesday of next week";
        }
    }

    public int diff21(int n) {
        if (n <= 21) {
            return Math.abs(21 - n);

        } else {
            return 2 * (Math.abs(21 - n));
        }
    }

    public boolean nearHundred(int n) {

        if (Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10) {
            return true;

        } else {
            return false;
        }
    }

    //Given 2 int values, return true if one is negative and one is positive.
//Except if the parameter "negative" is true, then return true only if both are negative.
    public boolean posNeg(int a, int b, boolean negative) {

        if (a < 0 && b > 0 && !negative) {
            return true;

        } else if (a > 0 && b < 0 && !negative) {
            return true;

        } else if (a < 0 && b < 0 && negative) {
            return true;

        } else {
            return false;
        }
    }

    //Given a string, return a new string where "not " has been added to the front.
    // However, if the string already begins with "not", return the string unchanged.
    // Note: use .equals() to compare 2 strings.
    //I STOLE THIS ANSWER OFF coding.bat -- I don't fully understand it
    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }
        return "not " + str;
    }

    //Given a non-empty string and an int n, return a new string where the char at index
    //n has been removed. The value of n will be a valid index of a char in the original
    //string (i.e. n will be in the range 0..str.length()-1 inclusive).
    public String missingChar(String str, int n) {
            String front = str.substring(0, n);
        // Start this substring at n+1 to omit the char.
        // Can also be shortened to just str.substring(n+1)
        // which goes through the end of the string.
            String back = str.substring(n+1, str.length());
            return front + back;
        }

    public String frontBack(String str) {
        if (str.length() <= 1) return str;

        String mid = str.substring(1, str.length()-1);

        // last + mid + first
        return str.charAt(str.length()-1) + mid + str.charAt(0);
    }
//Given a string, we'll say that the front is the first 3 chars of the string.
//If the string length is less than 3, the front is whatever is there. Return
// a new string which is 3 copies of the front.
    //public String front3(String str) {
    //    String front = str.substring(0, 3);
      //  if(str.length() >= 3) {
        //    return front+front+front;
       // }
        //if (str.length() <= 3) {
          //  return str+str+str;
       // } code above worked for some inputs but not all


    public String front3(String str) {
        String front;

        if (str.length() >= 3) {
            front = str.substring(0, 3);
        }
        else {
            front = str;
        }

        return front + front + front;
    }
//// last + mid + last
    public String backAround(String str) {
        String last = str.substring(str.length() - 1);
        return last + str + last;
    }

    public boolean or35(int n) {
        return (n % 3 == 0) || (n % 5 == 0);
    }
}



