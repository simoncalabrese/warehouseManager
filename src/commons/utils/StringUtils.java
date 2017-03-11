package commons.utils;

import java.util.Arrays;

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
}
