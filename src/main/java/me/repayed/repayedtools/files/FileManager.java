package me.repayed.repayedtools.files;

import java.util.HashMap;

public class FileManager {
    private HashMap<String, Files> files = new HashMap<String, Files>();

    public FileManager() {
        this.files.put("config.yml", new Files("config.yml"));
    }

    public Files getFile(String fileName) {
        if (this.files.containsKey(fileName))
            return this.files.get(fileName);

        throw new NullPointerException("File " + fileName + " does not exist.");
    }
}
