public class CastingConversao {
    static void main(String[] args) {
        //////////////CASTING: CONVERSAO IMPLICITA//////////////////////////////////
        int x = 10;
        double y = x;
        System.out.printf("""
                          
                            valor inteiro de   x = %d
                            valor flutuante de y = %.2f%n
                           """, x, y);

        /////////////////////CASTING: CONVERSAO EXPLICITO//////////////////////////////////
        double a = 10.5;
        int b = (int) a;
        System.out.printf("""                          
                            valor flutuante de a = %.2f
                            valor inteiro de   b = %d
                           """, a, b);


    }
}
