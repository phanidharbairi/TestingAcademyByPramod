package ex_Strings;

import java.sql.SQLOutput;

public class pr1_String_functions {
    public static void main(String[] args) {
        String firstName = "Suhan";
        String lastName =  "Pinnela";

        String splitName[] = firstName.split("h");

        StringBuffer name1 = new StringBuffer("Phanidhar");
        StringBuffer name2 = new StringBuffer("Bairi");

        System.out.println(firstName.startsWith("S"));
        System.out.println(lastName.startsWith("P"));

        System.out.println(firstName.substring(0,4));
        System.out.println(firstName.concat(lastName));

        System.out.println(name1.append(name2));
        System.out.println(splitName[1]);

    }
}
