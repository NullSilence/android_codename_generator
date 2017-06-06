package nullsilence.codenamegenerator;

import java.util.Random;

/**
 * Created by Nullsilence on 2017-06-01.
 */

/***
 * Return a random element of an Enum.
 * @param <E> The Enum.
 */
public class RandomEnum<E extends Enum> {

    private static final Random RND = new Random();
    private final E[] values;

    public RandomEnum(Class<E> tkn) {
        values = tkn.getEnumConstants();
    }

    public E random() {
        return values[RND.nextInt(values.length)];
    }
}
