public class Stringname {
   public static void main(String[] args) {
    String FirstName = "yuva";
        String LastName = "Raja";
        String FinalName = FirstName.concat(LastName);
        System.out.println("Concatenated String: " + FinalName);
        String UpperCase = FinalName.toUpperCase();
        System.out.println("Uppercase String: " +UpperCase)

         String Sentence="This program shows how can we split a string into multiple strings";
        String[] words = Sentence.split(" "); 
        for (String word : words) {
            System.out.println(word);
        }
        
       
        System.out.println(words.length);

        
    

 
   }
}
