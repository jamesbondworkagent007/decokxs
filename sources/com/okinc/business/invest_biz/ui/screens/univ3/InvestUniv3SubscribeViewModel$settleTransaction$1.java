package com.okinc.business.invest_biz.ui.screens.univ3;

import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeInfo;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeReceiveInfo;
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
public final class InvestUniv3SubscribeViewModel$settleTransaction$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $fromUSDTDialog;
    Object L$0;
    int label;
    final /* synthetic */ InvestUniv3SubscribeViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3SubscribeViewModel$settleTransaction$1(InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel, boolean z, Continuation<? super InvestUniv3SubscribeViewModel$settleTransaction$1> continuation) {
        super(2, continuation);
        this.this$0 = investUniv3SubscribeViewModel;
        this.$fromUSDTDialog = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUniv3SubscribeViewModel$settleTransaction$1(this.this$0, this.$fromUSDTDialog, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestUniv3SubscribeViewModel$settleTransaction$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0195  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        TransactionConfig transactionConfigValueOf;
        Object objCopydefault;
        Long analysisPlatformId;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            TransactionStep transactionStepKWHzl = C24174iXq.KWHzl(this.this$0.KWHzl().getValue());
            if (this.this$0.valueOf() == null || this.this$0.isConnected() == null || transactionStepKWHzl == null) {
                MutableSharedFlow mutableSharedFlow = this.this$0.OLrzqt;
                iXD.TaskDescription taskDescription = new iXD.TaskDescription(new OKServerException(0, "missing info.", null, null, 13, null), null, 2, null);
                this.label = 1;
                if (mutableSharedFlow.emit(taskDescription, this) == objCopydefault2) {
                    return objCopydefault2;
                }
                return Unit.INSTANCE;
            }
            if (this.this$0.gEmmrt() != null) {
                TransactionConfig transactionConfigValueOf2 = this.this$0.valueOf();
                if (transactionConfigValueOf2 != null) {
                    InvestUniv3SubscribeInfo investUniv3SubscribeInfoGEmmrt = this.this$0.gEmmrt();
                    long jLongValue = (investUniv3SubscribeInfoGEmmrt == null || (analysisPlatformId = investUniv3SubscribeInfoGEmmrt.getAnalysisPlatformId()) == null) ? 0L : analysisPlatformId.longValue();
                    InvestUniv3SubscribeInfo investUniv3SubscribeInfoGEmmrt2 = this.this$0.gEmmrt();
                    transactionConfigValueOf = transactionConfigValueOf2.AEQbTJ((33554427 & 1) != 0 ? transactionConfigValueOf2.gEmmrt : 0, (33554427 & 2) != 0 ? transactionConfigValueOf2.iwGUEr : 0, (33554427 & 4) != 0 ? transactionConfigValueOf2.values : 0L, (33554427 & 8) != 0 ? transactionConfigValueOf2.AkhnZx : false, (33554427 & 16) != 0 ? transactionConfigValueOf2.fIwbmz : 0L, (33554427 & 32) != 0 ? transactionConfigValueOf2.AEQbTJ : 0L, (33554427 & 64) != 0 ? transactionConfigValueOf2.AuCTel : null, (33554427 & 128) != 0 ? transactionConfigValueOf2.fARcdN : null, (33554427 & 256) != 0 ? transactionConfigValueOf2.valueOf : null, (33554427 & 512) != 0 ? transactionConfigValueOf2.DbNXlk : 0, (33554427 & 1024) != 0 ? transactionConfigValueOf2.hDKMBd : null, (33554427 & 2048) != 0 ? transactionConfigValueOf2.OLrzqt : jLongValue, (33554427 & 4096) != 0 ? transactionConfigValueOf2.AhwBna : investUniv3SubscribeInfoGEmmrt2 != null ? investUniv3SubscribeInfoGEmmrt2.getInvestType() : 0, (33554427 & 8192) != 0 ? transactionConfigValueOf2.uzCIH : null, (33554427 & 16384) != 0 ? transactionConfigValueOf2.djBIcL : null, (33554427 & 32768) != 0 ? transactionConfigValueOf2.getNewProxyInstance : null, (33554427 & 65536) != 0 ? transactionConfigValueOf2.copydefault : null, (33554427 & 131072) != 0 ? transactionConfigValueOf2.isConnected : null, (33554427 & 262144) != 0 ? transactionConfigValueOf2.fJNWhG : false, (33554427 & 524288) != 0 ? transactionConfigValueOf2.AYXKKw : false, (33554427 & 1048576) != 0 ? transactionConfigValueOf2.EZpvd : null, (33554427 & 2097152) != 0 ? transactionConfigValueOf2.KWHzl : null, (33554427 & 4194304) != 0 ? transactionConfigValueOf2.fetchVPNInfo : false, (33554427 & 8388608) != 0 ? transactionConfigValueOf2.getFieldNames : false, (33554427 & 16777216) != 0 ? transactionConfigValueOf2.ejfBZ : null);
                } else {
                    transactionConfigValueOf = null;
                }
            } else {
                transactionConfigValueOf = this.this$0.valueOf();
            }
            InvestTradeManager investTradeManager = InvestTradeManager.OLrzqt;
            if (investTradeManager.AEQbTJ(transactionStepKWHzl.valueOf()) && investTradeManager.KWHzl(transactionStepKWHzl.AEQbTJ()) && !this.$fromUSDTDialog) {
                MutableSharedFlow mutableSharedFlow2 = this.this$0.OLrzqt;
                iXD.TaskDescription taskDescription2 = new iXD.TaskDescription(new OKServerException(111000111, "", null, null, 12, null), null, 2, null);
                this.label = 2;
                if (mutableSharedFlow2.emit(taskDescription2, this) == objCopydefault2) {
                    return objCopydefault2;
                }
                return Unit.INSTANCE;
            }
            iXN ixnDjSkpj = this.this$0.djSkpj();
            Intrinsics.copydefault(transactionConfigValueOf);
            InterfaceC24182iXy.StateListAnimator stateListAnimator = InterfaceC24182iXy.StateListAnimator.OLrzqt;
            InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel = this.this$0;
            TransactionConfig transactionConfigValueOf3 = investUniv3SubscribeViewModel.valueOf();
            Intrinsics.copydefault(transactionConfigValueOf3);
            TransactionConfig transactionConfigAEQbTJ = transactionConfigValueOf3.AEQbTJ((33554427 & 1) != 0 ? transactionConfigValueOf3.gEmmrt : 0, (33554427 & 2) != 0 ? transactionConfigValueOf3.iwGUEr : 0, (33554427 & 4) != 0 ? transactionConfigValueOf3.values : 0L, (33554427 & 8) != 0 ? transactionConfigValueOf3.AkhnZx : false, (33554427 & 16) != 0 ? transactionConfigValueOf3.fIwbmz : 0L, (33554427 & 32) != 0 ? transactionConfigValueOf3.AEQbTJ : 0L, (33554427 & 64) != 0 ? transactionConfigValueOf3.AuCTel : null, (33554427 & 128) != 0 ? transactionConfigValueOf3.fARcdN : null, (33554427 & 256) != 0 ? transactionConfigValueOf3.valueOf : null, (33554427 & 512) != 0 ? transactionConfigValueOf3.DbNXlk : 0, (33554427 & 1024) != 0 ? transactionConfigValueOf3.hDKMBd : null, (33554427 & 2048) != 0 ? transactionConfigValueOf3.OLrzqt : 0L, (33554427 & 4096) != 0 ? transactionConfigValueOf3.AhwBna : 0, (33554427 & 8192) != 0 ? transactionConfigValueOf3.uzCIH : null, (33554427 & 16384) != 0 ? transactionConfigValueOf3.djBIcL : null, (33554427 & 32768) != 0 ? transactionConfigValueOf3.getNewProxyInstance : null, (33554427 & 65536) != 0 ? transactionConfigValueOf3.copydefault : null, (33554427 & 131072) != 0 ? transactionConfigValueOf3.isConnected : null, (33554427 & 262144) != 0 ? transactionConfigValueOf3.fJNWhG : false, (33554427 & 524288) != 0 ? transactionConfigValueOf3.AYXKKw : false, (33554427 & 1048576) != 0 ? transactionConfigValueOf3.EZpvd : null, (33554427 & 2097152) != 0 ? transactionConfigValueOf3.KWHzl : null, (33554427 & 4194304) != 0 ? transactionConfigValueOf3.fetchVPNInfo : this.this$0.OcIXYQ(), (33554427 & 8388608) != 0 ? transactionConfigValueOf3.getFieldNames : this.this$0.ffGIBT(), (33554427 & 16777216) != 0 ? transactionConfigValueOf3.ejfBZ : null);
            InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfoIsConnected = this.this$0.isConnected();
            Intrinsics.copydefault(investUniv3SubscribeReceiveInfoIsConnected);
            InvestTxModel investTxModelEZpvd = investUniv3SubscribeViewModel.EZpvd(transactionConfigAEQbTJ, investUniv3SubscribeReceiveInfoIsConnected, transactionStepKWHzl);
            this.label = 3;
            objCopydefault = ixnDjSkpj.copydefault(transactionConfigValueOf, stateListAnimator, investTxModelEZpvd, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel2 = this.this$0;
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
                InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel22 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
                if (thM7380exceptionOrNullimpl != null) {
                    MutableSharedFlow mutableSharedFlow3 = investUniv3SubscribeViewModel22.OLrzqt;
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
        InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel3 = this.this$0;
        if (Result.m7384isSuccessimpl(objCopydefault)) {
            investUniv3SubscribeViewModel3.QSBOWP();
            MutableSharedFlow mutableSharedFlow4 = investUniv3SubscribeViewModel3.OLrzqt;
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
