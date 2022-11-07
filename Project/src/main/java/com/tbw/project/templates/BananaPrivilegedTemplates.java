package com.tbw.project.templates;

import org.netbeans.spi.project.ProjectServiceProvider;
import org.netbeans.spi.project.ui.PrivilegedTemplates;

@ProjectServiceProvider(
        service = PrivilegedTemplates.class,
        projectType = "com-tbw-project")
public class BananaPrivilegedTemplates implements PrivilegedTemplates {

    private static final String[] PRIVILEGED_NAMES = new String[]{
        "Templates/Other/file",
        //"Templates/Licenses/license-apache20.txt",
        "Templates/Other/Folder",};

    @Override
    public String[] getPrivilegedTemplates() {
        return PRIVILEGED_NAMES;
    }
}
