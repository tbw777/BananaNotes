/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tbw.project.nodes;

import com.tbw.project.BananaProject;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.ChangeListener;
import org.netbeans.spi.project.ui.support.NodeList;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.nodes.FilterNode;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;

/**
 *
 * @author Андрей
 */
public class TextsNodeList implements NodeList<Node> {

    private final BananaProject PROJECT;

    public TextsNodeList(BananaProject project) {
        this.PROJECT = project;
    }

    @Override
    public List<Node> keys() {
        FileObject textsFolder
                = PROJECT.getProjectDirectory().getFileObject("texts");
        List<Node> result = new ArrayList<>();
        if (textsFolder != null) {
            for (FileObject textsFolderFile : textsFolder.getChildren()) {
                try {
                    result.add(DataObject.find(textsFolderFile).getNodeDelegate());
                } catch (DataObjectNotFoundException ex) {
                    Exceptions.printStackTrace(ex);
                }
            }
        }
        return result;
    }

    @Override
    public Node node(Node node) {
        return new FilterNode(node);
    }

    @Override
    public void addNotify() {
    }

    @Override
    public void removeNotify() {
    }

    @Override
    public void addChangeListener(ChangeListener cl) {
    }

    @Override
    public void removeChangeListener(ChangeListener cl) {
    }
}
