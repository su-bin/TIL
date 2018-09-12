class Solution {
  public String solution(String s) {
      String answer = "";
      
      for(int i = 0; i < s.length(); i++) {
          String str = s.charAt(i) + "";
          if(i == 0) {
              answer += str.toUpperCase();
          } else if(s.charAt(i-1) == 32) {
              answer += str.toUpperCase();
          } else {
              answer += str.toLowerCase();
          }
      }
      
      return answer;
  }
}