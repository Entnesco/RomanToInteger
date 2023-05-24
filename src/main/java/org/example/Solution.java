package org.example;

class Solution {
    public int romanToInt(String s) {
        int intValue = 0;

        for(int i = s.length()-1; i>=0; i--)
        {
            if(i == 0){
                if(s.charAt(i)=='I') intValue++;
                else if(s.charAt(i)=='V') intValue += 5;
                else if(s.charAt(i)=='X') intValue += 10;
                else if(s.charAt(i)=='L') intValue += 50;
                else if(s.charAt(i)=='C') intValue += 100;
                else if(s.charAt(i)=='D') intValue += 500;
                else if(s.charAt(i)=='M') intValue += 1000;
                break;
            }

            if(s.charAt(i) == 'I') {
                intValue++;
            }
            else if(s.charAt(i) == 'V') {
                if (s.charAt(i - 1) == 'I') {
                    intValue += 4;
                    i--;
                } else intValue += 5;
            }
            else if(s.charAt(i) == 'X') {
                if(s.charAt(i-1) == 'I') {
                    intValue +=9;
                    i--;
                }
                else intValue +=10;
            }
            else if(s.charAt(i) == 'L') {
                if(s.charAt(i-1) == 'X') {
                    intValue +=40;
                    i--;
                }
                else intValue +=50;
            }
            else if(s.charAt(i) == 'C') {
                if(s.charAt(i-1) == 'X') {
                    intValue +=90;
                    i--;
                }
                else intValue +=100;
            }
            else if(s.charAt(i) == 'D') {
                if(s.charAt(i-1) == 'C') {
                    intValue +=400;
                    i--;
                }
                else intValue +=500;
            }
            else if(s.charAt(i) == 'M') {
                if(s.charAt(i-1) == 'C') {
                    intValue +=900;
                    i--;
                }
                else intValue +=1000;
            }
        }

        return intValue;
    }
}
