package o;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.trade.features.home.domain.model.BridgeForceUpdateState;
import com.okinc.business.trade.features.home.domain.model.SingleForceUpdateState;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import uniffi.dex.DexStrategyBizMode;

/* JADX INFO: loaded from: classes7.dex */
public interface kYD {
    java.lang.Object AEQbTJ(@NotNull Continuation<? super AbstractC43419rot<BridgeForceUpdateState, OKServerException>> continuation);

    java.util.List<DefiChainInfo> AEQbTJ();

    void AEQbTJ(@NotNull java.util.List<DefiChainInfo> list);

    java.lang.Object AhwBna(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<DefiChainInfo>, OKServerException>> continuation);

    java.lang.Object EZpvd(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<DefiChainInfo>, OKServerException>> continuation);

    void EZpvd();

    java.lang.Object KWHzl(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<DefiChainInfo>, OKServerException>> continuation);

    java.util.List<DefiChainInfo> KWHzl();

    java.lang.Object OLrzqt(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<DefiChainInfo>, OKServerException>> continuation);

    java.util.List<DefiChainInfo> OLrzqt();

    void OLrzqt(@NotNull java.util.List<DefiChainInfo> list);

    java.lang.Object copydefault(@NotNull Continuation<? super AbstractC43419rot<SingleForceUpdateState, OKServerException>> continuation);

    java.util.List<DefiChainInfo> copydefault();

    void copydefault(@NotNull java.util.List<DefiChainInfo> list);

    void copydefault(@NotNull java.util.List<DefiChainInfo> list, @NotNull DexStrategyBizMode dexStrategyBizMode);

    java.lang.Object djBIcL(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<DefiChainInfo>, OKServerException>> continuation);

    java.lang.Object gEmmrt(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<DefiChainInfo>, OKServerException>> continuation);

    java.util.List<DefiChainInfo> gEmmrt();

    java.lang.Object valueOf(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<DefiChainInfo>, OKServerException>> continuation);

    java.util.List<DefiChainInfo> valueOf();
}
