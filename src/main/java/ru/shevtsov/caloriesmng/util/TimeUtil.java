package ru.shevtsov.caloriesmng.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by dead_rabbit
 * 10.10.2016
 */
public class TimeUtil {
    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public static String toString(LocalDateTime ldt) {
        return ldt == null ? "null" : ldt.format(DATE_TIME_FORMATTER);
    }
}
