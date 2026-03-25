package com.okinc.ok_kyc_core.presentation.host;

import com.okinc.ok_kyc_core.common.From;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ResultStatus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C42163rIr;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class OKComplianceActivityViewModel$verifyExit$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ From $from;
    final /* synthetic */ ResultStatus $resultStatus;
    int label;
    final /* synthetic */ C42163rIr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKComplianceActivityViewModel$verifyExit$1(C42163rIr c42163rIr, ResultStatus resultStatus, From from, Continuation<? super OKComplianceActivityViewModel$verifyExit$1> continuation) {
        super(2, continuation);
        this.this$0 = c42163rIr;
        this.$resultStatus = resultStatus;
        this.$from = from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKComplianceActivityViewModel$verifyExit$1(this.this$0, this.$resultStatus, this.$from, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKComplianceActivityViewModel$verifyExit$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow mutableSharedFlow = this.this$0.copydefault;
            C42163rIr.StateListAnimator.C0928StateListAnimator c0928StateListAnimator = new C42163rIr.StateListAnimator.C0928StateListAnimator(this.$resultStatus, this.$from);
            this.label = 1;
            if (mutableSharedFlow.emit(c0928StateListAnimator, this) == objCopydefault) {
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
