package o;

import com.okinc.market.alert.data.MarketUserAlert;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pWd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC38367pWd {
    java.util.List<MarketUserAlert> AEQbTJ(@NotNull java.lang.String str);

    boolean EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3);

    void KWHzl(@NotNull MarketUserAlert marketUserAlert);

    void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, long j, @NotNull java.lang.String str4);

    boolean KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3);

    void OLrzqt(@NotNull java.lang.String str);

    void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, long j, @NotNull java.lang.String str4);

    void OLrzqt(@NotNull java.util.List<MarketUserAlert> list);

    void copydefault(@NotNull MarketUserAlert marketUserAlert);

    void copydefault(@NotNull java.lang.String str, @NotNull java.util.List<MarketUserAlert> list);

    void copydefault(@NotNull java.util.List<MarketUserAlert> list);

    /* JADX INFO: renamed from: o.pWd$StateListAnimator */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class StateListAnimator {
        public static void KWHzl(@NotNull InterfaceC38367pWd interfaceC38367pWd, @NotNull MarketUserAlert marketUserAlert) {
            Intrinsics.checkNotNullParameter(marketUserAlert, "");
            if (marketUserAlert.getChainId().length() > 0 && marketUserAlert.getTokenAddress().length() > 0) {
                interfaceC38367pWd.OLrzqt(marketUserAlert.getUserId(), marketUserAlert.getChainId(), marketUserAlert.getTokenAddress(), marketUserAlert.getCreateTime(), marketUserAlert.getRuleId());
            } else {
                interfaceC38367pWd.KWHzl(marketUserAlert.getUserId(), marketUserAlert.getInstId(), marketUserAlert.getInstType(), marketUserAlert.getCreateTime(), marketUserAlert.getRuleId());
            }
        }

        public static void KWHzl(@NotNull InterfaceC38367pWd interfaceC38367pWd, @NotNull java.lang.String str, @NotNull java.util.List<MarketUserAlert> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            interfaceC38367pWd.OLrzqt(str);
            interfaceC38367pWd.copydefault(list);
        }

        public static void AEQbTJ(@NotNull InterfaceC38367pWd interfaceC38367pWd, @NotNull java.util.List<MarketUserAlert> list) {
            Intrinsics.checkNotNullParameter(list, "");
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                interfaceC38367pWd.KWHzl((MarketUserAlert) it.next());
            }
        }
    }
}
