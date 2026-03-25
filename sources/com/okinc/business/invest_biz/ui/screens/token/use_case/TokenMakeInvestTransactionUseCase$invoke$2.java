package com.okinc.business.invest_biz.ui.screens.token.use_case;

import com.okinc.business.invest_biz.data.bean.TokenInvestDetail;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C26594jfK;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC26561jee;

/* JADX INFO: loaded from: classes6.dex */
public final class TokenMakeInvestTransactionUseCase$invoke$2 extends SuspendLambda implements Function1<Continuation<? super InterfaceC26561jee>, Object> {
    final /* synthetic */ boolean $hasMultipleProtocols;
    final /* synthetic */ long $investmentId;
    final /* synthetic */ TokenInvestDetail $tokenInvestDetail;
    int label;
    final /* synthetic */ C26594jfK this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenMakeInvestTransactionUseCase$invoke$2(C26594jfK c26594jfK, long j, boolean z, TokenInvestDetail tokenInvestDetail, Continuation<? super TokenMakeInvestTransactionUseCase$invoke$2> continuation) {
        super(1, continuation);
        this.this$0 = c26594jfK;
        this.$investmentId = j;
        this.$hasMultipleProtocols = z;
        this.$tokenInvestDetail = tokenInvestDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new TokenMakeInvestTransactionUseCase$invoke$2(this.this$0, this.$investmentId, this.$hasMultipleProtocols, this.$tokenInvestDetail, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super InterfaceC26561jee> continuation) {
        return ((TokenMakeInvestTransactionUseCase$invoke$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C26594jfK c26594jfK = this.this$0;
            long j = this.$investmentId;
            boolean z = this.$hasMultipleProtocols;
            TokenInvestDetail tokenInvestDetail = this.$tokenInvestDetail;
            this.label = 1;
            obj = c26594jfK.EZpvd(j, z, tokenInvestDetail, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
