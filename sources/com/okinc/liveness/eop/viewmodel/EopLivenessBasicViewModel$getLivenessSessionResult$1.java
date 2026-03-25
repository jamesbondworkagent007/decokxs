package com.okinc.liveness.eop.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class EopLivenessBasicViewModel$getLivenessSessionResult$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EopLivenessBasicViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EopLivenessBasicViewModel$getLivenessSessionResult$1(EopLivenessBasicViewModel eopLivenessBasicViewModel, Continuation<? super EopLivenessBasicViewModel$getLivenessSessionResult$1> continuation) {
        super(continuation);
        this.this$0 = eopLivenessBasicViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.KWHzl((Function0<Unit>) null, (String) null, this);
    }
}
