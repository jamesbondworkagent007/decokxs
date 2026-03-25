package com.okinc.tradingbot.impl.strategy.fragment.auto_earn.domain;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C54143wym;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class AutoEarnStakingOverViewUseCase$execute$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C54143wym this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoEarnStakingOverViewUseCase$execute$1(C54143wym c54143wym, Continuation<? super AutoEarnStakingOverViewUseCase$execute$1> continuation) {
        super(continuation);
        this.this$0 = c54143wym;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt((C54143wym.StateListAnimator) null, (Continuation<? super C54143wym.Activity>) this);
    }
}
