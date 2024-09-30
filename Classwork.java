public class Classwork
{
  public static void main(String[] args)
  {
    System.out.println(firstLastN("dictionary", 3));

    System.out.println(delEnd("library", 5));

    System.out.println(compareLower("animal", "fanimal"));

  // l i b r a r y
  // 0 1 2 3 4 5 6 7
  }

  // write solutions to problems below
  public static String firstLastN(String word, int n)
  {
    // word = dictionary
    // n = 3
    //dicary
    String output = new String();

    // Getting the first n letters
    String firstN = word.substring(0, n); //first n letters; substring from 0 to n-1
    
    // Getting the last n letters
    int indexOfNToLast = word.length() - n; // index of the nth to last letter
    String lastN = word.substring(indexOfNToLast);
    
    output = firstN + lastN;
    return output;
  }

  // DelEnd
  public static String delEnd(String word, int n)
  {
    String output = new String();

    int stop = word.length() - n;
    // l i b r a r y
    // 0 1 2 3 4 5 6 7

    String first = word.substring(0, stop);
    output = first;
    return output;
  }

  public static int compareLower(String word1, String word2)
  {
    word1 = word1.toLowerCase();
    word2 = word2.toLowerCase();
    return word1.compareTo(word2);
  }
}