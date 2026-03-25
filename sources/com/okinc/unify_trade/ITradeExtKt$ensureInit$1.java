package com.okinc.unify_trade;

import androidx.lifecycle.LifecycleOwner;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C55608xnE;
import o.InterfaceC54577xNn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class ITradeExtKt$ensureInit$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ITradeExtKt$ensureInit$1(Continuation<? super ITradeExtKt$ensureInit$1> continuation) {
        super(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C55608xnE.AEQbTJ((InterfaceC54577xNn) null, (LifecycleOwner) null, this);
    }
}
