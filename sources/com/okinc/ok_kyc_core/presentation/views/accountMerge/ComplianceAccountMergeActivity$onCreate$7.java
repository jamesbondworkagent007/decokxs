package com.okinc.ok_kyc_core.presentation.views.accountMerge;

import com.okinc.biz.model.SupportService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.rQV;

/* JADX INFO: loaded from: classes16.dex */
public final class ComplianceAccountMergeActivity$onCreate$7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ rQV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComplianceAccountMergeActivity$onCreate$7(rQV rqv, Continuation<? super ComplianceAccountMergeActivity$onCreate$7> continuation) {
        super(2, continuation);
        this.this$0 = rqv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ComplianceAccountMergeActivity$onCreate$7(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ComplianceAccountMergeActivity$onCreate$7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        rQV rqv;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            rQV rqv2 = this.this$0;
            this.L$0 = rqv2;
            this.label = 1;
            Object objEZpvd = rqv2.EZpvd("account_reclaimkyc_stolenkyc", (Continuation<? super SupportService>) this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            rqv = rqv2;
            obj = objEZpvd;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rqv = (rQV) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        rqv.copydefault = (SupportService) obj;
        return Unit.INSTANCE;
    }
}
