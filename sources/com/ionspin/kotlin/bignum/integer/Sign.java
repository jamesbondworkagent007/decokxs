package com.ionspin.kotlin.bignum.integer;

import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes22.dex */
public enum Sign {
    POSITIVE,
    NEGATIVE,
    ZERO;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Sign.valuesCustom().length];
            iArr[Sign.POSITIVE.ordinal()] = 1;
            iArr[Sign.NEGATIVE.ordinal()] = 2;
            iArr[Sign.ZERO.ordinal()] = 3;
            KWHzl = iArr;
        }
    }

    public final Sign not() {
        int i = TaskDescription.KWHzl[ordinal()];
        if (i == 1) {
            return NEGATIVE;
        }
        if (i == 2) {
            return POSITIVE;
        }
        if (i == 3) {
            return ZERO;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int toInt() {
        int i = TaskDescription.KWHzl[ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return -1;
        }
        if (i == 3) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX DEBUG: Replace access to removed values field ($VALUES) with 'values()' method */
    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static Sign[] valuesCustom() {
        Sign[] signArrValuesCustom = values();
        return (Sign[]) Arrays.copyOf(signArrValuesCustom, signArrValuesCustom.length);
    }
}
