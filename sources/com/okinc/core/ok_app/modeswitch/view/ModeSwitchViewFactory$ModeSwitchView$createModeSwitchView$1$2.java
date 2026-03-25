package com.okinc.core.ok_app.modeswitch.view;

import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.okex.lite.home.bean.AppModeSwitchViewSource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC33244msm;
import o.C33423mwF;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class ModeSwitchViewFactory$ModeSwitchView$createModeSwitchView$1$2 extends SuspendLambda implements yHO<CoroutineScope, Unit, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<AbstractC33244msm, AbstractC33244msm, Unit> $callback;
    final /* synthetic */ FragmentManager $fragmentManager;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ AppModeSwitchViewSource $source;
    final /* synthetic */ FrameLayout $this_apply;
    int label;
    final /* synthetic */ C33423mwF.Application this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function2<? super o.msm, ? super o.msm, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModeSwitchViewFactory$ModeSwitchView$createModeSwitchView$1$2(FrameLayout frameLayout, C33423mwF.Application application, FragmentManager fragmentManager, LifecycleOwner lifecycleOwner, AppModeSwitchViewSource appModeSwitchViewSource, Function2<? super AbstractC33244msm, ? super AbstractC33244msm, Unit> function2, Continuation<? super ModeSwitchViewFactory$ModeSwitchView$createModeSwitchView$1$2> continuation) {
        super(3, continuation);
        this.$this_apply = frameLayout;
        this.this$0 = application;
        this.$fragmentManager = fragmentManager;
        this.$lifecycleOwner = lifecycleOwner;
        this.$source = appModeSwitchViewSource;
        this.$callback = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, Unit unit, Continuation<? super Unit> continuation) {
        return new ModeSwitchViewFactory$ModeSwitchView$createModeSwitchView$1$2(this.$this_apply, this.this$0, this.$fragmentManager, this.$lifecycleOwner, this.$source, this.$callback, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            FrameLayout frameLayout = this.$this_apply;
            pUU.KWHzl("ModeSwitch-ViewFactory", frameLayout + ", compliance changed, update views");
            this.this$0.EZpvd(frameLayout, this.$fragmentManager, this.$lifecycleOwner, this.$source, this.$callback);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
