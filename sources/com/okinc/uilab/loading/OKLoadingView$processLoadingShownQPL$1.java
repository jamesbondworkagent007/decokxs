package com.okinc.uilab.loading;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C55110xdk;
import o.C55113xdn;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yHO;

/* JADX INFO: loaded from: classes11.dex */
public final class OKLoadingView$processLoadingShownQPL$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $timestamp;
    int label;
    final /* synthetic */ C55113xdn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKLoadingView$processLoadingShownQPL$1(C55113xdn c55113xdn, long j, Continuation<? super OKLoadingView$processLoadingShownQPL$1> continuation) {
        super(2, continuation);
        this.this$0 = c55113xdn;
        this.$timestamp = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKLoadingView$processLoadingShownQPL$1(this.this$0, this.$timestamp, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKLoadingView$processLoadingShownQPL$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                Fragment fragmentFindFragment = FragmentManager.findFragment(this.this$0);
                Intrinsics.checkNotNullExpressionValue(fragmentFindFragment, "");
                this.this$0.AYXKKw = new WeakReference(fragmentFindFragment);
                yHO<Boolean, Long, WeakReference<Fragment>, Unit> yhoOLrzqt = C55110xdk.OLrzqt.OLrzqt();
                if (yhoOLrzqt != null) {
                    yhoOLrzqt.invoke(C56443yFo.KWHzl(true), C56443yFo.KWHzl(this.$timestamp), this.this$0.AYXKKw);
                }
            } catch (Exception unused) {
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
