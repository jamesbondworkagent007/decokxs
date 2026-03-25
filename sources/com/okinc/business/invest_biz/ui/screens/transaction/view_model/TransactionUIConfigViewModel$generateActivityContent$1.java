package com.okinc.business.invest_biz.ui.screens.transaction.view_model;

import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C26762jiT;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC24182iXy;

/* JADX INFO: loaded from: classes6.dex */
public final class TransactionUIConfigViewModel$generateActivityContent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ TransactionUIConfigViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionUIConfigViewModel$generateActivityContent$1(TransactionUIConfigViewModel transactionUIConfigViewModel, Continuation<? super TransactionUIConfigViewModel$generateActivityContent$1> continuation) {
        super(2, continuation);
        this.this$0 = transactionUIConfigViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TransactionUIConfigViewModel$generateActivityContent$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TransactionUIConfigViewModel$generateActivityContent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            long jIsConnected = this.this$0.AEQbTJ().isConnected();
            TransactionUIConfigViewModel transactionUIConfigViewModel = this.this$0;
            List listOLrzqt = C56402yEa.OLrzqt();
            if (transactionUIConfigViewModel.AEQbTJ().AubY()) {
                TransactionConfig transactionConfigAEQbTJ = transactionUIConfigViewModel.AEQbTJ();
                listOLrzqt.add(transactionConfigAEQbTJ.AEQbTJ((33554427 & 1) != 0 ? transactionConfigAEQbTJ.gEmmrt : 0, (33554427 & 2) != 0 ? transactionConfigAEQbTJ.iwGUEr : 11, (33554427 & 4) != 0 ? transactionConfigAEQbTJ.values : 0L, (33554427 & 8) != 0 ? transactionConfigAEQbTJ.AkhnZx : false, (33554427 & 16) != 0 ? transactionConfigAEQbTJ.fIwbmz : 0L, (33554427 & 32) != 0 ? transactionConfigAEQbTJ.AEQbTJ : 0L, (33554427 & 64) != 0 ? transactionConfigAEQbTJ.AuCTel : null, (33554427 & 128) != 0 ? transactionConfigAEQbTJ.fARcdN : null, (33554427 & 256) != 0 ? transactionConfigAEQbTJ.valueOf : null, (33554427 & 512) != 0 ? transactionConfigAEQbTJ.DbNXlk : 0, (33554427 & 1024) != 0 ? transactionConfigAEQbTJ.hDKMBd : null, (33554427 & 2048) != 0 ? transactionConfigAEQbTJ.OLrzqt : 0L, (33554427 & 4096) != 0 ? transactionConfigAEQbTJ.AhwBna : 0, (33554427 & 8192) != 0 ? transactionConfigAEQbTJ.uzCIH : null, (33554427 & 16384) != 0 ? transactionConfigAEQbTJ.djBIcL : null, (33554427 & 32768) != 0 ? transactionConfigAEQbTJ.getNewProxyInstance : null, (33554427 & 65536) != 0 ? transactionConfigAEQbTJ.copydefault : null, (33554427 & 131072) != 0 ? transactionConfigAEQbTJ.isConnected : null, (33554427 & 262144) != 0 ? transactionConfigAEQbTJ.fJNWhG : false, (33554427 & 524288) != 0 ? transactionConfigAEQbTJ.AYXKKw : false, (33554427 & 1048576) != 0 ? transactionConfigAEQbTJ.EZpvd : null, (33554427 & 2097152) != 0 ? transactionConfigAEQbTJ.KWHzl : null, (33554427 & 4194304) != 0 ? transactionConfigAEQbTJ.fetchVPNInfo : false, (33554427 & 8388608) != 0 ? transactionConfigAEQbTJ.getFieldNames : false, (33554427 & 16777216) != 0 ? transactionConfigAEQbTJ.ejfBZ : null));
                TransactionConfig transactionConfigAEQbTJ2 = transactionUIConfigViewModel.AEQbTJ();
                listOLrzqt.add(transactionConfigAEQbTJ2.AEQbTJ((33554427 & 1) != 0 ? transactionConfigAEQbTJ2.gEmmrt : 0, (33554427 & 2) != 0 ? transactionConfigAEQbTJ2.iwGUEr : 9, (33554427 & 4) != 0 ? transactionConfigAEQbTJ2.values : 0L, (33554427 & 8) != 0 ? transactionConfigAEQbTJ2.AkhnZx : false, (33554427 & 16) != 0 ? transactionConfigAEQbTJ2.fIwbmz : 0L, (33554427 & 32) != 0 ? transactionConfigAEQbTJ2.AEQbTJ : 0L, (33554427 & 64) != 0 ? transactionConfigAEQbTJ2.AuCTel : null, (33554427 & 128) != 0 ? transactionConfigAEQbTJ2.fARcdN : null, (33554427 & 256) != 0 ? transactionConfigAEQbTJ2.valueOf : null, (33554427 & 512) != 0 ? transactionConfigAEQbTJ2.DbNXlk : 0, (33554427 & 1024) != 0 ? transactionConfigAEQbTJ2.hDKMBd : C56443yFo.AEQbTJ(0), (33554427 & 2048) != 0 ? transactionConfigAEQbTJ2.OLrzqt : 0L, (33554427 & 4096) != 0 ? transactionConfigAEQbTJ2.AhwBna : 0, (33554427 & 8192) != 0 ? transactionConfigAEQbTJ2.uzCIH : null, (33554427 & 16384) != 0 ? transactionConfigAEQbTJ2.djBIcL : null, (33554427 & 32768) != 0 ? transactionConfigAEQbTJ2.getNewProxyInstance : null, (33554427 & 65536) != 0 ? transactionConfigAEQbTJ2.copydefault : null, (33554427 & 131072) != 0 ? transactionConfigAEQbTJ2.isConnected : null, (33554427 & 262144) != 0 ? transactionConfigAEQbTJ2.fJNWhG : false, (33554427 & 524288) != 0 ? transactionConfigAEQbTJ2.AYXKKw : false, (33554427 & 1048576) != 0 ? transactionConfigAEQbTJ2.EZpvd : null, (33554427 & 2097152) != 0 ? transactionConfigAEQbTJ2.KWHzl : null, (33554427 & 4194304) != 0 ? transactionConfigAEQbTJ2.fetchVPNInfo : false, (33554427 & 8388608) != 0 ? transactionConfigAEQbTJ2.getFieldNames : false, (33554427 & 16777216) != 0 ? transactionConfigAEQbTJ2.ejfBZ : null));
            } else if (transactionUIConfigViewModel.AEQbTJ().zsXlph()) {
                TransactionConfig transactionConfigAEQbTJ3 = transactionUIConfigViewModel.AEQbTJ();
                listOLrzqt.add(transactionConfigAEQbTJ3.AEQbTJ((33554427 & 1) != 0 ? transactionConfigAEQbTJ3.gEmmrt : 0, (33554427 & 2) != 0 ? transactionConfigAEQbTJ3.iwGUEr : 10, (33554427 & 4) != 0 ? transactionConfigAEQbTJ3.values : 0L, (33554427 & 8) != 0 ? transactionConfigAEQbTJ3.AkhnZx : false, (33554427 & 16) != 0 ? transactionConfigAEQbTJ3.fIwbmz : 0L, (33554427 & 32) != 0 ? transactionConfigAEQbTJ3.AEQbTJ : 0L, (33554427 & 64) != 0 ? transactionConfigAEQbTJ3.AuCTel : null, (33554427 & 128) != 0 ? transactionConfigAEQbTJ3.fARcdN : null, (33554427 & 256) != 0 ? transactionConfigAEQbTJ3.valueOf : null, (33554427 & 512) != 0 ? transactionConfigAEQbTJ3.DbNXlk : 0, (33554427 & 1024) != 0 ? transactionConfigAEQbTJ3.hDKMBd : C56443yFo.AEQbTJ(1), (33554427 & 2048) != 0 ? transactionConfigAEQbTJ3.OLrzqt : 0L, (33554427 & 4096) != 0 ? transactionConfigAEQbTJ3.AhwBna : 0, (33554427 & 8192) != 0 ? transactionConfigAEQbTJ3.uzCIH : null, (33554427 & 16384) != 0 ? transactionConfigAEQbTJ3.djBIcL : null, (33554427 & 32768) != 0 ? transactionConfigAEQbTJ3.getNewProxyInstance : null, (33554427 & 65536) != 0 ? transactionConfigAEQbTJ3.copydefault : null, (33554427 & 131072) != 0 ? transactionConfigAEQbTJ3.isConnected : null, (33554427 & 262144) != 0 ? transactionConfigAEQbTJ3.fJNWhG : false, (33554427 & 524288) != 0 ? transactionConfigAEQbTJ3.AYXKKw : false, (33554427 & 1048576) != 0 ? transactionConfigAEQbTJ3.EZpvd : null, (33554427 & 2097152) != 0 ? transactionConfigAEQbTJ3.KWHzl : null, (33554427 & 4194304) != 0 ? transactionConfigAEQbTJ3.fetchVPNInfo : false, (33554427 & 8388608) != 0 ? transactionConfigAEQbTJ3.getFieldNames : false, (33554427 & 16777216) != 0 ? transactionConfigAEQbTJ3.ejfBZ : null));
                TransactionConfig transactionConfigAEQbTJ4 = transactionUIConfigViewModel.AEQbTJ();
                listOLrzqt.add(transactionConfigAEQbTJ4.AEQbTJ((33554427 & 1) != 0 ? transactionConfigAEQbTJ4.gEmmrt : 0, (33554427 & 2) != 0 ? transactionConfigAEQbTJ4.iwGUEr : 12, (33554427 & 4) != 0 ? transactionConfigAEQbTJ4.values : 0L, (33554427 & 8) != 0 ? transactionConfigAEQbTJ4.AkhnZx : false, (33554427 & 16) != 0 ? transactionConfigAEQbTJ4.fIwbmz : 0L, (33554427 & 32) != 0 ? transactionConfigAEQbTJ4.AEQbTJ : 0L, (33554427 & 64) != 0 ? transactionConfigAEQbTJ4.AuCTel : null, (33554427 & 128) != 0 ? transactionConfigAEQbTJ4.fARcdN : null, (33554427 & 256) != 0 ? transactionConfigAEQbTJ4.valueOf : null, (33554427 & 512) != 0 ? transactionConfigAEQbTJ4.DbNXlk : 0, (33554427 & 1024) != 0 ? transactionConfigAEQbTJ4.hDKMBd : null, (33554427 & 2048) != 0 ? transactionConfigAEQbTJ4.OLrzqt : 0L, (33554427 & 4096) != 0 ? transactionConfigAEQbTJ4.AhwBna : 0, (33554427 & 8192) != 0 ? transactionConfigAEQbTJ4.uzCIH : null, (33554427 & 16384) != 0 ? transactionConfigAEQbTJ4.djBIcL : null, (33554427 & 32768) != 0 ? transactionConfigAEQbTJ4.getNewProxyInstance : null, (33554427 & 65536) != 0 ? transactionConfigAEQbTJ4.copydefault : null, (33554427 & 131072) != 0 ? transactionConfigAEQbTJ4.isConnected : null, (33554427 & 262144) != 0 ? transactionConfigAEQbTJ4.fJNWhG : false, (33554427 & 524288) != 0 ? transactionConfigAEQbTJ4.AYXKKw : false, (33554427 & 1048576) != 0 ? transactionConfigAEQbTJ4.EZpvd : null, (33554427 & 2097152) != 0 ? transactionConfigAEQbTJ4.KWHzl : null, (33554427 & 4194304) != 0 ? transactionConfigAEQbTJ4.fetchVPNInfo : false, (33554427 & 8388608) != 0 ? transactionConfigAEQbTJ4.getFieldNames : false, (33554427 & 16777216) != 0 ? transactionConfigAEQbTJ4.ejfBZ : null));
            } else {
                listOLrzqt.add(transactionUIConfigViewModel.AEQbTJ());
            }
            Unit unit = Unit.INSTANCE;
            this.this$0.copydefault.setValue(new InterfaceC24182iXy.Activity(new C26762jiT(jIsConnected, C56402yEa.fARcdN(listOLrzqt))));
            return unit;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
