package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.DexInstrument;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pZu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC38465pZu {
    void AEQbTJ(@NotNull TradeCoinInfo tradeCoinInfo, int i, @NotNull java.lang.String str);

    void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull DexInstrument dexInstrument, int i, java.lang.String str3, java.lang.String str4, java.lang.Boolean bool);

    void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull BizInstrument bizInstrument, int i, java.lang.String str3);

    /* JADX INFO: renamed from: o.pZu$Activity */
    public static final class Activity {
        public static /* synthetic */ void navigateInstrumentDetailPage$default(InterfaceC38465pZu interfaceC38465pZu, java.lang.String str, java.lang.String str2, BizInstrument bizInstrument, int i, java.lang.String str3, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateInstrumentDetailPage");
            }
            if ((i2 & 16) != 0) {
                str3 = null;
            }
            interfaceC38465pZu.OLrzqt(str, str2, bizInstrument, i, str3);
        }

        public static /* synthetic */ void navigateInstrumentDetailPage$default(InterfaceC38465pZu interfaceC38465pZu, java.lang.String str, java.lang.String str2, DexInstrument dexInstrument, int i, java.lang.String str3, java.lang.String str4, java.lang.Boolean bool, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateInstrumentDetailPage");
            }
            interfaceC38465pZu.KWHzl(str, str2, dexInstrument, i, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? java.lang.Boolean.FALSE : bool);
        }
    }
}
