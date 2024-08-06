package com.i2it.ems.util;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * <p>
 * This class responsible for validate the name and date of birth.
 * </p>
 */
public class Validator {
    /**
     * <p>
     * This method handle the String validation
     * </p>
     * 
     * @param name 
     *     -  accept the string value
     * @return bolean 
     *     - given string is match the condition return true else false
     */
    public static boolean stringValidate(String name) {
        String regex = "^[a-zA-Z]+([ ][a-zA-Z]+)*$";
        if (Pattern.matches(regex, name)) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * <p>
     * This method handle the Date of birth validation
     * </p>
     * 
     * @param dob 
     *     -  accept the string value
     * @return bolean 
     *     - given string is match the pattern return true else false
     */
    public static boolean dobValidate(String dob) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(dob, dateFormatter);
        return true;
    }
}