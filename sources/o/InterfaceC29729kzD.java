package o;

import com.okinc.business.market.data.model.traders.TradersData;
import com.okinc.business.market.data.model.traders.TradersWrapperData;
import com.okinc.business.market.features.trader.domain.model.TradersRequestParam;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kzD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC29729kzD {
    void AEQbTJ();

    java.lang.Object KWHzl(@NotNull TradersRequestParam tradersRequestParam, @NotNull Continuation<? super Flow<? extends java.util.List<TradersData>>> continuation);

    java.lang.Object copydefault(@NotNull TradersRequestParam tradersRequestParam, @NotNull Continuation<? super AbstractC43419rot<TradersWrapperData, OKServerException>> continuation);
}
