package nullsilence.codenamegenerator.Service;

import nullsilence.codenamegenerator.List.Alpha;
import nullsilence.codenamegenerator.List.Bravo;
import nullsilence.codenamegenerator.RandomEnum;

/**
 * Created by Nullsilence on 2017-06-01.
 */

/***
 * Get 2 words from the enum Alpha and Bravo ant put them into a String.
 */
public class RandomEnumService
{
    private String codename;
    private String first ="";
    private String second ="";

    //Generate 2 randoms words.
    private static final RandomEnum<Alpha> r1 = new RandomEnum<Alpha>(Alpha.class);
    private static final RandomEnum<Bravo> r2 = new RandomEnum<Bravo>(Bravo.class);

    /***
     * Put the random text into String.
     */
    public RandomEnumService()
    {
        first = r1.random().toString();
        second = r2.random().toString();
        codename = first + " " + second;
    }

    /***
     *Make it easy to get the codename in a TextView.
     * @return A complete codename.
     */
    @Override
    public String toString() {
        return codename.toString();
    }
}
