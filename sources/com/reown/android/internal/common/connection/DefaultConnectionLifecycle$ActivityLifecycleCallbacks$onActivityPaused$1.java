package com.reown.android.internal.common.connection;

import com.reown.android.internal.common.connection.DefaultConnectionLifecycle;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C58088yug;
import o.InterfaceC58028ytZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class DefaultConnectionLifecycle$ActivityLifecycleCallbacks$onActivityPaused$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ DefaultConnectionLifecycle.ActivityLifecycleCallbacks this$0;
    public final /* synthetic */ DefaultConnectionLifecycle this$1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultConnectionLifecycle$ActivityLifecycleCallbacks$onActivityPaused$1(DefaultConnectionLifecycle.ActivityLifecycleCallbacks activityLifecycleCallbacks, DefaultConnectionLifecycle defaultConnectionLifecycle, Continuation<? super DefaultConnectionLifecycle$ActivityLifecycleCallbacks$onActivityPaused$1> continuation) {
        super(2, continuation);
        this.this$0 = activityLifecycleCallbacks;
        this.this$1 = defaultConnectionLifecycle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        return new DefaultConnectionLifecycle$ActivityLifecycleCallbacks$onActivityPaused$1(this.this$0, this.this$1, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefaultConnectionLifecycle$ActivityLifecycleCallbacks$onActivityPaused$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            long millis = TimeUnit.SECONDS.toMillis(30L);
            this.label = 1;
            if (DelayKt.delay(millis, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (!this.this$0.isResumed()) {
            this.this$1.lifecycleRegistry.onNext(new InterfaceC58028ytZ.StateListAnimator.AbstractC1012StateListAnimator.C1013StateListAnimator(new C58088yug(1000, "App is paused")));
            this.this$0.setJob(null);
            this.this$1._onResume.setValue(C56443yFo.KWHzl(false));
        }
        return Unit.INSTANCE;
    }
}
