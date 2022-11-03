package com.tbw.project.customizer;

import javax.swing.JComponent;
import javax.swing.JPanel;
import org.netbeans.spi.project.ui.support.ProjectCustomizer;
import org.netbeans.spi.project.ui.support.ProjectCustomizer.Category;
import org.openide.util.Lookup;
import org.openide.util.NbBundle;

public class GeneralBananaProperties implements ProjectCustomizer.CompositeCategoryProvider {

    private static final String GENERAL = "General";

    @ProjectCustomizer.CompositeCategoryProvider.Registration(
            projectType = "com-tbw-project", position = 10)
    public static GeneralBananaProperties createGeneral() {
        return new GeneralBananaProperties();
    }

    @NbBundle.Messages("LBL_Config_General=General")
    @Override
    public Category createCategory(Lookup lkp) {
        return ProjectCustomizer.Category.create(
                GENERAL,
                Bundle.LBL_Config_General(),
                null);
    }

    @Override
    public JComponent createComponent(Category category, Lookup lkp) {
        return new JPanel();
    }
}
