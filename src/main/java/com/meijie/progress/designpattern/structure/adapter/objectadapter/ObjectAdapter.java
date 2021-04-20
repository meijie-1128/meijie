package com.meijie.progress.designpattern.structure.adapter.objectadapter;

import com.meijie.progress.designpattern.structure.adapter.SourceRole;
import com.meijie.progress.designpattern.structure.adapter.TargetRole;

public class ObjectAdapter implements TargetRole {

    private SourceRole sourceRole;

    public ObjectAdapter(SourceRole sourceRole) {
        this.sourceRole = sourceRole;
    }

    @Override
    public void realizeTargetRole() {
        this.sourceRole.realizeSource();
    }
}
