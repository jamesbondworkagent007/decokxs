package com.okinc.business.invest_biz.data.usecase;

import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfo;
import com.okinc.business.invest_biz.data.bean.request.InvestSubscriptionReceiveReq;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.data.models.InvestDetailsAndGasFee;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23643iDz;
import o.iCI;
import o.iDH;
import o.iFO;

/* JADX INFO: loaded from: classes6.dex */
public final class GetNetworkFeeAndReceiveInfoUseCaseImpl$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends InvestDetailsAndGasFee>>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ TransactionConfig $config;
    final /* synthetic */ InvestSubscriptionReceiveReq $req;
    Object L$0;
    int label;
    final /* synthetic */ iFO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetNetworkFeeAndReceiveInfoUseCaseImpl$invoke$2(iFO ifo, TransactionConfig transactionConfig, InvestSubscriptionReceiveReq investSubscriptionReceiveReq, String str, Continuation<? super GetNetworkFeeAndReceiveInfoUseCaseImpl$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = ifo;
        this.$config = transactionConfig;
        this.$req = investSubscriptionReceiveReq;
        this.$chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetNetworkFeeAndReceiveInfoUseCaseImpl$invoke$2(this.this$0, this.$config, this.$req, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends InvestDetailsAndGasFee>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<InvestDetailsAndGasFee>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<InvestDetailsAndGasFee>> continuation) {
        return ((GetNetworkFeeAndReceiveInfoUseCaseImpl$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        InvestGasPriceConfig investGasPriceConfig;
        Object objAEQbTJ;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            iDH idhCopydefault = this.this$0.AEQbTJ.copydefault(this.$config);
            long investmentId = this.$req.getInvestmentId();
            int value = InvestAction.Subscription.getValue();
            String inputTokenAddress = this.$req.getInputTokenAddress();
            Long lFARcdN = this.$config.fARcdN();
            this.label = 1;
            objCopydefault = idhCopydefault.copydefault(investmentId, value, inputTokenAddress, lFARcdN, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                investGasPriceConfig = (InvestGasPriceConfig) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = ((Result) obj).m7386unboximpl();
                if (Result.m7384isSuccessimpl(objAEQbTJ)) {
                    Result.Application application = Result.Companion;
                    objAEQbTJ = iCI.AEQbTJ((InvestSubscriptionReceiveInfo) objAEQbTJ, investGasPriceConfig);
                }
                return Result.m7376boximpl(Result.m7377constructorimpl(objAEQbTJ));
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objCopydefault)) {
            objCopydefault = null;
        }
        InvestGasPriceConfig investGasPriceConfig2 = (InvestGasPriceConfig) objCopydefault;
        if (investGasPriceConfig2 == null) {
            Result.Application application2 = Result.Companion;
            return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(new OKServerException(0, "Get Network Fees Failed.", null, null, 13, null))));
        }
        if (this.$req.getSlippage().length() == 0) {
            this.$req.setSlippage((String) this.this$0.AEQbTJ(investGasPriceConfig2, this.$chainId).getFirst());
        }
        InterfaceC23643iDz interfaceC23643iDzOLrzqt = this.this$0.EZpvd.OLrzqt(this.$config);
        InvestSubscriptionReceiveReq investSubscriptionReceiveReq = this.$req;
        this.L$0 = investGasPriceConfig2;
        this.label = 2;
        Object objOLrzqt = interfaceC23643iDzOLrzqt.OLrzqt(investSubscriptionReceiveReq, this);
        if (objOLrzqt == objCopydefault2) {
            return objCopydefault2;
        }
        investGasPriceConfig = investGasPriceConfig2;
        objAEQbTJ = objOLrzqt;
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
        }
        return Result.m7376boximpl(Result.m7377constructorimpl(objAEQbTJ));
    }
}
