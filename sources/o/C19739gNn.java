package o;

import com.okinc.business.dex.tee.domain.model.CreateOrderParams;
import com.okinc.business.dex.tee.domain.usecase.limit.TeeLimitOrderPlaceOrderUseCase$createOrder$1;
import com.okinc.business.dex.tee.domain.usecase.limit.TeeLimitOrderPlaceOrderUseCase$createOrdergIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailBean;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gNn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19739gNn {
    public final InterfaceC19729gNd EZpvd;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public C19739gNn(@NotNull InterfaceC19729gNd interfaceC19729gNd, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC19729gNd, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = interfaceC19729gNd;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull CreateOrderParams createOrderParams, @NotNull Continuation<? super Result<LimitOrderDetailBean>> continuation) {
        TeeLimitOrderPlaceOrderUseCase$createOrder$1 teeLimitOrderPlaceOrderUseCase$createOrder$1;
        if (continuation instanceof TeeLimitOrderPlaceOrderUseCase$createOrder$1) {
            teeLimitOrderPlaceOrderUseCase$createOrder$1 = (TeeLimitOrderPlaceOrderUseCase$createOrder$1) continuation;
            int i = teeLimitOrderPlaceOrderUseCase$createOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                teeLimitOrderPlaceOrderUseCase$createOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                teeLimitOrderPlaceOrderUseCase$createOrder$1 = new TeeLimitOrderPlaceOrderUseCase$createOrder$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = teeLimitOrderPlaceOrderUseCase$createOrder$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = teeLimitOrderPlaceOrderUseCase$createOrder$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            TeeLimitOrderPlaceOrderUseCase$createOrdergIAlus$$inlined$dexRunCatching$1 teeLimitOrderPlaceOrderUseCase$createOrdergIAlus$$inlined$dexRunCatching$1 = new TeeLimitOrderPlaceOrderUseCase$createOrdergIAlus$$inlined$dexRunCatching$1(null, this, createOrderParams);
            teeLimitOrderPlaceOrderUseCase$createOrder$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, teeLimitOrderPlaceOrderUseCase$createOrdergIAlus$$inlined$dexRunCatching$1, teeLimitOrderPlaceOrderUseCase$createOrder$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }
}
