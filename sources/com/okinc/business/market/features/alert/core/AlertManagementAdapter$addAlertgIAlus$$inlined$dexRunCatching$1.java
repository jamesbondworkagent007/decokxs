package com.okinc.business.market.features.alert.core;

import com.okinc.business.market.data.model.alert.AlertCreateRequest;
import com.okinc.business.market.data.model.alert.AlertCreateResponse;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.ABO;
import o.C25802jGx;
import o.C33077mpe;
import o.C4178Azu;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.alert.core.AlertManagementAdapter$addAlert-gIAlu-s$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes18.dex */
public final class AlertManagementAdapter$addAlertgIAlus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends AlertCreateResponse>>, Object> {
    final /* synthetic */ AlertCreateRequest $alertCreateRequest$inlined;
    Object L$0;
    int label;
    final /* synthetic */ C25802jGx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertManagementAdapter$addAlertgIAlus$$inlined$dexRunCatching$1(Continuation continuation, C25802jGx c25802jGx, AlertCreateRequest alertCreateRequest) {
        super(2, continuation);
        this.this$0 = c25802jGx;
        this.$alertCreateRequest$inlined = alertCreateRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AlertManagementAdapter$addAlertgIAlus$$inlined$dexRunCatching$1(continuation, this.this$0, this.$alertCreateRequest$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends AlertCreateResponse>> continuation) {
        return ((AlertManagementAdapter$addAlertgIAlus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objAEQbTJ;
        C25802jGx c25802jGx;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                pUU.KWHzl("AlertManagementAdapter", "addAlert");
                ABO aboAEQbTJ = this.this$0.EZpvd.AEQbTJ(this.$alertCreateRequest$inlined.AhwBna(), this.$alertCreateRequest$inlined.OLrzqt(), this.$alertCreateRequest$inlined.copydefault(), this.this$0.AEQbTJ(this.$alertCreateRequest$inlined.AEQbTJ()), this.this$0.copydefault(this.$alertCreateRequest$inlined.KWHzl()), this.$alertCreateRequest$inlined.djBIcL(), this.this$0.AEQbTJ(this.$alertCreateRequest$inlined.AYXKKw()));
                C25802jGx c25802jGx2 = this.this$0;
                C33077mpe c33077mpe = new C33077mpe(new AlertManagementAdapter$addAlert$2$1(aboAEQbTJ), new AlertManagementAdapter$addAlert$2$2(aboAEQbTJ), new AlertManagementAdapter$addAlert$2$3(aboAEQbTJ), new AlertManagementAdapter$addAlert$2$4(aboAEQbTJ), this.this$0.OLrzqt);
                this.L$0 = c25802jGx2;
                this.label = 1;
                objAEQbTJ = c33077mpe.AEQbTJ(this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                c25802jGx = c25802jGx2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c25802jGx = (C25802jGx) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = ((Result) obj).m7386unboximpl();
            }
            if (Result.m7384isSuccessimpl(objAEQbTJ)) {
                pUU.KWHzl("AlertManagementAdapter", "addAlert success");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
            objM7377constructorimpl = Result.m7377constructorimpl(c25802jGx.KWHzl((C4178Azu) objAEQbTJ));
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
