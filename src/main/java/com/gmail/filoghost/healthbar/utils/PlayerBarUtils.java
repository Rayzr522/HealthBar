package com.gmail.filoghost.healthbar.utils;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

import java.util.Set;

public class PlayerBarUtils {

    //enforce non-instantiability with a private constructor
    private PlayerBarUtils() {
    }

    public static void create10DefaultTeams(Scoreboard sb, int style) {

        if (style == 2) {
            sb.registerNewTeam("hbr1").setSuffix(" \u00A7c\u258c");
            sb.registerNewTeam("hbr2").setSuffix(" \u00A7c\u2588");
            sb.registerNewTeam("hbr3").setSuffix(" \u00A7e\u2588\u258c");
            sb.registerNewTeam("hbr4").setSuffix(" \u00A7e\u2588\u2588");
            sb.registerNewTeam("hbr5").setSuffix(" \u00A7e\u2588\u2588\u258c");
            sb.registerNewTeam("hbr6").setSuffix(" \u00A7a\u2588\u2588\u2588");
            sb.registerNewTeam("hbr7").setSuffix(" \u00A7a\u2588\u2588\u2588\u258c");
            sb.registerNewTeam("hbr8").setSuffix(" \u00A7a\u2588\u2588\u2588\u2588");
            sb.registerNewTeam("hbr9").setSuffix(" \u00A7a\u2588\u2588\u2588\u2588\u258c");
            sb.registerNewTeam("hbr10").setSuffix(" \u00A7a\u2588\u2588\u2588\u2588\u2588");
            return;
        } else if (style == 3) {
            sb.registerNewTeam("hbr1").setSuffix(" \u00A7cI\u00A78IIIIIIIII");
            sb.registerNewTeam("hbr2").setSuffix(" \u00A7cII\u00A78IIIIIIII");
            sb.registerNewTeam("hbr3").setSuffix(" \u00A7eIII\u00A78IIIIIII");
            sb.registerNewTeam("hbr4").setSuffix(" \u00A7eIIII\u00A78IIIIII");
            sb.registerNewTeam("hbr5").setSuffix(" \u00A7eIIIII\u00A78IIIII");
            sb.registerNewTeam("hbr6").setSuffix(" \u00A7aIIIIII\u00A78IIII");
            sb.registerNewTeam("hbr7").setSuffix(" \u00A7aIIIIIII\u00A78III");
            sb.registerNewTeam("hbr8").setSuffix(" \u00A7aIIIIIIII\u00A78II");
            sb.registerNewTeam("hbr9").setSuffix(" \u00A7aIIIIIIIII\u00A78I");
            sb.registerNewTeam("hbr10").setSuffix(" \u00A7aIIIIIIIIII");
            return;
        } else if (style == 4) {
            sb.registerNewTeam("hbr1").setSuffix(" \u00A7c1\u2764");
            sb.registerNewTeam("hbr2").setSuffix(" \u00A7c2\u2764");
            sb.registerNewTeam("hbr3").setSuffix(" \u00A7e3\u2764");
            sb.registerNewTeam("hbr4").setSuffix(" \u00A7e4\u2764");
            sb.registerNewTeam("hbr5").setSuffix(" \u00A7e5\u2764");
            sb.registerNewTeam("hbr6").setSuffix(" \u00A7a6\u2764");
            sb.registerNewTeam("hbr7").setSuffix(" \u00A7a7\u2764");
            sb.registerNewTeam("hbr8").setSuffix(" \u00A7a8\u2764");
            sb.registerNewTeam("hbr9").setSuffix(" \u00A7a9\u2764");
            sb.registerNewTeam("hbr10").setSuffix(" \u00A7a10\u2764");
            return;
        } else if (style == 5) {
            sb.registerNewTeam("hbr1").setSuffix(" \u00A7c\u2666\u00A77\u2666\u2666\u2666\u2666 ");
            sb.registerNewTeam("hbr2").setSuffix(" \u00A7c\u2666\u00A77\u2666\u2666\u2666\u2666 ");
            sb.registerNewTeam("hbr3").setSuffix(" \u00A7e\u2666\u2666\u00A77\u2666\u2666\u2666 ");
            sb.registerNewTeam("hbr4").setSuffix(" \u00A7e\u2666\u2666\u00A77\u2666\u2666\u2666 ");
            sb.registerNewTeam("hbr5").setSuffix(" \u00A7a\u2666\u2666\u2666\u00A77\u2666\u2666 ");
            sb.registerNewTeam("hbr6").setSuffix(" \u00A7a\u2666\u2666\u2666\u00A77\u2666\u2666 ");
            sb.registerNewTeam("hbr7").setSuffix(" \u00A7a\u2666\u2666\u2666\u2666\u00A77\u2666 ");
            sb.registerNewTeam("hbr8").setSuffix(" \u00A7a\u2666\u2666\u2666\u2666\u00A77\u2666 ");
            sb.registerNewTeam("hbr9").setSuffix(" \u00A7a\u2666\u2666\u2666\u2666\u2666 ");
            sb.registerNewTeam("hbr10").setSuffix(" \u00A7a\u2666\u2666\u2666\u2666\u2666 ");
            return;
        } else if (style == 6) {
            sb.registerNewTeam("hbr1").setSuffix(" \u00A7c\u2764\u00A77\u2764\u2764\u2764\u2764");
            sb.registerNewTeam("hbr2").setSuffix(" \u00A7c\u2764\u00A77\u2764\u2764\u2764\u2764");
            sb.registerNewTeam("hbr3").setSuffix(" \u00A7c\u2764\u2764\u00A77\u2764\u2764\u2764");
            sb.registerNewTeam("hbr4").setSuffix(" \u00A7c\u2764\u2764\u00A77\u2764\u2764\u2764");
            sb.registerNewTeam("hbr5").setSuffix(" \u00A7c\u2764\u2764\u2764\u00A77\u2764\u2764");
            sb.registerNewTeam("hbr6").setSuffix(" \u00A7c\u2764\u2764\u2764\u00A77\u2764\u2764");
            sb.registerNewTeam("hbr7").setSuffix(" \u00A7c\u2764\u2764\u2764\u2764\u00A77\u2764");
            sb.registerNewTeam("hbr8").setSuffix(" \u00A7c\u2764\u2764\u2764\u2764\u00A77\u2764");
            sb.registerNewTeam("hbr9").setSuffix(" \u00A7c\u2764\u2764\u2764\u2764\u2764");
            sb.registerNewTeam("hbr10").setSuffix(" \u00A7c\u2764\u2764\u2764\u2764\u2764");
            return;
        } else if (style == 7) {
            sb.registerNewTeam("hbr1").setSuffix(" \u00A7c\u258c\u00A78\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c");
            sb.registerNewTeam("hbr2").setSuffix(" \u00A7c\u258c\u258c\u00A78\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c");
            sb.registerNewTeam("hbr3").setSuffix(" \u00A7e\u258c\u258c\u258c\u00A78\u258c\u258c\u258c\u258c\u258c\u258c\u258c");
            sb.registerNewTeam("hbr4").setSuffix(" \u00A7e\u258c\u258c\u258c\u258c\u00A78\u258c\u258c\u258c\u258c\u258c\u258c");
            sb.registerNewTeam("hbr5").setSuffix(" \u00A7e\u258c\u258c\u258c\u258c\u258c\u00A78\u258c\u258c\u258c\u258c\u258c");
            sb.registerNewTeam("hbr6").setSuffix(" \u00A7a\u258c\u258c\u258c\u258c\u258c\u258c\u00A78\u258c\u258c\u258c\u258c");
            sb.registerNewTeam("hbr7").setSuffix(" \u00A7a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u00A78\u258c\u258c\u258c");
            sb.registerNewTeam("hbr8").setSuffix(" \u00A7a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u00A78\u258c\u258c");
            sb.registerNewTeam("hbr9").setSuffix(" \u00A7a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u00A78\u258c");
            sb.registerNewTeam("hbr10").setSuffix(" \u00A7a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c");
            return;
        } else {
            //style == 1 or > 7
            sb.registerNewTeam("hbr1").setSuffix(" \u00A7c|\u00A78|||||||||");
            sb.registerNewTeam("hbr2").setSuffix(" \u00A7c||\u00A78||||||||");
            sb.registerNewTeam("hbr3").setSuffix(" \u00A7e|||\u00A78|||||||");
            sb.registerNewTeam("hbr4").setSuffix(" \u00A7e||||\u00A78||||||");
            sb.registerNewTeam("hbr5").setSuffix(" \u00A7e|||||\u00A78|||||");
            sb.registerNewTeam("hbr6").setSuffix(" \u00A7a||||||\u00A78||||");
            sb.registerNewTeam("hbr7").setSuffix(" \u00A7a|||||||\u00A78|||");
            sb.registerNewTeam("hbr8").setSuffix(" \u00A7a||||||||\u00A78||");
            sb.registerNewTeam("hbr9").setSuffix(" \u00A7a|||||||||\u00A78|");
            sb.registerNewTeam("hbr10").setSuffix(" \u00A7a||||||||||");
            return;
        }
    }

