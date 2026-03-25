package com.okinc.business.trade.features.home.advanced.usecase;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C28182kRy;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedMyAssetsUseCase$getMyPositionList$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C28182kRy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedMyAssetsUseCase$getMyPositionList$1(C28182kRy c28182kRy, Continuation<? super AdvancedMyAssetsUseCase$getMyPositionList$1> continuation) {
        super(continuation);
        this.this$0 = c28182kRy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objAEQbTJ = this.this$0.AEQbTJ(null, null, null, null, null, this);
        return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Result.m7376boximpl(objAEQbTJ);
    }
}
