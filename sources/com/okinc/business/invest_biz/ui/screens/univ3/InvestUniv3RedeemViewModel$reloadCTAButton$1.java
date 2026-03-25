package com.okinc.business.invest_biz.ui.screens.univ3;

import com.okinc.business.invest_biz.data.bean.response.TransactionStep;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C23963iPv;
import o.C24177iXt;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC24173iXp;
import o.iCP;
import o.iXH;
import o.pUU;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestUniv3RedeemViewModel$reloadCTAButton$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<TransactionStep> $trxSteps;
    int label;
    final /* synthetic */ InvestUniv3RedeemViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3RedeemViewModel$reloadCTAButton$1(InvestUniv3RedeemViewModel investUniv3RedeemViewModel, List<TransactionStep> list, Continuation<? super InvestUniv3RedeemViewModel$reloadCTAButton$1> continuation) {
        super(2, continuation);
        this.this$0 = investUniv3RedeemViewModel;
        this.$trxSteps = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUniv3RedeemViewModel$reloadCTAButton$1(this.this$0, this.$trxSteps, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestUniv3RedeemViewModel$reloadCTAButton$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        TransactionStage transactionStage;
        Object objEZpvd;
        C23963iPv value;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.ORxRYg().getValue() == null || ((value = this.this$0.ORxRYg().getValue()) != null && value.OLrzqt())) {
                transactionStage = TransactionStage.INPUT;
            } else {
                transactionStage = TransactionStage.CONFIRMATION;
            }
            iXH ixhValueOf = this.this$0.valueOf();
            List<TransactionStep> list = this.$trxSteps;
            C24177iXt c24177iXtKWHzl = iCP.KWHzl();
            this.label = 1;
            objEZpvd = ixhValueOf.EZpvd(transactionStage, list, c24177iXtKWHzl, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        InvestUniv3RedeemViewModel investUniv3RedeemViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            investUniv3RedeemViewModel.OLrzqt.setValue((InterfaceC24173iXp) objEZpvd);
        }
        InvestUniv3RedeemViewModel investUniv3RedeemViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.OLrzqt("reloadCTAButton Failed " + thM7380exceptionOrNullimpl.getMessage());
            investUniv3RedeemViewModel2.OLrzqt.setValue(new InterfaceC24173iXp.ActionBar(iCP.KWHzl()));
        }
        return Unit.INSTANCE;
    }
}
