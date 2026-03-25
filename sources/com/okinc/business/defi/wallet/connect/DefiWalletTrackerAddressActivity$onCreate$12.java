package com.okinc.business.defi.wallet.connect;

import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.ActivityC16031ecJ;
import o.C13754dXa;
import o.C16103edc;
import o.C16297ehK;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class DefiWalletTrackerAddressActivity$onCreate$12 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C16297ehK $binding;
    int label;
    final /* synthetic */ ActivityC16031ecJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletTrackerAddressActivity$onCreate$12(ActivityC16031ecJ activityC16031ecJ, C16297ehK c16297ehK, Continuation<? super DefiWalletTrackerAddressActivity$onCreate$12> continuation) {
        super(2, continuation);
        this.this$0 = activityC16031ecJ;
        this.$binding = c16297ehK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletTrackerAddressActivity$onCreate$12(this.this$0, this.$binding, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletTrackerAddressActivity$onCreate$12) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.connect.DefiWalletTrackerAddressActivity$onCreate$12$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ C16297ehK $binding;
        int label;
        final /* synthetic */ ActivityC16031ecJ this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC16031ecJ activityC16031ecJ, C16297ehK c16297ehK, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC16031ecJ;
            this.$binding = c16297ehK;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$binding, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Flow<C16103edc.TaskDescription> flowOLrzqt = this.this$0.AYXKKw().OLrzqt();
                final ActivityC16031ecJ activityC16031ecJ = this.this$0;
                final C16297ehK c16297ehK = this.$binding;
                FlowCollector<? super C16103edc.TaskDescription> flowCollector = new FlowCollector() { // from class: com.okinc.business.defi.wallet.connect.DefiWalletTrackerAddressActivity.onCreate.12.1.4
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                    public final Object emit(C16103edc.TaskDescription taskDescription, Continuation<? super Unit> continuation) {
                        activityC16031ecJ.dismissLoading();
                        if (taskDescription instanceof C16103edc.TaskDescription.Activity) {
                            TextView textView = c16297ehK.AEQbTJ;
                            Intrinsics.checkNotNullExpressionValue(textView, "");
                            textView.setVisibility(0);
                            c16297ehK.AEQbTJ.setText(C13754dXa.FragmentManager.OHqIaq);
                        } else if (Intrinsics.EZpvd(taskDescription, C16103edc.TaskDescription.StateListAnimator.EZpvd)) {
                            TextView textView2 = c16297ehK.AEQbTJ;
                            Intrinsics.checkNotNullExpressionValue(textView2, "");
                            textView2.setVisibility(0);
                            c16297ehK.AEQbTJ.setText(C13754dXa.FragmentManager.Dfv);
                        } else {
                            if (!(taskDescription instanceof C16103edc.TaskDescription.C0839TaskDescription)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            TextView textView3 = c16297ehK.AEQbTJ;
                            Intrinsics.checkNotNullExpressionValue(textView3, "");
                            textView3.setVisibility(8);
                            C16103edc.TaskDescription.C0839TaskDescription c0839TaskDescription = (C16103edc.TaskDescription.C0839TaskDescription) taskDescription;
                            activityC16031ecJ.AEQbTJ(c0839TaskDescription.KWHzl(), c0839TaskDescription.copydefault());
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowOLrzqt.collect(flowCollector, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ActivityC16031ecJ activityC16031ecJ = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(activityC16031ecJ, this.$binding, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(activityC16031ecJ, state, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
