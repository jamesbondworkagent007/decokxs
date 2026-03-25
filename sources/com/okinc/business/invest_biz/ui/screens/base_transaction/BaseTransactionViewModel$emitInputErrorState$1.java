package com.okinc.business.invest_biz.ui.screens.base_transaction;

import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
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
import o.iXC;

/* JADX INFO: loaded from: classes6.dex */
public final class BaseTransactionViewModel$emitInputErrorState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ iXC $content;
    int label;
    final /* synthetic */ AbstractC24170iXm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTransactionViewModel$emitInputErrorState$1(AbstractC24170iXm abstractC24170iXm, iXC ixc, Continuation<? super BaseTransactionViewModel$emitInputErrorState$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractC24170iXm;
        this.$content = ixc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseTransactionViewModel$emitInputErrorState$1(this.this$0, this.$content, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseTransactionViewModel$emitInputErrorState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow = this.this$0.copydefault;
            iXC ixc = this.$content;
            InterfaceC24182iXy.Activity activity = new InterfaceC24182iXy.Activity(ixc.KWHzl((16777087 & 1) != 0 ? ixc.AkhnZx : false, (16777087 & 2) != 0 ? ixc.fetchVPNInfo : true, (16777087 & 4) != 0 ? ixc.valueOf : null, (16777087 & 8) != 0 ? ixc.values : 0L, (16777087 & 16) != 0 ? ixc.djBIcL : 0, (16777087 & 32) != 0 ? ixc.EZpvd : 0L, (16777087 & 64) != 0 ? ixc.DbNXlk : 0, (16777087 & 128) != 0 ? ixc.fARcdN : TransactionStage.INPUT, (16777087 & 256) != 0 ? ixc.fIwbmz : null, (16777087 & 512) != 0 ? ixc.KWHzl : null, (16777087 & 1024) != 0 ? ixc.gEmmrt : null, (16777087 & 2048) != 0 ? ixc.AYXKKw : null, (16777087 & 4096) != 0 ? ixc.iwGUEr : null, (16777087 & 8192) != 0 ? ixc.OLrzqt : null, (16777087 & 16384) != 0 ? ixc.getNewProxyInstance : null, (16777087 & 32768) != 0 ? ixc.getFieldNames : null, (16777087 & 65536) != 0 ? ixc.ejfBZ : null, (16777087 & 131072) != 0 ? ixc.isConnected : false, (16777087 & 262144) != 0 ? ixc.uzCIH : null, (16777087 & 524288) != 0 ? ixc.AhwBna : null, (16777087 & 1048576) != 0 ? ixc.copydefault : null, (16777087 & 2097152) != 0 ? ixc.AuCTel : null, (16777087 & 4194304) != 0 ? ixc.fJNWhG : null, (16777087 & 8388608) != 0 ? ixc.AEQbTJ : 0));
            this.label = 1;
            if (mutableStateFlow.emit(activity, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
