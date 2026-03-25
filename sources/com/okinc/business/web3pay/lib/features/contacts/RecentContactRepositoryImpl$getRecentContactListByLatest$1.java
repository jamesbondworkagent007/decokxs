package com.okinc.business.web3pay.lib.features.contacts;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C31246lqR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class RecentContactRepositoryImpl$getRecentContactListByLatest$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C31246lqR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentContactRepositoryImpl$getRecentContactListByLatest$1(C31246lqR c31246lqR, Continuation<? super RecentContactRepositoryImpl$getRecentContactListByLatest$1> continuation) {
        super(continuation);
        this.this$0 = c31246lqR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.AEQbTJ(null, 0, this);
    }
}
