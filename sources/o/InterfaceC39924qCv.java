package o;

import com.okinc.market.common.biz_spot.bean.DefiWebCoins;
import com.okinc.market.search.features.main.recommend.history.data.model.Product;
import com.okinc.market.search.features.main.root.data.po.P2pAndDepositHistory;
import com.okinc.market.search.features.main.root.data.po.SearchTrader;
import com.okinc.market.search.features.main.root.data.po.TradingStrategy;
import com.okinc.p2p.api.OtcRouteConst;
import com.okinc.unify_trade.trade.source.SearchTradeBizInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qCv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC39924qCv {
    void AEQbTJ();

    java.util.List<java.lang.Object> EZpvd();

    void KWHzl(@NotNull java.lang.Object obj);

    /* JADX INFO: renamed from: o.qCv$TaskDescription */
    public static final class TaskDescription {
        public static java.lang.String EZpvd(@NotNull InterfaceC39924qCv interfaceC39924qCv, @NotNull java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            if (obj instanceof SearchTrader) {
                SearchTrader searchTrader = (SearchTrader) obj;
                return searchTrader.getNickNameCn() + searchTrader.getNickNameEn();
            }
            if (obj instanceof SearchTradeBizInfo) {
                SearchTradeBizInfo searchTradeBizInfo = (SearchTradeBizInfo) obj;
                return searchTradeBizInfo.getInstId() + searchTradeBizInfo.getAlias() + searchTradeBizInfo.getInstType() + searchTradeBizInfo.getIndex();
            }
            if (obj instanceof Product) {
                return C39916qCn.copydefault((Product) obj);
            }
            if (obj instanceof TradingStrategy) {
                return qGH.KWHzl((TradingStrategy) obj);
            }
            if (obj instanceof DefiWebCoins) {
                return pWR.EZpvd((DefiWebCoins) obj);
            }
            if (!(obj instanceof P2pAndDepositHistory)) {
                return null;
            }
            P2pAndDepositHistory p2pAndDepositHistory = (P2pAndDepositHistory) obj;
            return p2pAndDepositHistory.getP2pData().getCcy() + (p2pAndDepositHistory.isP2p() ? OtcRouteConst.P2P : "deposit");
        }
    }
}
