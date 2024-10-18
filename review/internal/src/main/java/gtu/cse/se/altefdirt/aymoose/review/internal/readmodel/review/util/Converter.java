package gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.util;

public class Converter {
    
    private final class Pattern {
        static String RATING = "^[0-5]{1}(.[0-9])?$";
    }

    public static short convertRating(String rating, boolean roundUp) {
        
        if (!rating.matches(Pattern.RATING)) {
            throw new IllegalArgumentException("Rating must be in the format of x.x");
        }
        if(roundUp) {
            return (short) Math.ceil(Double.parseDouble(rating));
        }
        return (short) Math.floor(Double.parseDouble(rating));
    }
}
