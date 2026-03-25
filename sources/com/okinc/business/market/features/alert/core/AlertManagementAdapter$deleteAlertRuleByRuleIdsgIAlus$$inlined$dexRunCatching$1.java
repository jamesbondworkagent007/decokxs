package com.okinc.business.market.features.alert.core;

import com.okinc.business.market.data.model.alert.AlertDeleteRequest;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.BeZ;
import o.C25802jGx;
import o.C33077mpe;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.alert.core.AlertManagementAdapter$deleteAlertRuleByRuleIds-gIAlu-s$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes18.dex */
public final class AlertManagementAdapter$deleteAlertRuleByRuleIdsgIAlus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Integer>>, Object> {
    final /* synthetic */ AlertDeleteRequest $alertDeleteRequest$inlined;
    int label;
    final /* synthetic */ C25802jGx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertManagementAdapter$deleteAlertRuleByRuleIdsgIAlus$$inlined$dexRunCatching$1(Continuation continuation, C25802jGx c25802jGx, AlertDeleteRequest alertDeleteRequest) {
        super(2, continuation);
        this.this$0 = c25802jGx;
        this.$alertDeleteRequest$inlined = alertDeleteRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AlertManagementAdapter$deleteAlertRuleByRuleIdsgIAlus$$inlined$dexRunCatching$1(continuation, this.this$0, this.$alertDeleteRequest$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Integer>> continuation) {
        return ((AlertManagementAdapter$deleteAlertRuleByRuleIdsgIAlus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                pUU.KWHzl("AlertManagementAdapter", "deleteAlertRuleByRuleIds");
                BeZ beZOLrzqt = this.this$0.EZpvd.OLrzqt(this.$alertDeleteRequest$inlined.OLrzqt(), this.$alertDeleteRequest$inlined.KWHzl(), this.$alertDeleteRequest$inlined.copydefault());
                C33077mpe c33077mpe = new C33077mpe(new AlertManagementAdapter$deleteAlertRuleByRuleIds$2$1(beZOLrzqt), new AlertManagementAdapter$deleteAlertRuleByRuleIds$2$2(beZOLrzqt), new AlertManagementAdapter$deleteAlertRuleByRuleIds$2$3(beZOLrzqt), new AlertManagementAdapter$deleteAlertRuleByRuleIds$2$4(beZOLrzqt), this.this$0.OLrzqt);
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
                ((Number) objAEQbTJ).intValue();
                pUU.KWHzl("AlertManagementAdapter", "deleteAlertRuleByRuleIds success");
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
