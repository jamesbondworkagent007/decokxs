package o;

import com.okinc.market.common.biz_spot.bean.DefiWebCoins;
import com.okinc.market.search.features.main.entry.ui.model.SearchRecommendVo;
import com.okinc.market.search.features.main.recommend.history.data.model.Product;
import com.okinc.market.search.features.main.result.ui.SubPage;
import com.okinc.market.search.features.main.root.data.po.P2pAndDeposit;
import com.okinc.market.search.features.main.root.data.po.P2pAndDepositHistory;
import com.okinc.market.search.features.main.root.data.po.SearchTrader;
import com.okinc.market.search.features.main.root.data.po.TradingStrategy;
import com.okinc.unify_trade.biz.BizInstrument;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public interface qHN {
    void AEQbTJ(int i);

    void AEQbTJ(@NotNull DefiWebCoins defiWebCoins);

    void AEQbTJ(@NotNull TradingStrategy tradingStrategy, int i);

    void AEQbTJ(@NotNull BizInstrument bizInstrument, boolean z);

    void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3);

    void AEQbTJ(@NotNull qID qid);

    void AEQbTJ(boolean z);

    void AYXKKw();

    void AhwBna();

    void AkhnZx();

    void DbNXlk();

    void EZpvd(SearchRecommendVo searchRecommendVo);

    void EZpvd(@NotNull SearchTrader searchTrader);

    void EZpvd(@NotNull BizInstrument bizInstrument, int i);

    void EZpvd(@NotNull java.lang.String str);

    void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3);

    void EZpvd(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4);

    void EZpvd(@NotNull C39991qFh c39991qFh, int i);

    void KWHzl(@NotNull P2pAndDeposit p2pAndDeposit, boolean z);

    void KWHzl(@NotNull P2pAndDepositHistory p2pAndDepositHistory);

    void KWHzl(@NotNull BizInstrument bizInstrument, int i, SubPage subPage, java.lang.String str, boolean z);

    void KWHzl(@NotNull java.lang.String str);

    void KWHzl(java.lang.String str, java.lang.String str2, int i, @NotNull java.lang.String str3);

    void KWHzl(@NotNull C39997qFn c39997qFn, int i);

    void KWHzl(@NotNull C40004qFu c40004qFu, int i);

    void OLrzqt(@NotNull BizInstrument bizInstrument);

    void OLrzqt(@NotNull BizInstrument bizInstrument, @NotNull SubPage subPage, int i);

    void OLrzqt(java.lang.String str);

    void a_(@NotNull DefiWebCoins defiWebCoins, int i);

    void a_(@NotNull SearchTrader searchTrader, int i);

    void copydefault(int i, @NotNull SubPage subPage);

    void copydefault(@NotNull Product product);

    void copydefault(@NotNull Product product, int i);

    void copydefault(@NotNull P2pAndDepositHistory p2pAndDepositHistory);

    void copydefault(@NotNull TradingStrategy tradingStrategy);

    void copydefault(@NotNull BizInstrument bizInstrument, int i);

    void copydefault(@NotNull C40081qIq c40081qIq, @NotNull java.lang.String str, boolean z);

    void djBIcL(java.lang.String str);

    void fIwbmz();

    void fetchVPNInfo();

    void gEmmrt();

    void isConnected();

    void m_(java.lang.String str);

    void values();
}
