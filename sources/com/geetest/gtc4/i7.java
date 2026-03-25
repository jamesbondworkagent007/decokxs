package com.geetest.gtc4;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f463a;
    public static final /* synthetic */ int[] b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int[] iArr = new int[k7.values().length];
        b = iArr;
        try {
            iArr[k7.BREAK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[k7.SIMPLE_VALUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[k7.IEEE_754_HALF_PRECISION_FLOAT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[k7.IEEE_754_SINGLE_PRECISION_FLOAT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            b[k7.IEEE_754_DOUBLE_PRECISION_FLOAT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            b[k7.SIMPLE_VALUE_NEXT_BYTE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr2 = new int[v6.values().length];
        f463a = iArr2;
        try {
            iArr2[v6.FALSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f463a[v6.TRUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f463a[v6.NULL.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f463a[v6.UNDEFINED.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f463a[v6.UNALLOCATED.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f463a[v6.RESERVED.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
