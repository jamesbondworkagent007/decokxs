package o;

import com.okinc.business.dexlogic.bean.CheckServiceOfflineBean;
import com.okinc.business.dexlogic.bean.DexMultiTokenDetailReq;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.MarketTokenCheckBeanParams;
import com.okinc.business.dexlogic.main.market.bean.CoinDetailTradeJumpBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jyU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC27611jyU {
    java.lang.Object AEQbTJ(@NotNull Continuation<? super AbstractC43419rot<CheckServiceOfflineBean, OKServerException>> continuation);

    java.lang.Object EZpvd(@NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object KWHzl(@NotNull DexMultiTokenDetailReq dexMultiTokenDetailReq, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<DexMultiTokenInfoBean>, OKServerException>> continuation);

    java.lang.Object OLrzqt(@NotNull MarketTokenCheckBeanParams marketTokenCheckBeanParams, @NotNull Continuation<? super AbstractC43419rot<CoinDetailTradeJumpBean, OKServerException>> continuation);

    java.lang.Object OLrzqt(boolean z, @NotNull Continuation<? super Unit> continuation);
}
