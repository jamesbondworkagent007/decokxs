package com.okinc.business.trade.features.home.ui.cefi.placeorder;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C30760lhI;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC30595leC;
import o.yHQ;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderFragment$observeData$29 extends SuspendLambda implements yHQ<InterfaceC30595leC, AdvancedQuoteUiData, AdvancedTradeType, DexMultiTokenInfoBean, DexMultiTokenInfoBean, Continuation<? super C30760lhI>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;
    final /* synthetic */ AdvancedPlaceOrderFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPlaceOrderFragment$observeData$29(AdvancedPlaceOrderFragment advancedPlaceOrderFragment, Continuation<? super AdvancedPlaceOrderFragment$observeData$29> continuation) {
        super(6, continuation);
        this.this$0 = advancedPlaceOrderFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHQ
    public final Object invoke(InterfaceC30595leC interfaceC30595leC, AdvancedQuoteUiData advancedQuoteUiData, AdvancedTradeType advancedTradeType, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, Continuation<? super C30760lhI> continuation) {
        AdvancedPlaceOrderFragment$observeData$29 advancedPlaceOrderFragment$observeData$29 = new AdvancedPlaceOrderFragment$observeData$29(this.this$0, continuation);
        advancedPlaceOrderFragment$observeData$29.L$0 = interfaceC30595leC;
        advancedPlaceOrderFragment$observeData$29.L$1 = advancedQuoteUiData;
        advancedPlaceOrderFragment$observeData$29.L$2 = advancedTradeType;
        advancedPlaceOrderFragment$observeData$29.L$3 = dexMultiTokenInfoBean;
        return advancedPlaceOrderFragment$observeData$29.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        return new C30760lhI((InterfaceC30595leC) this.L$0, (AdvancedQuoteUiData) this.L$1, (AdvancedTradeType) this.L$2, (DexMultiTokenInfoBean) this.L$3, this.this$0.AEQbTJ().AkhnZx());
    }
}
