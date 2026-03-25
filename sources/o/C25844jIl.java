package o;

import com.okinc.core.util.SPUtils;

/* JADX INFO: renamed from: o.jIl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25844jIl {
    public static final C25844jIl EZpvd = new C25844jIl();

    private C25844jIl() {
    }

    public final void OLrzqt(boolean z) {
        SPUtils.put("market.futures_analysis_show_trading_fee", java.lang.Boolean.valueOf(z));
    }

    public final boolean AEQbTJ() {
        return SPUtils.getBoolean("market.futures_analysis_show_trading_fee", false);
    }
}
