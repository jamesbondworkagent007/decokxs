package com.geetest.gtc4;

/* JADX INFO: loaded from: classes21.dex */
public abstract class g0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String a(int i, int i2) {
        if (i == 64) {
            return "[APPLICATION " + i2 + "]";
        }
        if (i == 128) {
            return "[CONTEXT " + i2 + "]";
        }
        if (i != 192) {
            return "[UNIVERSAL " + i2 + "]";
        }
        return "[PRIVATE " + i2 + "]";
    }
}
