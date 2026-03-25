package com.okinc.business.market.features.alert.core;

import com.okinc.business.market.data.model.alert.AlertListRequest;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C2185ACa;
import o.C25798jGt;
import o.C33077mpe;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.alert.core.AlertCoreAdapter$checkAlertListEmpty-gIAlu-s$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class AlertCoreAdapter$checkAlertListEmptygIAlus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Boolean>>, Object> {
    final /* synthetic */ AlertListRequest $alertListRequest$inlined;
    int label;
    final /* synthetic */ C25798jGt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertCoreAdapter$checkAlertListEmptygIAlus$$inlined$dexRunCatching$1(Continuation continuation, C25798jGt c25798jGt, AlertListRequest alertListRequest) {
        super(2, continuation);
        this.this$0 = c25798jGt;
        this.$alertListRequest$inlined = alertListRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AlertCoreAdapter$checkAlertListEmptygIAlus$$inlined$dexRunCatching$1(continuation, this.this$0, this.$alertListRequest$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Boolean>> continuation) {
        return ((AlertCoreAdapter$checkAlertListEmptygIAlus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                pUU.KWHzl("AlertCoreAdapter", "checkAlertListEmpty");
                C2185ACa c2185ACaKWHzl = this.this$0.EZpvd().KWHzl(this.$alertListRequest$inlined.KWHzl(), this.$alertListRequest$inlined.copydefault(), this.$alertListRequest$inlined.OLrzqt());
                C33077mpe c33077mpe = new C33077mpe(new AlertCoreAdapter$checkAlertListEmpty$2$1(c2185ACaKWHzl), new AlertCoreAdapter$checkAlertListEmpty$2$2(c2185ACaKWHzl), new AlertCoreAdapter$checkAlertListEmpty$2$3(c2185ACaKWHzl), new AlertCoreAdapter$checkAlertListEmpty$2$4(c2185ACaKWHzl), this.this$0.copydefault);
                this.label = 1;
                objAEQbTJ = c33077mpe.AEQbTJ(this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = ((Result) obj).m7386unboximpl();
            }
            if (Result.m7384isSuccessimpl(objAEQbTJ)) {
                pUU.KWHzl("AlertCoreAdapter", "checkAlertListEmpty success, isEmpty=" + ((List) objAEQbTJ).isEmpty());
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
            objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(((List) objAEQbTJ).isEmpty()));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
