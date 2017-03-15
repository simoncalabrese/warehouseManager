package commons.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Arrays;
import java.util.function.Function;

/**
 * Created by simon on 04/03/17.
 */
public class StringUtils {
    public static Boolean isNotEmpty(final String value) {
        return value != null && !value.isEmpty();
    }

    public static Boolean isNotEmpty(final String... values) {
        return Arrays.stream(values).filter(StringUtils::isNotEmpty).count() == values.length;
    }

    /**
     * Se B è stringa va convertita in Localdate altrimenti in String
     *
     * @param toConvert
     * @param <A>
     * @param <B>
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <A, B> B localDateToString(final A toConvert) {

        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        B toReturn = null;
        if (toConvert.getClass().isAssignableFrom(LocalDate.class)) {
            toReturn = (B) formatter.format((TemporalAccessor) toConvert);
        } else if (toConvert.getClass().isAssignableFrom(String.class)) {
            toReturn = (B) formatter.parse((CharSequence) toConvert);
        }

        return toReturn;
    }


}
