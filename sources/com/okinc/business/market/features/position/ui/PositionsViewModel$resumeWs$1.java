package com.okinc.business.market.features.position.ui;

import com.okinc.business.dexlogic.txs.TxType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C29109knT;
import o.C29128knm;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class PositionsViewModel$resumeWs$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TxType $type;
    int label;
    final /* synthetic */ PositionsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionsViewModel$resumeWs$1(PositionsViewModel positionsViewModel, TxType txType, Continuation<? super PositionsViewModel$resumeWs$1> continuation) {
        super(2, continuation);
        this.this$0 = positionsViewModel;
        this.$type = txType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PositionsViewModel$resumeWs$1(this.this$0, this.$type, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PositionsViewModel$resumeWs$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow<C29109knT> flowAkhnZx = this.this$0.AkhnZx();
            this.label = 1;
            obj = FlowKt.firstOrNull(flowAkhnZx, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                this.this$0.fIwbmz.KWHzl(this.this$0.getNewProxyInstance.getChainId(), this.this$0.getNewProxyInstance.getTokenAddress());
                this.this$0.ejfBZ();
                this.this$0.fJNWhG();
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C29109knT c29109knT = (C29109knT) obj;
        if ((c29109knT != null ? c29109knT.AEQbTJ() : null) != null) {
            return Unit.INSTANCE;
        }
        C29128knm c29128knm = this.this$0.uzCIH;
        PositionDetailsParam positionDetailsParam = this.this$0.getNewProxyInstance;
        TxType txType = this.$type;
        this.label = 2;
        if (c29128knm.KWHzl(positionDetailsParam, txType, this) == objCopydefault) {
            return objCopydefault;
        }
        this.this$0.fIwbmz.KWHzl(this.this$0.getNewProxyInstance.getChainId(), this.this$0.getNewProxyInstance.getTokenAddress());
        this.this$0.ejfBZ();
        this.this$0.fJNWhG();
        return Unit.INSTANCE;
    }
}
