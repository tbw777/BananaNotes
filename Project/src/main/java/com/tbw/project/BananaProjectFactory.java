/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tbw.project;

import java.io.IOException;
import org.netbeans.api.project.Project;
import org.openide.util.lookup.ServiceProvider;
import org.netbeans.spi.project.ProjectFactory;
import org.netbeans.spi.project.ProjectState;
import org.openide.filesystems.FileObject;

/**
 *
 * @author Андрей
 */
@ServiceProvider(service = ProjectFactory.class)
public class BananaProjectFactory implements ProjectFactory {

    public static final String PROJECT_FILE = "banana.prj";

    //Specifies when a project is a project, i.e.,
    //if "car.prj" is present in a folder:
    @Override
    public boolean isProject(FileObject projectDirectory) {
        return projectDirectory.getFileObject(PROJECT_FILE) != null;
    }

    //Specifies when the project will be opened, i.e., if the project exists:
    @Override
    public Project loadProject(FileObject dir, ProjectState state) throws IOException {
        // leave state unused, not needed
        return isProject(dir) ? new BananaProject(dir) : null;
    }

    @Override
    public void saveProject(final Project project) throws IOException, ClassCastException {
        // leave unimplemented, not needed
    }

}
