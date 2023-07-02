public class Chapter_2_Practise_Programs {
    public static void main(String[] args) {
        // 1.what will be result of
        float a = 7 / 4 * 9 / 2;
        System.out.println(a);
        // Ans. by rules of presedence and associativity, the answer would be:4.0

        // 2.Write a Java program to encrypt a grade by adding 8 to it and then decrypt
        // it
        char ch = 'A';
        char encrypt = (char) (ch + 8);
        System.out.println(encrypt);
        char decrypt = (char) (encrypt - 8);
        System.out.println(decrypt);

        // 3.Java program to convert a string to a lowercase
        String chin = "I Am A Chin";
        System.out.println(chin.toLowerCase());

        // 4.Format the following letter using escape sequence
        String letter = "Dear Tommy, I am grateful to you.Thanks!";
        System.out.println("Dear Tommy,\n\tI am grateful to you.\n\tThanks!");
    }
}
