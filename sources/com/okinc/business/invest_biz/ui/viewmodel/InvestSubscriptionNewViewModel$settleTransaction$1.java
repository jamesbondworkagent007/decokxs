package com.okinc.business.invest_biz.ui.viewmodel;

import com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfo;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.data.bean.response.TransactionStep;
import com.okinc.business.invest_biz.data.logic.InvestTradeManager;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C24174iXq;
import o.C24183iXz;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC24182iXy;
import o.iXD;
import o.iXN;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestSubscriptionNewViewModel$settleTransaction$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $fromUSDTDialog;
    Object L$0;
    int label;
    final /* synthetic */ InvestSubscriptionNewViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestSubscriptionNewViewModel$settleTransaction$1(InvestSubscriptionNewViewModel investSubscriptionNewViewModel, boolean z, Continuation<? super InvestSubscriptionNewViewModel$settleTransaction$1> continuation) {
        super(2, continuation);
        this.this$0 = investSubscriptionNewViewModel;
        this.$fromUSDTDialog = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestSubscriptionNewViewModel$settleTransaction$1(this.this$0, this.$fromUSDTDialog, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestSubscriptionNewViewModel$settleTransaction$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            TransactionStep transactionStepKWHzl = C24174iXq.KWHzl(this.this$0.DbNXlk().getValue());
            if (this.this$0.RcXXUw() == null || this.this$0.values == null || transactionStepKWHzl == null) {
                MutableSharedFlow mutableSharedFlow = this.this$0.copydefault;
                iXD.TaskDescription taskDescription = new iXD.TaskDescription(new OKServerException(0, "Missing Info.", null, null, 13, null), null, 2, null);
                this.label = 1;
                if (mutableSharedFlow.emit(taskDescription, this) == objCopydefault2) {
                    return objCopydefault2;
                }
                return Unit.INSTANCE;
            }
            InvestTradeManager investTradeManager = InvestTradeManager.OLrzqt;
            if (investTradeManager.AEQbTJ(transactionStepKWHzl.valueOf()) && investTradeManager.KWHzl(transactionStepKWHzl.AEQbTJ()) && !this.$fromUSDTDialog) {
                MutableSharedFlow mutableSharedFlow2 = this.this$0.copydefault;
                iXD.TaskDescription taskDescription2 = new iXD.TaskDescription(new OKServerException(111000111, "Show USDT Reminder Dialog.", null, null, 12, null), null, 2, null);
                this.label = 2;
                if (mutableSharedFlow2.emit(taskDescription2, this) == objCopydefault2) {
                    return objCopydefault2;
                }
                return Unit.INSTANCE;
            }
            iXN ixnQbewEr = this.this$0.QbewEr();
            TransactionConfig transactionConfigRcXXUw = this.this$0.RcXXUw();
            Intrinsics.copydefault(transactionConfigRcXXUw);
            InterfaceC24182iXy.StateListAnimator stateListAnimator = InterfaceC24182iXy.StateListAnimator.OLrzqt;
            InvestSubscriptionNewViewModel investSubscriptionNewViewModel = this.this$0;
            TransactionConfig transactionConfigRcXXUw2 = investSubscriptionNewViewModel.RcXXUw();
            Intrinsics.copydefault(transactionConfigRcXXUw2);
            InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo = this.this$0.values;
            Intrinsics.copydefault(investSubscriptionReceiveInfo);
            InvestTxModel investTxModelOLrzqt = investSubscriptionNewViewModel.OLrzqt(transactionConfigRcXXUw2, investSubscriptionReceiveInfo, transactionStepKWHzl);
            this.label = 3;
            objCopydefault = ixnQbewEr.copydefault(transactionConfigRcXXUw, stateListAnimator, investTxModelOLrzqt, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            InvestSubscriptionNewViewModel investSubscriptionNewViewModel2 = this.this$0;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
            if (thM7380exceptionOrNullimpl != null) {
            }
        } else {
            if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            if (i == 2) {
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            if (i == 3) {
                C56391yDq.AEQbTJ(obj);
                objCopydefault = ((Result) obj).m7386unboximpl();
                InvestSubscriptionNewViewModel investSubscriptionNewViewModel22 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
                if (thM7380exceptionOrNullimpl != null) {
                    MutableSharedFlow mutableSharedFlow3 = investSubscriptionNewViewModel22.copydefault;
                    iXD.TaskDescription taskDescription3 = new iXD.TaskDescription(thM7380exceptionOrNullimpl, null, 2, null);
                    this.L$0 = objCopydefault;
                    this.label = 4;
                    if (mutableSharedFlow3.emit(taskDescription3, this) == objCopydefault2) {
                        return objCopydefault2;
                    }
                }
            } else {
                if (i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                objCopydefault = this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
        }
        InvestSubscriptionNewViewModel investSubscriptionNewViewModel3 = this.this$0;
        if (Result.m7384isSuccessimpl(objCopydefault)) {
            MutableSharedFlow mutableSharedFlow4 = investSubscriptionNewViewModel3.copydefault;
            iXD ixdKWHzl = ((C24183iXz) objCopydefault).KWHzl();
            this.L$0 = objCopydefault;
            this.label = 5;
            if (mutableSharedFlow4.emit(ixdKWHzl, this) == objCopydefault2) {
                return objCopydefault2;
            }
        }
        return Unit.INSTANCE;
    }
}
