package com.okinc.business.invest_biz.ui.screens.base_transaction;

import com.okinc.business.invest_biz.data.bean.InvestOrder;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestInputData;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC24170iXm;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC24182iXy;
import o.iXB;
import o.iXG;
import o.yDY;

/* JADX INFO: loaded from: classes6.dex */
public final class BaseTransactionViewModel$fetchInitialInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InvestInputData $selectedTokenInputData;
    int label;
    final /* synthetic */ AbstractC24170iXm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTransactionViewModel$fetchInitialInfo$1(AbstractC24170iXm abstractC24170iXm, InvestInputData investInputData, Continuation<? super BaseTransactionViewModel$fetchInitialInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractC24170iXm;
        this.$selectedTokenInputData = investInputData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseTransactionViewModel$fetchInitialInfo$1(this.this$0, this.$selectedTokenInputData, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseTransactionViewModel$fetchInitialInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0128  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InvestInputData investInputData;
        ArrayList<InvestInputData> arrayListValueOf;
        Object objAEQbTJ;
        Object objM7386unboximpl;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.KWHzl.getValue() == null) {
                MutableStateFlow mutableStateFlow = this.this$0.copydefault;
                InterfaceC24182iXy.ActionBar actionBar = InterfaceC24182iXy.ActionBar.copydefault;
                this.label = 1;
                if (mutableStateFlow.emit(actionBar, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    iXG ixg = this.this$0.AkhnZx;
                    TransactionConfig transactionConfig = this.this$0.uzCIH;
                    investInputData = this.$selectedTokenInputData;
                    if (investInputData != null) {
                        arrayListValueOf = this.this$0.uzCIH.valueOf();
                    } else {
                        arrayListValueOf = yDY.copydefault(investInputData);
                    }
                    TransactionConfig transactionConfigAEQbTJ = transactionConfig.AEQbTJ((33554427 & 1) != 0 ? transactionConfig.gEmmrt : 0, (33554427 & 2) != 0 ? transactionConfig.iwGUEr : 0, (33554427 & 4) != 0 ? transactionConfig.values : 0L, (33554427 & 8) != 0 ? transactionConfig.AkhnZx : false, (33554427 & 16) != 0 ? transactionConfig.fIwbmz : 0L, (33554427 & 32) != 0 ? transactionConfig.AEQbTJ : 0L, (33554427 & 64) != 0 ? transactionConfig.AuCTel : null, (33554427 & 128) != 0 ? transactionConfig.fARcdN : null, (33554427 & 256) != 0 ? transactionConfig.valueOf : arrayListValueOf, (33554427 & 512) != 0 ? transactionConfig.DbNXlk : 0, (33554427 & 1024) != 0 ? transactionConfig.hDKMBd : null, (33554427 & 2048) != 0 ? transactionConfig.OLrzqt : 0L, (33554427 & 4096) != 0 ? transactionConfig.AhwBna : 0, (33554427 & 8192) != 0 ? transactionConfig.uzCIH : null, (33554427 & 16384) != 0 ? transactionConfig.djBIcL : null, (33554427 & 32768) != 0 ? transactionConfig.getNewProxyInstance : null, (33554427 & 65536) != 0 ? transactionConfig.copydefault : null, (33554427 & 131072) != 0 ? transactionConfig.isConnected : null, (33554427 & 262144) != 0 ? transactionConfig.fJNWhG : false, (33554427 & 524288) != 0 ? transactionConfig.AYXKKw : false, (33554427 & 1048576) != 0 ? transactionConfig.EZpvd : null, (33554427 & 2097152) != 0 ? transactionConfig.KWHzl : null, (33554427 & 4194304) != 0 ? transactionConfig.fetchVPNInfo : false, (33554427 & 8388608) != 0 ? transactionConfig.getFieldNames : false, (33554427 & 16777216) != 0 ? transactionConfig.ejfBZ : null);
                    this.label = 3;
                    objAEQbTJ = ixg.AEQbTJ(transactionConfigAEQbTJ, this);
                    if (objAEQbTJ != objCopydefault) {
                        return objCopydefault;
                    }
                    objM7386unboximpl = objAEQbTJ;
                    AbstractC24170iXm abstractC24170iXm = this.this$0;
                    if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                    }
                    AbstractC24170iXm abstractC24170iXm2 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
                AbstractC24170iXm abstractC24170iXm3 = this.this$0;
                if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                    InitialInfoModel initialInfoModel = (InitialInfoModel) objM7386unboximpl;
                    abstractC24170iXm3.KWHzl.setValue(initialInfoModel);
                    if (initialInfoModel instanceof InitialInfoModel.RedeemInitialInfo) {
                        InitialInfoModel.RedeemInitialInfo redeemInitialInfo = (InitialInfoModel.RedeemInitialInfo) initialInfoModel;
                        if (redeemInitialInfo.valueOf()) {
                            InvestOrder investOrderAhwBna = abstractC24170iXm3.uzCIH.AhwBna();
                            String stakedAmount = investOrderAhwBna != null ? investOrderAhwBna.getStakedAmount() : null;
                            if (stakedAmount == null) {
                                stakedAmount = "";
                            }
                            abstractC24170iXm3.copydefault(new iXB(stakedAmount, redeemInitialInfo.fIwbmz(), TransactionStage.CONFIRMATION, null, null, null, 0L, null, 0, false, false, false, 4088, null));
                        }
                    }
                    abstractC24170iXm3.OLrzqt(initialInfoModel, abstractC24170iXm3.uzCIH);
                }
                AbstractC24170iXm abstractC24170iXm22 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                if (thM7380exceptionOrNullimpl != null) {
                    abstractC24170iXm22.copydefault.setValue(new InterfaceC24182iXy.TaskDescription(thM7380exceptionOrNullimpl));
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        MutableStateFlow mutableStateFlow2 = this.this$0.KWHzl;
        this.label = 2;
        if (mutableStateFlow2.emit(null, this) == objCopydefault) {
            return objCopydefault;
        }
        iXG ixg2 = this.this$0.AkhnZx;
        TransactionConfig transactionConfig2 = this.this$0.uzCIH;
        investInputData = this.$selectedTokenInputData;
        if (investInputData != null) {
        }
        TransactionConfig transactionConfigAEQbTJ2 = transactionConfig2.AEQbTJ((33554427 & 1) != 0 ? transactionConfig2.gEmmrt : 0, (33554427 & 2) != 0 ? transactionConfig2.iwGUEr : 0, (33554427 & 4) != 0 ? transactionConfig2.values : 0L, (33554427 & 8) != 0 ? transactionConfig2.AkhnZx : false, (33554427 & 16) != 0 ? transactionConfig2.fIwbmz : 0L, (33554427 & 32) != 0 ? transactionConfig2.AEQbTJ : 0L, (33554427 & 64) != 0 ? transactionConfig2.AuCTel : null, (33554427 & 128) != 0 ? transactionConfig2.fARcdN : null, (33554427 & 256) != 0 ? transactionConfig2.valueOf : arrayListValueOf, (33554427 & 512) != 0 ? transactionConfig2.DbNXlk : 0, (33554427 & 1024) != 0 ? transactionConfig2.hDKMBd : null, (33554427 & 2048) != 0 ? transactionConfig2.OLrzqt : 0L, (33554427 & 4096) != 0 ? transactionConfig2.AhwBna : 0, (33554427 & 8192) != 0 ? transactionConfig2.uzCIH : null, (33554427 & 16384) != 0 ? transactionConfig2.djBIcL : null, (33554427 & 32768) != 0 ? transactionConfig2.getNewProxyInstance : null, (33554427 & 65536) != 0 ? transactionConfig2.copydefault : null, (33554427 & 131072) != 0 ? transactionConfig2.isConnected : null, (33554427 & 262144) != 0 ? transactionConfig2.fJNWhG : false, (33554427 & 524288) != 0 ? transactionConfig2.AYXKKw : false, (33554427 & 1048576) != 0 ? transactionConfig2.EZpvd : null, (33554427 & 2097152) != 0 ? transactionConfig2.KWHzl : null, (33554427 & 4194304) != 0 ? transactionConfig2.fetchVPNInfo : false, (33554427 & 8388608) != 0 ? transactionConfig2.getFieldNames : false, (33554427 & 16777216) != 0 ? transactionConfig2.ejfBZ : null);
        this.label = 3;
        objAEQbTJ = ixg2.AEQbTJ(transactionConfigAEQbTJ2, this);
        if (objAEQbTJ != objCopydefault) {
        }
    }
}
