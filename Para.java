public class Para {
    public String removeOuterParanthesis(String s){
        StringBuilder ans = new StringBuilder();
        int depth = 0;
        for(char ch: s.toCharArray()){
            if(ch == '('){
                if(depth>0) ans.append(ch);
                depth++;
            }else{
                depth--;
                if(depth>0){
                    ans.append(ch);
                }
            }
        }
            return ans.toString();
    }

    public static void main(String[] args) {
//        String s = "(()())(())";
        String s = "(()())(())(()(()))";
        Para p = new Para();
        String m = p.removeOuterParanthesis(s);
        System.out.println(m);
    }
}
