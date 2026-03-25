package com.okinc.dexkline.market.features.position.ui;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C34467ncd;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class PositionsViewModel$dismissAlert$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ PositionsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionsViewModel$dismissAlert$1(PositionsViewModel positionsViewModel, Continuation<? super PositionsViewModel$dismissAlert$1> continuation) {
        super(2, continuation);
        this.this$0 = positionsViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PositionsViewModel$dismissAlert$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PositionsViewModel$dismissAlert$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableStateFlow mutableStateFlow;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C34467ncd c34467ncd = this.this$0.fJNWhG;
            PositionDetailsParam positionDetailsParam = this.this$0.AuCTel;
            this.label = 1;
            if (c34467ncd.OLrzqt(positionDetailsParam, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableStateFlow = (MutableStateFlow) this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableStateFlow.setValue(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        MutableStateFlow mutableStateFlow2 = this.this$0.valueOf;
        C34467ncd c34467ncd2 = this.this$0.fJNWhG;
        PositionDetailsParam positionDetailsParam2 = this.this$0.AuCTel;
        this.L$0 = mutableStateFlow2;
        this.label = 2;
        Object objAEQbTJ = c34467ncd2.AEQbTJ(positionDetailsParam2, this);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        mutableStateFlow = mutableStateFlow2;
        obj = objAEQbTJ;
        mutableStateFlow.setValue(obj);
        return Unit.INSTANCE;
    }
}
