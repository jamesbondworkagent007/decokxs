package com.okinc.business.trade.features.home.meme.usecase.preset.transaction;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.kWG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeMarketApproveUseCase$handleApproveCallBack$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ kWG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeMarketApproveUseCase$handleApproveCallBack$1(kWG kwg, Continuation<? super MemeMarketApproveUseCase$handleApproveCallBack$1> continuation) {
        super(continuation);
        this.this$0 = kwg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt(null, null, null, null, null, null, null, null, false, null, this);
    }
}
