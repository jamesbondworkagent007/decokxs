package com.okinc.business.market.features.position.domain;

import com.okinc.business.market.features.position.ui.PositionDetailsParam;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C29123knh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class GetLatestPnLUseCase$dismissAlert$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C29123knh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLatestPnLUseCase$dismissAlert$1(C29123knh c29123knh, Continuation<? super GetLatestPnLUseCase$dismissAlert$1> continuation) {
        super(continuation);
        this.this$0 = c29123knh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.KWHzl((PositionDetailsParam) null, this);
    }
}
