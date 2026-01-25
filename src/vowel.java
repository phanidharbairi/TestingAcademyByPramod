import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = sc.next();

        boolean hasVowel = false;

        for(int i=0; i< name.length(); i++){
            char ch = Character.toLowerCase(name.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
                hasVowel = true;
                break;
            }
        }
        if(hasVowel) {
            System.out.println("String contains vowels");
        } else {
            System.out.println("String doesnot contain vowels");
        }
    }
}
