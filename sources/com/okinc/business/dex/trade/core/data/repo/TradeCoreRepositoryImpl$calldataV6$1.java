package com.okinc.business.dex.trade.core.data.repo;

import com.okinc.business.dex.trade.core.domain.model.V6CalldataRequest;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.gYN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class TradeCoreRepositoryImpl$calldataV6$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ gYN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeCoreRepositoryImpl$calldataV6$1(gYN gyn, Continuation<? super TradeCoreRepositoryImpl$calldataV6$1> continuation) {
        super(continuation);
        this.this$0 = gyn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.KWHzl((V6CalldataRequest) null, this);
    }
}
