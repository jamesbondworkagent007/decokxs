package org.spongycastle.crypto.tls;

/* JADX INFO: loaded from: classes25.dex */
public class AlertLevel {
    public static final short fatal = 2;
    public static final short warning = 1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String getName(short s) {
        return s != 1 ? s != 2 ? "UNKNOWN" : "fatal" : "warning";
    }

    public static String getText(short s) {
        return getName(s) + "(" + ((int) s) + ")";
    }
}
