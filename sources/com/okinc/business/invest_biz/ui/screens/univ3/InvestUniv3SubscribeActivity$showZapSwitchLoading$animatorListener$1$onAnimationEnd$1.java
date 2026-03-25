package com.okinc.business.invest_biz.ui.screens.univ3;

import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C23732iHg;
import o.C55113xdn;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes23.dex */
public final class InvestUniv3SubscribeActivity$showZapSwitchLoading$animatorListener$1$onAnimationEnd$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InvestUniv3SubscribeActivity.ClipData $listener;
    int label;
    final /* synthetic */ InvestUniv3SubscribeActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3SubscribeActivity$showZapSwitchLoading$animatorListener$1$onAnimationEnd$1(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, InvestUniv3SubscribeActivity.ClipData clipData, Continuation<? super InvestUniv3SubscribeActivity$showZapSwitchLoading$animatorListener$1$onAnimationEnd$1> continuation) {
        super(2, continuation);
        this.this$0 = investUniv3SubscribeActivity;
        this.$listener = clipData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUniv3SubscribeActivity$showZapSwitchLoading$animatorListener$1$onAnimationEnd$1(this.this$0, this.$listener, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestUniv3SubscribeActivity$showZapSwitchLoading$animatorListener$1$onAnimationEnd$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C23732iHg c23732iHg = this.this$0.AhwBna;
            C23732iHg c23732iHg2 = null;
            if (c23732iHg == null) {
                Intrinsics.gEmmrt("");
                c23732iHg = null;
            }
            c23732iHg.DCJXGO.copydefault();
            C23732iHg c23732iHg3 = this.this$0.AhwBna;
            if (c23732iHg3 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg3 = null;
            }
            C55113xdn c55113xdn = c23732iHg3.DCJXGO;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            c55113xdn.setVisibility(8);
            C23732iHg c23732iHg4 = this.this$0.AhwBna;
            if (c23732iHg4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23732iHg2 = c23732iHg4;
            }
            c23732iHg2.DCJXGO.removeAnimatorListener(this.$listener);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
