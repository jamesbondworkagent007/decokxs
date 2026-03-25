package com.geetest.gtc4;

/* JADX INFO: loaded from: classes21.dex */
public enum k7 {
    SIMPLE_VALUE,
    SIMPLE_VALUE_NEXT_BYTE,
    IEEE_754_HALF_PRECISION_FLOAT,
    IEEE_754_SINGLE_PRECISION_FLOAT,
    IEEE_754_DOUBLE_PRECISION_FLOAT,
    BREAK;

    public static k7 ofByte(int i) throws q1 {
        switch (i & 31) {
            case 24:
                return SIMPLE_VALUE_NEXT_BYTE;
            case 25:
                return IEEE_754_HALF_PRECISION_FLOAT;
            case 26:
                return IEEE_754_SINGLE_PRECISION_FLOAT;
            case 27:
                return IEEE_754_DOUBLE_PRECISION_FLOAT;
            case 28:
            case 29:
            case 30:
                throw new q1("Not implemented special type " + i);
            case 31:
                return BREAK;
            default:
                return SIMPLE_VALUE;
        }
    }
}
