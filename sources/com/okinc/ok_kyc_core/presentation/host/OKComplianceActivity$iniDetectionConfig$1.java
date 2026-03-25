package com.okinc.ok_kyc_core.presentation.host;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC42162rIq;
import o.C42467rTy;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.rSC;

/* JADX INFO: loaded from: classes10.dex */
public final class OKComplianceActivity$iniDetectionConfig$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC42162rIq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKComplianceActivity$iniDetectionConfig$1(ActivityC42162rIq activityC42162rIq, Continuation<? super OKComplianceActivity$iniDetectionConfig$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC42162rIq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKComplianceActivity$iniDetectionConfig$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKComplianceActivity$iniDetectionConfig$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C42467rTy c42467rTy = C42467rTy.KWHzl;
            ActivityC42162rIq activityC42162rIq = this.this$0;
            this.label = 1;
            if (c42467rTy.EZpvd(activityC42162rIq, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        rSC rsc = (rSC) C43251rlk.OLrzqt(rSC.class);
        if (rsc != null) {
            rsc.KWHzl(null);
        }
        return Unit.INSTANCE;
    }
}
