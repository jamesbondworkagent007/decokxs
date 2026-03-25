package com.okinc.business.trade.features.home.advanced.viewmodel;

import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C28227kTp;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderVM$getStrategies$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends AdvancedAutoSellStrategy>>, Object> {
    int label;
    final /* synthetic */ AdvancedPlaceOrderVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPlaceOrderVM$getStrategies$2(AdvancedPlaceOrderVM advancedPlaceOrderVM, Continuation<? super AdvancedPlaceOrderVM$getStrategies$2> continuation) {
        super(2, continuation);
        this.this$0 = advancedPlaceOrderVM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedPlaceOrderVM$getStrategies$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends AdvancedAutoSellStrategy>> continuation) {
        return ((AdvancedPlaceOrderVM$getStrategies$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C28227kTp c28227kTp = this.this$0.zLjUOn;
            this.label = 1;
            obj = c28227kTp.AEQbTJ((Continuation<? super List<? extends AdvancedAutoSellStrategy>>) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
