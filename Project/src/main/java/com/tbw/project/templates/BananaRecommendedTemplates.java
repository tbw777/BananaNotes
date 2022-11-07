package com.tbw.project.templates;

import org.netbeans.spi.project.ProjectServiceProvider;
import org.netbeans.spi.project.ui.RecommendedTemplates;

@ProjectServiceProvider(
        service = RecommendedTemplates.class,
        projectType = "com-tbw-project")
public class BananaRecommendedTemplates implements RecommendedTemplates {

    private static final String[] RECOMMENDED_NAMES = new String[]{
        "simple-files"
    };

    @Override
    public String[] getRecommendedTypes() {
        return RECOMMENDED_NAMES;
    }
}
