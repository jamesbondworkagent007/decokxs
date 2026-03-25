package o;

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
import com.okinc.business.dex.trade.core.domain.model.limit.PairRateParams;
import com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateQuote;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface gYO {
    java.lang.Object AEQbTJ(@NotNull V6QuoteRequest v6QuoteRequest, @NotNull Continuation<? super AbstractC43419rot<V6QuoteResponseData, OKServerException>> continuation);

    java.lang.Object AEQbTJ(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull V6QuoteAndCalldataRequest v6QuoteAndCalldataRequest, @NotNull Continuation<? super AbstractC43419rot<V6QuoteAndCalldataResponseData, OKServerException>> continuation);

    java.lang.Object KWHzl(@NotNull V6BatchBroadcastRequest v6BatchBroadcastRequest, @NotNull Continuation<? super AbstractC43419rot<V6BatchBroadcastResponseData, ? extends java.lang.Exception>> continuation);

    java.lang.Object KWHzl(@NotNull V6CalldataRequest v6CalldataRequest, @NotNull Continuation<? super AbstractC43419rot<V6CalldataResponseData, OKServerException>> continuation);

    java.lang.Object copydefault(@NotNull PairRateParams pairRateParams, @NotNull Continuation<? super AbstractC43419rot<TokenPairRateQuote, OKServerException>> continuation);

    java.lang.Object copydefault(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull V6BroadcastRequest v6BroadcastRequest, @NotNull Continuation<? super AbstractC43419rot<V6BroadcastResponseData, ? extends java.lang.Exception>> continuation);
}
