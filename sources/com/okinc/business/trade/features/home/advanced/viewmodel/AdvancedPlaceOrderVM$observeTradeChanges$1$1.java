package com.okinc.business.trade.features.home.advanced.viewmodel;

import com.okinc.business.dexlogic.bean.PreCheckBean;
import com.okinc.business.dexlogic.track.enums.DexSwapLiquiditySource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.C30626leh;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC30595leC;
import o.kQV;
import o.yHT;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderVM$observeTradeChanges$1$1 extends SuspendLambda implements yHT<FlowCollector<? super C30626leh>, C30626leh, PreCheckBean, Continuation<? super Unit>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ AdvancedPlaceOrderVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPlaceOrderVM$observeTradeChanges$1$1(AdvancedPlaceOrderVM advancedPlaceOrderVM, Continuation<? super AdvancedPlaceOrderVM$observeTradeChanges$1$1> continuation) {
        super(4, continuation);
        this.this$0 = advancedPlaceOrderVM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHT
    public final Object invoke(FlowCollector<? super C30626leh> flowCollector, C30626leh c30626leh, PreCheckBean preCheckBean, Continuation<? super Unit> continuation) {
        AdvancedPlaceOrderVM$observeTradeChanges$1$1 advancedPlaceOrderVM$observeTradeChanges$1$1 = new AdvancedPlaceOrderVM$observeTradeChanges$1$1(this.this$0, continuation);
        advancedPlaceOrderVM$observeTradeChanges$1$1.L$0 = flowCollector;
        advancedPlaceOrderVM$observeTradeChanges$1$1.L$1 = c30626leh;
        advancedPlaceOrderVM$observeTradeChanges$1$1.L$2 = preCheckBean;
        return advancedPlaceOrderVM$observeTradeChanges$1$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        int i;
        AdvancedPlaceOrderVM advancedPlaceOrderVM;
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            C30626leh c30626leh = (C30626leh) this.L$1;
            PreCheckBean preCheckBean = (PreCheckBean) this.L$2;
            this.this$0.OqFWZa = c30626leh.KWHzl((895 & 1) != 0 ? c30626leh.valueOf : null, (895 & 2) != 0 ? c30626leh.EZpvd : null, (895 & 4) != 0 ? c30626leh.AYXKKw : null, (895 & 8) != 0 ? c30626leh.AEQbTJ : null, (895 & 16) != 0 ? c30626leh.AhwBna : null, (895 & 32) != 0 ? c30626leh.OLrzqt : null, (895 & 64) != 0 ? c30626leh.KWHzl : this.this$0.RcXXUw.KWHzl(this.this$0.accept, true).OLrzqt() == DexSwapLiquiditySource.All, (895 & 128) != 0 ? c30626leh.djBIcL : null, (895 & 256) != 0 ? c30626leh.gEmmrt : null, (895 & 512) != 0 ? c30626leh.copydefault : null);
            i = ((preCheckBean == null || preCheckBean.isSupportQuote()) && this.this$0.RlQdEF.EZpvd(this.this$0.OqFWZa)) ? 1 : 0;
            if (i == 0) {
                AdvancedPlaceOrderVM.stopCheckingQuote$default(this.this$0, false, false, 3, null);
            }
            advancedPlaceOrderVM = this.this$0;
            kQV kqv = advancedPlaceOrderVM.ORxRYg;
            C30626leh c30626leh2 = this.this$0.OqFWZa;
            this.L$0 = flowCollector;
            this.L$1 = advancedPlaceOrderVM;
            this.I$0 = i;
            this.label = 1;
            objAEQbTJ = kqv.AEQbTJ(c30626leh2, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            i = this.I$0;
            advancedPlaceOrderVM = (AdvancedPlaceOrderVM) this.L$1;
            flowCollector = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = obj;
        }
        advancedPlaceOrderVM.EZpvd((InterfaceC30595leC) objAEQbTJ);
        if (i != 0) {
            C30626leh c30626leh3 = this.this$0.OqFWZa;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (flowCollector.emit(c30626leh3, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
