package com.mahmoud.computerstore.view;

import javax.swing.*;
import java.awt.*;

/**
 * Panel displaying a list of components (e.g., CPUs).
 * Shows data in a JTable and provides Add/Edit/Delete buttons.
 */
public class InventoryPanel extends JPanel {
    private JTable table;
    private JButton addBtn, editBtn, delBtn;

    public InventoryPanel() {
        setupUI();
    }
    // setupUI(), getters for buttons/table...
}
