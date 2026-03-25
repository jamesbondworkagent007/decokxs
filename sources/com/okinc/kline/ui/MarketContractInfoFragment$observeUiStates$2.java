package com.okinc.kline.ui;

import androidx.fragment.app.Fragment;
import com.okinc.kline.ui.viewmodel.TradingRulesContainerViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C38743pfG;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.oPX;
import o.oPY;
import o.rVN;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketContractInfoFragment$observeUiStates$2 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends List<? extends oPY>>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C38743pfG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketContractInfoFragment$observeUiStates$2(C38743pfG c38743pfG, Continuation<? super MarketContractInfoFragment$observeUiStates$2> continuation) {
        super(2, continuation);
        this.this$0 = c38743pfG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketContractInfoFragment$observeUiStates$2 marketContractInfoFragment$observeUiStates$2 = new MarketContractInfoFragment$observeUiStates$2(this.this$0, continuation);
        marketContractInfoFragment$observeUiStates$2.L$0 = obj;
        return marketContractInfoFragment$observeUiStates$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends List<? extends oPY>> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return invoke2((InterfaceC49371unL<? extends List<oPY>>) interfaceC49371unL, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC49371unL<? extends List<oPY>> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return ((MarketContractInfoFragment$observeUiStates$2) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
            if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
                oPX opx = this.this$0.gEmmrt;
                if (opx != null) {
                    opx.submitList((List) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault());
                }
                TradingRulesContainerViewModel tradingRulesContainerViewModelEZpvd = this.this$0.EZpvd();
                this.label = 1;
                if (tradingRulesContainerViewModelEZpvd.AEQbTJ(this) == objCopydefault) {
                    return objCopydefault;
                }
                rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
            } else if ((interfaceC49371unL instanceof InterfaceC49371unL.Application) || (interfaceC49371unL instanceof InterfaceC49371unL.TaskDescription)) {
                TradingRulesContainerViewModel tradingRulesContainerViewModelEZpvd2 = this.this$0.EZpvd();
                this.label = 2;
                if (tradingRulesContainerViewModelEZpvd2.AEQbTJ(this) == objCopydefault) {
                    return objCopydefault;
                }
                rVN.reportFullyDrawn$default((Fragment) this.this$0, false, (String) null, 2, (Object) null);
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            rVN.reportFullyDrawn$default((Fragment) this.this$0, false, (String) null, 2, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
