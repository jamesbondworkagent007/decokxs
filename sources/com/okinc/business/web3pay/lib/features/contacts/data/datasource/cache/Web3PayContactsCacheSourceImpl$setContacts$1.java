package com.okinc.business.web3pay.lib.features.contacts.data.datasource.cache;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C31254lqZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class Web3PayContactsCacheSourceImpl$setContacts$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C31254lqZ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Web3PayContactsCacheSourceImpl$setContacts$1(C31254lqZ c31254lqZ, Continuation<? super Web3PayContactsCacheSourceImpl$setContacts$1> continuation) {
        super(continuation);
        this.this$0 = c31254lqZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.AEQbTJ(null, this);
    }
}
