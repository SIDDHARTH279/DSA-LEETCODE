class Solution {
    public String reverseWords(String s) {

        String res = "";
        String ans = "";
        for(int i = 0; i < s.length(); i++) {
            

            if(s.charAt(i) != ' '){
                ans += s.charAt(i);
            }
            else {
                res += reverse(ans);
                res += ' ';
                ans = "";
            }
        } 
        res += reverse(ans);


        return res;
    }

    private String reverse(String r) {

        String z = "";

        for(int i = r.length()-1; i >= 0; i--) {
            z += r.charAt(i);
        }

        return z;
    } 
}