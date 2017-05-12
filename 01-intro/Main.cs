delegate int IntThunk();
class M {
    public static void Main() {
        IntThunk[] funcs = new IntThunk[11];
        for (int i = 0; i <= 10; i++) {
            funcs[i] = delegate() { return i; };
        }
        foreach (IntThunk f in funcs) {
            System.Console.WriteLine(f());
        }
    }
}
