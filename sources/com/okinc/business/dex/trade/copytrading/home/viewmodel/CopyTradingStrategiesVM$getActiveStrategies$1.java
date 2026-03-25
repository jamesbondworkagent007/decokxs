package com.okinc.business.dex.trade.copytrading.home.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC20003gXh;
import o.C56391yDq;
import o.C56442yFn;
import o.gWI;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingStrategiesVM$getActiveStrategies$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $showLoad;
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ CopyTradingStrategiesVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingStrategiesVM$getActiveStrategies$1(boolean z, CopyTradingStrategiesVM copyTradingStrategiesVM, Continuation<? super CopyTradingStrategiesVM$getActiveStrategies$1> continuation) {
        super(2, continuation);
        this.$showLoad = z;
        this.this$0 = copyTradingStrategiesVM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingStrategiesVM$getActiveStrategies$1(this.$showLoad, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CopyTradingStrategiesVM$getActiveStrategies$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableStateFlow mutableStateFlow;
        int i;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$showLoad) {
                this.this$0.copydefault.setValue(AbstractC20003gXh.ActionBar.copydefault);
            }
            MutableStateFlow mutableStateFlow2 = this.this$0.copydefault;
            gWI gwi = this.this$0.AEQbTJ;
            this.L$0 = mutableStateFlow2;
            this.label = 1;
            Object objOLrzqt = gwi.OLrzqt(this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            mutableStateFlow = mutableStateFlow2;
            obj = objOLrzqt;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$0;
                mutableStateFlow = (MutableStateFlow) this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableStateFlow.setValue(new AbstractC20003gXh.TaskDescription(i, ((Number) obj).intValue()));
                return Unit.INSTANCE;
            }
            mutableStateFlow = (MutableStateFlow) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        int iIntValue = ((Number) obj).intValue();
        gWI gwi2 = this.this$0.AEQbTJ;
        this.L$0 = mutableStateFlow;
        this.I$0 = iIntValue;
        this.label = 2;
        Object objCopydefault2 = gwi2.copydefault(this);
        if (objCopydefault2 == objCopydefault) {
            return objCopydefault;
        }
        i = iIntValue;
        obj = objCopydefault2;
        mutableStateFlow.setValue(new AbstractC20003gXh.TaskDescription(i, ((Number) obj).intValue()));
        return Unit.INSTANCE;
    }
}
