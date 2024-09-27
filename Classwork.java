public class Classwork
{
  public static void main(String[] args)
  {
    System.out.println(firstLastN("dictionary", 3));
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




//DelEnd
public static void main(String[] args)
{
  System.out.println(delEnd("library", 5))
}

public static String delEnd(String word, int n)
{
  String output = new String();

  String first
}
}
