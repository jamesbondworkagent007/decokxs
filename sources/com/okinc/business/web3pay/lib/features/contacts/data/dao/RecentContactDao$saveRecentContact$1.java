package com.okinc.business.web3pay.lib.features.contacts.data.dao;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC31244lqP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class RecentContactDao$saveRecentContact$1 extends ContinuationImpl {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RecentContactDao$saveRecentContact$1(Continuation<? super RecentContactDao$saveRecentContact$1> continuation) {
        super(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return InterfaceC31244lqP.StateListAnimator.EZpvd(null, null, 0, this);
    }
}
