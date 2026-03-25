package com.okinc.dexkline.market.features.position.ui;

import com.okinc.dexkline.dexlogic.txs.TxType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C34446ncI;
import o.C34466ncc;
import o.C34467ncd;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class PositionsViewModel$resumeWSs$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TxType $type;
    int label;
    final /* synthetic */ PositionsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionsViewModel$resumeWSs$1(PositionsViewModel positionsViewModel, TxType txType, Continuation<? super PositionsViewModel$resumeWSs$1> continuation) {
        super(2, continuation);
        this.this$0 = positionsViewModel;
        this.$type = txType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PositionsViewModel$resumeWSs$1(this.this$0, this.$type, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PositionsViewModel$resumeWSs$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow<C34446ncI> flowValues = this.this$0.values();
            this.label = 1;
            obj = FlowKt.firstOrNull(flowValues, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                C34467ncd.subscribeWs$default(this.this$0.fJNWhG, this.this$0.AuCTel, null, 2, null);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C34446ncI c34446ncI = (C34446ncI) obj;
        if ((c34446ncI != null ? c34446ncI.AEQbTJ() : null) != null) {
            return Unit.INSTANCE;
        }
        C34466ncc c34466ncc = this.this$0.iwGUEr;
        PositionDetailsParam positionDetailsParam = this.this$0.AuCTel;
        TxType txType = this.$type;
        this.label = 2;
        if (c34466ncc.KWHzl(positionDetailsParam, txType, this) == objCopydefault) {
            return objCopydefault;
        }
        C34467ncd.subscribeWs$default(this.this$0.fJNWhG, this.this$0.AuCTel, null, 2, null);
        return Unit.INSTANCE;
    }
}
