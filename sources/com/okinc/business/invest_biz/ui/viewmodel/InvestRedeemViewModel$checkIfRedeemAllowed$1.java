package com.okinc.business.invest_biz.ui.viewmodel;

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
import o.C27544jxG;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23693iFv;
import o.iXD;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestRedeemViewModel$checkIfRedeemAllowed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ InvestRedeemViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestRedeemViewModel$checkIfRedeemAllowed$1(InvestRedeemViewModel investRedeemViewModel, Continuation<? super InvestRedeemViewModel$checkIfRedeemAllowed$1> continuation) {
        super(2, continuation);
        this.this$0 = investRedeemViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestRedeemViewModel$checkIfRedeemAllowed$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestRedeemViewModel$checkIfRedeemAllowed$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Throwable thM7380exceptionOrNullimpl;
        Object obj2;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            TransactionStep transactionStepKWHzl = C24174iXq.KWHzl(this.this$0.gEmmrt().getValue());
            if (this.this$0.fJNWhG() == null || this.this$0.fetchVPNInfo == null || transactionStepKWHzl == null) {
                MutableSharedFlow mutableSharedFlow = this.this$0.copydefault;
                iXD.TaskDescription taskDescription = new iXD.TaskDescription(new OKServerException(0, "missing info.", null, null, 13, null), null, 2, null);
                this.label = 1;
                if (mutableSharedFlow.emit(taskDescription, this) == objCopydefault2) {
                    return objCopydefault2;
                }
                return Unit.INSTANCE;
            }
            if (!InvestTradeManager.OLrzqt.AEQbTJ(transactionStepKWHzl.valueOf())) {
                InterfaceC23693iFv interfaceC23693iFvAYXKKw = this.this$0.AYXKKw();
                TransactionConfig transactionConfigFJNWhG = this.this$0.fJNWhG();
                Intrinsics.copydefault(transactionConfigFJNWhG);
                String strFetchVPNInfo = this.this$0.fetchVPNInfo();
                int iValueOf = transactionStepKWHzl.valueOf();
                this.label = 2;
                objCopydefault = interfaceC23693iFvAYXKKw.copydefault(transactionConfigFJNWhG, strFetchVPNInfo, iValueOf, this);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                InvestRedeemViewModel investRedeemViewModel = this.this$0;
                if (Result.m7384isSuccessimpl(objCopydefault)) {
                }
                InvestRedeemViewModel investRedeemViewModel2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
                if (thM7380exceptionOrNullimpl != null) {
                }
                Result.m7376boximpl(objCopydefault);
            } else {
                this.this$0.getNewProxyInstance();
            }
        } else {
            if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            if (i == 2) {
                C56391yDq.AEQbTJ(obj);
                objCopydefault = ((Result) obj).m7386unboximpl();
                InvestRedeemViewModel investRedeemViewModel3 = this.this$0;
                if (Result.m7384isSuccessimpl(objCopydefault)) {
                    investRedeemViewModel3.getNewProxyInstance();
                }
                InvestRedeemViewModel investRedeemViewModel22 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
                if (thM7380exceptionOrNullimpl != null) {
                    if (!(thM7380exceptionOrNullimpl instanceof OKServerException)) {
                        investRedeemViewModel22.KWHzl(thM7380exceptionOrNullimpl.getMessage());
                        MutableSharedFlow mutableSharedFlow2 = investRedeemViewModel22.copydefault;
                        iXD.TaskDescription taskDescription2 = new iXD.TaskDescription(thM7380exceptionOrNullimpl, null, 2, null);
                        this.L$0 = objCopydefault;
                        this.label = 3;
                        if (mutableSharedFlow2.emit(taskDescription2, this) == objCopydefault2) {
                            return objCopydefault2;
                        }
                        obj2 = objCopydefault;
                        objCopydefault = obj2;
                    } else {
                        OKServerException oKServerException = (OKServerException) thM7380exceptionOrNullimpl;
                        investRedeemViewModel22.EZpvd(oKServerException.getCode(), C27544jxG.OLrzqt(oKServerException));
                    }
                }
                Result.m7376boximpl(objCopydefault);
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objCopydefault = obj2;
                Result.m7376boximpl(objCopydefault);
            }
        }
        return Unit.INSTANCE;
    }
}
