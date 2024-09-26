package MyPackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	public static void main(String args[]){  
		//1st way  
		Pattern p = Pattern.compile(".s");//. represents single character  
		Matcher m = p.matcher("as");  
		boolean b = m.matches();  
		  
		//2nd way  
		boolean b2=Pattern.compile(".s").matcher("as").matches();  
		  
		//3rd way  
		boolean b3 = Pattern.matches(".s", "as");  
		  
		System.out.println(b+" "+b2+" "+b3); 
		
		
		System.out.println(Pattern.matches(".s", "as"));//true (2nd char is s)  
		System.out.println(Pattern.matches(".s", "mk"));//false (2nd char is not s)  
		System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char)  
		System.out.println(Pattern.matches(".s", "amms"));//false (has more than 2 char)  
		System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s)  
		
		
		
//		// Example 1: [abc]
//        String regex1 = "[abc]";
//        testRegex("Example 1: [abc]", regex1, "apple", "banana", "cherry","abc","a");
//
//        // Example 2: [^abc]
//        String regex2 = "[^abc]";
//        testRegex("Example 2: [^abc]", regex2, "apple", "banana", "cherry","hi","k");
//
//        // Example 3: [a-zA-Z]
//        String regex3 = "[a-zA-Z]";
//        testRegex("Example 3: [a-zA-Z]", regex3, "apple", "123", "!@#","l","hi");
//
//        // Example 4: [a-d[m-p]](union)
//        String regex4 = "[a-d[m-p]]";
//        testRegex("Example 4: [a-d[m-p]]", regex4, "apple", "cat", "dog", "mango","a","ab","m");
//
//        // Example 5: [a-z&&[def]](intersection)
//        String regex5 = "[a-z&&[def]]";
//        testRegex("Example 5: [a-z&&[def]]", regex5, "apple", "dog", "frog", "zebra","a","f");
//
//        // Example 6: [a-z&&[^bc]]
//        String regex6 = "[a-z&&[^bc]]";
//        testRegex("Example 6: [a-z&&[^bc]]", regex6, "apple", "banana", "cherry","b","a");
//
//        // Example 7: [a-z&&[^m-p]]
//        String regex7 = "[a-z&&[^m-p]]";
//        testRegex("Example 7: [a-z&&[^m-p]]", regex7, "apple", "mango", "pear", "zebra","o","z");
    
        
//        // Example 1: X?
//        String regex1 = "colou?r";
//        testRegex("Example 1: X?", regex1, "color", "colour","colo");
//
//        // Example 2: X+
//        String regex2 = "go+d";
//        testRegex("Example 2: X+", regex2, "god","godd", "good", "gooooood");
//
//        // Example 3: X*
//        String regex3 = "A*B*C*";
//        testRegex("Example 3: X*", regex3, "BC", "ABC", "AABBCCCC");
//
//        // Example 4: X{n}
//        String regex4 = "\\d{3}";
//        testRegex("Example 4: X{n}", regex4, "123", "456", "7890","abc");
//
//        // Example 5: X{n,}
//        String regex5 = "\\w{2,}";
//        testRegex("Example 5: X{n,}", regex5, "ab", "xyz", "12345","1");
//
//        // Example 6: X{y,z}
//        String regex6 = "\\d{2,4}";
//        testRegex("Example 6: X{y,z}", regex6, "1","12", "123", "1234", "12345");
  
		
		  // Example 1: Any character (may or may not match terminator)
        String regex1 = "a.b";
        testRegex("Example 1: Any character", regex1, "axb",
        		"abc","acb", "ab","a b","a+b","a.b","abb","a\nb");

        // Example 2: Any digit, short of [0-9]
        String regex2 = "\\d";
        testRegex("Example 2: Any digit", regex2, "123", "abc" ,"1","a");

        // Example 3: Any non-digit, short for [^0-9]
        String regex3 = "\\D";
        testRegex("Example 3: Any non-digit", regex3, "123", "abc","1","a");

        // Example 4: Any whitespace character, short for [\t\n\x0B\f\r]
        String regex4 = "\\s";
        testRegex("Example 4: Any whitespace character", regex4," ", "word space",
        		"wordspace", "tab\tnewline\n");

        // Example 5: Any non-whitespace character, short for [^\s]
        String regex5 = "\\S";
        testRegex("Example 5: Any non-whitespace character", regex5,"w","wordspace", 
        		"word space", "tab\tnewline\n");

        // Example 6: Any word character, short for [a-zA-Z_0-9]
        String regex6 = "\\w";
        testRegex("Example 6: Any word character", regex6, "abc_123","1","a","ab", "!@#");

        // Example 7: Any non-word character, short for [^\w]
        String regex7 = "\\W";
        testRegex("Example 7: Any non-word character", regex7, "abc_123","1","a","-", "!@#");

        // Example 8: A word boundary
        String regex8 = "\\bword\\b";
        testRegex("Example 8: A word boundary", regex8, "word",
        		"wor","helo", "words", "wording");

        // Example 9: A non-word boundary
        String regex9 = "\\Bword\\B";
        testRegex("Example 9: A non-word boundary", regex9,"word",
        		"This is a keyword in a sentence.","Hello word! hi",
        		"hword!"," ","","a","w", "words", "wording");
   	}

    private static void testRegex(String example, String regex, String... testStrings) {
        Pattern pattern = Pattern.compile(regex);

        System.out.println("\n" + example);
        for (String testString : testStrings) {
            Matcher matcher = pattern.matcher(testString);
            System.out.println(testString + " matches: " + matcher.matches());
        }
    }

//    private static void testRegex(String example, String regex, String... testStrings) {
//        Pattern pattern = Pattern.compile(regex);
//
//        System.out.println("\n" + example);
//        for (String testString : testStrings) {
//            Matcher matcher = pattern.matcher(testString);
//            System.out.println(testString + " matches: " + matcher.matches());
//        }
//   }		
		
		
		
		
		

}
