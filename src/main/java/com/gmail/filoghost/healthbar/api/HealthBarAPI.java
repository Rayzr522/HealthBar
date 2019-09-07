package com.gmail.filoghost.healthbar.api;

import com.gmail.filoghost.healthbar.DamageListener;
import com.gmail.filoghost.healthbar.MiscListeners;
import org.bukkit.entity.LivingEntity;

public class HealthBarAPI {
    /**
     * Checks if a mob has a health bar.
     */
    public static boolean mobHasBar(LivingEntity mob) {

        String tagName = mob.getCustomName();

        if (tagName != null) {
            return tagName.startsWith("\u00A7r");
        }

        return false;
    }

    /**
     * Hides the bar restoring the custom name.
     */
    public static void mobHideBar(LivingEntity mob) {
        DamageListener.hideBar(mob);
    }

    /**
     * Gets the real name of the mob, even if it doesn't have the health bar.
     */
    public static String getMobName(LivingEntity mob) {
        return DamageListener.getNameWhileHavingBar(mob);
    }

    /**
     * HealthBar has a method to remove team prefix & suffix in the tab list.
     * This disabled that function.
     */
    public static void disableWhiteTabNames() {
        MiscListeners.disableTabNamesFix();
    }
}
