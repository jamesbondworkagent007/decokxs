package com.okinc.business.invest_biz.data.usecase;

import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestRedeemReceiveInfo;
import com.okinc.business.invest_biz.data.bean.request.InvestRedeemReceiveReq;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.data.models.RedeemDetailsAndGasFee;
import com.okinc.business.invest_biz.di.TransactionBiz;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.iCI;
import o.iDF;
import o.iDH;
import o.iFM;

/* JADX INFO: loaded from: classes6.dex */
public final class GetRedeemReceiveInfoWithNetworkFeeUseCaseImpl$invoke$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends RedeemDetailsAndGasFee>>, Object> {
    final /* synthetic */ TransactionBiz $biz;
    final /* synthetic */ iDH $repository;
    final /* synthetic */ InvestRedeemReceiveReq $req;
    Object L$0;
    int label;
    final /* synthetic */ iFM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRedeemReceiveInfoWithNetworkFeeUseCaseImpl$invoke$2$1(iDH idh, InvestRedeemReceiveReq investRedeemReceiveReq, iFM ifm, TransactionBiz transactionBiz, Continuation<? super GetRedeemReceiveInfoWithNetworkFeeUseCaseImpl$invoke$2$1> continuation) {
        super(2, continuation);
        this.$repository = idh;
        this.$req = investRedeemReceiveReq;
        this.this$0 = ifm;
        this.$biz = transactionBiz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetRedeemReceiveInfoWithNetworkFeeUseCaseImpl$invoke$2$1(this.$repository, this.$req, this.this$0, this.$biz, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends RedeemDetailsAndGasFee>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<RedeemDetailsAndGasFee>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<RedeemDetailsAndGasFee>> continuation) {
        return ((GetRedeemReceiveInfoWithNetworkFeeUseCaseImpl$invoke$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        InvestGasPriceConfig investGasPriceConfig;
        Object objCopydefault2;
        Object objCopydefault3 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            iDH idh = this.$repository;
            long investmentId = this.$req.getInvestmentId();
            int value = InvestAction.Redeem.getValue();
            String outputTokenAddress = this.$req.getOutputTokenAddress();
            String str = outputTokenAddress == null ? "" : outputTokenAddress;
            Long stakeId = this.$req.getStakeId();
            this.label = 1;
            objCopydefault = idh.copydefault(investmentId, value, str, stakeId, this);
            if (objCopydefault == objCopydefault3) {
                return objCopydefault3;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                investGasPriceConfig = (InvestGasPriceConfig) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objCopydefault2 = ((Result) obj).m7386unboximpl();
                if (Result.m7384isSuccessimpl(objCopydefault2)) {
                    Result.Application application = Result.Companion;
                    objCopydefault2 = iCI.copydefault((InvestRedeemReceiveInfo) objCopydefault2, investGasPriceConfig);
                }
                return Result.m7376boximpl(Result.m7377constructorimpl(objCopydefault2));
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InvestGasPriceConfig investGasPriceConfig2 = (InvestGasPriceConfig) objCopydefault;
        this.$req.setSlippage("");
        iDF idfAEQbTJ = this.this$0.OLrzqt.AEQbTJ(this.$biz);
        InvestRedeemReceiveReq investRedeemReceiveReq = this.$req;
        this.L$0 = investGasPriceConfig2;
        this.label = 2;
        Object objAEQbTJ = idfAEQbTJ.AEQbTJ(investRedeemReceiveReq, this);
        if (objAEQbTJ == objCopydefault3) {
            return objCopydefault3;
        }
        investGasPriceConfig = investGasPriceConfig2;
        objCopydefault2 = objAEQbTJ;
        if (Result.m7384isSuccessimpl(objCopydefault2)) {
        }
        return Result.m7376boximpl(Result.m7377constructorimpl(objCopydefault2));
    }
}
