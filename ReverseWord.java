public class ReverseWord{
    public static void main(String[] args) {
        String str =" Hello Duniya";
        System.out.println(Reverse(str));
    }
    static String Reverse(String str){
        String[] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder();

        
        for(String word : words){
            sb.insert(0,word + " ");
        }
        return sb.toString().trim();
    }
}