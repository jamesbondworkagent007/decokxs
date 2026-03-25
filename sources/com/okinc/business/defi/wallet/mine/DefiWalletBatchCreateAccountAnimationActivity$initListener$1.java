package com.okinc.business.defi.wallet.mine;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC16331ehs;
import o.ActivityC18496fjW;
import o.C13754dXa;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class DefiWalletBatchCreateAccountAnimationActivity$initListener$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC18496fjW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletBatchCreateAccountAnimationActivity$initListener$1(ActivityC18496fjW activityC18496fjW, Continuation<? super DefiWalletBatchCreateAccountAnimationActivity$initListener$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC18496fjW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletBatchCreateAccountAnimationActivity$initListener$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletBatchCreateAccountAnimationActivity$initListener$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.DefiWalletBatchCreateAccountAnimationActivity$initListener$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ActivityC18496fjW this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC18496fjW activityC18496fjW, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC18496fjW;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
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
                Flow<Integer> flowDjBIcL = this.this$0.copydefault().djBIcL();
                final ActivityC18496fjW activityC18496fjW = this.this$0;
                FlowCollector<? super Integer> flowCollector = new FlowCollector() { // from class: com.okinc.business.defi.wallet.mine.DefiWalletBatchCreateAccountAnimationActivity.initListener.1.1.4
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return AEQbTJ(((Number) obj2).intValue(), continuation);
                    }

                    public final Object AEQbTJ(int i2, Continuation<? super Unit> continuation) {
                        AppCompatTextView appCompatTextView;
                        AppCompatTextView appCompatTextView2;
                        activityC18496fjW.EZpvd(i2);
                        if (i2 == activityC18496fjW.copydefault().AkhnZx()) {
                            AbstractC16331ehs abstractC16331ehs = activityC18496fjW.EZpvd;
                            if (abstractC16331ehs != null && (appCompatTextView2 = abstractC16331ehs.AEQbTJ) != null) {
                                appCompatTextView2.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatMediaBrowserImpl));
                            }
                            AbstractC16331ehs abstractC16331ehs2 = activityC18496fjW.EZpvd;
                            if (abstractC16331ehs2 != null && (appCompatTextView = abstractC16331ehs2.AYXKKw) != null) {
                                appCompatTextView.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal));
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowDjBIcL.collect(flowCollector, this) == objCopydefault) {
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
            ActivityC18496fjW activityC18496fjW = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(activityC18496fjW, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(activityC18496fjW, state, anonymousClass1, this) == objCopydefault) {
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
