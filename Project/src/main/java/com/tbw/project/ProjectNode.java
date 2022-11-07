/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tbw.project;

import java.awt.Image;
import javax.swing.Action;
import org.netbeans.spi.project.ui.support.CommonProjectActions;
import org.netbeans.spi.project.ui.support.NodeFactorySupport;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.nodes.FilterNode;
import org.openide.nodes.Node;
import org.openide.util.Lookup;
import org.openide.util.lookup.Lookups;
import org.openide.util.lookup.ProxyLookup;

/**
 *
 * @author Андрей
 */
public class ProjectNode extends FilterNode {

    private final BananaProject PROJECT;

    public ProjectNode(Node node, BananaProject project) throws DataObjectNotFoundException {
        super(node,
                NodeFactorySupport.createCompositeChildren(
                        project,
                        "Projects/com-tbw-project/Nodes"),
                // new FilterNode.Children(node),
                new ProxyLookup(
                        new Lookup[]{
                            Lookups.singleton(project),
                            node.getLookup()
                        }));
        this.PROJECT = project;

//        super(node,
//                new FilterNode.Children(node),
//                new ProxyLookup(
//                        new Lookup[]{
//                            Lookups.singleton(project),
//                            node.getLookup()
//                        }));
//        this.project = project;
    }

    @Override
    public Action[] getActions(boolean arg0) {
        return new Action[]{
            CommonProjectActions.newFileAction(),
            CommonProjectActions.copyProjectAction(),
            CommonProjectActions.deleteProjectAction(),
            CommonProjectActions.customizeProjectAction(),
            CommonProjectActions.closeProjectAction()
        };
    }

    @Override
    public Image getIcon(int type) {
        //return ImageUtilities.loadImage(CAR_ICON);
        //return ImageUtilities.loadImage(ProjectInfo.BANANA_ICON);
        return ProjectInfo.projectImage;
    }

    @Override
    public Image getOpenedIcon(int type) {
        return getIcon(type);
    }

    @Override
    public String getDisplayName() {
        return PROJECT.getProjectDirectory().getName();
    }
}
