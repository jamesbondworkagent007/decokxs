package o;

import com.okinc.business.dex.trade.order.domain.model.GetOrderCountRequest;
import com.okinc.business.dex.trade.order.domain.model.OrderCountResponse;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gZF {
    public final InterfaceC20053gZd EZpvd;

    @yCM
    public gZF(@NotNull InterfaceC20053gZd interfaceC20053gZd) {
        Intrinsics.checkNotNullParameter(interfaceC20053gZd, "");
        this.EZpvd = interfaceC20053gZd;
    }

    public final java.lang.Object AEQbTJ(@NotNull GetOrderCountRequest getOrderCountRequest, @NotNull Continuation<? super AbstractC43419rot<OrderCountResponse, OKServerException>> continuation) {
        return this.EZpvd.EZpvd(getOrderCountRequest, continuation);
    }
}
