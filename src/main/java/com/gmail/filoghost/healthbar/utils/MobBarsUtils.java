package com.gmail.filoghost.healthbar.utils;

import org.bukkit.configuration.file.FileConfiguration;

public class MobBarsUtils {

    //enforce non-instantiability with a private constructor
    private MobBarsUtils() {
    }

    /*
     *  Used to retrieve the array that contains the health bars from the configs
     */
    public static String[] getDefaultsBars(FileConfiguration config) {

        String[] barArray = new String[21];

        int mobBarStyle = config.getInt("mob-bars.display-style");

        if (mobBarStyle == 2) {
            barArray[0] = "\u00A7c|\u00A77|||||||||||||||||||";
            barArray[1] = "\u00A7c|\u00A77|||||||||||||||||||";
            barArray[2] = "\u00A7c||\u00A77||||||||||||||||||";
            barArray[3] = "\u00A7c|||\u00A77|||||||||||||||||";
            barArray[4] = "\u00A7c||||\u00A77||||||||||||||||";
            barArray[5] = "\u00A7e|||||\u00A77|||||||||||||||";
            barArray[6] = "\u00A7e||||||\u00A77||||||||||||||";
            barArray[7] = "\u00A7e|||||||\u00A77|||||||||||||";
            barArray[8] = "\u00A7e||||||||\u00A77||||||||||||";
            barArray[9] = "\u00A7e|||||||||\u00A77|||||||||||";
            barArray[10] = "\u00A7e||||||||||\u00A77||||||||||";
            barArray[11] = "\u00A7a|||||||||||\u00A77|||||||||";
            barArray[12] = "\u00A7a||||||||||||\u00A77||||||||";
            barArray[13] = "\u00A7a|||||||||||||\u00A77|||||||";
            barArray[14] = "\u00A7a||||||||||||||\u00A77||||||";
            barArray[15] = "\u00A7a|||||||||||||||\u00A77|||||";
            barArray[16] = "\u00A7a||||||||||||||||\u00A77||||";
            barArray[17] = "\u00A7a|||||||||||||||||\u00A77|||";
            barArray[18] = "\u00A7a||||||||||||||||||\u00A77||";
            barArray[19] = "\u00A7a|||||||||||||||||||\u00A77|";
            barArray[20] = "\u00A7a||||||||||||||||||||";
        } else if (mobBarStyle == 3) {
            barArray[0] = "\u00A7c❤\u00A77❤❤❤❤❤❤❤❤❤";
            barArray[1] = "\u00A7c❤\u00A77❤❤❤❤❤❤❤❤❤";
            barArray[2] = "\u00A7c❤\u00A77❤❤❤❤❤❤❤❤❤";
            barArray[3] = "\u00A7c❤❤\u00A77❤❤❤❤❤❤❤❤";
            barArray[4] = "\u00A7c❤❤\u00A77❤❤❤❤❤❤❤❤";
            barArray[5] = "\u00A7e❤❤❤\u00A77❤❤❤❤❤❤❤";
            barArray[6] = "\u00A7e❤❤❤\u00A77❤❤❤❤❤❤❤";
            barArray[7] = "\u00A7e❤❤❤❤\u00A77❤❤❤❤❤❤";
            barArray[8] = "\u00A7e❤❤❤❤\u00A77❤❤❤❤❤❤";
            barArray[9] = "\u00A7e❤❤❤❤❤\u00A77❤❤❤❤❤";
            barArray[10] = "\u00A7e❤❤❤❤❤\u00A77❤❤❤❤❤";
            barArray[11] = "\u00A7a❤❤❤❤❤❤\u00A77❤❤❤❤";
            barArray[12] = "\u00A7a❤❤❤❤❤❤\u00A77❤❤❤❤";
            barArray[13] = "\u00A7a❤❤❤❤❤❤❤\u00A77❤❤❤";
            barArray[14] = "\u00A7a❤❤❤❤❤❤❤\u00A77❤❤❤";
            barArray[15] = "\u00A7a❤❤❤❤❤❤❤❤\u00A77❤❤";
            barArray[16] = "\u00A7a❤❤❤❤❤❤❤❤\u00A77❤❤";
            barArray[17] = "\u00A7a❤❤❤❤❤❤❤❤❤\u00A77❤";
            barArray[18] = "\u00A7a❤❤❤❤❤❤❤❤❤\u00A77❤";
            barArray[19] = "\u00A7a❤❤❤❤❤❤❤❤❤❤";
            barArray[20] = "\u00A7a❤❤❤❤❤❤❤❤❤❤";
        } else if (mobBarStyle == 4) {
            barArray[0] = "\u00A7a▌\u00A78▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌";
            barArray[1] = "\u00A7a▌\u00A78▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌";
            barArray[2] = "\u00A7a▌▌\u00A78▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌";
            barArray[3] = "\u00A7a▌▌▌\u00A78▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌";
            barArray[4] = "\u00A7a▌▌▌▌\u00A78▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌";
            barArray[5] = "\u00A7a▌▌▌▌▌\u00A78▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌";
            barArray[6] = "\u00A7a▌▌▌▌▌▌\u00A78▌▌▌▌▌▌▌▌▌▌▌▌▌▌";
            barArray[7] = "\u00A7a▌▌▌▌▌▌▌\u00A78▌▌▌▌▌▌▌▌▌▌▌▌▌";
            barArray[8] = "\u00A7a▌▌▌▌▌▌▌▌\u00A78▌▌▌▌▌▌▌▌▌▌▌▌";
            barArray[9] = "\u00A7a▌▌▌▌▌▌▌▌▌\u00A78▌▌▌▌▌▌▌▌▌▌▌";
            barArray[10] = "\u00A7a▌▌▌▌▌▌▌▌▌▌\u00A78▌▌▌▌▌▌▌▌▌▌";
            barArray[11] = "\u00A7a▌▌▌▌▌▌▌▌▌▌▌\u00A78▌▌▌▌▌▌▌▌▌";
            barArray[12] = "\u00A7a▌▌▌▌▌▌▌▌▌▌▌▌\u00A78▌▌▌▌▌▌▌▌";
            barArray[13] = "\u00A7a▌▌▌▌▌▌▌▌▌▌▌▌▌\u00A78▌▌▌▌▌▌▌";
            barArray[14] = "\u00A7a▌▌▌▌▌▌▌▌▌▌▌▌▌▌\u00A78▌▌▌▌▌▌";
            barArray[15] = "\u00A7a▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌\u00A78▌▌▌▌▌";
            barArray[16] = "\u00A7a▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌\u00A78▌▌▌▌";
            barArray[17] = "\u00A7a▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌\u00A78▌▌▌";
            barArray[18] = "\u00A7a▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌\u00A78▌▌";
            barArray[19] = "\u00A7a▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌\u00A78▌";
            barArray[20] = "\u00A7a▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌";
        } else if (mobBarStyle == 5) {
            barArray[0] = "\u00A7c█\u00A70█████████";
            barArray[1] = "\u00A7c█\u00A70█████████";
            barArray[2] = "\u00A7c█\u00A70█████████";
            barArray[3] = "\u00A7c██\u00A70████████";
            barArray[4] = "\u00A7c██\u00A70████████";
            barArray[5] = "\u00A7e███\u00A70███████";
            barArray[6] = "\u00A7e███\u00A70███████";
            barArray[7] = "\u00A7e████\u00A70██████";
            barArray[8] = "\u00A7e████\u00A70██████";
            barArray[9] = "\u00A7e█████\u00A70█████";
            barArray[10] = "\u00A7e█████\u00A70█████";
            barArray[11] = "\u00A7a██████\u00A70████";
            barArray[12] = "\u00A7a██████\u00A70████";
            barArray[13] = "\u00A7a███████\u00A70███";
            barArray[14] = "\u00A7a███████\u00A70███";
            barArray[15] = "\u00A7a████████\u00A70██";
            barArray[16] = "\u00A7a████████\u00A70██";
            barArray[17] = "\u00A7a█████████\u00A70█";
            barArray[18] = "\u00A7a█████████\u00A70█";
            barArray[19] = "\u00A7a██████████";
            barArray[20] = "\u00A7a██████████";
        } else {
            //default (1 or anything else)
            barArray[0] = "\u00A7c▌                   ";
            barArray[1] = "\u00A7c▌                   ";
            barArray[2] = "\u00A7c█                  ";
            barArray[3] = "\u00A7c█▌                 ";
            barArray[4] = "\u00A7c██                ";
            barArray[5] = "\u00A7e██▌               ";
            barArray[6] = "\u00A7e███              ";
            barArray[7] = "\u00A7e███▌             ";
            barArray[8] = "\u00A7e████            ";
            barArray[9] = "\u00A7e████▌           ";
            barArray[10] = "\u00A7e█████          ";
            barArray[11] = "\u00A7a█████▌         ";
            barArray[12] = "\u00A7a██████        ";
            barArray[13] = "\u00A7a██████▌       ";
            barArray[14] = "\u00A7a███████      ";
            barArray[15] = "\u00A7a███████▌     ";
            barArray[16] = "\u00A7a████████    ";
            barArray[17] = "\u00A7a████████▌   ";
            barArray[18] = "\u00A7a█████████  ";
            barArray[19] = "\u00A7a█████████▌ ";
            barArray[20] = "\u00A7a██████████";
        }

        return barArray;
    }


    /*
     * Load the bars from a custom file
     */
    public static String[] getCustomBars(FileConfiguration config) {

        String[] barArray = new String[21];

        barArray[0] = "";

        for (int i = 1; i < 21; i++) {

            barArray[i] = "";

            try {

                String cname = config.getString(i * 5 + "-percent-bar");

                if (cname == null) cname = "";

                barArray[i] = Utils.replaceSymbols(cname);

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        return barArray;
    }
}
