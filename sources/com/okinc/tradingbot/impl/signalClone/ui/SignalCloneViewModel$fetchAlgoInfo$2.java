package com.okinc.tradingbot.impl.signalClone.ui;

import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C53736wrC;
import o.C53739wrF;
import o.C53826wsn;
import o.C54589xNz;
import o.C55887xsS;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54577xNn;
import o.InterfaceC54581xNr;
import o.uLU;

/* JADX INFO: loaded from: classes19.dex */
public final class SignalCloneViewModel$fetchAlgoInfo$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C53826wsn.StateListAnimator.C0993StateListAnimator $action;
    Object L$0;
    int label;
    final /* synthetic */ C53826wsn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalCloneViewModel$fetchAlgoInfo$2(C53826wsn c53826wsn, C53826wsn.StateListAnimator.C0993StateListAnimator c0993StateListAnimator, Continuation<? super SignalCloneViewModel$fetchAlgoInfo$2> continuation) {
        super(2, continuation);
        this.this$0 = c53826wsn;
        this.$action = c0993StateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SignalCloneViewModel$fetchAlgoInfo$2(this.this$0, this.$action, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SignalCloneViewModel$fetchAlgoInfo$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        StrategyDetailsResponse strategyDetailsResponse;
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        InterfaceC54581xNr interfaceC54581xNrCopydefault2;
        StrategyDetailsResponse strategyDetailsResponse2;
        C55887xsS c55887xsS;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C53736wrC c53736wrC = this.this$0.valueOf;
            C53736wrC.StateListAnimator stateListAnimatorAEQbTJ = this.$action.AEQbTJ();
            this.label = 1;
            obj = c53736wrC.KWHzl(stateListAnimatorAEQbTJ, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    strategyDetailsResponse = (StrategyDetailsResponse) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    ((Result) obj).m7386unboximpl();
                    interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
                    if (interfaceC54581xNrCopydefault != null) {
                        String instType = strategyDetailsResponse.getInstType();
                        this.L$0 = strategyDetailsResponse;
                        this.label = 3;
                        obj = interfaceC54581xNrCopydefault.EZpvd(instType, this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    interfaceC54581xNrCopydefault2 = C54589xNz.EZpvd.copydefault();
                    if (interfaceC54581xNrCopydefault2 != null) {
                    }
                    this.this$0.AEQbTJ = new C55887xsS(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId());
                    c55887xsS = this.this$0.AEQbTJ;
                    if (c55887xsS == null) {
                    }
                    c55887xsS.gEmmrt(strategyDetailsResponse.getTradeQuoteCcy());
                    this.this$0.EZpvd.setValue(uLU.Companion.AEQbTJ(new C53739wrF(strategyDetailsResponse, this.this$0.copydefault(strategyDetailsResponse.getOrderType(), strategyDetailsResponse.getSourceCcy()))));
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    strategyDetailsResponse2 = (StrategyDetailsResponse) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    strategyDetailsResponse = strategyDetailsResponse2;
                    this.this$0.AEQbTJ = new C55887xsS(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId());
                    c55887xsS = this.this$0.AEQbTJ;
                    if (c55887xsS == null) {
                        Intrinsics.gEmmrt("");
                        c55887xsS = null;
                    }
                    c55887xsS.gEmmrt(strategyDetailsResponse.getTradeQuoteCcy());
                    this.this$0.EZpvd.setValue(uLU.Companion.AEQbTJ(new C53739wrF(strategyDetailsResponse, this.this$0.copydefault(strategyDetailsResponse.getOrderType(), strategyDetailsResponse.getSourceCcy()))));
                    return Unit.INSTANCE;
                }
                strategyDetailsResponse = (StrategyDetailsResponse) this.L$0;
                C56391yDq.AEQbTJ(obj);
                interfaceC54581xNrCopydefault2 = C54589xNz.EZpvd.copydefault();
                if (interfaceC54581xNrCopydefault2 != null) {
                    this.L$0 = strategyDetailsResponse;
                    this.label = 4;
                    obj = interfaceC54581xNrCopydefault2.EZpvd(this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    strategyDetailsResponse2 = strategyDetailsResponse;
                    strategyDetailsResponse = strategyDetailsResponse2;
                }
                this.this$0.AEQbTJ = new C55887xsS(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId());
                c55887xsS = this.this$0.AEQbTJ;
                if (c55887xsS == null) {
                }
                c55887xsS.gEmmrt(strategyDetailsResponse.getTradeQuoteCcy());
                this.this$0.EZpvd.setValue(uLU.Companion.AEQbTJ(new C53739wrF(strategyDetailsResponse, this.this$0.copydefault(strategyDetailsResponse.getOrderType(), strategyDetailsResponse.getSourceCcy()))));
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        StrategyDetailsResponse strategyDetailsResponseCopydefault = ((C53736wrC.Activity) obj).copydefault();
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        this.L$0 = strategyDetailsResponseCopydefault;
        this.label = 2;
        if (InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(c54589xNz, false, null, this, 3, null) == objCopydefault) {
            return objCopydefault;
        }
        strategyDetailsResponse = strategyDetailsResponseCopydefault;
        interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault != null) {
        }
        interfaceC54581xNrCopydefault2 = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault2 != null) {
        }
        this.this$0.AEQbTJ = new C55887xsS(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId());
        c55887xsS = this.this$0.AEQbTJ;
        if (c55887xsS == null) {
        }
        c55887xsS.gEmmrt(strategyDetailsResponse.getTradeQuoteCcy());
        this.this$0.EZpvd.setValue(uLU.Companion.AEQbTJ(new C53739wrF(strategyDetailsResponse, this.this$0.copydefault(strategyDetailsResponse.getOrderType(), strategyDetailsResponse.getSourceCcy()))));
        return Unit.INSTANCE;
    }
}
