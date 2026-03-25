package com.okinc.uilab.loading;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import o.C55113xdn;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes11.dex */
public final class OKLoadingView$pendingStartAnim$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $delayTime;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C55113xdn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKLoadingView$pendingStartAnim$1(long j, C55113xdn c55113xdn, Continuation<? super OKLoadingView$pendingStartAnim$1> continuation) {
        super(2, continuation);
        this.$delayTime = j;
        this.this$0 = c55113xdn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OKLoadingView$pendingStartAnim$1 oKLoadingView$pendingStartAnim$1 = new OKLoadingView$pendingStartAnim$1(this.$delayTime, this.this$0, continuation);
        oKLoadingView$pendingStartAnim$1.L$0 = obj;
        return oKLoadingView$pendingStartAnim$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKLoadingView$pendingStartAnim$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            long j = this.$delayTime;
            this.L$0 = coroutineScope2;
            this.label = 1;
            if (DelayKt.delay(j, this) == objCopydefault) {
                return objCopydefault;
            }
            coroutineScope = coroutineScope2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        if (CoroutineScopeKt.isActive(coroutineScope)) {
            super/*android.view.View*/.setVisibility(0);
            super/*com.airbnb.lottie.LottieAnimationView*/.resumeAnimation();
        }
        return Unit.INSTANCE;
    }
}
