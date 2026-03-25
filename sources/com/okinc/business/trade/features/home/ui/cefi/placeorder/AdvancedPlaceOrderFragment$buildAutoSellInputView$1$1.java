package com.okinc.business.trade.features.home.ui.cefi.placeorder;

import com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedPlaceOrderVM;
import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC30503lcQ;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderFragment$buildAutoSellInputView$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    int label;
    final /* synthetic */ AdvancedPlaceOrderFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPlaceOrderFragment$buildAutoSellInputView$1$1(AdvancedPlaceOrderFragment advancedPlaceOrderFragment, Continuation<? super AdvancedPlaceOrderFragment$buildAutoSellInputView$1$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedPlaceOrderFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedPlaceOrderFragment$buildAutoSellInputView$1$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedPlaceOrderFragment$buildAutoSellInputView$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            i = (this.this$0.AEQbTJ().RcXXUw() && this.this$0.AEQbTJ().aKErDB()) ? 1 : 0;
            AdvancedPlaceOrderVM advancedPlaceOrderVMAEQbTJ = this.this$0.AEQbTJ();
            this.I$0 = i;
            this.label = 1;
            obj = advancedPlaceOrderVMAEQbTJ.KWHzl((Continuation<? super List<? extends AdvancedAutoSellStrategy>>) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            i = this.I$0;
            C56391yDq.AEQbTJ(obj);
        }
        List list = (List) obj;
        if (i == 0) {
            AdvancedPlaceOrderVM.updateAutoSell$default(this.this$0.AEQbTJ(), new AbstractC30503lcQ.Application(list), false, 2, null);
            return Unit.INSTANCE;
        }
        if (!list.isEmpty()) {
            AdvancedPlaceOrderVM.updateAutoSell$default(this.this$0.AEQbTJ(), new AbstractC30503lcQ.StateListAnimator(list), false, 2, null);
            return Unit.INSTANCE;
        }
        AdvancedPlaceOrderFragment advancedPlaceOrderFragment = this.this$0;
        this.label = 2;
        if (AdvancedPlaceOrderFragment.openAutoSellStrategySetupActivity$default(advancedPlaceOrderFragment, null, this, 1, null) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
