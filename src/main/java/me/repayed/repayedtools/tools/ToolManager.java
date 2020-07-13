package me.repayed.repayedtools.tools;

import me.repayed.repayedtools.tools.types.ExplosivePickaxeTool;

import java.util.ArrayList;
import java.util.List;

public class ToolManager {
    private List<Tool> tools = new ArrayList<>();

    public ToolManager() {
        addTool(new ExplosivePickaxeTool());
    }

    private void addTool(Tool tool) {
        if(!this.tools.contains(tool))
            this.tools.add(tool);
    }

    public List<Tool> getTools() {
        return this.tools;
    }
}
