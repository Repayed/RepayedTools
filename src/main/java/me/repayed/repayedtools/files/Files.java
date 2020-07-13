package me.repayed.repayedtools.files;

import me.repayed.repayedtools.RepayedTools;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;

public class Files {

    private String name;

    private RepayedTools plugin;
    private FileConfiguration configuration;
    private File configurationFile;

    public Files(String fileName) {
        this.plugin = RepayedTools.getInstance();
        this.name = fileName;
        saveDefaultConfiguration();
    }

    public void reloadConfiguration() {
        if (this.configurationFile == null)
            this.configurationFile = new File(this.plugin.getDataFolder(), this.name);

        this.configuration = YamlConfiguration.loadConfiguration(this.configurationFile);

        InputStream defaultStream = this.plugin.getResource(this.name);

        if (defaultStream != null) {
            YamlConfiguration defaultConfiguration = YamlConfiguration.loadConfiguration(new InputStreamReader(defaultStream));
            this.configuration.setDefaults(defaultConfiguration);
        }
    }

    public FileConfiguration getConfiguration() {
        if (this.configuration == null)
            reloadConfiguration();

        return this.configuration;
    }

    public void saveConfiguration() {
        if (this.configuration == null || this.configurationFile == null)
            return;

        try {
            this.getConfiguration().save(this.configurationFile);
        } catch (IOException e) {
            this.plugin.getLogger().log(Level.SEVERE, "Could not save configuration to " + this.configurationFile, e);
        }

    }

    public void saveDefaultConfiguration() {
        if(this.configurationFile == null)
            this.configurationFile = new File(this.plugin.getDataFolder(), this.name);

        if(this.configurationFile.exists()) {
            this.plugin.saveResource(this.name, false);
        }
    }
}