    /*
     * Adds the teams from a file to the scoreboard
     */
    public static void create10CustomTeams(Scoreboard sb, FileConfiguration c) {
        for (int i = 1; i < 11; i++) {
            try {

                Team t = sb.registerNewTeam("hbr" + i);
                if (!c.isSet(i + "0" + "-percent.prefix")) {
                    c.set(i + "0" + "-percent.prefix", "");
                }
                if (!c.isSet(i + "0" + "-percent.suffix")) {
                    c.set(i + "0" + "-percent.suffix", "");
                }
                String prefix = c.getString(i + "0" + "-percent.prefix");
                String suffix = c.getString(i + "0" + "-percent.suffix");

                if ((prefix != null) && (!prefix.equals("")))
                    t.setPrefix(Utils.replaceSymbols(prefix));
                if ((suffix != null) && (!suffix.equals("")))
                    t.setSuffix(Utils.replaceSymbols(suffix));

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    /*
     * By default players in the same team can see each other while invisible
     */
    public static void setAllTeamsInvisibility(Scoreboard sb) {

        Set<Team> teamList = sb.getTeams();
        for (Team team : teamList) {
            //teams used by healthbar - they contains hbr
            if (team.getName().contains("hbr")) {
                team.setCanSeeFriendlyInvisibles(false);
            }
        }
    }

    /*
     * Removes all the teams created by HealthBar
     */
    public static void removeAllHealthbarTeams(Scoreboard sb) {

        Set<Team> teamList = sb.getTeams();
        for (Team team : teamList) {
            if (team.getName().contains("hbr")) {
                team.unregister();
            }
        }
    }

}
