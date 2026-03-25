package o;

import com.okinc.business.trade.features.home.meme.repository.MemeOpenOrderRepositoryImpl$openOrders$2;
import com.okinc.business.trade.features.home.ui.meme.data.OpenOrderData;
import com.okinc.business.trade.features.home.ui.meme.data.OpenOrderReq;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kVx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28289kVx implements InterfaceC28288kVw {
    public final InterfaceC23234huQ EZpvd;

    @yCM
    public C28289kVx(@NotNull InterfaceC23234huQ interfaceC23234huQ) {
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        this.EZpvd = interfaceC23234huQ;
    }

    @Override // o.InterfaceC28288kVw
    public java.lang.Object AEQbTJ(@NotNull OpenOrderReq openOrderReq, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<OpenOrderData>, OKServerException>> continuation) {
        return kAB.EZpvd(new MemeOpenOrderRepositoryImpl$openOrders$2(this, openOrderReq, null), continuation);
    }
}
