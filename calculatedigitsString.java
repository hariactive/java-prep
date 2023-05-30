import javax.xml.crypto.dsig.DigestMethod;

public class calculatedigitsString {
    public static void main(String[] args) {
        String str="hello1m23m5646m6ffffffa";
        System.out.println(count(str));
    }
    static int count(String str){
        int digitcount =0;
        for(int i =0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                digitcount++;
            }
        }
        return digitcount;
    }
    
}
