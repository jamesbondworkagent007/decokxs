package o;

import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailPageType;

/* JADX INFO: renamed from: o.jNe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25972jNe {
    public static final PnlDetailPageType KWHzl(java.lang.Integer num) {
        return (num != null && num.intValue() == 0) ? PnlDetailPageType.CURRENT_HOLDINGS : (num != null && num.intValue() == 1) ? PnlDetailPageType.ALL_TIME : PnlDetailPageType.CURRENT_HOLDINGS;
    }

    public static final PnlDetailPageType copydefault(java.lang.Integer num) {
        return (num != null && num.intValue() == 1) ? PnlDetailPageType.CURRENT_HOLDINGS : (num != null && num.intValue() == 2) ? PnlDetailPageType.ALL_TIME : PnlDetailPageType.CURRENT_HOLDINGS;
    }
}
