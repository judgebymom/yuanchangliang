package cn.ycl.base;
class Test {
    public static int strStr(String haystack, String needle) {
        if(needle.equals("") && haystack.equals("")) {
            return 0;
        }
        if(needle.equals("")) {
            return 0;
        }
        if(haystack.equals("") ) {
            return -1;
        }
        if(haystack.length()==needle.length()) {
            return 0;
        }

        // if(haystack.length()<=needle.length()) return 0;
        int result=-1;
        for (int i = 0; i < haystack.length()-needle.length()+1; i++) {
            if(haystack.substring(i,i+needle.length()).equals(needle))  {
                result=i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("hello".substring(2,4));
        System.out.println(strStr("hello","ll"));
    }
}
