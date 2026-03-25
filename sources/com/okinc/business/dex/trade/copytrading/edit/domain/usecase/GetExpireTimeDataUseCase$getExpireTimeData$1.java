package com.okinc.business.dex.trade.copytrading.edit.domain.usecase;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C19876gSp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class GetExpireTimeDataUseCase$getExpireTimeData$1 extends ContinuationImpl {
    public Object L$0;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C19876gSp this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetExpireTimeDataUseCase$getExpireTimeData$1(C19876gSp c19876gSp, Continuation<? super GetExpireTimeDataUseCase$getExpireTimeData$1> continuation) {
        super(continuation);
        this.this$0 = c19876gSp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt(null, false, this);
    }
}
