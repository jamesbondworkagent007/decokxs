package o;

import com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestItem;
import com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestSubscriptionProtocolModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jgT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26656jgT {
    public static final C26656jgT copydefault = new C26656jgT();
    public static final java.util.Map<java.lang.String, InvestSubscriptionProtocolModel> AEQbTJ = new LinkedHashMap();
    public static final int EZpvd = 8;

    private C26656jgT() {
    }

    public final void EZpvd(@NotNull InvestSubscriptionProtocolModel investSubscriptionProtocolModel) {
        Intrinsics.checkNotNullParameter(investSubscriptionProtocolModel, "");
        AEQbTJ.put("PROTOCOL_CACHE", investSubscriptionProtocolModel);
    }

    public final InvestSubscriptionProtocolModel EZpvd() {
        return AEQbTJ.get("PROTOCOL_CACHE");
    }

    public final void copydefault() {
        AEQbTJ.remove("PROTOCOL_CACHE");
    }

    public final void OLrzqt() {
        AEQbTJ.clear();
    }

    public final int KWHzl() {
        InvestSubscriptionProtocolModel investSubscriptionProtocolModelEZpvd = EZpvd();
        if (investSubscriptionProtocolModelEZpvd == null) {
            return 0;
        }
        java.util.List<InvestItem> listOLrzqt = investSubscriptionProtocolModelEZpvd.OLrzqt();
        int size = listOLrzqt != null ? listOLrzqt.size() : 0;
        java.util.List<InvestItem> listEZpvd = investSubscriptionProtocolModelEZpvd.EZpvd();
        return size + (listEZpvd != null ? listEZpvd.size() : 0);
    }

    public final boolean AEQbTJ() {
        return KWHzl() > 0;
    }
}
