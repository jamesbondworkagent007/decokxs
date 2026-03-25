package com.okinc.business.invest_biz.data.repository;

import com.okinc.business.invest_biz.data.bean.request.InvestSubscriptionProtocolsReq;
import com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestSubscriptionProtocolModel;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C26656jgT;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23589iBz;
import o.InterfaceC25472ixP;
import o.iBL;
import o.iDD;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestTransactionRepositoryImpl$getSubscribeProtocols$2 extends SuspendLambda implements Function1<Continuation<? super InvestSubscriptionProtocolModel>, Object> {
    final /* synthetic */ InvestSubscriptionProtocolsReq $req;
    int label;
    final /* synthetic */ iDD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestTransactionRepositoryImpl$getSubscribeProtocols$2(iDD idd, InvestSubscriptionProtocolsReq investSubscriptionProtocolsReq, Continuation<? super InvestTransactionRepositoryImpl$getSubscribeProtocols$2> continuation) {
        super(1, continuation);
        this.this$0 = idd;
        this.$req = investSubscriptionProtocolsReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new InvestTransactionRepositoryImpl$getSubscribeProtocols$2(this.this$0, this.$req, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super InvestSubscriptionProtocolModel> continuation) {
        return ((InvestTransactionRepositoryImpl$getSubscribeProtocols$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C26656jgT c26656jgT = C26656jgT.copydefault;
            InvestSubscriptionProtocolModel investSubscriptionProtocolModelEZpvd = c26656jgT.EZpvd();
            if (investSubscriptionProtocolModelEZpvd != null) {
                return investSubscriptionProtocolModelEZpvd;
            }
            c26656jgT.copydefault();
            InterfaceC23589iBz interfaceC23589iBz = this.this$0.AEQbTJ;
            String accountId = this.$req.getAccountId();
            this.label = 1;
            obj = interfaceC23589iBz.KWHzl(accountId, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                Object objUnwrapResponseData$default = iBL.unwrapResponseData$default((ResponseData) obj, null, 1, null);
                Intrinsics.copydefault(objUnwrapResponseData$default);
                InvestSubscriptionProtocolModel investSubscriptionProtocolModel = (InvestSubscriptionProtocolModel) objUnwrapResponseData$default;
                C26656jgT.copydefault.EZpvd(investSubscriptionProtocolModel);
                return investSubscriptionProtocolModel;
            }
            C56391yDq.AEQbTJ(obj);
        }
        long investmentId = this.$req.getInvestmentId();
        this.label = 2;
        obj = ((InterfaceC25472ixP) obj).OLrzqt(String.valueOf(investmentId), this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        Object objUnwrapResponseData$default2 = iBL.unwrapResponseData$default((ResponseData) obj, null, 1, null);
        Intrinsics.copydefault(objUnwrapResponseData$default2);
        InvestSubscriptionProtocolModel investSubscriptionProtocolModel2 = (InvestSubscriptionProtocolModel) objUnwrapResponseData$default2;
        C26656jgT.copydefault.EZpvd(investSubscriptionProtocolModel2);
        return investSubscriptionProtocolModel2;
    }
}
