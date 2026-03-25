package com.okinc.trade.arch.ui;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AbstractC49411unz;
import o.InterfaceC49367unH;
import o.InterfaceC49369unJ;
import o.InterfaceC56560yJx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class IUiRetrievable$getUiState$2<T extends InterfaceC49369unJ<T>, A> extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IUiRetrievable$getUiState$2(Continuation<? super IUiRetrievable$getUiState$2> continuation) {
        super(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return InterfaceC49367unH.TaskDescription.copydefault((InterfaceC49367unH) null, (AbstractC49411unz) null, (InterfaceC56560yJx) null, this);
    }
}
