package com.okinc.tradingbot.impl.order.strategy.grid.dialog;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C50503vQv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartEarnAllocationBottomSheetViewModel$submitChanges$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C50503vQv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartEarnAllocationBottomSheetViewModel$submitChanges$1(C50503vQv c50503vQv, Continuation<? super SmartEarnAllocationBottomSheetViewModel$submitChanges$1> continuation) {
        super(continuation);
        this.this$0 = c50503vQv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.copydefault((Continuation<? super Unit>) this);
    }
}
