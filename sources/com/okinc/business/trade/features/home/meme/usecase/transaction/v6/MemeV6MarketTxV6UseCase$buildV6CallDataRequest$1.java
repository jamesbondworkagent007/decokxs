package com.okinc.business.trade.features.home.meme.usecase.transaction.v6;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AbstractC28328kXi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeV6MarketTxV6UseCase$buildV6CallDataRequest$1 extends ContinuationImpl {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ AbstractC28328kXi this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeV6MarketTxV6UseCase$buildV6CallDataRequest$1(AbstractC28328kXi abstractC28328kXi, Continuation<? super MemeV6MarketTxV6UseCase$buildV6CallDataRequest$1> continuation) {
        super(continuation);
        this.this$0 = abstractC28328kXi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd(null, null, 0, null, this);
    }
}
