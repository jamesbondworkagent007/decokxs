package o;

import com.okinc.business.dex.trade.order.domain.model.CancelOrReactivateOrderRequest;
import com.okinc.business.dex.trade.order.domain.usecase.ReactivateOrderUseCase$invoke$1;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gZH {
    public final kYC KWHzl;
    public final InterfaceC20053gZd OLrzqt;

    @yCM
    public gZH(@NotNull kYC kyc, @NotNull InterfaceC20053gZd interfaceC20053gZd) {
        Intrinsics.checkNotNullParameter(kyc, "");
        Intrinsics.checkNotNullParameter(interfaceC20053gZd, "");
        this.KWHzl = kyc;
        this.OLrzqt = interfaceC20053gZd;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super Result<java.lang.Integer>> continuation) {
        ReactivateOrderUseCase$invoke$1 reactivateOrderUseCase$invoke$1;
        if (continuation instanceof ReactivateOrderUseCase$invoke$1) {
            reactivateOrderUseCase$invoke$1 = (ReactivateOrderUseCase$invoke$1) continuation;
            int i = reactivateOrderUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reactivateOrderUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                reactivateOrderUseCase$invoke$1 = new ReactivateOrderUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = reactivateOrderUseCase$invoke$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = reactivateOrderUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                Result.Application application = Result.Companion;
                InterfaceC20053gZd interfaceC20053gZd = this.OLrzqt;
                CancelOrReactivateOrderRequest cancelOrReactivateOrderRequest = new CancelOrReactivateOrderRequest(this.KWHzl.KWHzl(), list);
                reactivateOrderUseCase$invoke$1.label = 1;
                objCopydefault = interfaceC20053gZd.copydefault(cancelOrReactivateOrderRequest, reactivateOrderUseCase$invoke$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
            }
            return Result.m7377constructorimpl(C56443yFo.AEQbTJ(((java.lang.Number) C25389ivm.KWHzl((AbstractC43419rot) objCopydefault)).intValue()));
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
