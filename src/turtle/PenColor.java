/* Copyright (c) 2021 oasomefun@futa.edu.ng. All Rights Reserved.
 * Redistribution of original or derived work requires permission.
 * Credits: MIT
 */
package turtle;

/**
 * Enumeration of turtle pen colors.
 * 
 * You may not modify this enumeration.
 */
public enum PenColor {
    BLACK,
    GRAY,
    RED,
    PINK,
    ORANGE,
    YELLOW,
    GREEN,
    CYAN,
    BLUE,
    MAGENTA;

    public static PenColor byIndex(int index) {
        for (PenColor m : PenColor.values()) {
            if (m.ordinal() == index) {
                return m;
            }
        }
        return null;
    }
}
