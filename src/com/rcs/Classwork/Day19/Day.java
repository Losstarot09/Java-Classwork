package com.rcs.Classwork.Day19;

public enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public static Day getDayLV(String dayName) {
        switch(dayName.toUpperCase()) {
            case "PIRMDIENA":
                return MONDAY;
            case "OTRDIENA":
                return TUESDAY;
            case "TREŠDIENA":
                return WEDNESDAY;
            case "CETURDIENA":
                return THURSDAY;
            case "PIEKTDIENA":
                return FRIDAY;
            case "SESTDIENA":
                return SATURDAY;
            case "SVETDIENA":
                return SUNDAY;
            default:
                return MONDAY;
        }
    }
}
