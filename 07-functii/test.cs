class P {
    public static void Main() {
        int i = 7 ;
        System.Console.WriteLine(i);
        {
          System.Console.WriteLine(i);
          int i = 13 ;
          System.Console.WriteLine(i);
        }
        System.Console.WriteLine(i);
    }
}