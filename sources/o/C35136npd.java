package o;

import com.okinc.core.util.SPUtils;

/* JADX INFO: renamed from: o.npd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C35136npd {
    public static final C35136npd AEQbTJ = new C35136npd();

    private C35136npd() {
    }

    public final void EZpvd(boolean z) {
        SPUtils.put("market_discover_overview_flow_expand", java.lang.Boolean.valueOf(z));
    }

    public final boolean AEQbTJ() {
        return SPUtils.getBoolean("market_discover_overview_flow_expand", false);
    }
}
