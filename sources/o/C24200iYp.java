package o;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: o.iYp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24200iYp {
    public static boolean KWHzl;
    public static final C24200iYp OLrzqt = new C24200iYp();
    public static boolean AEQbTJ = true;
    public static final int copydefault = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return (AEQbTJ || KWHzl) ? false : true;
    }

    private C24200iYp() {
    }

    public final void EZpvd() {
        android.content.SharedPreferences sharedPreferences = C43246rlf.OLrzqt.valueOf().getSharedPreferences("OKWalletInvest", 0);
        AEQbTJ = sharedPreferences != null ? sharedPreferences.getBoolean("ModeSwitchGuideHasShown_14", false) : true;
    }

    public final void OLrzqt(boolean z) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutBoolean;
        AEQbTJ = z;
        android.content.SharedPreferences sharedPreferences = C43246rlf.OLrzqt.valueOf().getSharedPreferences("OKWalletInvest", 0);
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null || (editorPutBoolean = editorEdit.putBoolean("ModeSwitchGuideHasShown_14", true)) == null) {
            return;
        }
        editorPutBoolean.apply();
    }
}
