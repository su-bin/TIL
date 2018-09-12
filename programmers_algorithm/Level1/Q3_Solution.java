import java.util.*;

public class Solution {
	public int[] solution(int []arr) {
        int[] answer;
        int count = 1;
        
        for(int i = 1; i < arr.length; i++) {
            if( arr[i] != arr[i-1]) {
                count++;
            }
        }
        
        answer = new int[count];
        answer[0] = arr[0];
        count = 1;
        for(int i = 1; i < arr.length; i++) {
            if( arr[i] != arr[i-1]) {
                answer[count++] = arr[i];
            }
        }
        
        return answer;
	}
}