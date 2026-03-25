package o;

import com.appsflyer.AppsFlyerProperties;
import kotlin.jvm.internal.Intrinsics;
import o.tTL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tBI extends tTL {
    public final java.util.Map<java.lang.String, tTL.Application> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.tTL
    public java.util.Map<java.lang.String, tTL.Application> copydefault() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tBI(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.Boolean bool, java.lang.String str4) {
        super("CopyTradingLead_Full_Page_View");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        kotlin.Pair[] pairArr = new kotlin.Pair[4];
        pairArr[0] = C56390yDp.OLrzqt(AppsFlyerProperties.CHANNEL, new tTL.Application(str2, false));
        pairArr[1] = C56390yDp.OLrzqt("trader_id", new tTL.Application(str3, false));
        pairArr[2] = C56390yDp.OLrzqt("biz_type", new tTL.Application(str == null ? "" : str, true));
        pairArr[3] = C56390yDp.OLrzqt("translation", new tTL.Application(tTP.KWHzl(bool), true));
        java.util.Map<java.lang.String, tTL.Application> mapDjBIcL = C56424yEw.djBIcL(pairArr);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str4)) {
            mapDjBIcL.put("page", new tTL.Application(str4 == null ? "" : str4, true));
        }
        this.EZpvd = mapDjBIcL;
    }
}
