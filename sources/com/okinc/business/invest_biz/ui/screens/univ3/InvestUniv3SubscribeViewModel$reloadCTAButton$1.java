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
import o.C24177iXt;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC24173iXp;
import o.iCP;
import o.iXH;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestUniv3SubscribeViewModel$reloadCTAButton$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<TransactionStep> $trxSteps;
    int label;
    final /* synthetic */ InvestUniv3SubscribeViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3SubscribeViewModel$reloadCTAButton$1(InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel, List<TransactionStep> list, Continuation<? super InvestUniv3SubscribeViewModel$reloadCTAButton$1> continuation) {
        super(2, continuation);
        this.this$0 = investUniv3SubscribeViewModel;
        this.$trxSteps = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUniv3SubscribeViewModel$reloadCTAButton$1(this.this$0, this.$trxSteps, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestUniv3SubscribeViewModel$reloadCTAButton$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            iXH ixhAhwBna = this.this$0.AhwBna();
            TransactionStage transactionStageFJNWhG = this.this$0.fJNWhG();
            List<TransactionStep> list = this.$trxSteps;
            C24177iXt c24177iXtKWHzl = iCP.KWHzl();
            this.label = 1;
            objEZpvd = ixhAhwBna.EZpvd(transactionStageFJNWhG, list, c24177iXtKWHzl, this);
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
        InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            investUniv3SubscribeViewModel.EZpvd.setValue((InterfaceC24173iXp) objEZpvd);
        }
        InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
            investUniv3SubscribeViewModel2.EZpvd.setValue(new InterfaceC24173iXp.ActionBar(iCP.KWHzl()));
        }
        return Unit.INSTANCE;
    }
}
