package o;

import com.okinc.business.dexlogic.bean.CheckServiceOfflineBean;
import com.okinc.business.dexlogic.bean.DexMultiTokenDetailReq;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.MarketTokenCheckBeanParams;
import com.okinc.business.dexlogic.main.market.bean.CoinDetailTradeJumpBean;
import com.okinc.business.market.data.repository.MarketTradeRepositoryImpl$addToken$2;
import com.okinc.business.market.data.repository.MarketTradeRepositoryImpl$checkSwapServiceOffline$2;
import com.okinc.business.market.data.repository.MarketTradeRepositoryImpl$checkTokensToTrade$2;
import com.okinc.core.util.SPUtils;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jyW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27613jyW implements InterfaceC27611jyU {
    public final InterfaceC23234huQ KWHzl;

    @yCM
    public C27613jyW(@NotNull InterfaceC23234huQ interfaceC23234huQ) {
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        this.KWHzl = interfaceC23234huQ;
    }

    @Override // o.InterfaceC27611jyU
    public java.lang.Object OLrzqt(@NotNull MarketTokenCheckBeanParams marketTokenCheckBeanParams, @NotNull Continuation<? super AbstractC43419rot<CoinDetailTradeJumpBean, OKServerException>> continuation) {
        return kAB.EZpvd(new MarketTradeRepositoryImpl$checkTokensToTrade$2(this, marketTokenCheckBeanParams, null), continuation);
    }

    @Override // o.InterfaceC27611jyU
    public java.lang.Object KWHzl(@NotNull DexMultiTokenDetailReq dexMultiTokenDetailReq, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<DexMultiTokenInfoBean>, OKServerException>> continuation) {
        return kAB.EZpvd(new MarketTradeRepositoryImpl$addToken$2(this, dexMultiTokenDetailReq, null), continuation);
    }

    @Override // o.InterfaceC27611jyU
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super AbstractC43419rot<CheckServiceOfflineBean, OKServerException>> continuation) {
        return kAB.EZpvd(new MarketTradeRepositoryImpl$checkSwapServiceOffline$2(this, null), continuation);
    }

    @Override // o.InterfaceC27611jyU
    public java.lang.Object OLrzqt(boolean z, @NotNull Continuation<? super Unit> continuation) {
        SPUtils.put("dex_market_history_selected_is_token", C56443yFo.KWHzl(z), "dex_market");
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC27611jyU
    public java.lang.Object EZpvd(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return C56443yFo.KWHzl(SPUtils.getBoolean("dex_market_history_selected_is_token", false, "dex_market"));
    }
}
