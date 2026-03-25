package com.okinc.business.invest_biz.ui.viewmodel;

import com.okinc.business.invest_biz.data.bean.InvestRedeemReceiveInfo;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.data.bean.response.TransactionStep;
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
public final class InvestRedeemViewModel$settleTransaction$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ InvestRedeemViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestRedeemViewModel$settleTransaction$1(InvestRedeemViewModel investRedeemViewModel, Continuation<? super InvestRedeemViewModel$settleTransaction$1> continuation) {
        super(2, continuation);
        this.this$0 = investRedeemViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestRedeemViewModel$settleTransaction$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestRedeemViewModel$settleTransaction$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
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
            iXN ixnEjfBZ = this.this$0.ejfBZ();
            TransactionConfig transactionConfigFJNWhG = this.this$0.fJNWhG();
            Intrinsics.copydefault(transactionConfigFJNWhG);
            InterfaceC24182iXy.StateListAnimator stateListAnimator = InterfaceC24182iXy.StateListAnimator.OLrzqt;
            InvestRedeemViewModel investRedeemViewModel = this.this$0;
            TransactionConfig transactionConfigFJNWhG2 = investRedeemViewModel.fJNWhG();
            Intrinsics.copydefault(transactionConfigFJNWhG2);
            InvestRedeemReceiveInfo investRedeemReceiveInfo = this.this$0.fetchVPNInfo;
            Intrinsics.copydefault(investRedeemReceiveInfo);
            InvestTxModel investTxModelCopydefault = investRedeemViewModel.copydefault(transactionConfigFJNWhG2, investRedeemReceiveInfo, transactionStepKWHzl, this.this$0.fetchVPNInfo());
            this.label = 2;
            objCopydefault = ixnEjfBZ.copydefault(transactionConfigFJNWhG, stateListAnimator, investTxModelCopydefault, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            obj2 = objCopydefault;
            InvestRedeemViewModel investRedeemViewModel2 = this.this$0;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
            if (thM7380exceptionOrNullimpl != null) {
            }
        } else {
            if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            if (i == 2) {
                C56391yDq.AEQbTJ(obj);
                objCopydefault = ((Result) obj).m7386unboximpl();
                obj2 = objCopydefault;
                InvestRedeemViewModel investRedeemViewModel22 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    MutableSharedFlow mutableSharedFlow2 = investRedeemViewModel22.copydefault;
                    iXD.TaskDescription taskDescription2 = new iXD.TaskDescription(thM7380exceptionOrNullimpl, null, 2, null);
                    this.L$0 = obj2;
                    this.label = 3;
                    if (mutableSharedFlow2.emit(taskDescription2, this) == objCopydefault2) {
                        return objCopydefault2;
                    }
                }
            } else {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
        }
        InvestRedeemViewModel investRedeemViewModel3 = this.this$0;
        if (Result.m7384isSuccessimpl(obj2)) {
            MutableSharedFlow mutableSharedFlow3 = investRedeemViewModel3.copydefault;
            iXD ixdKWHzl = ((C24183iXz) obj2).KWHzl();
            this.L$0 = obj2;
            this.label = 4;
            if (mutableSharedFlow3.emit(ixdKWHzl, this) == objCopydefault2) {
                return objCopydefault2;
            }
        }
        return Unit.INSTANCE;
    }
}
