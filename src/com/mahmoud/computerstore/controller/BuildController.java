package com.mahmoud.computerstore.controller;

import com.mahmoud.computerstore.util.CompatibilityChecker;
import com.mahmoud.computerstore.model.*;
import java.util.Map;

/**
 * Manages the PC-building workflow.
 * Tracks selected components, enforces compatibility, and finalizes builds.
 */
public class BuildController {
    private Map<String, Component> currentBuild;

    public boolean addComponent(Component c) {
        // e.g., CompatibilityChecker.isCpuCompatibleWithMotherboard(...)
    }

    public void finalizeBuild() {
        // save build, reset state, etc.
    }
}
