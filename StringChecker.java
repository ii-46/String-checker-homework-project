package Inthava;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class StringChecke {
    public static boolean isOperator(String operator) {
        if ( operator.length() > 1 || operator.length() < 1) {
            return false;
        } else {
            if ( operator == "+" || operator == "-" || operator == "*" || operator == "/" || operator == "%" ) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static boolean isSymbol(String symbol) {
        if ( symbol.length() > 1 || symbol.length() < 1) {
            return false;
        } else {
            Pattern p = Pattern.compile( "[^a-z0-9 ]", Pattern.CASE_INSENSITIVE );
            Matcher m = p.matcher( symbol );
            boolean check = m.find();
            if ( check ) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static boolean isLowerCase(String text) {
        if ( text.length() > 1 || text.length() < 1) {
            return false;
        } else {
            char charText = text.charAt( 0 );
            if ( java.lang.Character.isLowerCase( charText ) ) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static boolean isDecimal(String num) {
            if ( num.contains( "." ) || num.contains( "," ) ) {
                return true;
            } else {
                return false;
            }
    }
    public static boolean isSpace(String text) {
        if ( text.length() > 1 || text.length() < 1) {
            return false;
        } else {
            char charText = text.charAt( 0 );
            if ( java.lang.Character.isWhitespace( charText ) ) {
                return true;
            } else {
                return false;
            }
        }
    }

}
