public class aaa {
    public String reverseParenttheses(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }
        if (s.length() == 1) {
            return s;
        }
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                int j = i;
                int num = 0;
                for (; j < s.length(); j++) {
                    // 括号多一个
                    if (s.charAt(j) == '(') {
                        num++;
                    }
                    // 括号结束一个
                    if (s.charAt(j) == ')') {
                        num--;
                    }
                    // 必须放在最后
                    if (num == 0) {
                        break;
                    }
                }
                // 递归处理将外层括号剥离后的子字符串
                StringBuffer stringBuffer2 = new StringBuffer(reverseParenttheses(s.substring(i+1, j)));
                // 反转子字符串，并加到父字符串
                for (int k = stringBuffer2.length()-1; k >= 0; k--) {
                    stringBuffer.append(stringBuffer2.charAt(k));
                }
                // 此时i应该往后移动
                i = j;
            }
            else {
                stringBuffer.append(s.charAt(i));
            }
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        aaa main36 = new aaa();
        String s = "(ed(et(oc))el)";
        String s1 = "(u(love)i)";
        System.out.println(main36.reverseParenttheses(s1));
    }






}
