package com.okinc.business.defi.wallet.home.usdgActivity.domain.usecase;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C18181fdZ;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class QueryAddressRegisterStatusUseCase$invoke$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C18181fdZ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryAddressRegisterStatusUseCase$invoke$1(C18181fdZ c18181fdZ, Continuation<? super QueryAddressRegisterStatusUseCase$invoke$1> continuation) {
        super(continuation);
        this.this$0 = c18181fdZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objCopydefault = this.this$0.copydefault(null, this);
        return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Result.m7376boximpl(objCopydefault);
    }
}
