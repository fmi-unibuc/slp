class Main {
    interface F<A, B> {          B a(A x);         }
    static <A, B, C> F<A, C> c(final F<A, B> f, final F<B, C> g) {
        return new F<A, C>() { 
            public C a(A x) {  return g.a(f.a(x)); }
        };
    }
    public static void main(String[] args) {
        final Integer a = 2, b = 1;
        F<Integer, Integer> f = new F<Integer, Integer>() { 
            public Integer a(Integer x) { return x + b; } };
        F<Integer, Integer> g = new F<Integer, Integer>() { 
            public Integer a(Integer x) { return a * x; } };
        F<Integer, Integer> h = c( f, g );
        System.out.println(h.a(5));
    }
}
