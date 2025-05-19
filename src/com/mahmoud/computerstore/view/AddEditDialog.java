package com.mahmoud.computerstore.view;

import javax.swing.*;
import java.awt.*;

/**
 * Modal dialog for adding or editing a component.
 * Uses form fields to collect component properties.
 */
public class AddEditDialog extends JDialog {
    // JTextField modelField, socketField, etc.
    // saveBtn, cancelBtn...

    public AddEditDialog(JFrame parent, String title) {
        super(parent, title, true);
        setupUI();
        pack();
    }
}

