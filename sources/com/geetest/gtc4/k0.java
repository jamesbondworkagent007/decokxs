package com.geetest.gtc4;

/* JADX INFO: loaded from: classes21.dex */
public enum k0 {
    DIRECT(0),
    ONE_BYTE(24),
    TWO_BYTES(25),
    FOUR_BYTES(26),
    EIGHT_BYTES(27),
    RESERVED(28),
    INDEFINITE(31);

    private final int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    k0(int i) {
        this.value = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static k0 ofByte(int i) {
        switch (i & 31) {
            case 24:
                return ONE_BYTE;
            case 25:
                return TWO_BYTES;
            case 26:
                return FOUR_BYTES;
            case 27:
                return EIGHT_BYTES;
            case 28:
            case 29:
            case 30:
                return RESERVED;
            case 31:
                return INDEFINITE;
            default:
                return DIRECT;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getValue() {
        return this.value;
    }
}
