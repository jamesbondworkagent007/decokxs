package com.okinc.business.trade.features.home.meme.usecase;

import com.okinc.business.dex.api.bean.TokenBase;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.kVY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeQuickModeStrategyUseCase$tryGetPreloadedResult$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ kVY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeQuickModeStrategyUseCase$tryGetPreloadedResult$1(kVY kvy, Continuation<? super MemeQuickModeStrategyUseCase$tryGetPreloadedResult$1> continuation) {
        super(continuation);
        this.this$0 = kvy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.AEQbTJ((TokenBase) null, this);
    }
}
