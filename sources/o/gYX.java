package o;

import androidx.core.app.FrameMetricsAggregator;
import com.okinc.business.dex.trade.core.domain.model.V6BatchBroadcastRequest;
import com.okinc.business.dex.trade.core.domain.model.V6BatchBroadcastResponseData;
import com.okinc.business.dex.trade.core.domain.model.V6BroadcastRequest;
import com.okinc.business.dex.trade.core.domain.model.V6BroadcastResponseData;
import com.okinc.business.dex.trade.core.domain.model.V6CalldataRequest;
import com.okinc.business.dex.trade.core.domain.model.V6CalldataResponseData;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataRequest;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataResponseData;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteRequest;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteResponseData;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo;
import com.okinc.network.okg.response.OKServerException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import o.gYS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gYX {
    public final kTW AEQbTJ;
    public final gYO EZpvd;

    @yCM
    public gYX(@NotNull gYO gyo, @NotNull kTW ktw) {
        Intrinsics.checkNotNullParameter(gyo, "");
        Intrinsics.checkNotNullParameter(ktw, "");
        this.EZpvd = gyo;
        this.AEQbTJ = ktw;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.dex.trade.core.domain.model.V6QuoteRequest.copy$default(com.okinc.business.dex.trade.core.domain.model.V6QuoteRequest, java.lang.String, java.lang.String, com.okinc.business.dex.trade.core.domain.model.common.SlippageConfig, com.okinc.business.dex.trade.core.domain.model.common.LiquidityConfig, com.okinc.business.dex.trade.core.domain.model.common.QuoteExt, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.trade.core.domain.model.common.AccountInfo, int, java.lang.Object):com.okinc.business.dex.trade.core.domain.model.V6QuoteRequest */
    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.dex.trade.core.domain.model.common.AccountInfo.copy$default(com.okinc.business.dex.trade.core.domain.model.common.AccountInfo, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.String, int, java.lang.Object):com.okinc.business.dex.trade.core.domain.model.common.AccountInfo */
    public final java.lang.Object EZpvd(@NotNull V6QuoteRequest v6QuoteRequest, @NotNull Continuation<? super AbstractC43419rot<V6QuoteResponseData, OKServerException>> continuation) {
        gYO gyo = this.EZpvd;
        AccountInfo accountInfo = v6QuoteRequest.getAccountInfo();
        return gyo.AEQbTJ(v6QuoteRequest.copy((FrameMetricsAggregator.EVERY_DURATION & 1) != 0 ? v6QuoteRequest.userWalletAddress : null, (FrameMetricsAggregator.EVERY_DURATION & 2) != 0 ? v6QuoteRequest.tradeMode : null, (FrameMetricsAggregator.EVERY_DURATION & 4) != 0 ? v6QuoteRequest.slippageConfig : null, (FrameMetricsAggregator.EVERY_DURATION & 8) != 0 ? v6QuoteRequest.liquidityConfig : null, (FrameMetricsAggregator.EVERY_DURATION & 16) != 0 ? v6QuoteRequest.ext : null, (FrameMetricsAggregator.EVERY_DURATION & 32) != 0 ? v6QuoteRequest.chainId : null, (FrameMetricsAggregator.EVERY_DURATION & 64) != 0 ? v6QuoteRequest.fromTokenAddress : null, (FrameMetricsAggregator.EVERY_DURATION & 128) != 0 ? v6QuoteRequest.toTokenAddress : null, (FrameMetricsAggregator.EVERY_DURATION & 256) != 0 ? v6QuoteRequest.amount : null, (FrameMetricsAggregator.EVERY_DURATION & 512) != 0 ? v6QuoteRequest.accountInfo : accountInfo != null ? AccountInfo.copy$default(accountInfo, null, null, C56443yFo.KWHzl(this.AEQbTJ.copydefault()), null, 11, null) : null), continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull V6CalldataRequest v6CalldataRequest, @NotNull Continuation<? super AbstractC43419rot<V6CalldataResponseData, OKServerException>> continuation) {
        return this.EZpvd.KWHzl(v6CalldataRequest, continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull V6QuoteAndCalldataRequest v6QuoteAndCalldataRequest, @NotNull Continuation<? super AbstractC43419rot<V6QuoteAndCalldataResponseData, OKServerException>> continuation) {
        return this.EZpvd.AEQbTJ(map, v6QuoteAndCalldataRequest, continuation);
    }

    public final java.lang.Object EZpvd(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull V6BroadcastRequest v6BroadcastRequest, @NotNull Continuation<? super AbstractC43419rot<V6BroadcastResponseData, ? extends java.lang.Exception>> continuation) {
        return this.EZpvd.copydefault(map, v6BroadcastRequest, continuation);
    }

    public final java.lang.Object EZpvd(@NotNull V6BatchBroadcastRequest v6BatchBroadcastRequest, @NotNull Continuation<? super AbstractC43419rot<V6BatchBroadcastResponseData, ? extends java.lang.Exception>> continuation) {
        return this.EZpvd.KWHzl(v6BatchBroadcastRequest, continuation);
    }

    public static /* synthetic */ Flow pollByStrategy$default(gYX gyx, gYS gys, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 5000;
        }
        return gyx.copydefault(gys, j);
    }

    public final Flow<gYP> copydefault(@NotNull gYS gys, long j) {
        gYU gyr;
        Intrinsics.checkNotNullParameter(gys, "");
        if (gys instanceof gYS.Application) {
            gyr = new gYW(this.EZpvd);
        } else if (gys instanceof gYS.Activity) {
            gyr = new gYV(this.EZpvd);
        } else {
            if (!(gys instanceof gYS.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            gyr = new gYR(this.EZpvd);
        }
        return gyr.AEQbTJ(gys, j);
    }
}
