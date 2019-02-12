package seedu.addressbook.common;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Utility methods
 */
public class Utils {

    /**
     * Returns true if any of the given items are null.
     */
    public static boolean isAnyNull(Object... items) {
        if (items == null) {
            return false;
        }
        for (Object item : items) {
            if (item == null) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns true if every element the given collection are unique by {@link Object#equals(Object)}.
     */
    public static boolean elementsAreUnique(Collection<?> items) {
        final Set<Object> testSet = new HashSet<>();
        for (Object item : items) {
            final boolean itemAlreadyExists = !testSet.add(item); // see Set documentation
            if (itemAlreadyExists) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns a new set of String keywords in all lowercase from a set of String keywords
     */
    public static Set<String> toLowerCaseKeywords(Set<String> keywords) {
        Set<String> lowerCaseKeywords = new HashSet<>();
        for (String keyword : keywords) {
            lowerCaseKeywords.add(keyword.toLowerCase());
        }
        return lowerCaseKeywords;
    }
}
