/*
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.



Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false


Constraints:

1 <= sentence.length <= 1000
sentence consists of lowercase English letters.
 */
public class Day8PangramAndLowercase {
    public boolean checkIfPangram(String sentence) {
        int arr[]= new int[26];

        for(int i=0;i<sentence.length();i++)
            arr[sentence.charAt(i)-'a']++;

        for(int i=0;i<26;i++)
            if(arr[i]< 1)
                return false;

        return true;
    }
}
