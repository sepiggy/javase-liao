public class IfFloat {

    public static void main( String[] args ) {

        double x = 1 - 9.0 / 10;

        System.out.println( "x = " + x );

        if ( x == 0.1 ) {
            System.out.println( "x is 0.1" );
        } else {
            System.out.println( "x is NOT 0.1" );
        }

        if ( Math.abs( x- 0.1 ) < 0.0000000001 ) {
            System.out.println( "x is 0.1" );
        } else {
            System.out.println( "x is NOT 0.1" );
        }

    }
}
