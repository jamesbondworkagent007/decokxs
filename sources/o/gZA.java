package o;

import com.okinc.business.dex.trade.order.domain.model.CancelOrReactivateOrderRequest;
import com.okinc.business.dex.trade.order.domain.usecase.CancelOrderUseCase$invoke$1;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gZA {
    public final InterfaceC20053gZd EZpvd;
    public final kYC OLrzqt;

    @yCM
    public gZA(@NotNull kYC kyc, @NotNull InterfaceC20053gZd interfaceC20053gZd) {
        Intrinsics.checkNotNullParameter(kyc, "");
        Intrinsics.checkNotNullParameter(interfaceC20053gZd, "");
        this.OLrzqt = kyc;
        this.EZpvd = interfaceC20053gZd;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super Result<java.lang.Integer>> continuation) {
        CancelOrderUseCase$invoke$1 cancelOrderUseCase$invoke$1;
        if (continuation instanceof CancelOrderUseCase$invoke$1) {
            cancelOrderUseCase$invoke$1 = (CancelOrderUseCase$invoke$1) continuation;
            int i = cancelOrderUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cancelOrderUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                cancelOrderUseCase$invoke$1 = new CancelOrderUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = cancelOrderUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = cancelOrderUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                Result.Application application = Result.Companion;
                InterfaceC20053gZd interfaceC20053gZd = this.EZpvd;
                CancelOrReactivateOrderRequest cancelOrReactivateOrderRequest = new CancelOrReactivateOrderRequest(this.OLrzqt.KWHzl(), list);
                cancelOrderUseCase$invoke$1.label = 1;
                objAEQbTJ = interfaceC20053gZd.AEQbTJ(cancelOrReactivateOrderRequest, cancelOrderUseCase$invoke$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            return Result.m7377constructorimpl(C56443yFo.AEQbTJ(((java.lang.Number) C25389ivm.KWHzl((AbstractC43419rot) objAEQbTJ)).intValue()));
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
