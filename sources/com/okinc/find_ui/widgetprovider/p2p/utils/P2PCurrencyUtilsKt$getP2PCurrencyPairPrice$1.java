package com.okinc.find_ui.widgetprovider.p2p.utils;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C35127npU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class P2PCurrencyUtilsKt$getP2PCurrencyPairPrice$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public P2PCurrencyUtilsKt$getP2PCurrencyPairPrice$1(Continuation<? super P2PCurrencyUtilsKt$getP2PCurrencyPairPrice$1> continuation) {
        super(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C35127npU.copydefault(null, 0, null, this);
    }
}
