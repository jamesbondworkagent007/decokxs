package com.okinc.business.market.features.risk_control.ui;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AAL;
import o.ACT;
import o.C2298AGj;
import o.C33077mpe;
import o.C4147AzP;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.jNK;
import o.pUU;
import uniffi.dex.CoinCheckResult;

/* JADX INFO: loaded from: classes18.dex */
public final class RiskControlViewModel$fetchRiskControlDetails$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenContractAddress;
    int label;
    final /* synthetic */ RiskControlViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiskControlViewModel$fetchRiskControlDetails$1(String str, String str2, RiskControlViewModel riskControlViewModel, Continuation<? super RiskControlViewModel$fetchRiskControlDetails$1> continuation) {
        super(2, continuation);
        this.$tokenContractAddress = str;
        this.$chainId = str2;
        this.this$0 = riskControlViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RiskControlViewModel$fetchRiskControlDetails$1(this.$tokenContractAddress, this.$chainId, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RiskControlViewModel$fetchRiskControlDetails$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ACT coinRisk = AAL.getCoinRisk(this.$tokenContractAddress, this.$chainId);
            C33077mpe c33077mpe = new C33077mpe(new RiskControlViewModel$fetchRiskControlDetails$1$1$1(coinRisk), new RiskControlViewModel$fetchRiskControlDetails$1$1$2(coinRisk), new RiskControlViewModel$fetchRiskControlDetails$1$1$3(coinRisk), new RiskControlViewModel$fetchRiskControlDetails$1$1$4(coinRisk), null, 16, null);
            this.label = 1;
            objAEQbTJ = c33077mpe.AEQbTJ(this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        RiskControlViewModel riskControlViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            CoinCheckResult coinCheckResult = (CoinCheckResult) objAEQbTJ;
            pUU.KWHzl("RiskControlViewModel", "fetchRiskControlDetails core success");
            if (Intrinsics.EZpvd(coinCheckResult, CoinCheckResult.Activity.INSTANCE)) {
                riskControlViewModel.KWHzl.setValue(null);
            } else {
                if (!(coinCheckResult instanceof CoinCheckResult.ActionBar)) {
                    throw new NoWhenBranchMatchedException();
                }
                C4147AzP c4147AzPOLrzqt = ((CoinCheckResult.ActionBar) coinCheckResult).OLrzqt();
                C2298AGj c2298AGjAhwBna = c4147AzPOLrzqt.AhwBna();
                if (c2298AGjAhwBna == null || !C56443yFo.KWHzl(jNK.KWHzl(c4147AzPOLrzqt.gEmmrt())).booleanValue()) {
                    c2298AGjAhwBna = null;
                }
                riskControlViewModel.copydefault = c2298AGjAhwBna;
                riskControlViewModel.OLrzqt = jNK.KWHzl(c4147AzPOLrzqt.gEmmrt());
                riskControlViewModel.KWHzl.setValue(jNK.AEQbTJ(c4147AzPOLrzqt));
            }
        }
        RiskControlViewModel riskControlViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("RiskControlViewModel", "fetchRiskControlDetails core failed", thM7380exceptionOrNullimpl);
            riskControlViewModel2.KWHzl.setValue(null);
        }
        return Unit.INSTANCE;
    }
}
