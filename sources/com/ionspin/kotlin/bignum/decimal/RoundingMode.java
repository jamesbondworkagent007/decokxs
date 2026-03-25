package com.ionspin.kotlin.bignum.decimal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes22.dex */
public enum RoundingMode {
    FLOOR,
    CEILING,
    AWAY_FROM_ZERO,
    TOWARDS_ZERO,
    NONE,
    ROUND_HALF_AWAY_FROM_ZERO,
    ROUND_HALF_TOWARDS_ZERO,
    ROUND_HALF_CEILING,
    ROUND_HALF_FLOOR,
    ROUND_HALF_TO_EVEN,
    ROUND_HALF_TO_ODD;

    /* JADX DEBUG: Replace access to removed values field ($VALUES) with 'values()' method */
    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static RoundingMode[] valuesCustom() {
        RoundingMode[] roundingModeArrValuesCustom = values();
        return (RoundingMode[]) Arrays.copyOf(roundingModeArrValuesCustom, roundingModeArrValuesCustom.length);
    }
}
