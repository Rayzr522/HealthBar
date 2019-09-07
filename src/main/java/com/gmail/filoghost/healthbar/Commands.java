package com.gmail.filoghost.healthbar;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Commands implements CommandExecutor {
    public Main instance;

    private static final String PREFIX = "\u00A72[\u00A7aHealthBar\u00A72] ";

    public Commands(Main main) {
        instance = main;
    }

    @Override
    public boolean onCommand(final CommandSender sender, Command cmd, String label, String[] args) {
        if (args.length == 0) {
            sendInfo(sender);
            return true;
        }

        if (args[0].equalsIgnoreCase("help")) {
            sendCommandList(sender);
            return true;
        }

        if (args[0].equalsIgnoreCase("reload")) {
            reloadConfigs(sender);
            return true;
        }

        if (args[0].equalsIgnoreCase("update")) {

            if (!sender.hasPermission("healthbar.update")) {
                noPermissionMessage(sender);
                return true;
            }

            Thread updaterThread = new Thread(() -> Updater.UpdaterHandler.manuallyCheckUpdates(sender));
            updaterThread.start();

            return true;
        }

        sender.sendMessage(PREFIX + "\u00A7eUnknown command. Type \u00A7a" + label + " \u00A7efor help.");
        return true;
    }


    private void reloadConfigs(CommandSender sender) {
        if (!sender.hasPermission("healthbar.reload")) {
            noPermissionMessage(sender);
            return;
        }
        try {
            instance.reloadConfigFromDisk();
            sender.sendMessage("\u00A7e>>\u00A76 HealthBar reloaded");
        } catch (Exception e) {
            e.printStackTrace();
            sender.sendMessage("\u00A7cFailed to reload configs, take a look at the console!");
        }

    }

    private void sendInfo(CommandSender sender) {
        sender.sendMessage(PREFIX);
        sender.sendMessage("\u00A7aVersion: \u00A77" + instance.getDescription().getVersion());
        sender.sendMessage("\u00A7aDeveloper: \u00A77filoghost");
        sender.sendMessage("\u00A7aCommands: \u00A77/hbr help");
    }

    private void sendCommandList(CommandSender sender) {
        if (!sender.hasPermission("healthbar.help")) {
            noPermissionMessage(sender);
            return;
        }
        sender.sendMessage("\u00A7e>>\u00A76 HealthBar commands: ");
        sender.sendMessage("\u00A72/hbr \u00A77- \u00A7aDisplays general plugin info");
        sender.sendMessage("\u00A72/hbr reload \u00A77- \u00A7aReloads the configs");
        sender.sendMessage("\u00A72/hbr update \u00A77- \u00A7aChecks for updates");
    }

    private void noPermissionMessage(CommandSender sender) {
        sender.sendMessage("\u00A7cYou don't have permission.");
    }
}
