package o;

import com.okinc.core.util.SPUtils;

/* JADX INFO: loaded from: classes5.dex */
public final class gFE {
    public static final gFE OLrzqt = new gFE();
    public static boolean AEQbTJ = true;
    public static final int KWHzl = 8;

    private gFE() {
    }

    public final void copydefault(boolean z) {
        AEQbTJ = z;
        SPUtils.put("key_btc_segwitaddress_file", java.lang.Boolean.valueOf(z), "key_show_segwitaddress_switch_guide");
    }

    public final boolean copydefault() {
        return SPUtils.getBoolean("key_btc_segwitaddress_file", true, "key_show_segwitaddress_switch_guide");
    }
}
