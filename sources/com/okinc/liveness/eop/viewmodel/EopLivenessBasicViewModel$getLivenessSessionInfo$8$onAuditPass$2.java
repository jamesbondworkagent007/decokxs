package com.okinc.liveness.eop.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C43734ruq;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes16.dex */
public final class EopLivenessBasicViewModel$getLivenessSessionInfo$8$onAuditPass$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ EopLivenessBasicViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EopLivenessBasicViewModel$getLivenessSessionInfo$8$onAuditPass$2(EopLivenessBasicViewModel eopLivenessBasicViewModel, Continuation<? super EopLivenessBasicViewModel$getLivenessSessionInfo$8$onAuditPass$2> continuation) {
        super(2, continuation);
        this.this$0 = eopLivenessBasicViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EopLivenessBasicViewModel$getLivenessSessionInfo$8$onAuditPass$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EopLivenessBasicViewModel$getLivenessSessionInfo$8$onAuditPass$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.valueOf.setValue(new C43734ruq(C56443yFo.KWHzl(true)));
            EopLivenessBasicViewModel eopLivenessBasicViewModel = this.this$0;
            this.label = 1;
            if (EopLivenessBasicViewModel.getLivenessSessionResult$default(eopLivenessBasicViewModel, null, null, this, 3, null) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
