public class Main
{
  public static int maxNumber (int Num)
  {
    int mod = 0;
    int highestNum = 0;
    while (Num > 0)
      {
	mod = Num % 10;
	highestNum = Math.max(highestNum, mod);
	Num = Num / 10;
      }
    return highestNum;
  }

public static void main (String[] args)
{
  int input = 34697;
  int output = maxNumber(input);
  System.out.print("Minimum Digit in Input is "+output);
}
}
