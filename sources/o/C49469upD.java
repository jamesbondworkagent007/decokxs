package o;

import com.okinc.core.util.SPUtils;

/* JADX INFO: renamed from: o.upD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C49469upD {
    public static final void KWHzl(boolean z) {
        SPUtils.put("ASSET_AVAILABLE_SELECT_FOR_TRADING-" + C55697xoo.OLrzqt.gEmmrt(), java.lang.Boolean.valueOf(z));
    }

    public static final boolean copydefault() {
        return SPUtils.getBoolean("ASSET_AVAILABLE_SELECT_FOR_TRADING-" + C55697xoo.OLrzqt.gEmmrt(), xVL.EZpvd.gEmmrt());
    }

    public static final void AEQbTJ(boolean z) {
        SPUtils.put("EARN_AVAILABLE_SELECT_FOR_TRADING-" + C55697xoo.OLrzqt.gEmmrt(), java.lang.Boolean.valueOf(z));
    }

    public static final boolean OLrzqt() {
        return SPUtils.getBoolean("EARN_AVAILABLE_SELECT_FOR_TRADING-" + C55697xoo.OLrzqt.gEmmrt(), false);
    }
}
