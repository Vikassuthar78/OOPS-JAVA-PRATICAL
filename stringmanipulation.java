public class stringmanipulation{
}

// 1. Character Length & charAt
class CharLength {
    public static void main(String[] args) {
        String s = "java programs";
        System.out.println("charAt(2): " + s.charAt(2));  
        System.out.println("length(): " + s.length());    
    }
}

// 2. Substring & Extraction
class SubstringExample {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(s.substring(5));         
        System.out.println(s.substring(2, 7));       
    }
}

//3. Search & index
class SearchIndex 
{
 public static void main(String[] args) {
 String s = "Hello_world";
        System.out.println(s.indexOf("_"));        
        System.out.println(s.lastIndexOf("or"));    
        System.out.println(s.contains("ll"));      
    
        
 }
}

//4. case conversion
class CaseConversion {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(s.toUpperCase());  
        System.out.println(s.toLowerCase());  
    }
}

// 5. trimming &whitespace
class TrimWhitespace{
    public static void main(String[] args){
        String s = "   Hello    ";
        System.out.println("["+s.trim()+"]");

    }
}

// 6. replace & modify
class ReplaceModify{
    public static void main(String[] args){
        String s = "ababab";
        System.out.println(s.replace('a','x'));
        System.out.println(s.replace("ab","xy"));
        System.out.println(s.replaceAll("a.","z"));
        System.out.println(s.replaceFirst("ab","xy"));

    }
}

// 7. Comparison
class StringComparison {
    public static void main(String[] args) {
        String a = "Java";
        String b = "java";
        System.out.println(a.equals(b));             
        System.out.println(a.equalsIgnoreCase(b));   
        System.out.println(a.compareTo(b));          
    }
}


// 8. Creation & Joining
class StringJoinExample {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";
        System.out.println(a.concat(" ").concat(b));  // Hello World
        String joined = String.join("-", "A", "B", "C");
        System.out.println(joined);  // A-B-C
    }
}

// 9. Conversion
class ConversionExample {
    public static void main(String[] args) {
        String s = "Java";
        char[] chars = s.toCharArray();
        for (char c : chars) System.out.print(c + " ");
        System.out.println();
        byte[] bytes = s.getBytes();
        for (byte b : bytes) System.out.print(b + " ");
    }
}


// 10. Using StringBuilder
class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, " Java");
        sb.delete(0, 5);
        sb.replace(0, 4, "Hi");
        sb.reverse();
        System.out.println(sb);  // Output varies
    }
}

class ConcatenateStrings {
    public static void main(String[] args) {
        String first = "Hello";
        String second = "World";
        String result = first + " " + second;
        System.out.println("Concatenated: " + result);
    }
}

class SbstringExample{
    public static void main(String[] args){
        String s1 = "JavaProgramming";
        String sub = s1.substring(4,11);
        System.out.println("Substring:"+sub);
    }
}

class ReplaceExample {
    public static void main(String[] args) {
        String sentence = "I like C";
        String newSentence = sentence.replace("C", "java");
        System.out.println("After Replace: " + newSentence);
    }
}

class SplitExample {
    public static void main(String[] args) {
        String s = "apple,banana,grape,orange";
        String[] fruits = s.split(",");
        for(String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

class TrimExample {
    public static void main(String[] args) {
        String raw = "   Welcome to Java!   ";
        System.out.println("Before Trim: [" + raw + "]");
        System.out.println("After Trim: [" + raw.trim() + "]");
    }
}

