package o;

import com.okinc.core.util.SPUtils;

/* JADX INFO: loaded from: classes5.dex */
public final class fPD {
    public static final fPD copydefault = new fPD();
    public static boolean EZpvd = true;
    public static boolean AEQbTJ = true;
    public static boolean KWHzl = true;
    public static final int OLrzqt = 8;

    private fPD() {
    }

    public final void copydefault(boolean z) {
        EZpvd = z;
        SPUtils.put("key_aa_file", java.lang.Boolean.valueOf(z), "key_show_aa_guide");
    }

    public final void OLrzqt(boolean z) {
        AEQbTJ = z;
        SPUtils.put("key_aa_file", java.lang.Boolean.valueOf(z), "key_show_aa_deposit_guide");
    }

    public final boolean AEQbTJ() {
        return SPUtils.getBoolean("key_aa_file", true, "key_show_aa_deposit_guide");
    }

    public final void KWHzl(boolean z) {
        KWHzl = z;
        SPUtils.put("KEY_IS_SHOW_AA_COPY_BOTTOM_SHEET", java.lang.Boolean.valueOf(z));
    }

    public final boolean OLrzqt() {
        return SPUtils.getBoolean("KEY_IS_SHOW_AA_COPY_BOTTOM_SHEET", true);
    }
}
