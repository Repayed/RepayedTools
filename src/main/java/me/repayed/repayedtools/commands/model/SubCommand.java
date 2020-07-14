package me.repayed.repayedtools.commands.model;

public abstract class SubCommand {
    private String name;
    private String permission;
    private String syntax;

    public SubCommand(String name, String permission, String syntax) {
        this.name = name;
        this.permission = permission;
        this.syntax = syntax;
    }

    public String getName() {
        return this.name;
    }

    public String getPermission() {
        return this.permission;
    }

    public String getSyntax() {
        return this.syntax;
    }

    protected abstract void execute();

}
