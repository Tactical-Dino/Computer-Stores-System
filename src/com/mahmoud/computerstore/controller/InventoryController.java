package com.mahmoud.computerstore.controller;

import com.mahmoud.computerstore.dao.CPUDao;
import com.mahmoud.computerstore.model.CPU;
import java.util.List;

/**
 * Orchestrates CPU inventory operations.
 * Invokes CPUDao for persistence and updates the UI via callbacks.
 */
public class InventoryController {
    private CPUDao cpuDao = new CPUDao();

    public List<CPU> loadCPUs() { /* ... */ }
    public void addCPU(CPU cpu) { /* ... */ }
    // edit, delete...
}
