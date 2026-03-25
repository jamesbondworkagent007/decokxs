package com.okinc.tradingbot.impl.usecase.bot;

import com.okinc.unify_trade.biz.EditContractDcaReq;
import com.okinc.unify_trade.biz.StrategyResponse;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C52675wUe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class StopContractDcaManualOrderUseCase$execute$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C52675wUe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopContractDcaManualOrderUseCase$execute$1(C52675wUe c52675wUe, Continuation<? super StopContractDcaManualOrderUseCase$execute$1> continuation) {
        super(continuation);
        this.this$0 = c52675wUe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt((EditContractDcaReq) null, (Continuation<? super StrategyResponse>) this);
    }
}
