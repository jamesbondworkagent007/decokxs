package com.okinc.business.market.features.meme.ui;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28695kfd;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeActivityViewModelV2$setTabResumed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $tabIndex;
    final /* synthetic */ InterfaceC28695kfd $updateState;
    int label;
    final /* synthetic */ MemeActivityViewModelV2 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeActivityViewModelV2$setTabResumed$1(InterfaceC28695kfd interfaceC28695kfd, MemeActivityViewModelV2 memeActivityViewModelV2, int i, Continuation<? super MemeActivityViewModelV2$setTabResumed$1> continuation) {
        super(2, continuation);
        this.$updateState = interfaceC28695kfd;
        this.this$0 = memeActivityViewModelV2;
        this.$tabIndex = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeActivityViewModelV2$setTabResumed$1(this.$updateState, this.this$0, this.$tabIndex, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemeActivityViewModelV2$setTabResumed$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC28695kfd interfaceC28695kfd = this.$updateState;
            if (Intrinsics.EZpvd(interfaceC28695kfd, InterfaceC28695kfd.ActionBar.KWHzl) || Intrinsics.EZpvd(interfaceC28695kfd, InterfaceC28695kfd.Activity.copydefault)) {
                this.this$0.values.gEmmrt(this.$tabIndex);
            } else if (Intrinsics.EZpvd(interfaceC28695kfd, InterfaceC28695kfd.StateListAnimator.OLrzqt) || Intrinsics.EZpvd(interfaceC28695kfd, InterfaceC28695kfd.Application.EZpvd)) {
                this.this$0.values.KWHzl(this.$tabIndex);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
