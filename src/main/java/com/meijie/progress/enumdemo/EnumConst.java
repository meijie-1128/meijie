package com.meijie.progress.enumdemo;

/**
 * 使用枚举定义常量
 */
public enum EnumConst {

    ORDERED,
    READY,
    DELIVERED;

}

// 非枚举和枚举比较，可以使用 == 代替equals，避免空指针
// 但是不能使用枚举 == 枚举比较，编译不通过

