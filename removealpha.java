public public class RemoveNonAlphabets {
    public static void main(String[] args) {
        String str = "Hello!123, How are you?";

        String result = removeNonAlphabets(str);
        
        System.out.println("String after removing non-alphabetic characters: " + result);
    }

    public static String removeNonAlphabets(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}{

}
