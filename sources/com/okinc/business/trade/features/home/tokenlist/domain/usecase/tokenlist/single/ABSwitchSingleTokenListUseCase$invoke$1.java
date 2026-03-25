package com.okinc.business.trade.features.home.tokenlist.domain.usecase.tokenlist.single;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C28398kZy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class ABSwitchSingleTokenListUseCase$invoke$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C28398kZy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ABSwitchSingleTokenListUseCase$invoke$1(C28398kZy c28398kZy, Continuation<? super ABSwitchSingleTokenListUseCase$invoke$1> continuation) {
        super(continuation);
        this.this$0 = c28398kZy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.AEQbTJ(null, this);
    }
}
