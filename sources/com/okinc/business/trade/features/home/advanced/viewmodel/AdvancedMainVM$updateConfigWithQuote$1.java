package com.okinc.business.trade.features.home.advanced.viewmodel;

import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C30806liB;
import o.C30808liD;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedMainVM$updateConfigWithQuote$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AdvancedQuoteUiData $quote;
    int label;
    final /* synthetic */ AdvancedMainVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedMainVM$updateConfigWithQuote$1(AdvancedMainVM advancedMainVM, AdvancedQuoteUiData advancedQuoteUiData, Continuation<? super AdvancedMainVM$updateConfigWithQuote$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedMainVM;
        this.$quote = advancedQuoteUiData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedMainVM$updateConfigWithQuote$1(this.this$0, this.$quote, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedMainVM$updateConfigWithQuote$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        C30806liB c30806liB;
        C30808liD c30808liDCopydefault;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow = this.this$0.valueOf;
            AdvancedMainVM advancedMainVM = this.this$0;
            AdvancedQuoteUiData advancedQuoteUiData = this.$quote;
            do {
                value = mutableStateFlow.getValue();
                c30806liB = (C30806liB) value;
                c30808liDCopydefault = c30806liB.copydefault();
            } while (!mutableStateFlow.compareAndSet(value, C30806liB.copy$default(c30806liB, false, false, false, c30808liDCopydefault.copydefault((24851 & 1) != 0 ? c30808liDCopydefault.fARcdN : null, (24851 & 2) != 0 ? c30808liDCopydefault.OLrzqt : null, (24851 & 4) != 0 ? c30808liDCopydefault.fetchVPNInfo : advancedMainVM.OLrzqt(advancedQuoteUiData, c30806liB.copydefault()), (24851 & 8) != 0 ? c30808liDCopydefault.isConnected : 0, (24851 & 16) != 0 ? c30808liDCopydefault.EZpvd : null, (24851 & 32) != 0 ? c30808liDCopydefault.DbNXlk : advancedMainVM.EZpvd(advancedQuoteUiData, c30806liB.copydefault()), (24851 & 64) != 0 ? c30808liDCopydefault.gEmmrt : 0, (24851 & 128) != 0 ? c30808liDCopydefault.djBIcL : advancedMainVM.AEQbTJ(c30806liB.copydefault().AhwBna(), advancedQuoteUiData), (24851 & 256) != 0 ? c30808liDCopydefault.KWHzl : null, (24851 & 512) != 0 ? c30808liDCopydefault.values : null, (24851 & 1024) != 0 ? c30808liDCopydefault.AkhnZx : null, (24851 & 2048) != 0 ? c30808liDCopydefault.AhwBna : null, (24851 & 4096) != 0 ? c30808liDCopydefault.AuCTel : advancedMainVM.gEmmrt(advancedQuoteUiData, c30806liB.copydefault()), (24851 & 8192) != 0 ? c30808liDCopydefault.valueOf : advancedQuoteUiData.KWHzl().AuCTel(), (24851 & 16384) != 0 ? c30808liDCopydefault.AYXKKw : null), 6, null)));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
