class LongestSubStringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
//         Set to store unique characters in that particular range.
        Set<Character> characters = new HashSet<>();
//         Intializing two pointers left and right to keept track of indexes.
        int l = 0, r = 0;
//         Variablet o store the longest length;
        int longest = 0;
//         Iterating the string length by using two pointers.
        while(r <= s.length() - 1){
//             First we are going to check whether set the set the character that we are having.
            if(characters.contains(s.charAt(r))){
//                 If it contians then we remove the characters so that the set doesn't contain duplicates.
                characters.remove(s.charAt(l));
                // incrementing left pointer
                l++;
            }else{
//                 obtaining the longest index
                longest = Math.max(longest, r - l + 1);
//              Adding the character to the set.
                characters.add(s.charAt(r));
//                 Incrementing the right pointer.
                r++;
            }
        }
//         returning the largest.
        return longest;
    }
}