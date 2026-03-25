package com.ionspin.kotlin.bignum;

import java.util.Arrays;

/* JADX INFO: loaded from: classes22.dex */
public enum Endianness {
    BIG,
    LITTLE;

    /* JADX DEBUG: Replace access to removed values field ($VALUES) with 'values()' method */
    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static Endianness[] valuesCustom() {
        Endianness[] endiannessArrValuesCustom = values();
        return (Endianness[]) Arrays.copyOf(endiannessArrValuesCustom, endiannessArrValuesCustom.length);
    }
}
