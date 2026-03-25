package com.okinc.business.invest_biz.ui.screens.base_transaction;

import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC24170iXm;
import o.C24177iXt;
import o.C24181iXx;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC24173iXp;
import o.InterfaceC24182iXy;
import o.iCP;
import o.iXA;
import o.iXB;
import o.iXC;
import o.iXD;

/* JADX INFO: loaded from: classes6.dex */
public final class BaseTransactionViewModel$emitError$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C24177iXt $buttonError;
    final /* synthetic */ iXD $trxError;
    int label;
    final /* synthetic */ AbstractC24170iXm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTransactionViewModel$emitError$1(AbstractC24170iXm abstractC24170iXm, iXD ixd, C24177iXt c24177iXt, Continuation<? super BaseTransactionViewModel$emitError$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractC24170iXm;
        this.$trxError = ixd;
        this.$buttonError = c24177iXt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseTransactionViewModel$emitError$1(this.this$0, this.$trxError, this.$buttonError, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseTransactionViewModel$emitError$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00f5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        iXC ixcKWHzl;
        iXB ixb;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow mutableSharedFlow = this.this$0.AYXKKw;
            iXD ixd = this.$trxError;
            this.label = 1;
            if (mutableSharedFlow.emit(ixd, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                ixb = (iXB) this.this$0.AhwBna.getValue();
                if (ixb != null) {
                    this.this$0.copydefault(ixb.KWHzl((4091 & 1) != 0 ? ixb.copydefault : null, (4091 & 2) != 0 ? ixb.valueOf : null, (4091 & 4) != 0 ? ixb.AkhnZx : TransactionStage.INPUT, (4091 & 8) != 0 ? ixb.OLrzqt : null, (4091 & 16) != 0 ? ixb.AYXKKw : null, (4091 & 32) != 0 ? ixb.gEmmrt : null, (4091 & 64) != 0 ? ixb.fetchVPNInfo : 0L, (4091 & 128) != 0 ? ixb.djBIcL : null, (4091 & 256) != 0 ? ixb.AEQbTJ : 0, (4091 & 512) != 0 ? ixb.AhwBna : false, (4091 & 1024) != 0 ? ixb.KWHzl : false, (4091 & 2048) != 0 ? ixb.EZpvd : false));
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        iXD ixd2 = this.$trxError;
        if ((ixd2 instanceof iXD.TaskDescription) && (((iXD.TaskDescription) ixd2).OLrzqt() instanceof OKServerException) && ((OKServerException) ((iXD.TaskDescription) this.$trxError).OLrzqt()).getCode() == 10006) {
            iXC ixcAEQbTJ = C24181iXx.AEQbTJ((InterfaceC24182iXy) this.this$0.copydefault.getValue());
            AbstractC24170iXm abstractC24170iXm = this.this$0;
            TransactionStage transactionStage = TransactionStage.INPUT;
            if (ixcAEQbTJ != null) {
                iXA ixaEZpvd = ixcAEQbTJ.EZpvd();
                ixcKWHzl = ixcAEQbTJ.KWHzl((16777087 & 1) != 0 ? ixcAEQbTJ.AkhnZx : false, (16777087 & 2) != 0 ? ixcAEQbTJ.fetchVPNInfo : false, (16777087 & 4) != 0 ? ixcAEQbTJ.valueOf : null, (16777087 & 8) != 0 ? ixcAEQbTJ.values : 0L, (16777087 & 16) != 0 ? ixcAEQbTJ.djBIcL : 0, (16777087 & 32) != 0 ? ixcAEQbTJ.EZpvd : 0L, (16777087 & 64) != 0 ? ixcAEQbTJ.DbNXlk : 0, (16777087 & 128) != 0 ? ixcAEQbTJ.fARcdN : transactionStage, (16777087 & 256) != 0 ? ixcAEQbTJ.fIwbmz : null, (16777087 & 512) != 0 ? ixcAEQbTJ.KWHzl : ixaEZpvd.AEQbTJ((1032191 & 1) != 0 ? ixaEZpvd.AuCTel : null, (1032191 & 2) != 0 ? ixaEZpvd.DbNXlk : false, (1032191 & 4) != 0 ? ixaEZpvd.copydefault : null, (1032191 & 8) != 0 ? ixaEZpvd.AYXKKw : null, (1032191 & 16) != 0 ? ixaEZpvd.ejfBZ : null, (1032191 & 32) != 0 ? ixaEZpvd.fARcdN : null, (1032191 & 64) != 0 ? ixaEZpvd.djBIcL : null, (1032191 & 128) != 0 ? ixaEZpvd.EZpvd : 0, (1032191 & 256) != 0 ? ixaEZpvd.fIwbmz : 0, (1032191 & 512) != 0 ? ixaEZpvd.AkhnZx : false, (1032191 & 1024) != 0 ? ixaEZpvd.values : false, (1032191 & 2048) != 0 ? ixaEZpvd.fJNWhG : null, (1032191 & 4096) != 0 ? ixaEZpvd.KWHzl : null, (1032191 & 8192) != 0 ? ixaEZpvd.AEQbTJ : null, (1032191 & 16384) != 0 ? ixaEZpvd.isConnected : iCP.copydefault(), (1032191 & 32768) != 0 ? ixaEZpvd.AhwBna : false, (1032191 & 65536) != 0 ? ixaEZpvd.valueOf : false, (1032191 & 131072) != 0 ? ixaEZpvd.OLrzqt : false, (1032191 & 262144) != 0 ? ixaEZpvd.fetchVPNInfo : false, (1032191 & 524288) != 0 ? ixaEZpvd.gEmmrt : false), (16777087 & 1024) != 0 ? ixcAEQbTJ.gEmmrt : null, (16777087 & 2048) != 0 ? ixcAEQbTJ.AYXKKw : null, (16777087 & 4096) != 0 ? ixcAEQbTJ.iwGUEr : null, (16777087 & 8192) != 0 ? ixcAEQbTJ.OLrzqt : null, (16777087 & 16384) != 0 ? ixcAEQbTJ.getNewProxyInstance : null, (16777087 & 32768) != 0 ? ixcAEQbTJ.getFieldNames : null, (16777087 & 65536) != 0 ? ixcAEQbTJ.ejfBZ : null, (16777087 & 131072) != 0 ? ixcAEQbTJ.isConnected : false, (16777087 & 262144) != 0 ? ixcAEQbTJ.uzCIH : null, (16777087 & 524288) != 0 ? ixcAEQbTJ.AhwBna : null, (16777087 & 1048576) != 0 ? ixcAEQbTJ.copydefault : null, (16777087 & 2097152) != 0 ? ixcAEQbTJ.AuCTel : null, (16777087 & 4194304) != 0 ? ixcAEQbTJ.fJNWhG : null, (16777087 & 8388608) != 0 ? ixcAEQbTJ.AEQbTJ : 0);
            } else {
                ixcKWHzl = null;
            }
            abstractC24170iXm.OLrzqt(transactionStage, ixcKWHzl);
            MutableStateFlow mutableStateFlow = this.this$0.EZpvd;
            InterfaceC24173iXp.ActionBar actionBar = new InterfaceC24173iXp.ActionBar(iCP.KWHzl());
            this.label = 2;
            if (mutableStateFlow.emit(actionBar, this) == objCopydefault) {
                return objCopydefault;
            }
            ixb = (iXB) this.this$0.AhwBna.getValue();
            if (ixb != null) {
            }
            return Unit.INSTANCE;
        }
        C24177iXt c24177iXt = this.$buttonError;
        if (c24177iXt != null) {
            MutableStateFlow mutableStateFlow2 = this.this$0.EZpvd;
            InterfaceC24173iXp.Activity activity = new InterfaceC24173iXp.Activity(c24177iXt, null, null, 0, 14, null);
            this.label = 3;
            if (mutableStateFlow2.emit(activity, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
