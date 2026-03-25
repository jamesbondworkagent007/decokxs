package o;

import com.okinc.market.common.biz_spot.bean.DefiWebCoins;
import com.okinc.market.search.features.main.recommend.history.data.model.Product;
import com.okinc.market.search.features.main.result.ui.SubPage;
import com.okinc.market.search.features.main.root.data.po.P2pAndDeposit;
import com.okinc.market.search.features.main.root.data.po.SearchTrader;
import com.okinc.market.search.features.main.root.data.po.TradingStrategy;
import com.okinc.unify_trade.biz.BizInstrument;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public interface qHM {
    void AEQbTJ(@NotNull P2pAndDeposit p2pAndDeposit, int i);

    void AEQbTJ(@NotNull C39991qFh c39991qFh, int i);

    void AEQbTJ(@NotNull C39992qFi c39992qFi, int i);

    void EZpvd(@NotNull DefiWebCoins defiWebCoins, int i);

    void EZpvd(@NotNull C39993qFj c39993qFj, int i);

    void EZpvd(@NotNull C39997qFn c39997qFn, int i);

    void KWHzl(@NotNull TradingStrategy tradingStrategy, int i);

    void OLrzqt(@NotNull Product product, int i);

    void OLrzqt(@NotNull P2pAndDeposit p2pAndDeposit, int i);

    void OLrzqt(@NotNull BizInstrument bizInstrument, int i, SubPage subPage, java.lang.String str, boolean z, boolean z2);

    void copydefault(@NotNull SearchTrader searchTrader, int i);

    void copydefault(@NotNull java.lang.String str);

    void copydefault(@NotNull C40004qFu c40004qFu, int i, java.lang.String str);

    public static final class StateListAnimator {
        public static /* synthetic */ void navigateInstrumentDetailPage$default(qHM qhm, BizInstrument bizInstrument, int i, SubPage subPage, java.lang.String str, boolean z, boolean z2, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateInstrumentDetailPage");
            }
            if ((i2 & 32) != 0) {
                z2 = true;
            }
            qhm.OLrzqt(bizInstrument, i, subPage, str, z, z2);
        }
    }
}
