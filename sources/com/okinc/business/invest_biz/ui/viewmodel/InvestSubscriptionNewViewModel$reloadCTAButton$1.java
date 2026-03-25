package com.okinc.business.invest_biz.ui.viewmodel;

import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.PromptInformation;
import com.okinc.business.invest_biz.data.bean.response.TransactionStep;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C24177iXt;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC24173iXp;
import o.iCP;
import o.iXH;
import o.pUU;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestSubscriptionNewViewModel$reloadCTAButton$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<TransactionStep> $trxSteps;
    Object L$0;
    int label;
    final /* synthetic */ InvestSubscriptionNewViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestSubscriptionNewViewModel$reloadCTAButton$1(InvestSubscriptionNewViewModel investSubscriptionNewViewModel, List<TransactionStep> list, Continuation<? super InvestSubscriptionNewViewModel$reloadCTAButton$1> continuation) {
        super(2, continuation);
        this.this$0 = investSubscriptionNewViewModel;
        this.$trxSteps = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestSubscriptionNewViewModel$reloadCTAButton$1(this.this$0, this.$trxSteps, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestSubscriptionNewViewModel$reloadCTAButton$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C24177iXt c24177iXtKWHzl;
        C24177iXt c24177iXt;
        Object objM7386unboximpl;
        InvestTipInfoVo investmentInfoTip;
        C24177iXt c24177iXtKWHzl2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            PromptInformation promptInformation = this.this$0.zLjUOn().getPromptInformation();
            if (promptInformation == null || (investmentInfoTip = promptInformation.getInvestmentInfoTip()) == null || (c24177iXtKWHzl = (c24177iXtKWHzl2 = iCP.KWHzl()).copydefault((247 & 1) != 0 ? c24177iXtKWHzl2.copydefault : null, (247 & 2) != 0 ? c24177iXtKWHzl2.valueOf : null, (247 & 4) != 0 ? c24177iXtKWHzl2.djBIcL : 0, (247 & 8) != 0 ? c24177iXtKWHzl2.OLrzqt : false, (247 & 16) != 0 ? c24177iXtKWHzl2.EZpvd : false, (247 & 32) != 0 ? c24177iXtKWHzl2.AEQbTJ : investmentInfoTip, (247 & 64) != 0 ? c24177iXtKWHzl2.AYXKKw : 0, (247 & 128) != 0 ? c24177iXtKWHzl2.KWHzl : 0)) == null) {
                c24177iXtKWHzl = iCP.KWHzl();
            }
            iXH fieldNames = this.this$0.getFieldNames();
            TransactionStage transactionStage = this.this$0.isConnected;
            List<TransactionStep> list = this.$trxSteps;
            this.L$0 = c24177iXtKWHzl;
            this.label = 1;
            Object objEZpvd = fieldNames.EZpvd(transactionStage, list, c24177iXtKWHzl, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c24177iXt = c24177iXtKWHzl;
            objM7386unboximpl = objEZpvd;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c24177iXt = (C24177iXt) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
        }
        InvestSubscriptionNewViewModel investSubscriptionNewViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            investSubscriptionNewViewModel.EZpvd.setValue((InterfaceC24173iXp) objM7386unboximpl);
        }
        InvestSubscriptionNewViewModel investSubscriptionNewViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.OLrzqt("reloadCTAButton Failed " + thM7380exceptionOrNullimpl.getMessage());
            investSubscriptionNewViewModel2.EZpvd.setValue(new InterfaceC24173iXp.ActionBar(c24177iXt));
        }
        return Unit.INSTANCE;
    }
}
