package com.meijie.progress.designpattern.structure.adapter.objectadapter;

import com.meijie.progress.designpattern.structure.adapter.SourceRole;
import com.meijie.progress.designpattern.structure.adapter.TargetRole;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObjectAdapterTest {

    @Test
    void realizeTargetRole() {

        TargetRole targetRole = new ObjectAdapter(new SourceRole());
        targetRole.realizeTargetRole();
    }
}