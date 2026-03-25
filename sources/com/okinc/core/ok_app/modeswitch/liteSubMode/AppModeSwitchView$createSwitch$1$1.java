package com.okinc.core.ok_app.modeswitch.liteSubMode;

import android.view.View;
import android.widget.LinearLayout;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC33240msi;
import o.AbstractC33249msr;
import o.C33373mvI;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class AppModeSwitchView$createSwitch$1$1 extends SuspendLambda implements yHO<CoroutineScope, Pair<? extends AbstractC33249msr, ? extends AbstractC33240msi>, Continuation<? super Unit>, Object> {
    final /* synthetic */ View $chipView;
    final /* synthetic */ View $segmentView;
    final /* synthetic */ LinearLayout $this_apply;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppModeSwitchView$createSwitch$1$1(LinearLayout linearLayout, View view, View view2, Continuation<? super AppModeSwitchView$createSwitch$1$1> continuation) {
        super(3, continuation);
        this.$this_apply = linearLayout;
        this.$segmentView = view;
        this.$chipView = view2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, Pair<? extends AbstractC33249msr, ? extends AbstractC33240msi> pair, Continuation<? super Unit> continuation) {
        return new AppModeSwitchView$createSwitch$1$1(this.$this_apply, this.$segmentView, this.$chipView, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!this.$this_apply.getRootView().isAttachedToWindow()) {
                return Unit.INSTANCE;
            }
            C33373mvI.KWHzl.OLrzqt(this.$this_apply, this.$segmentView, this.$chipView);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
