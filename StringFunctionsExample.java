public class StringFunctionsExample {
    public static void main(String[] args){
        String str = "Hello world";
        String str2 = "Hello world";

        System.out.println("Original String:"+ str);

        //Length of the string
        System.out.println("lenght:"+ str.length());

        //character at index
        System.out.println("charater at index 1: "+str.charAt(1));
        
        //substring
        System.out.println("String (0,5):"+str.substring(0,5));

        //contains
        System.out.println("Contains 'world': " + str.contains("world"));

        //startswith and endswith
        System.out.println("starts with 'Hello':"+str.startsWith("Hello"));
        System.out.println("ends with 'world':"+str.endsWith("world"));

        //indexof and lastindexof
        System.out.println("index of 'o':"+str.indexOf('o'));
        System.out.println("last index of 'o':"+str.lastIndexOf('o'));

        //replace
        System.out.println("Replace 'l' with 'x': "+str.replace('l','x'));

        //touppercase and lowercase
        System.out.println("To Upper case: "+str.toUpperCase());
        System.out.println("To Lower case: "+str.toLowerCase());

        //equls and equalsIgnoreCase
        System.out.println("Equals str2:"+str.equals(str2));
        System.out.println("Equalsignorecase str2: "+str.equalsIgnoreCase(str2));

        //trim
        String strwithSpace ="    Hello world    ";
        System.out.println("Trimmed:"+strwithSpace.trim()+"'");
 
        //split
        String[] words = str.split(" ");
        System.out.println("Split:");
        for(String word : words) {
            System.out.println(word);
        }
        
        //concat
        System.out.println("concatenated:'"+str.concat("!!!"));

        //isEmpty
        System.out.println("Is Empty: " + str.isEmpty());

        //compareto
        System.out.println("CompareTo 'Hello':"+str.compareTo("Hello"));

        //Master
        System.out.println("Matches regex '.*world' "+str.matches(".*world"));

        //TocharArray
        char[] chars = str.toCharArray();
        System.out.println("Charaters: ");
        for(char c: chars){
            System.out.println(c +" ");
        }   

        //format
        String formatted = String.format("welcome to %s", str);
        System.out.println("\nFormatted string:"+formatted);

        //intern
        String interned = str.intern();
        System.out.println("Interned string: "+interned);

        //repeat
        System.out.println("Repeat 3 times: "+str.repeat(3));
      }
    
}
