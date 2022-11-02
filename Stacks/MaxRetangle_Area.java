import java.util.*;
public class MaxRetangle_Area {

    public static void maxArea(int arr[]) {// O(n) - optimized
        int maxArea = 0;
        int nsr[] = new int[arr.length];//next samallest right = nsr
        int nsl[] = new int [arr.length]; //next samallest right = nsl

        //Next smaller right O(n)
        Stack<Integer> s = new Stack<>();

        for(int i=arr.length-1; i>=0; i--) {//yaha right ki baat hori h isslie right to left jaaege
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }


        //next smaller left O(n)
        s = new Stack<>();//is line se jo stack already bna hua he bus mujhe usse khali krna h

        for(int i=0; i<arr.length; i++) {//yaha right ki baat hori h isslie right to left jaaege
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        //current area : width = j-i-1 = nsr[i] -nsl[i] -1

        for(int i=0; i<arr.length; i++) {// O(n)
            int height = arr[i];
            int width = nsr[i] - nsl[i] -1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }
        System.out.println("max area in histogram = " + maxArea);
    }
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 2, 3}; //heights in histogram
        maxArea(arr);
        
    }
}
