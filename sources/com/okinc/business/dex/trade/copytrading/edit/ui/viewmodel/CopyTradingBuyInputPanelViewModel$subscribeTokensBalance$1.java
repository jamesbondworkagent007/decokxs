package com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel;

import com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel.CopyTradingBuyInputPanelViewModel$subscribeTokensBalance$1;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC58185ywX;
import o.C23311hvo;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C9860bdZ;
import o.InterfaceC58229yxO;
import o.InterfaceC58239yxY;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingBuyInputPanelViewModel$subscribeTokensBalance$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DexMultiTokenInfoBean $token;
    int label;
    final /* synthetic */ CopyTradingBuyInputPanelViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingBuyInputPanelViewModel$subscribeTokensBalance$1(CopyTradingBuyInputPanelViewModel copyTradingBuyInputPanelViewModel, DexMultiTokenInfoBean dexMultiTokenInfoBean, Continuation<? super CopyTradingBuyInputPanelViewModel$subscribeTokensBalance$1> continuation) {
        super(2, continuation);
        this.this$0 = copyTradingBuyInputPanelViewModel;
        this.$token = dexMultiTokenInfoBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingBuyInputPanelViewModel$subscribeTokensBalance$1(this.this$0, this.$token, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CopyTradingBuyInputPanelViewModel$subscribeTokensBalance$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC58185ywX<C9860bdZ> abstractC58185ywXEZpvd = this.this$0.fetchVPNInfo.EZpvd();
            final DexMultiTokenInfoBean dexMultiTokenInfoBean = this.$token;
            final Function1 function1 = new Function1() { // from class: o.gTO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(CopyTradingBuyInputPanelViewModel$subscribeTokensBalance$1.invokeSuspend$lambda$0(dexMultiTokenInfoBean, (C9860bdZ) obj2));
                }
            };
            AbstractC58185ywX<C9860bdZ> abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58239yxY() { // from class: o.gTM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58239yxY
                public final boolean test(java.lang.Object obj2) {
                    return CopyTradingBuyInputPanelViewModel$subscribeTokensBalance$1.invokeSuspend$lambda$1(function1, obj2);
                }
            });
            final DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.$token;
            final CopyTradingBuyInputPanelViewModel copyTradingBuyInputPanelViewModel = this.this$0;
            final Function1 function12 = new Function1() { // from class: o.gTL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return CopyTradingBuyInputPanelViewModel$subscribeTokensBalance$1.invokeSuspend$lambda$2(dexMultiTokenInfoBean2, copyTradingBuyInputPanelViewModel, (C9860bdZ) obj2);
                }
            };
            abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.gTT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj2) {
                    return CopyTradingBuyInputPanelViewModel$subscribeTokensBalance$1.invokeSuspend$lambda$3(function12, obj2);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(DexMultiTokenInfoBean dexMultiTokenInfoBean, C9860bdZ c9860bdZ) {
        return Intrinsics.EZpvd((Object) String.valueOf(c9860bdZ.OLrzqt()), (Object) dexMultiTokenInfoBean.getChainId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$1(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(DexMultiTokenInfoBean dexMultiTokenInfoBean, CopyTradingBuyInputPanelViewModel copyTradingBuyInputPanelViewModel, C9860bdZ c9860bdZ) {
        String strValueOf = String.valueOf(c9860bdZ.OLrzqt());
        String strAhwBna = c9860bdZ.AhwBna();
        if (strAhwBna == null) {
            strAhwBna = "";
        }
        if (Intrinsics.EZpvd((Object) C23311hvo.EZpvd(strValueOf, strAhwBna, Intrinsics.EZpvd(c9860bdZ.AYXKKw(), Boolean.TRUE)), (Object) C23311hvo.EZpvd(dexMultiTokenInfoBean.getChainId(), dexMultiTokenInfoBean.getTokenContractAddress(), dexMultiTokenInfoBean.isMainChainCoin()))) {
            MutableStateFlow mutableStateFlow = copyTradingBuyInputPanelViewModel.KWHzl;
            String str = dexMultiTokenInfoBean.getChainId() + dexMultiTokenInfoBean.getTokenContractAddress();
            String strAEQbTJ = c9860bdZ.AEQbTJ();
            mutableStateFlow.setValue(C56390yDp.OLrzqt(str, strAEQbTJ != null ? strAEQbTJ : ""));
        }
        return Unit.INSTANCE;
    }
}
