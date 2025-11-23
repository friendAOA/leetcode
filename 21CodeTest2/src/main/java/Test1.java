import java.util.Scanner;

/**
 * @Author: 昊辰（汪程昊）
 * @Date : 2021/11/6
 * @Description :
 * @Modified By : Copyright(c) cai-inc.com
 */
public class Test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //...
        System.out.println("result:" );
    }

    /**
     * 获取字符串s在字符串str的位置，条件：字符串s必定出现在字符串String中
     * @param
     * @return
     */
    private static int indexOf(String str,String s){
       return str.indexOf(s);
    }
    /**
     * 字符串大写
     * @param str
     * "hello" --> "HELLO"
     * " hello " --> " HELLO "
     * @return
     */
    private String toUpperCase(String str){
        if (isEmpty(str)) {
            return str;
        }
        str.trim();
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                ch[i] = (char) (ch[i] - 32);
            }
        }


        return new String(ch);
    }


    /**
     * 正确英文短语首字母大写
     * @param str
     * "my name is xxx" --> "My Name Is Xxx"
     * "  hello,every one!   " --> "Hello,Every One!"
     * "  hello,every one!my name is xxx " --> "Hello,Every One!My Name Is Xxx"
     * @return
     */

    private String toFirstUpperCase(String str){
        if (isEmpty(str)) {
            return str;
        }
        str.trim();
//        char[] ch = str.toCharArray();
//        ch[0] = (char) (ch[0] - 32);
//        for (int i = 0; i < ch.length; i++){
//            //正则表达式
//            if (ch[i]==' '||ch[i]==','||ch[i]=='!'||ch[i]=='?'){
//                ch[i+1] = (char) (ch[i+1] - 32);
//            }
//        }
//        return new String(ch);
        StringBuffer stringBuffer=new StringBuffer();
        String[] array = str.split(" ");
        for (int i = 0; i < array.length; i++) {
            char[] chars = array[i].toCharArray();
            chars[0] = (char) (chars[0] - 32);
            array[i]=new String(chars);
            stringBuffer.append(array+" ");
        }
        return stringBuffer.toString().trim();

    }


    private Boolean isEmpty(String str){
        if (str==null || str.equals("")){
            return true;
        }
        return false;
    }
}
