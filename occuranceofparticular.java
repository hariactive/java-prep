public class occuranceofparticular {
    public static void main(String[] args) {
        String str ="sachinkumarsasds";
        char target ='a';
        System.out.println(Occurance(str, target));
    }
    static int Occurance (String str, char target){
        int count =0;
        for(int i= 0;i<str.length();i++){
            if(str.charAt(i) == target)
            count++;
        } 
        return count;
    }
}
