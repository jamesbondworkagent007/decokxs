package com.okinc.business.market.features.smart_money.signal.ui.activity;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalActivityViewModel$trade$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SignalActivityViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalActivityViewModel$trade$1(SignalActivityViewModel signalActivityViewModel, Continuation<? super SignalActivityViewModel$trade$1> continuation) {
        super(continuation);
        this.this$0 = signalActivityViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objKWHzl = this.this$0.KWHzl(null, null, this);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Result.m7376boximpl(objKWHzl);
    }
}
