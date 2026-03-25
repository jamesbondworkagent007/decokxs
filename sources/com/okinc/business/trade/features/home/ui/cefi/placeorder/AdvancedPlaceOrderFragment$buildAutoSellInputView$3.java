package com.okinc.business.trade.features.home.ui.cefi.placeorder;

import com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedPlaceOrderVM;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.AbstractC30503lcQ;
import o.C21668hHx;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderFragment$buildAutoSellInputView$3 extends SuspendLambda implements Function2<AbstractC30503lcQ, Continuation<? super Unit>, Object> {
    final /* synthetic */ C21668hHx $this_buildAutoSellInputView;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdvancedPlaceOrderFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPlaceOrderFragment$buildAutoSellInputView$3(C21668hHx c21668hHx, AdvancedPlaceOrderFragment advancedPlaceOrderFragment, Continuation<? super AdvancedPlaceOrderFragment$buildAutoSellInputView$3> continuation) {
        super(2, continuation);
        this.$this_buildAutoSellInputView = c21668hHx;
        this.this$0 = advancedPlaceOrderFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvancedPlaceOrderFragment$buildAutoSellInputView$3 advancedPlaceOrderFragment$buildAutoSellInputView$3 = new AdvancedPlaceOrderFragment$buildAutoSellInputView$3(this.$this_buildAutoSellInputView, this.this$0, continuation);
        advancedPlaceOrderFragment$buildAutoSellInputView$3.L$0 = obj;
        return advancedPlaceOrderFragment$buildAutoSellInputView$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC30503lcQ abstractC30503lcQ, Continuation<? super Unit> continuation) {
        return ((AdvancedPlaceOrderFragment$buildAutoSellInputView$3) create(abstractC30503lcQ, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.$this_buildAutoSellInputView.OLrzqt.setState((AbstractC30503lcQ) this.L$0);
            this.$this_buildAutoSellInputView.OLrzqt.setEditVisibility(AdvancedPlaceOrderVM.shouldShowAutoSellEdit$default(this.this$0.AEQbTJ(), null, 1, null));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
