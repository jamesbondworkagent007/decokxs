package o;

import com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo;
import com.okinc.business.invest_biz.data.bean.request.InvestOrderDetailsPageParam;
import com.okinc.business.invest_biz.data.logic.net.InvestNetworkManagerImpl$getOrderDetails$2;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@yCR
public final class iBE implements iBH {
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC23589iBz OLrzqt;

    @yCM
    public iBE(@NotNull InterfaceC23589iBz interfaceC23589iBz, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23589iBz, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = interfaceC23589iBz;
        this.EZpvd = coroutineDispatcher;
    }

    @Override // o.iBH
    public java.lang.Object copydefault(@NotNull InvestOrderDetailsPageParam investOrderDetailsPageParam, @NotNull Continuation<? super ResponseData<InvestOrderDetailsInfoVo>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new InvestNetworkManagerImpl$getOrderDetails$2(this, investOrderDetailsPageParam, null), continuation);
    }
}
