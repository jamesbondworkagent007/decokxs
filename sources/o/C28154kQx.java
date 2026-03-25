package o;

import com.google.gson.JsonObject;
import com.okinc.business.dexlogic.bean.TokenMarketInfoResponse;
import com.okinc.business.dexlogic.bean.TokenPriceResponse;
import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.business.market.data.model.history.HistoryChangeFilterRequest;
import com.okinc.business.market.data.model.history.HistoryChangeResponse;
import com.okinc.business.trade.features.home.advanced.repository.AdvancedMarketInfoRepoImpl$fetchHistoryList$2;
import com.okinc.business.trade.features.home.advanced.repository.AdvancedMarketInfoRepoImpl$fetchMarketInfo$2;
import com.okinc.business.trade.features.home.advanced.repository.AdvancedMarketInfoRepoImpl$fetchTokenPrice$2;
import com.okinc.business.trade.features.home.advanced.repository.AdvancedMarketInfoRepoImpl$getKLineTokenInfo$2;
import com.okinc.business.trade.features.home.advanced.repository.AdvancedMarketInfoRepoImpl$getOrderBookFilters$2;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedOrderBookFilter;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kQx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28154kQx implements InterfaceC28152kQv {
    public final InterfaceC23229huL AEQbTJ;
    public final InterfaceC23234huQ EZpvd;
    public final C27640jyx OLrzqt;
    public final C27640jyx copydefault;

    @yCM
    public C28154kQx(@yCL(AEQbTJ = "public_client") @NotNull C27640jyx c27640jyx, @yCL(AEQbTJ = "private_client") @NotNull C27640jyx c27640jyx2, @NotNull InterfaceC23234huQ interfaceC23234huQ, @NotNull InterfaceC23229huL interfaceC23229huL) {
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(c27640jyx2, "");
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        this.OLrzqt = c27640jyx;
        this.copydefault = c27640jyx2;
        this.EZpvd = interfaceC23234huQ;
        this.AEQbTJ = interfaceC23229huL;
    }

    @Override // o.InterfaceC28152kQv
    public java.lang.Object AEQbTJ(@NotNull C27614jyX c27614jyX, @NotNull Continuation<? super Unit> continuation) {
        this.OLrzqt.copydefault("dex-market-v3", yDY.copydefault(new WsArgV5ForWeb3("dex-market-v3", null, c27614jyX.AEQbTJ(), c27614jyX.EZpvd(), null, 18, null)));
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC28152kQv
    public java.lang.Object OLrzqt(@NotNull C27614jyX c27614jyX, @NotNull Continuation<? super Unit> continuation) {
        this.OLrzqt.copydefault("dex-market-trade-history-batch", yDY.copydefault(new WsArgV5ForWeb3("dex-market-trade-history-batch", null, c27614jyX.AEQbTJ(), c27614jyX.EZpvd(), null, 18, null)));
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC28152kQv
    public java.lang.Object KWHzl(@NotNull JsonObject jsonObject, @NotNull Continuation<? super Unit> continuation) {
        this.OLrzqt.copydefault("dex-market-trade-history", yDY.copydefault(new WsArgV5ForWeb3("dex-market-trade-history", null, null, null, jsonObject, 14, null)));
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC28152kQv
    public java.lang.Object EZpvd(@NotNull Continuation<? super Flow<? extends kotlin.Pair<java.lang.String, ? extends java.util.HashMap<java.lang.String, java.lang.String>>>> continuation) {
        return this.OLrzqt.KWHzl();
    }

    @Override // o.InterfaceC28152kQv
    public java.lang.Object copydefault(@NotNull Continuation<? super Flow<? extends kotlin.Pair<java.lang.String, ? extends java.util.HashMap<java.lang.String, java.lang.String>>>> continuation) {
        return this.copydefault.KWHzl();
    }

    @Override // o.InterfaceC28152kQv
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<AdvancedOrderBookFilter>, OKServerException>> continuation) {
        return kAB.EZpvd(new AdvancedMarketInfoRepoImpl$getOrderBookFilters$2(this, null), continuation);
    }

    @Override // o.InterfaceC28152kQv
    public java.lang.Object AEQbTJ(@NotNull HistoryChangeFilterRequest historyChangeFilterRequest, @NotNull Continuation<? super AbstractC43419rot<HistoryChangeResponse, OKServerException>> continuation) {
        return kAB.EZpvd(new AdvancedMarketInfoRepoImpl$fetchHistoryList$2(this, historyChangeFilterRequest, null), continuation);
    }

    @Override // o.InterfaceC28152kQv
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<TokenPriceResponse, OKServerException>> continuation) {
        return kAB.EZpvd(new AdvancedMarketInfoRepoImpl$fetchTokenPrice$2(this, str, str2, null), continuation);
    }

    @Override // o.InterfaceC28152kQv
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<TokenMarketInfoResponse, OKServerException>> continuation) {
        return kAB.EZpvd(new AdvancedMarketInfoRepoImpl$fetchMarketInfo$2(this, str, str2, null), continuation);
    }

    @Override // o.InterfaceC28152kQv
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull Continuation<? super AbstractC43419rot<LatestMarketInfoBean, OKServerException>> continuation) {
        return kAB.EZpvd(new AdvancedMarketInfoRepoImpl$getKLineTokenInfo$2(this, str2, str3, str, str4, null), continuation);
    }

    @Override // o.InterfaceC28152kQv
    public void KWHzl(java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "dex-market-trade-history-batch")) {
            this.OLrzqt.AEQbTJ(str);
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "dex-market-trade-history")) {
            this.copydefault.AEQbTJ(str);
        } else {
            this.OLrzqt.AEQbTJ();
        }
    }
}
