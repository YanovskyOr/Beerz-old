package com.ory.beerz;




import android.graphics.Color;

import java.util.HashMap;

/**
 * Created by OrY on 24/10/2016.
 */

public final class Constants {


    public Constants() {
    }

    // Colors definitions
    private static final int paleAle = 0xffe94e;
    private static final int lager = 0xf4cc2e;
    private static final int pilsner = 0xf5a238;
    private static final int wheatBeer = 0xdc8234;
    private static final int goldenAle = 0xe45e2b;
    private static final int darkAle = 0x761618;
    private static final int porter = 0x601711;
    private static final int stout = 0x541800;
    private static final int imperialStout = 0x070707;

    // Colors map of name and color
    private static HashMap<String, Integer> colorMap = new HashMap<String, Integer>();
    static {
        colorMap.put("pale_ale", paleAle);
        colorMap.put("lager", lager);
        colorMap.put("pilsner", pilsner);
        colorMap.put("wheat_Beer", wheatBeer);
        colorMap.put("golden_ale", goldenAle);
        colorMap.put("dark_ale", darkAle);
        colorMap.put("porter", porter);
        colorMap.put("stout", stout);
        colorMap.put("imperial_stout", imperialStout);
    }

    //Color getter name -> color
    public static Integer getColorByName(final String colorName) {
        return colorMap.get(colorName);
    }

}
