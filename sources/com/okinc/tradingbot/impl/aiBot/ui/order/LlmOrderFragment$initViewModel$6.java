package com.okinc.tradingbot.impl.aiBot.ui.order;

import android.widget.TextView;
import com.okinc.tradingbot.impl.aiBot.ui.order.LlmOrderViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import o.C33070mpX;
import o.C48033uCm;
import o.C48112uFk;
import o.C52761wXj;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes16.dex */
public final class LlmOrderFragment$initViewModel$6 extends SuspendLambda implements Function2<LlmOrderViewModel.StateListAnimator, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C48112uFk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LlmOrderFragment$initViewModel$6(C48112uFk c48112uFk, Continuation<? super LlmOrderFragment$initViewModel$6> continuation) {
        super(2, continuation);
        this.this$0 = c48112uFk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LlmOrderFragment$initViewModel$6 llmOrderFragment$initViewModel$6 = new LlmOrderFragment$initViewModel$6(this.this$0, continuation);
        llmOrderFragment$initViewModel$6.L$0 = obj;
        return llmOrderFragment$initViewModel$6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LlmOrderViewModel.StateListAnimator stateListAnimator, Continuation<? super Unit> continuation) {
        return ((LlmOrderFragment$initViewModel$6) create(stateListAnimator, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int iCopydefault;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            LlmOrderViewModel.StateListAnimator stateListAnimator = (LlmOrderViewModel.StateListAnimator) this.L$0;
            TextView textView = C48112uFk.isConnected(this.this$0).AEQbTJ;
            String strKWHzl = stateListAnimator.KWHzl();
            boolean z = !StringsKt__StringsKt.fARcdN((CharSequence) strKWHzl);
            if (!z) {
                strKWHzl = C33070mpX.AYXKKw(C48033uCm.Fragment.OqFWZa);
            }
            textView.setText(strKWHzl);
            if (z) {
                iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
            } else {
                iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.QwvEab);
            }
            textView.setTextColor(iCopydefault);
            C48112uFk.refreshButtonState$default(this.this$0, false, 1, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
