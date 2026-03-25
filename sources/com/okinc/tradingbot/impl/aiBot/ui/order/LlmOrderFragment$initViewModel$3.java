package com.okinc.tradingbot.impl.aiBot.ui.order;

import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.transition.ChangeBounds;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC48473uSs;
import o.C48112uFk;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes16.dex */
public final class LlmOrderFragment$initViewModel$3 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C48112uFk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LlmOrderFragment$initViewModel$3(C48112uFk c48112uFk, Continuation<? super LlmOrderFragment$initViewModel$3> continuation) {
        super(2, continuation);
        this.this$0 = c48112uFk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LlmOrderFragment$initViewModel$3 llmOrderFragment$initViewModel$3 = new LlmOrderFragment$initViewModel$3(this.this$0, continuation);
        llmOrderFragment$initViewModel$3.L$0 = obj;
        return llmOrderFragment$initViewModel$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((LlmOrderFragment$initViewModel$3) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = (String) this.L$0;
            AbstractC48473uSs abstractC48473uSsIsConnected = C48112uFk.isConnected(this.this$0);
            C48112uFk c48112uFk = this.this$0;
            LinearLayoutCompat linearLayoutCompat = abstractC48473uSsIsConnected.AhwBna;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            Fade fade = new Fade();
            fade.setDuration(180L);
            transitionSet.addTransition(fade);
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(180L);
            transitionSet.addTransition(changeBounds);
            TransitionManager.beginDelayedTransition(linearLayoutCompat, transitionSet);
            if (Intrinsics.EZpvd((Object) str, (Object) "SPOT")) {
                TextView textView = abstractC48473uSsIsConnected.DbNXlk;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                c48112uFk.copydefault(textView);
                TextView textView2 = abstractC48473uSsIsConnected.values;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                c48112uFk.AEQbTJ(textView2);
            } else if (Intrinsics.EZpvd((Object) str, (Object) "SWAP")) {
                TextView textView3 = abstractC48473uSsIsConnected.DbNXlk;
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                c48112uFk.AEQbTJ(textView3);
                TextView textView4 = abstractC48473uSsIsConnected.values;
                Intrinsics.checkNotNullExpressionValue(textView4, "");
                c48112uFk.copydefault(textView4);
            }
            C48112uFk.refreshButtonState$default(this.this$0, false, 1, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
