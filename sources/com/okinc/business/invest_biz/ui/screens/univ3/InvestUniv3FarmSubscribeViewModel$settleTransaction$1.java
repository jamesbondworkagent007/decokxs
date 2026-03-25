package com.okinc.business.invest_biz.ui.screens.univ3;

import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeReceiveInfo;
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
public final class InvestUniv3FarmSubscribeViewModel$settleTransaction$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ InvestUniv3FarmSubscribeViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3FarmSubscribeViewModel$settleTransaction$1(InvestUniv3FarmSubscribeViewModel investUniv3FarmSubscribeViewModel, Continuation<? super InvestUniv3FarmSubscribeViewModel$settleTransaction$1> continuation) {
        super(2, continuation);
        this.this$0 = investUniv3FarmSubscribeViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUniv3FarmSubscribeViewModel$settleTransaction$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestUniv3FarmSubscribeViewModel$settleTransaction$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
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
            TransactionStep transactionStepKWHzl = C24174iXq.KWHzl(this.this$0.AEQbTJ().getValue());
            if (this.this$0.valueOf() == null || this.this$0.djBIcL == null || transactionStepKWHzl == null) {
                MutableSharedFlow mutableSharedFlow = this.this$0.EZpvd;
                iXD.TaskDescription taskDescription = new iXD.TaskDescription(new OKServerException(0, "missing info.", null, null, 13, null), null, 2, null);
                this.label = 1;
                if (mutableSharedFlow.emit(taskDescription, this) == objCopydefault2) {
                    return objCopydefault2;
                }
                return Unit.INSTANCE;
            }
            iXN ixnIsConnected = this.this$0.isConnected();
            TransactionConfig transactionConfigValueOf = this.this$0.valueOf();
            Intrinsics.copydefault(transactionConfigValueOf);
            InterfaceC24182iXy.StateListAnimator stateListAnimator = InterfaceC24182iXy.StateListAnimator.OLrzqt;
            InvestUniv3FarmSubscribeViewModel investUniv3FarmSubscribeViewModel = this.this$0;
            TransactionConfig transactionConfigValueOf2 = investUniv3FarmSubscribeViewModel.valueOf();
            Intrinsics.copydefault(transactionConfigValueOf2);
            InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo = this.this$0.djBIcL;
            Intrinsics.copydefault(investUniv3SubscribeReceiveInfo);
            InvestTxModel investTxModelEZpvd = investUniv3FarmSubscribeViewModel.EZpvd(transactionConfigValueOf2, investUniv3SubscribeReceiveInfo, transactionStepKWHzl);
            this.label = 2;
            objCopydefault = ixnIsConnected.copydefault(transactionConfigValueOf, stateListAnimator, investTxModelEZpvd, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            obj2 = objCopydefault;
            InvestUniv3FarmSubscribeViewModel investUniv3FarmSubscribeViewModel2 = this.this$0;
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
                InvestUniv3FarmSubscribeViewModel investUniv3FarmSubscribeViewModel22 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    MutableSharedFlow mutableSharedFlow2 = investUniv3FarmSubscribeViewModel22.EZpvd;
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
        InvestUniv3FarmSubscribeViewModel investUniv3FarmSubscribeViewModel3 = this.this$0;
        if (Result.m7384isSuccessimpl(obj2)) {
            MutableSharedFlow mutableSharedFlow3 = investUniv3FarmSubscribeViewModel3.EZpvd;
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
