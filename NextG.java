import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class NextG {
    public static ArrayList<Integer> nextLargerElement(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        int n = arr.length;

        for(int i = n-1; i>=0; i--){
            if(st.size()==0){
                list.add(-1);
            }else if(st.size()>0 && st.peek()>arr[i]){
                list.add(st.peek());
            }else if(st.size()>0 && st.peek()<=arr[i]){
                while (st.size()>0 && st.peek()<=arr[i]){
                    st.pop();
                }
                if(st.size()==0){
                    list.add(-1);
                }else {
                    list.add(st.peek());
                }
            }
            st.push(arr[i]);
        }
//        Collections.reverse(list);
        int left = 0;
        int right = list.size()-1;
        while (left<right){
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        System.out.println(nextLargerElement(arr));
    }
}
