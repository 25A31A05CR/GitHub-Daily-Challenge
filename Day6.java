class Day6{
    public static void main(String[] args) {

        String name = "Varun";

        
        System.out.println("Name: " + name);

        
        System.out.println("Length: " + name.length());

        
        System.out.println("Uppercase: " + name.toUpperCase());

        
        System.out.println("Lowercase: " + name.toLowerCase());

        
        String reverse = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }

        System.out.println("Reverse: " + reverse);

      
        if (name.equalsIgnoreCase(reverse)) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }
    }
}