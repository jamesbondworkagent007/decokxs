package com.okinc.business.invest_biz.repository;

import com.okinc.business.invest_biz.data.bean.TokenInvestDetail;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C23946iPe;
import o.C56391yDq;
import o.C56442yFn;
import o.iOY;

/* JADX INFO: loaded from: classes15.dex */
public final class InvestIndependentCheckFlowService$executeInvestFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $fromUserAction;
    final /* synthetic */ boolean $hasMultipleProtocols;
    final /* synthetic */ long $investmentId;
    final /* synthetic */ Function1<Throwable, Unit> $onError;
    final /* synthetic */ Function1<iOY, Unit> $onSuccess;
    final /* synthetic */ TokenInvestDetail $tokenInvestDetail;
    int label;
    final /* synthetic */ C23946iPe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function1<? super o.iOY, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InvestIndependentCheckFlowService$executeInvestFlow$1(C23946iPe c23946iPe, long j, TokenInvestDetail tokenInvestDetail, boolean z, boolean z2, Function1<? super iOY, Unit> function1, Function1<? super Throwable, Unit> function12, Continuation<? super InvestIndependentCheckFlowService$executeInvestFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = c23946iPe;
        this.$investmentId = j;
        this.$tokenInvestDetail = tokenInvestDetail;
        this.$hasMultipleProtocols = z;
        this.$fromUserAction = z2;
        this.$onSuccess = function1;
        this.$onError = function12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestIndependentCheckFlowService$executeInvestFlow$1(this.this$0, this.$investmentId, this.$tokenInvestDetail, this.$hasMultipleProtocols, this.$fromUserAction, this.$onSuccess, this.$onError, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestIndependentCheckFlowService$executeInvestFlow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        iOY ioy;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C23946iPe c23946iPe = this.this$0;
                long j = this.$investmentId;
                TokenInvestDetail tokenInvestDetail = this.$tokenInvestDetail;
                boolean z = this.$hasMultipleProtocols;
                boolean z2 = this.$fromUserAction;
                this.label = 1;
                obj = c23946iPe.OLrzqt(j, tokenInvestDetail, z, z2, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            ioy = (iOY) obj;
        } catch (Exception e) {
            this.$onError.invoke(e);
        }
        if (!(ioy instanceof iOY.ActionBar) && !(ioy instanceof iOY.StateListAnimator)) {
            throw new NoWhenBranchMatchedException();
        }
        this.$onSuccess.invoke(ioy);
        return Unit.INSTANCE;
    }
}
