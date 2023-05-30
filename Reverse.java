public class Reverse {
    public static void main(String[] args) {
        String str ="hello sir";
        System.out.println(reverse(str));
    }
    static String reverse(String str){
        char[] arr = str.toCharArray();
        int start =0;
        int end = str.length()-1;
        while(start < end ){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] =temp;
            start ++;
            end -- ;
        }
        return String.valueOf(arr);
    }
    
}
