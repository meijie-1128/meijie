package com.meijie.progress.designpattern.structure.adapter.classadapter;

import com.meijie.progress.designpattern.structure.adapter.SourceRole;
import com.meijie.progress.designpattern.structure.adapter.TargetRole;

public class ClassAdapter extends SourceRole implements TargetRole {

    @Override
    public void realizeTargetRole() {
        super.realizeSource();
    }
}
