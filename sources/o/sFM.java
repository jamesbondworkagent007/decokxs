package o;

import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes10.dex */
public final class sFM {
    public static java.lang.String AEQbTJ;
    public static java.lang.String EZpvd;
    public static java.lang.String KWHzl;
    public static final sFM copydefault = new sFM();
    public static final int OLrzqt = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return AEQbTJ;
    }

    private sFM() {
    }

    public final void OLrzqt(java.lang.String str) {
        if (str == null || (!C44157sFk.gEmmrt().values() && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)))) {
            C44124sEe.imLogNonLogin$default("Set non-login token: " + str, null, 2, null);
            EZpvd = str;
        }
    }

    public final void AEQbTJ(java.lang.String str) {
        if (str == null || (!C44157sFk.gEmmrt().values() && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)))) {
            C44124sEe.imLogNonLogin$default("Set non-login UID: " + str, null, 2, null);
            AEQbTJ = str;
        }
    }
}
