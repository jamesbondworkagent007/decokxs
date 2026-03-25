package com.okinc.business.market.features.scanner.surge.trending.domain;

import com.okinc.business.market.features.scanner.surge.trending.domain.GetTrendingTokensUseCase$subscribeToTokenKline$job$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class GetTrendingTokensUseCase$subscribeToTokenKline$job$1$1$emit$1 extends ContinuationImpl {
    float F$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetTrendingTokensUseCase$subscribeToTokenKline$job$1.AnonymousClass5<T> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.okinc.business.market.features.scanner.surge.trending.domain.GetTrendingTokensUseCase$subscribeToTokenKline$job$1$5<? super T> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GetTrendingTokensUseCase$subscribeToTokenKline$job$1$1$emit$1(GetTrendingTokensUseCase$subscribeToTokenKline$job$1.AnonymousClass5<? super T> anonymousClass5, Continuation<? super GetTrendingTokensUseCase$subscribeToTokenKline$job$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to com.okinc.business.market.features.scanner.surge.trending.domain.GetTrendingTokensUseCase$subscribeToTokenKline$job$1$1$emit$1 for r1v1 'this'  kotlin.coroutines.Continuation
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r2) {
        /*
            r1 = this;
            r1.result = r2
            int r2 = r1.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.label = r2
            com.okinc.business.market.features.scanner.surge.trending.domain.GetTrendingTokensUseCase$subscribeToTokenKline$job$1$5<T> r2 = r1.this$0
            r0 = 0
            java.lang.Object r2 = r2.emit(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.business.market.features.scanner.surge.trending.domain.GetTrendingTokensUseCase$subscribeToTokenKline$job$1$1$emit$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
