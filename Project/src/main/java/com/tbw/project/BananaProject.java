/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tbw.project;

import com.tbw.project.customizer.BananaCustomizerProvider;
import org.netbeans.api.project.Project;
import org.netbeans.spi.project.support.LookupProviderSupport;
import org.openide.filesystems.FileObject;
import org.openide.util.Lookup;
import org.openide.util.lookup.Lookups;

/**
 *
 * @author Андрей
 */
public class BananaProject implements Project {

    private final FileObject projectDir;
    private Lookup lkp;

    BananaProject(FileObject dir) {
        this.projectDir = dir;
    }

    @Override
    public FileObject getProjectDirectory() {
        return projectDir;
    }

    @Override
    public Lookup getLookup() {
        if (lkp == null) {
            lkp = Lookups.fixed(// register your features here
                    this,
                    new ProjectInfo(this),
                    new BananaProjectLogicalView(this),
                    new BananaCustomizerProvider(this));
        }

        return LookupProviderSupport.createCompositeLookup(
                lkp,
                "Projects/com-tbw-project/Lookup");
    }

}
