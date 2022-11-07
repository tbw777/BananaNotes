/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tbw.project;

import java.awt.Image;
import java.beans.PropertyChangeListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.netbeans.api.annotations.common.StaticResource;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectInformation;
import org.openide.util.ImageUtilities;

/**
 *
 * @author Андрей
 */
public class ProjectInfo implements ProjectInformation {

    @StaticResource()
    public static final String BANANA_ICON = "com/tbw/project/banana_icon.png";
    
    public static Image projectImage = ImageUtilities.loadImage(ProjectInfo.BANANA_ICON);
    public static ImageIcon projectImageIcon = new ImageIcon(projectImage);
    
    private final BananaProject bananaProject;

    public ProjectInfo(BananaProject bananaProject) {
        this.bananaProject = bananaProject;
    }

    @Override
    public Icon getIcon() {
        return projectImageIcon;
    }

    @Override
    public String getName() {
        return bananaProject.getProjectDirectory().getParent().getName();
    }

    @Override
    public String getDisplayName() {
        return getName();
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener pcl) {
//do nothing, won't change
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener pcl) {
//do nothing, won't change
    }

    @Override
    public Project getProject() {
        return bananaProject;
    }
}
