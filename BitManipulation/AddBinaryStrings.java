// Given two binary strings A and B. Return their sum (also a binary string).

package BitManipulation;

public class AddBinaryStrings {

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println(addStrings(a, b));
    }

    private static String addStrings(String a, String b){
        int length = Math.max(a.length(), b.length());

        // make both strings of equal size by appending 0s to string with shorter length
        int lengthDiff = Math.max(a.length(), b.length()) - Math.min(a.length(), b.length());

        StringBuilder zeros = new StringBuilder();

        for(int i=0; i<lengthDiff; i++){
            zeros.append("0");
        }

        if(a.length()<b.length()){
            a = zeros.toString() + a;
        }
        else{
            b = zeros.toString() + b;
        }

        // logic to create result string based on character value at index i from right to left
        int carry = 0;
        StringBuilder result = new StringBuilder();

        for(int i=length-1; i>=0; i--){
            int operand1 = a.charAt(i) - '0';
            int operand2 = b.charAt(i) - '0';

            int sum = operand1 + operand2 + carry;

            switch (sum) {
                case 0:
                    result.append('0');
                    carry = 0;
                    break;
                case 1:
                    result.append('1');
                    carry = 0;
                    break;
                case 2:
                    result.append('0');
                    carry = 1;
                    break;
                case 3:
                    result.append('1');
                    carry = 1;
                    break;
            }
        }

        // if carry value is 1 we need to append 1 to the result
        if(carry!=0){
            result.append('1');
        }

        // reverse the result since it is generated in opposite order
        return result.reverse().toString();
    }
    
}
