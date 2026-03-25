package com.okinc.business.trade.features.home.advanced.viewmodel;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C30626leh;
import o.C30805liA;
import o.C30808liD;
import o.C56391yDq;
import o.C56442yFn;
import o.kQV;
import o.kTB;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderVM$updateQuote$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isUpdateOnResume;
    final /* synthetic */ C30626leh $params;
    int label;
    final /* synthetic */ AdvancedPlaceOrderVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPlaceOrderVM$updateQuote$1(AdvancedPlaceOrderVM advancedPlaceOrderVM, C30626leh c30626leh, boolean z, Continuation<? super AdvancedPlaceOrderVM$updateQuote$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedPlaceOrderVM;
        this.$params = c30626leh;
        this.$isUpdateOnResume = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedPlaceOrderVM$updateQuote$1(this.this$0, this.$params, this.$isUpdateOnResume, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedPlaceOrderVM$updateQuote$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            kTB ktb = this.this$0.gGvvIC;
            C30805liA c30805liADjBIcL = this.$params.djBIcL();
            SlippageMode slippageModeCopydefault = c30805liADjBIcL != null ? c30805liADjBIcL.copydefault() : null;
            C30805liA c30805liADjBIcL2 = this.$params.djBIcL();
            ktb.copydefault(slippageModeCopydefault, c30805liADjBIcL2 != null ? c30805liADjBIcL2.KWHzl() : null);
            DexMultiTokenInfoBean dexMultiTokenInfoBeanAhwBna = this.$params.AhwBna();
            String chainId = dexMultiTokenInfoBeanAhwBna != null ? dexMultiTokenInfoBeanAhwBna.getChainId() : null;
            if (chainId == null) {
                chainId = "";
            }
            C30626leh c30626leh = this.$params;
            if (StringsKt__StringsKt.fARcdN((CharSequence) chainId)) {
                DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ = c30626leh.AEQbTJ();
                String chainId2 = dexMultiTokenInfoBeanAEQbTJ != null ? dexMultiTokenInfoBeanAEQbTJ.getChainId() : null;
                chainId = chainId2 != null ? chainId2 : "";
            }
            this.this$0.gGvvIC.AEQbTJ(this.$params, (C30808liD) this.this$0.AuCTel.getValue(), this.this$0.UeEOUB(), kQV.canUseSmartAccount$default(this.this$0.ORxRYg, null, 1, null), this.this$0.dNCPSb.OLrzqt(this.this$0.accept, chainId, this.$params.copydefault()));
            if (!this.$isUpdateOnResume) {
                this.this$0.DTwDnp.copydefault();
            }
            this.this$0.OLrzqt(this.$isUpdateOnResume);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
