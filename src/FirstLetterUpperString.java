
public class FirstLetterUpperString {

	public static void main(String[] args) {
        // create a string
        String str = "this is java code";
        String words[]=str.split("\\s");
        String capitalizeStr="";
 
        for(String word:words){
            // Capitalize first letter
            String firstLetter=word.substring(0,1);
            // Get remaining letter
            String remainingLetters=word.substring(1);
            capitalizeStr+=firstLetter.toUpperCase()+remainingLetters+" ";
        }
        System.out.println(capitalizeStr);
    }


}
