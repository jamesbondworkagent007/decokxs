package o;

/* JADX INFO: loaded from: classes5.dex */
public final class gLZ {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String EZpvd(boolean z, boolean z2) {
        return z ? "sa_dex_copytrade_tradebtn" : z2 ? "sa_dex_limitorder" : "sa_dex_marketorder_autosell";
    }

    public static /* synthetic */ java.lang.String getPathSource$default(boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return EZpvd(z, z2);
    }
}
