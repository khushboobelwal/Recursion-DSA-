class Solution {
    int Palindrome(String S) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Character> second = new ArrayList<>();
        for(int i=S.length()-1; i>=0; i--){
            second.add(S.charAt(i));
        }
        int j=0;
        for(Character s: second){
            sb.append(s);
        }
        if(S.contains(sb.toString())){
            return 1;
        }
        else {
            return 0;
        }
    }
};
