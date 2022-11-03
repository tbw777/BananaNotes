/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tbw.project.nodes;

import com.tbw.project.BananaProject;
import org.netbeans.api.project.Project;
import org.netbeans.spi.project.ui.support.NodeFactory;
import org.netbeans.spi.project.ui.support.NodeList;

@NodeFactory.Registration(projectType = "com-tbw-project", position = 10)
public class TextsNodeFactory implements NodeFactory {

    @Override
    public NodeList<?> createNodes(Project project) {
        BananaProject p = project.getLookup().lookup(BananaProject.class);
        assert p != null;
        return new TextsNodeList(p);
    }

}
