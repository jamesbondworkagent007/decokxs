package com.okinc.liveness.eop.activity;

import com.okinc.liveness.eop.viewmodel.EopLivenessBasicViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import o.ActivityC38205pQc;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class EopLivenessActivity$startLcaLiveness$1$1$onRetry$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $errorDetail;
    final /* synthetic */ boolean $isRetryReasonResumeFromBackground;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC38205pQc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EopLivenessActivity$startLcaLiveness$1$1$onRetry$1(boolean z, ActivityC38205pQc activityC38205pQc, String str, Continuation<? super EopLivenessActivity$startLcaLiveness$1$1$onRetry$1> continuation) {
        super(2, continuation);
        this.$isRetryReasonResumeFromBackground = z;
        this.this$0 = activityC38205pQc;
        this.$errorDetail = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EopLivenessActivity$startLcaLiveness$1$1$onRetry$1 eopLivenessActivity$startLcaLiveness$1$1$onRetry$1 = new EopLivenessActivity$startLcaLiveness$1$1$onRetry$1(this.$isRetryReasonResumeFromBackground, this.this$0, this.$errorDetail, continuation);
        eopLivenessActivity$startLcaLiveness$1$1$onRetry$1.L$0 = obj;
        return eopLivenessActivity$startLcaLiveness$1$1$onRetry$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EopLivenessActivity$startLcaLiveness$1$1$onRetry$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (CoroutineScopeKt.isActive((CoroutineScope) this.L$0)) {
                if (!this.$isRetryReasonResumeFromBackground) {
                    EopLivenessBasicViewModel eopLivenessBasicViewModel = this.this$0.KWHzl;
                    if (eopLivenessBasicViewModel != null) {
                        String str = this.$errorDetail;
                        this.label = 1;
                        if (eopLivenessBasicViewModel.copydefault(str, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    return Unit.INSTANCE;
                }
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
