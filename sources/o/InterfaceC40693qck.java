package o;

import com.okinc.business.market.bean.CoinQuote;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qck, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC40693qck {
    boolean AEQbTJ(@NotNull android.view.View view, @NotNull CoinQuote coinQuote, int i, @NotNull java.lang.String str, @NotNull java.lang.String str2);

    void EZpvd(@NotNull android.view.View view, @NotNull TradeCoinInfo tradeCoinInfo, int i);

    void OLrzqt(@NotNull android.view.View view, @NotNull BizInstrument bizInstrument, int i, boolean z);

    void OLrzqt(@NotNull android.view.View view, @NotNull InterfaceC41655qus interfaceC41655qus, int i, boolean z, boolean z2, java.lang.String str, java.lang.String str2);

    /* JADX INFO: renamed from: o.qck$Application */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class Application {
        public static /* synthetic */ void onLongClickInstrument$default(InterfaceC40693qck interfaceC40693qck, android.view.View view, BizInstrument bizInstrument, int i, boolean z, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onLongClickInstrument");
            }
            if ((i2 & 8) != 0) {
                z = false;
            }
            interfaceC40693qck.OLrzqt(view, bizInstrument, i, z);
        }

        public static /* synthetic */ void onLongClickInstrument$default(InterfaceC40693qck interfaceC40693qck, android.view.View view, InterfaceC41655qus interfaceC41655qus, int i, boolean z, boolean z2, java.lang.String str, java.lang.String str2, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onLongClickInstrument");
            }
            interfaceC40693qck.OLrzqt(view, interfaceC41655qus, i, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? null : str, (i2 & 64) != 0 ? null : str2);
        }
    }
}
