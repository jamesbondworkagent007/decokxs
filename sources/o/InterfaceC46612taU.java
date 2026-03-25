package o;

import com.okinc.kline.api.bean.MarketCoinInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.taU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC46612taU {
    void copydefault(MarketCoinInfo marketCoinInfo, InterfaceC41655qus interfaceC41655qus, java.lang.String str, java.lang.Integer num, @NotNull java.lang.String str2);

    /* JADX INFO: renamed from: o.taU$ActionBar */
    public static final class ActionBar {
        public static /* synthetic */ void navToKlinePage$default(InterfaceC46612taU interfaceC46612taU, MarketCoinInfo marketCoinInfo, InterfaceC41655qus interfaceC41655qus, java.lang.String str, java.lang.Integer num, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navToKlinePage");
            }
            interfaceC46612taU.copydefault((i & 1) != 0 ? null : marketCoinInfo, (i & 2) != 0 ? null : interfaceC41655qus, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num, str2);
        }
    }
}
