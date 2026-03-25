package com.okinc.business.trade.features.home.ui.cefi.placeorder;

import com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedPlaceOrderVM;
import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderFragment$buildAutoSellInputView$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ AdvancedPlaceOrderFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPlaceOrderFragment$buildAutoSellInputView$2$1(AdvancedPlaceOrderFragment advancedPlaceOrderFragment, Continuation<? super AdvancedPlaceOrderFragment$buildAutoSellInputView$2$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedPlaceOrderFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedPlaceOrderFragment$buildAutoSellInputView$2$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedPlaceOrderFragment$buildAutoSellInputView$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AdvancedPlaceOrderFragment advancedPlaceOrderFragment;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            advancedPlaceOrderFragment = this.this$0;
            AdvancedPlaceOrderVM advancedPlaceOrderVMAEQbTJ = advancedPlaceOrderFragment.AEQbTJ();
            this.L$0 = advancedPlaceOrderFragment;
            this.label = 1;
            obj = advancedPlaceOrderVMAEQbTJ.KWHzl((Continuation<? super List<? extends AdvancedAutoSellStrategy>>) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            advancedPlaceOrderFragment = (AdvancedPlaceOrderFragment) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        this.L$0 = null;
        this.label = 2;
        if (advancedPlaceOrderFragment.EZpvd((List<? extends AdvancedAutoSellStrategy>) obj, (Continuation<? super Unit>) this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
