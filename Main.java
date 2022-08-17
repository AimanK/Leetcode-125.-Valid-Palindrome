class Main {
  public static void main(String[] args) {
   /**
    A phrase is a palindrome if, after converting all uppercase letters into          
    lowercase letters and removing all non-alphanumeric characters, it reads the       
    same forward and backward. Alphanumeric characters include letters and numbers.


    Given a string s, return true if it is a palindrome, or false otherwise.

    Ex:
      Input: s = "A man, a plan, a canal: Panama"
      Output: true
      Explanation: "amanaplanacanalpanama" is a palindrome.

   **/


    String s = "A man, a plan, a canal: Panama";

    System.out.println(isPalindrome(s));

    /**

      SOLUTION:

      - First, create two pointers, i and j, set to 0 and the end of the string respecively, to take advantage of the two pointer approach.
      - Initiate a while loop (i < j)
      - Within the loop, set two class Character variables, start and end, that are set to i and j.
      - within the loop, set an if statement that if start is not a letter or digit, increment i. Under that, include a continue statement. (!Character.isLetterOrDigit(start)) is the proper syntax.
      - Within the loop, set an if statement that if end is not a letter or digit, decrement j. Under that, include a continue statement. (!Character.isLetterOrDigit(end)) is the proper syntax.
      - Within the loop, set an if statement that if the characters at start and end are both lowercase but not equal, return false. (Character.toLowerCase(start)) for example, is the proper syntax.
      - Within the loop, yet at the bottom, increment i, and decrement j, respectively.
      - Outside of the loop, and at the end of the program, return true;
    **/
    
  }


   public static boolean isPalindrome(String s) {
        
        int i = 0;
        int j = s.length() - 1;
        
        while (i < j)
        {
            Character start = s.charAt(i);
            Character end = s.charAt(j);
            
            if (!Character.isLetterOrDigit(start))
            {
                
                i++;
                continue;
            }
            
            
            if (!Character.isLetterOrDigit(end))
            {
                
                j--;
                continue;
            }
            
            
            if (Character.toLowerCase(start) != Character.toLowerCase(end))
            {
                return false;
            }
            
            i++;
            j--;
        }
        
        return true;
    }
}
