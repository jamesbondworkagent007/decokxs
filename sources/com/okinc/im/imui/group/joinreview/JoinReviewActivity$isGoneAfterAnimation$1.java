package com.okinc.im.imui.group.joinreview;

import androidx.fragment.app.FragmentContainerView;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.ActivityC34183nUn;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class JoinReviewActivity$isGoneAfterAnimation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentContainerView $this_isGoneAfterAnimation;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC34183nUn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JoinReviewActivity$isGoneAfterAnimation$1(ActivityC34183nUn activityC34183nUn, FragmentContainerView fragmentContainerView, Continuation<? super JoinReviewActivity$isGoneAfterAnimation$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC34183nUn;
        this.$this_isGoneAfterAnimation = fragmentContainerView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        JoinReviewActivity$isGoneAfterAnimation$1 joinReviewActivity$isGoneAfterAnimation$1 = new JoinReviewActivity$isGoneAfterAnimation$1(this.this$0, this.$this_isGoneAfterAnimation, continuation);
        joinReviewActivity$isGoneAfterAnimation$1.L$0 = obj;
        return joinReviewActivity$isGoneAfterAnimation$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((JoinReviewActivity$isGoneAfterAnimation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FragmentContainerView fragmentContainerView;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                ActivityC34183nUn activityC34183nUn = this.this$0;
                FragmentContainerView fragmentContainerView2 = this.$this_isGoneAfterAnimation;
                Result.Application application = Result.Companion;
                long jKWHzl = activityC34183nUn.isConnected().KWHzl();
                this.L$0 = fragmentContainerView2;
                this.label = 1;
                if (DelayKt.delay(jKWHzl, this) == objCopydefault) {
                    return objCopydefault;
                }
                fragmentContainerView = fragmentContainerView2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fragmentContainerView = (FragmentContainerView) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            fragmentContainerView.setVisibility(8);
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        this.this$0.djBIcL = null;
        return Unit.INSTANCE;
    }
}
