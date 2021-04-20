package com.meijie.progress.designpattern.structure.adapter.classadapter;

import com.meijie.progress.designpattern.structure.adapter.TargetRole;
import org.junit.jupiter.api.Test;

class ClassAdapterTest {

    @Test
    void realizeTargetRole() {

        TargetRole targetRole = new ClassAdapter();
        targetRole.realizeTargetRole();
    }
}