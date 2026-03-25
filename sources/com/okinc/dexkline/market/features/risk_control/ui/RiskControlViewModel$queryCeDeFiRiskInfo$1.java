package com.okinc.dexkline.market.features.risk_control.ui;

import com.okinc.dexkline.market.data.model.CeDeFiCoinRiskData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C34531ndo;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class RiskControlViewModel$queryCeDeFiRiskInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $token;
    final /* synthetic */ String $tokenContractAddress;
    int label;
    final /* synthetic */ RiskControlViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiskControlViewModel$queryCeDeFiRiskInfo$1(RiskControlViewModel riskControlViewModel, String str, String str2, String str3, Continuation<? super RiskControlViewModel$queryCeDeFiRiskInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = riskControlViewModel;
        this.$chainId = str;
        this.$tokenContractAddress = str2;
        this.$token = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RiskControlViewModel$queryCeDeFiRiskInfo$1(this.this$0, this.$chainId, this.$tokenContractAddress, this.$token, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RiskControlViewModel$queryCeDeFiRiskInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C34531ndo c34531ndo = this.this$0.values;
            String str = this.$chainId;
            String str2 = this.$tokenContractAddress;
            String str3 = this.$token;
            this.label = 1;
            objCopydefault = c34531ndo.copydefault(str, str2, str3, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        RiskControlViewModel riskControlViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objCopydefault)) {
            CeDeFiCoinRiskData ceDeFiCoinRiskData = (CeDeFiCoinRiskData) objCopydefault;
            int iCopydefault = ceDeFiCoinRiskData != null ? ceDeFiCoinRiskData.copydefault() : 0;
            riskControlViewModel.KWHzl.setValue(C56443yFo.AEQbTJ(iCopydefault));
            riskControlViewModel.EZpvd.setValue(C56443yFo.KWHzl(ceDeFiCoinRiskData != null ? ceDeFiCoinRiskData.AEQbTJ() : false));
            riskControlViewModel.valueOf = iCopydefault >= 4;
            riskControlViewModel.AYXKKw = iCopydefault > 5;
            riskControlViewModel.copydefault.setValue(C56443yFo.KWHzl(ceDeFiCoinRiskData != null ? ceDeFiCoinRiskData.KWHzl() : false));
            riskControlViewModel.AEQbTJ.setValue(C56443yFo.KWHzl(true));
        }
        RiskControlViewModel riskControlViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.KWHzl(thM7380exceptionOrNullimpl);
            riskControlViewModel2.AEQbTJ.setValue(C56443yFo.KWHzl(true));
        }
        return Unit.INSTANCE;
    }
}
