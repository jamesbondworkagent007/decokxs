package com.okinc.business.market.features.alert.core;

import com.okinc.business.market.data.model.alert.CheckSubscribeRequest;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.BeZ;
import o.C25798jGt;
import o.C33077mpe;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.alert.core.AlertCoreAdapter$checkCoinAlertSubscribeStatus-gIAlu-s$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class AlertCoreAdapter$checkCoinAlertSubscribeStatusgIAlus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Integer>>, Object> {
    final /* synthetic */ CheckSubscribeRequest $request$inlined;
    int label;
    final /* synthetic */ C25798jGt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertCoreAdapter$checkCoinAlertSubscribeStatusgIAlus$$inlined$dexRunCatching$1(Continuation continuation, C25798jGt c25798jGt, CheckSubscribeRequest checkSubscribeRequest) {
        super(2, continuation);
        this.this$0 = c25798jGt;
        this.$request$inlined = checkSubscribeRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AlertCoreAdapter$checkCoinAlertSubscribeStatusgIAlus$$inlined$dexRunCatching$1(continuation, this.this$0, this.$request$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Integer>> continuation) {
        return ((AlertCoreAdapter$checkCoinAlertSubscribeStatusgIAlus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                pUU.KWHzl("AlertCoreAdapter", "checkCoinAlertSubscribeStatus");
                BeZ beZAEQbTJ = this.this$0.EZpvd().AEQbTJ(this.$request$inlined.copydefault(), this.$request$inlined.KWHzl(), this.$request$inlined.EZpvd());
                C33077mpe c33077mpe = new C33077mpe(new AlertCoreAdapter$checkCoinAlertSubscribeStatus$2$1(beZAEQbTJ), new AlertCoreAdapter$checkCoinAlertSubscribeStatus$2$2(beZAEQbTJ), new AlertCoreAdapter$checkCoinAlertSubscribeStatus$2$3(beZAEQbTJ), new AlertCoreAdapter$checkCoinAlertSubscribeStatus$2$4(beZAEQbTJ), this.this$0.copydefault);
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
                pUU.KWHzl("AlertCoreAdapter", "checkCoinAlertSubscribeStatus success value=" + ((Number) objAEQbTJ).intValue());
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
            objM7377constructorimpl = Result.m7377constructorimpl(objAEQbTJ);
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
