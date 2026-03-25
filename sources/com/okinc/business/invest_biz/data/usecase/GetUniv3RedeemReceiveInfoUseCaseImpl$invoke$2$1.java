package com.okinc.business.invest_biz.data.usecase;

import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestUniv3RedeemReceiveInfo;
import com.okinc.business.invest_biz.data.bean.request.InvestUniv3RedeemReceiveReq;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.data.models.RedeemDetailsAndGasFee;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.iCI;
import o.iDF;
import o.iDH;
import o.iFQ;

/* JADX INFO: loaded from: classes6.dex */
public final class GetUniv3RedeemReceiveInfoUseCaseImpl$invoke$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends RedeemDetailsAndGasFee>>, Object> {
    final /* synthetic */ InvestUniv3RedeemReceiveReq $req;
    Object L$0;
    int label;
    final /* synthetic */ iFQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUniv3RedeemReceiveInfoUseCaseImpl$invoke$2$1(iFQ ifq, InvestUniv3RedeemReceiveReq investUniv3RedeemReceiveReq, Continuation<? super GetUniv3RedeemReceiveInfoUseCaseImpl$invoke$2$1> continuation) {
        super(2, continuation);
        this.this$0 = ifq;
        this.$req = investUniv3RedeemReceiveReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetUniv3RedeemReceiveInfoUseCaseImpl$invoke$2$1(this.this$0, this.$req, continuation);
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
        return ((GetUniv3RedeemReceiveInfoUseCaseImpl$invoke$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0  */
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
            iDH idh = this.this$0.copydefault;
            long investmentId = this.$req.getInvestmentId();
            int value = InvestAction.Redeem.getValue();
            String outputTokenAddress = this.$req.getOutputTokenAddress();
            if (outputTokenAddress == null) {
                outputTokenAddress = "";
            }
            Long lKWHzl = C56443yFo.KWHzl(-1L);
            this.label = 1;
            objCopydefault = idh.copydefault(investmentId, value, outputTokenAddress, lKWHzl, this);
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
                    objCopydefault2 = iCI.copydefault((InvestUniv3RedeemReceiveInfo) objCopydefault2, investGasPriceConfig);
                }
                return Result.m7376boximpl(Result.m7377constructorimpl(objCopydefault2));
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InvestGasPriceConfig investGasPriceConfig2 = (InvestGasPriceConfig) objCopydefault;
        if (this.$req.getSlippage().length() == 0) {
            InvestUniv3RedeemReceiveReq investUniv3RedeemReceiveReq = this.$req;
            investUniv3RedeemReceiveReq.setSlippage((String) this.this$0.EZpvd(investGasPriceConfig2, C33129mqd.gEmmrt(investUniv3RedeemReceiveReq.getChainId())).getFirst());
        }
        this.$req.setChainId(null);
        iDF idf = this.this$0.KWHzl;
        String accountId = this.$req.getAccountId();
        InvestUniv3RedeemReceiveReq investUniv3RedeemReceiveReq2 = this.$req;
        this.L$0 = investGasPriceConfig2;
        this.label = 2;
        Object objCopydefault4 = idf.copydefault(accountId, investUniv3RedeemReceiveReq2, this);
        if (objCopydefault4 == objCopydefault3) {
            return objCopydefault3;
        }
        investGasPriceConfig = investGasPriceConfig2;
        objCopydefault2 = objCopydefault4;
        if (Result.m7384isSuccessimpl(objCopydefault2)) {
        }
        return Result.m7376boximpl(Result.m7377constructorimpl(objCopydefault2));
    }
}
